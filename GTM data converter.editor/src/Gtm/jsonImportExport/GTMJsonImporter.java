package Gtm.jsonImportExport;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.*;
import Gtm.actions.GtmUtils;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import gtm.AfterSalesConditionDef;
import gtm.AfterSalesRuleDef;
import gtm.AllowedChange;
import gtm.BarCodeTypesDef;
import gtm.CalendarDef;
import gtm.CarrierConstraintDef;
import gtm.CarrierResourceLocationDef;
import gtm.ConnectionPointDef;
import gtm.ControlSecurityTypeDef;
import gtm.CrossBorderConditionDef;
import gtm.CurrencyPriceDef;
import gtm.FareCombinationConstraintDef;
import gtm.FareCombinationModelDef;
import gtm.FareDataDef;
import gtm.FareDef;
import gtm.FareDef.FareTypeDef;
import gtm.FareDelivery;
import gtm.FareDeliveryDetailsDef;
import gtm.FareReferenceStationSetDef;
import gtm.FareResourceLocationDef;
import gtm.FulfillmentConstraintDef;
import gtm.GeoCoordinate;
import gtm.IncludedFreePassenger;
import gtm.LegacyAccountingIdentifierDef;
import gtm.LegacyReservationParameterDef;
import gtm.LineDef;
import gtm.OnlineResourceDef;
import gtm.PassengerConstraintDef;
import gtm.PersonalDataConstraintDef;
import gtm.PolygonDef;
import gtm.PriceDef;
import gtm.ReductionCardDef;
import gtm.ReductionCardReferenceDef;
import gtm.ReductionConstraintDef;
import gtm.RegionalConstraintDef;
import gtm.RegionalValidityDef;
import gtm.RegulatoryConditionsDef;
import gtm.RelativeTimeDef;
import gtm.RequiredDatum;
import gtm.RequiredSi;
import gtm.ReservationOptionGroupDef;
import gtm.ReservationParameterDef;
import gtm.ReturnConstraint;
import gtm.SalesAvailabilityConstraintDef;
import gtm.ServiceClassDefinitionDef;
import gtm.ServiceClassDefinitionDef.ServiceClassIdDef;
import gtm.ServiceConstraintDef;
import gtm.ServiceLevelDef;
import gtm.StationDef;
import gtm.StationNamesDef;
import gtm.StationResourceLocationDef;
import gtm.TextDef;
import gtm.TrainResourceLocationDef;
import gtm.Transfer;
import gtm.TranslationDef;
import gtm.TravelValidityConstraintDef;
import gtm.ViaStationsDef;
import gtm.ZoneDef;
import gtm.ZoneDefinitionDef;


public class GTMJsonImporter {
	
	private HashMap<Integer,Station> stations = null;	
	private HashMap<String,Carrier> carriers = null;
	private HashMap<String,Language> languages = null;
	private HashMap<Integer,Country> countries = null;
	private HashMap<String,Country> countriesISO = null;	
	private HashMap<String,Currency> currencies = null;	
	private HashMap<Integer,ServiceBrand> serviceBrands = null;
	private HashMap<String,NutsCode> nutsCodes = null;
	
	private EditingDomain domain = null;
	
	/*
	 *   y   = year   (yy or yyyy)
	 *	M   = month  (MM)
	 *	d   = day in month (dd)
	 *	h   = hour (0-12)  (hh)
	 *	H   = hour (0-23)  (HH)
	 *	m   = minute in hour (mm)
	 *	s   = seconds (ss)
	 *	S   = milliseconds (SSS)
	 *	z   = time zone  text        (e.g. Pacific Standard Time...)
	 *	Z   = time zone, time offset (e.g. -0800)
	 */
	final DateFormat fmtZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); //$NON-NLS-1$
	final DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //$NON-NLS-1$
	final DateFormat pmdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a z"); //$NON-NLS-1$
	GTMTool tool = null;
	
	FareStructure fareStructure = null;

	
	public GTMJsonImporter(GTMTool tool, EditingDomain domain) {
		this.tool = tool;
		stations = new HashMap<Integer,Station>();
		carriers = new HashMap<String,Carrier>();
		languages = new HashMap<String,Language>();
		countriesISO = new HashMap<String,Country>();
		countries = new HashMap<Integer,Country>();
		currencies = new HashMap<String,Currency>();	
		serviceBrands = new HashMap<Integer,ServiceBrand>();
		nutsCodes = new HashMap<String,NutsCode>();	
		this.domain = domain;
		
		stations = GtmUtils.getStationMap(tool);
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()) {
			carriers.put(carrier.getCode() , carrier);
		}
		for (Language language : tool.getCodeLists().getLanguages().getLanguages()) {
			languages.put(language.getCode() ,language);
		}		
		for (Country country : tool.getCodeLists().getCountries().getCountries()) {
			countries.put(Integer.valueOf(country.getCode()),country);
			countriesISO.put(country.getISOcode(), country);
		}
		for (Currency currency : tool.getCodeLists().getCurrencies().getCurrencies()) {
			currencies.put(currency.getIsoCode(),currency);
		}		
		for (ServiceBrand s : tool.getCodeLists().getServiceBrands().getServiceBrands()) {
			serviceBrands.put(Integer.valueOf(s.getCode()),s);
		}
		for (NutsCode s : tool.getCodeLists().getNutsCodes().getNutsCodes()) {
			nutsCodes.put(s.getCode(),s);
		}
	}
	

	public GeneralTariffModel  convertFromJson(FareDelivery fareDelivery) {
		
		GeneralTariffModel gtm = GtmFactory.eINSTANCE.createGeneralTariffModel();
		
		gtm.setDelivery(convert(fareDelivery.getFareStructureDelivery().getDelivery()));
		
		gtm.setFareStructure(convert(fareDelivery.getFareStructureDelivery().getFareStructure()));		
		
		return gtm;
	}
	

	private FareStructure convert(FareDataDef fareDataDef) {
		
		fareStructure = GtmFactory.eINSTANCE.createFareStructure();
		
		fareStructure.setCalendars(convertCalendarList(fareDataDef.getCalendars()));
		
		fareStructure.setTexts(convertTextList(fareDataDef.getTexts()));
		
		fareStructure.setStationNames(convertStationNames(fareDataDef.getStationNames()));
		
		updateMERITSStations(fareDataDef.getStationNames());
		
		fareStructure.setAfterSalesRules(convertAfterSalesRulesList(fareDataDef.getAfterSalesConditions()));
		
		fareStructure.setCarrierConstraints(convertCarrierConstraintList(fareDataDef.getCarrierConstraints()));
		
		fareStructure.setCombinationConstraints(convertCombinationConstraintList(fareDataDef.getCombinationConstraints()));
		
		fareStructure.setConnectionPoints(convertConnectionPointList(fareDataDef.getConnectionPoints()));
		
		fareStructure.setFareResourceLocations(convertFareResourceList(fareDataDef.getFareResourceLocation()));
		
		fareStructure.setFulfillmentConstraints(convertFulfillmentList(fareDataDef.getFullfillmentConstraints()));
		
		fareStructure.setPassengerConstraints(convertPassengerConstraints(fareDataDef.getPassengerConstraints()));
		
		fareStructure.setPersonalDataConstraints(convertPersonalDataConstraints(fareDataDef.getPersonalDataConstraints()));
		
		fareStructure.setPrices(convertPrices(fareDataDef.getPrices()));
		
		fareStructure.setReductionCards(convertReductionCards(fareDataDef.getReductionCards()));
		
		fareStructure.setReductionConstraints(convertReductionConstraints(fareDataDef.getReductionConstraints()));
		
		fareStructure.setRegionalConstraints(convertRegionalConstraints(fareDataDef.getRegionalConstraints()));
		
		fareStructure.setReservationParameters(convertReservationParameters(fareDataDef.getReservationParameters()));
		
		fareStructure.setSalesAvailabilityConstraints(convertSalesAvailabilities(fareDataDef.getSalesAvailabilityConstraint()));
		
		fareStructure.setServiceClassDefinitions(convertServiceClassDefinitions(fareDataDef.getServiceClassDefinitions()));
		
		fareStructure.setServiceConstraints(convertServiceConstraints(fareDataDef.getServiceConstraints()));
		
		fareStructure.setServiceLevelDefinitions(convertServiceLevelDefinitions(fareDataDef.getServiceLevelDefinitions()));
		
		fareStructure.setSupportedOnlineServices(convertSupportedOnlineServices(fareDataDef.getSupportedOnlineServices()));
		
		fareStructure.setTravelValidityConstraints(convertTravelValidityConstraints(fareDataDef.getTravelValidityConstraints()));
		
		fareStructure.setFareStationSetDefinitions(convertFareStationSetDefinitions(fareDataDef.getFareReferenceStationSetDefinitions()));

		fareStructure.setZoneDefinitions(convertZoneDefinitions(fareDataDef.getZoneDefinitions()));
		
		fareStructure.setFareElements(convertFareElementList(fareDataDef.getFares()));		
		
		return fareStructure;
	}
	

	private StationNames convertStationNames(List<StationNamesDef> jl) {
		
		StationNames n = GtmFactory.eINSTANCE.createStationNames();
		if (jl == null || jl.isEmpty()) return n;
		
		for (StationNamesDef jn : jl) {
			
			Station s = getStation(jn.getCountry(), jn.getLocalCode());
			if (s != null) {
				n.getStationName().add(s);
			}
			
		}
		return n;
	}
	
	
	private void updateMERITSStations(List<StationNamesDef> list) {
		//correcting merits data using 108 data
		
		CompoundCommand command = new CompoundCommand();
						
		for (StationNamesDef lStation : list ) {
			
			Station station = stations.get(Integer.valueOf(lStation.getLocalCode() + lStation.getCountry()*100000));
			
			if (station != null) {
			
				if (lStation.getLegacyBorderPointCode() > 0) {
				
					if (station != null && station.isBorderStation() == false){
						
						Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__BORDER_STATION, true);
						if (com != null && com.canExecute()) {
							command.append(com);	
						}
						Command comm2 = SetCommand.create(domain, station, GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, lStation.getLegacyBorderPointCode());
						if (comm2 != null && comm2.canExecute()) {
							command.append(comm2);	
						}					
					
					}
				
				}
			
				if (lStation.getName() != null && 
					station.getNameCaseASCII() == null || !station.getNameCaseASCII().equals(lStation.getName())) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_ASCII, lStation.getName());
					if (com.canExecute()) {
						command.append(com);
					}
				}
				if (lStation.getName() != null && 
					station.getNameCaseASCII() == null || !station.getNameCaseASCII().equals(lStation.getName())) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_ASCII, lStation.getName());
					if (com.canExecute()) {
						command.append(com);					
					}
				}

				if (lStation.getNameUtf8() != null && 
					station.getNameCaseUTF8() == null || !station.getNameCaseUTF8().equals(lStation.getNameUtf8())) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_UTF8, lStation.getNameUtf8());
					if (com.canExecute()) {
						command.append(com);					
					}
				}

				if (lStation.getLegacyBorderPointCode() != lStation.getLegacyBorderPointCode()) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, lStation.getLegacyBorderPointCode());
					if (com.canExecute()) {
						command.append(com);					
					}
				}
		
			}
		}
		
		if (command != null && !command.isEmpty()) {
			domain.getCommandStack().execute(command);
			command = new CompoundCommand();
		}
		
		HashSet<Station> borderStations = new HashSet<Station>();
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			if (station.getLegacyBorderPointCode() > 0 || station.isBorderStation()) {
				borderStations.add(station);
			}
		}
		
		CompoundCommand com2 = new CompoundCommand();
		
		Float accuracy = ((float)PreferencesAccess.getIntFromPreferenceStore(PreferenceConstants.P_LINK_STATIONS_BY_GEO_ACCURACY)) / (60 * 60);
		
		for (Station station1 : borderStations) {
			
			for (Station station2 : borderStations) {
				
				if (station1 != station2 && 
					station1.getLatitude() > 0 &&
					station2.getLatitude() > 0 &&
					station1.getLongitude() > 0 &&
					station2.getLongitude() > 0 &&
					station1.getLatitude() - station2.getLatitude() < accuracy &&
					station1.getLongitude() - station2.getLongitude() < accuracy) {
					
					StationRelation rel1 = GtmFactory.eINSTANCE.createStationRelation();
					rel1.setRelationType(StationRelationType.SAME_STATION);
					rel1.setStation(station2);
					Command comm3 = AddCommand.create(domain, station1, GtmPackage.Literals.STATION__RELATIONS, rel1);
					if (comm3 != null && comm3.canExecute()) {
						com2.append(comm3);	
					}	
					

					StationRelation rel2 = GtmFactory.eINSTANCE.createStationRelation();
					rel2.setRelationType(StationRelationType.SAME_STATION);
					rel2.setStation(station1);
					Command comm4 = AddCommand.create(domain, station2, GtmPackage.Literals.STATION__RELATIONS, rel2);
					if (comm4 != null && comm4.canExecute()) {
						com2.append(comm3);	
					}						

				}
			}									
		}
		
		if (com2 != null && !com2.isEmpty()) {
			domain.getCommandStack().execute(com2);
		}
		
		
		
	}



	private ZoneDefinitions convertZoneDefinitions(List<ZoneDefinitionDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		ZoneDefinitions zs = GtmFactory.eINSTANCE.createZoneDefinitions();
		for (ZoneDefinitionDef jz : jl ) {
			zs.getZoneDefinition().add(convert(jz));			
		}
		return zs;
	}


	private ZoneDefinition convert(ZoneDefinitionDef jz) {
		ZoneDefinition z = GtmFactory.eINSTANCE.createZoneDefinition();
		z.setZoneId(jz.getZoneId());
		z.setProvider(getCarrier(jz.getCarrier()));
		z.setName(jz.getName());
		z.setNameUtf8(jz.getNameUTF8());
		StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
		stationSet.getStations().addAll(convertStationList(jz.getStationList()));
		z.setStationSet(stationSet);
		z.setPolygone(convert(jz.getPloygon()));
		z.getNutsCodes().addAll(convertNutsCodes(jz.getNutsCodes()));
		return z;
	}


	private Collection<? extends NutsCode> convertNutsCodes(List<String> jl) {

		List<NutsCode> codes = new ArrayList<NutsCode>();
		if (jl == null || jl.isEmpty()) return codes;
		
		for (String jc : jl) {
			NutsCode c = getNutsCode(jc);
			if (c != null)
				codes.add(c);
		}

		return codes;
	}


	private FareStationSetDefinitions convertFareStationSetDefinitions(List<FareReferenceStationSetDef> list) {
		if (list == null || list.isEmpty()) return null;
		FareStationSetDefinitions o = GtmFactory.eINSTANCE.createFareStationSetDefinitions();
		
		for (FareReferenceStationSetDef jz : list) {
			o.getFareStationSetDefinitions().add(convert(jz));
		}
		return o;
	}


	private FareStationSetDefinition convert(FareReferenceStationSetDef jz) {
		FareStationSetDefinition z = GtmFactory.eINSTANCE.createFareStationSetDefinition();
		
		z.setDataSource(DataSource.IMPORTED);
		z.setCode(jz.getCode());
		z.setName(jz.getName());
		z.setNameUtf8(jz.getNameUTF8()); 
		z.setLegacyCode(jz.getLegacyCode());
		z.setCarrier(getCarrier(jz.getFareProvider()));
		z.getStations().addAll(convertStationList(new ArrayList<StationDef>(jz.getStations())));
		return z;
	}


	private TravelValidityConstraints convertTravelValidityConstraints(List<TravelValidityConstraintDef> jo) {
		TravelValidityConstraints o = GtmFactory.eINSTANCE.createTravelValidityConstraints();
		for (TravelValidityConstraintDef jc : jo) {
			o.getTravelValidityConstraints().add(convert(jc));
		}
		return o;
	}


	private TravelValidityConstraint convert(TravelValidityConstraintDef jc) {
		TravelValidityConstraint o = GtmFactory.eINSTANCE.createTravelValidityConstraint();
		o.setId(jc.getId());
		o.setRange(convert(jc.getValidityRange()));
		o.setReturnConstraint(convert(jc.getReturnConstraint()));
		o.setTravelDays(jc.getNumberOfTravelDays());
		o.setValidDays(convert(jc.getValidTravelDates()));
		return o;
	}


	private ReturnValidityConstraint convert(ReturnConstraint jr) {
		if (jr == null) return  null;
		
		ReturnValidityConstraint o = GtmFactory.eINSTANCE.createReturnValidityConstraint();
		o.setEarliestReturn(jr.getEarliestReturn());
		o.setLatestReturn(jr.getLatestReturn());
		o.getExcludedWeekdays().addAll(convertWeekdays(jr.getExcludedWeekdays()));
		return o;
	}


	private Collection<? extends WeekDay> convertWeekdays(List<Integer> jl) {
		ArrayList<WeekDay> l = new ArrayList<WeekDay>();
		if (jl == null || jl.isEmpty()) return l;
		for (Integer i : jl) {
			l.add(WeekDay.get(i.intValue()));
		}
		return l;
	}


	private ValidityRange convert(gtm.ValidityRange jv) {
		if (jv == null) return null;
		ValidityRange v = GtmFactory.eINSTANCE.createValidityRange();
		if (jv.getHoursAfterMidnight() != null) {
			v.setHoursAfterMidnight(jv.getHoursAfterMidnight()); 
		}
		if (jv.getTimeUnit() != null) {
			v.setUnit(TimeUnit.getByName(jv.getTimeUnit().name()));
		}
		v.setValue(jv.getValue());   
		return v;
	}


	private SupportedOnlineServices convertSupportedOnlineServices(List<String> jl) {

		SupportedOnlineServices l = GtmFactory.eINSTANCE.createSupportedOnlineServices();
		if (jl == null || jl.isEmpty()) return l;
		
		for ( String jo : jl) {
			l.getSupportedOnlineServices().add(OnlineServiceType.getByName(jo));
		}
		return l;
	}


	private ServiceLevelDefinitions convertServiceLevelDefinitions(List<ServiceLevelDef> list) {
		if (list == null || list.isEmpty()) return null;
		ServiceLevelDefinitions o = GtmFactory.eINSTANCE.createServiceLevelDefinitions();
		
		for (ServiceLevelDef js : list) {
			o.getServiceLevelDefinition().add(convert(js));
		}
		return o;
	}


	private ServiceLevel convert(ServiceLevelDef js) {
		ServiceLevel s = GtmFactory.eINSTANCE.createServiceLevel();
		s.setId(js.getId());
		s.setText(findText(js.getTextRef()));
		s.setIncludesClassName(js.getIncludesClassName());
		s.setReservationParameter(findReservationParams(js.getReservationParameterId()));
		return s;
	}


	private ServiceConstraints convertServiceConstraints(List<ServiceConstraintDef> jl) {
		ServiceConstraints o = GtmFactory.eINSTANCE.createServiceConstraints();
		for (ServiceConstraintDef sc : jl) {
			o.getServiceConstraints().add(convert(sc));
		}
		return o;
	}


	private ServiceConstraint convert(ServiceConstraintDef sc) {
		ServiceConstraint o = GtmFactory.eINSTANCE.createServiceConstraint();
		o.setId(sc.getId());
		o.getExcludedServiceBrands().addAll(convertServiceBrandList(sc.getExcludedServiceBrands()));
		o.getIncludedServiceBrands().addAll(convertServiceBrandList(sc.getIncludedServiceBrands()));
		return o;
	}


	private ServiceClassDefinitions convertServiceClassDefinitions(List<ServiceClassDefinitionDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		ServiceClassDefinitions o = GtmFactory.eINSTANCE.createServiceClassDefinitions();
		for (ServiceClassDefinitionDef js : jl) {
			o.getServiceClassDefinitions().add(convert(js));
		}
		return o;
	}

	
	private ClassId convertServiceClassId(ServiceClassIdDef id){
		
		if  (id == null) return null;
		
		if (id.equals(ServiceClassIdDef.BEST)) {
			return ClassId.A;
		} else if (id.equals(ServiceClassIdDef.HIGH)) {
			return ClassId.B;
		} else if (id.equals(ServiceClassIdDef.STANDARD)) {
			return ClassId.C;
		} else if (id.equals(ServiceClassIdDef.BASIC)) {
			return ClassId.D;
		} 
		
		return  null;
		
	}

	private ServiceClass convert(ServiceClassDefinitionDef js) {
		ServiceClass s = GtmFactory.eINSTANCE.createServiceClass();
		
		s.setId(convertServiceClassId(js.getId()));
		
		s.setText(findText(js.getTextRef()));
		if (js.getComfortClass() != null) {
			s.setClassicClass(ClassicClassType.getByName(js.getComfortClass().name()));
		}
		return s;
	}


	private SalesAvailabilityConstraints convertSalesAvailabilities(List<SalesAvailabilityConstraintDef> jl) {

		SalesAvailabilityConstraints o = GtmFactory.eINSTANCE.createSalesAvailabilityConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (SalesAvailabilityConstraintDef js : jl) {
			o.getSalesAvailabilityConstraints().add(convert(js));
		}
		return o;
	}


	private SalesAvailabilityConstraint convert(SalesAvailabilityConstraintDef js) {
		SalesAvailabilityConstraint o = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
		o.setId(js.getId());
		o.setDataSource(DataSource.IMPORTED);
		o.getRestrictions().addAll(convertSalesRestrictions(js.getSalesRestrictions()));
		return o;
	}


	private Collection<? extends SalesRestriction> convertSalesRestrictions(List<gtm.SalesRestriction> jl) {

		ArrayList<SalesRestriction> l = new ArrayList<SalesRestriction>();
		if (jl == null || jl.isEmpty()) return l;
		
		for (gtm.SalesRestriction jr : jl) {
			SalesRestriction r = GtmFactory.eINSTANCE.createSalesRestriction();
			r.setEndOfSale(convertEndDate(jr.getEndOfSale()));
			r.setStartOfSale(convertStartDate(jr.getStartOfSale()));
			r.setSalesDates(findCalendar(jr.getSalesDatesRef()));
			l.add(r);
		}

		return l;
	}
	
	
	
	private Calendar findCalendar(String id) {
		if (id == null || id.length() < 1) return null;
		for (Calendar cal : fareStructure.getCalendars().getCalendars()) {
			if (cal.getId().equals(id)) return cal;
		}
		return null;
	}


	private StartOfSale convertStartDate(RelativeTimeDef jo) {
		if (jo == null) return null;
		StartOfSale o = GtmFactory.eINSTANCE.createStartOfSale();
		if (jo.getTimeReference()!= null) {
			o.setReference(TimeReferenceType.getByName(jo.getTimeReference().name()));
		}
		if (jo.getTimeUnit() != null) {
			o.setUnit(TimeUnit.getByName(jo.getTimeUnit().name()));
		}
		o.setValue(jo.getTimeValue());
		return o;
	}


	private EndOfSale convertEndDate(RelativeTimeDef jo) {
		if (jo == null) return null;
		EndOfSale o = GtmFactory.eINSTANCE.createEndOfSale();
		if (jo.getTimeReference()!= null) {
			o.setReference(TimeReferenceType.getByName(jo.getTimeReference().name()));
		}
		if (jo.getTimeUnit() != null) {
			o.setUnit(TimeUnit.getByName(jo.getTimeUnit().name()));
		}
		o.setValue(jo.getTimeValue());
		return o;
	}


	private ReservationParameters convertReservationParameters(List<ReservationParameterDef> jl) {

		ReservationParameters o = GtmFactory.eINSTANCE.createReservationParameters();
		if (jl == null || jl.isEmpty()) return o;
		for (ReservationParameterDef jr : jl) {
			o.getReservationParameters().add(convert(jr));
		}
		return o;
	}


	private ReservationParameter convert(ReservationParameterDef jr) {
		if (jr == null) return null;
		
		ReservationParameter o = GtmFactory.eINSTANCE.createReservationParameter();
		
		o.setId(jr.getId());
		o.setMandatoryReservation(jr.getReservationRequired());
		o.setOptions(convert(jr.getReservationOptions()));
		o.setParams9181(convert(jr.getReservationParams9181()));
		
		o.getMandatoryReservationForBrands().addAll(convertServiceBrandList(jr.getReservationRequiredForBrand()));
		o.getMandatoryReservationsForMode().addAll(convertToServiceModeList(jr.getReservationRequiredForMode()));

		return o;
	}


	private ArrayList<ServiceMode> convertToServiceModeList(List<String> jl) {
		ArrayList<ServiceMode> l = new ArrayList<ServiceMode>();
		if (jl == null || jl.isEmpty()) return l;
		for (String s : jl) {
			try {
				int value = Integer.parseInt(s);
				l.add(ServiceMode.get(value));
			} catch (Exception e) {
				//
			}
		}
		return l;
	}


	private ReservationParams9181 convert(LegacyReservationParameterDef jr) {
		if (jr == null) return null;
		ReservationParams9181 o = GtmFactory.eINSTANCE.createReservationParams9181();
		o.setBerthType(ReservationBerthType.getByName(jr.getBerthType()));
		o.setCoachType(Integer.parseInt(jr.getCoachTypeCode(),0));
		o.setCompartmentType(Integer.parseInt(jr.getCompartmentTypeCode(), 0));
		o.setService(ReservationService.getByName(jr.getServiceCode()));
		o.setServiceLevel(ReservationServiceLevel.getByName(jr.getServiceLevelCode()));
		o.setTariff(Integer.parseInt(jr.getTariff(),0));
		o.setTravelClass(ReservationTravelClass.getByName(jr.getTravelClass()));
		return o;
	}


	private ReservationOptions convert(gtm.ReservationOptions jr) {
		if (jr == null) return null;
		ReservationOptions o = GtmFactory.eINSTANCE.createReservationOptions();
		o.setGraphicalReservation(GraphicalReservationType.getByName(jr.getGraficalReservation()));
		o.getPreferences().addAll(convertPreferencesList(jr.getPreferences()));
		o.getServiceBrands().addAll(convertServiceBrandList(jr.getServiceBrands()));
		return o;
	}


	private Collection<? extends ReservationPreferenceGroup> convertPreferencesList(List<ReservationOptionGroupDef> jl) {
		ArrayList <ReservationPreferenceGroup> o = new ArrayList<ReservationPreferenceGroup>();
		if (jl == null || jl.isEmpty()) return o;
		for (ReservationOptionGroupDef jr : jl) {
			ReservationPreferenceGroup rg = GtmFactory.eINSTANCE.createReservationPreferenceGroup();
			rg.getPreference().addAll(convert(jr));
			rg.setGroup(jr.getPreferenceGroup());
		}
		return o;
	}

	
	private Collection<? extends String> convert(ReservationOptionGroupDef jr) {
		if (jr == null) return new ArrayList<String>();
		return jr.getPreferences();
	}


	private RegionalConstraints convertRegionalConstraints(List<RegionalConstraintDef> jl) {

		RegionalConstraints o = GtmFactory.eINSTANCE.createRegionalConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (RegionalConstraintDef jr : jl) {
			o.getRegionalConstraints().add(convert(jr));
		}
		return o;
	}


	private RegionalConstraint convert(RegionalConstraintDef jr) {
		if (jr == null) return null;
		RegionalConstraint o = GtmFactory.eINSTANCE.createRegionalConstraint();
		o.setDataSource(DataSource.IMPORTED);
		o.setId(jr.getId());
		o.setDistance(jr.getDistance());
		o.setEntryConnectionPoint(findConnectionPoint(jr.getEntryConnectionPointId()));
		o.setExitConnectionPoint(findConnectionPoint(jr.getExitConnectionPointId()));
		o.getRegionalValidity().addAll(convertRegionalValidities(jr.getRegionalValidity()));
		return o;
	}


	private Collection<? extends RegionalValidity> convertRegionalValidities(List<RegionalValidityDef> jl) {
		ArrayList<RegionalValidity> l = new ArrayList<RegionalValidity>();
		if (jl == null || jl.isEmpty()) return l;
		
		for (RegionalValidityDef jr : jl) {
			RegionalValidity r = GtmFactory.eINSTANCE.createRegionalValidity();
			r.setLine(convert(jr.getLine()));
			r.setPolygone(convert(jr.getPolygon()));
			r.setViaStation(convert(jr.getViaStations()));
			r.setSeqNb(jr.getSeqNb());
			r.setZone(convert(jr.getZone()));
			r.setLine(convert(jr.getLine()));
			
			l.add(r);
		}

		return l;
	}


	private Zone convert(ZoneDef jz) {
		if (jz == null) return null;
		Zone z = GtmFactory.eINSTANCE.createZone();
		z.setBinaryZoneId(jz.getBinaryZoneId().getBytes());
		z.setCarrier(getCarrier(jz.getCarrier()));
		z.setCity(jz.getCity());
		if (jz.getEntryStation()!= null) {
			z.setEntryStation(getStation(jz.getEntryStation().getCode()));
		}
		if (jz.getTerminalStation()!= null) {
			z.setTerminalStation(getStation(jz.getTerminalStation().getCode()));
		}		
		z.setNutsCode(getNutsCode(jz.getNutsCode()));
		
		for (Integer id : jz.getZoneIds()) {
			z.getZoneId().add(id.toString());
		}
		return z;
	}


	private ViaStation convert(ViaStationsDef jv) {
		if (jv == null) return null;
		ViaStation v = GtmFactory.eINSTANCE.createViaStation();
		if (jv.getCarrier() != null) {
			v.setCarrier(getCarrier(jv.getCarrier()));
		}
		if (jv.getStation() != null) {
			v.setStation(getStation(jv.getStation().getCode()));
		}
		
		if (jv.getRoute()!= null && !jv.getRoute().isEmpty()) {
			Route r = GtmFactory.eINSTANCE.createRoute();
			for (ViaStationsDef jv2 : jv.getRoute()) {
				r.getStations().add(convert(jv2));
			}
			v.setRoute(r);
		}
		
		if (jv.getAlternativeRoute()!= null && !jv.getAlternativeRoute().isEmpty()) {
			
			for (ViaStationsDef jar : jv.getAlternativeRoute()) {
				AlternativeRoute ar = GtmFactory.eINSTANCE.createAlternativeRoute();
				ar.getStations().add(convert(jar));
				v.getAlternativeRoutes().add(ar);
			}
		}
		return v;
	}


	private Polygone convert(PolygonDef jp) {
		if (jp == null) return null;
		Polygone p = GtmFactory.eINSTANCE.createPolygone();
		p.getEdge().addAll(convertEdgeList(jp.getEdge()));

		return p;
	}


	private Collection<? extends Edge> convertEdgeList(List<GeoCoordinate> jl) {
		
		ArrayList<Edge> l = new ArrayList<Edge>();
		if (jl == null || jl.isEmpty()) return l;
		for (GeoCoordinate jg : jl) {
			Edge e = GtmFactory.eINSTANCE.createEdge();
            e.setLatitude(jg.getLatitude());
            e.setLongitude(jg.getLongitude());
            e.setAccuracy(jg.getAccuracy());
			
			l.add(e);
		}
		return l;
	}


	private Line convert(LineDef jz) {
		if (jz == null) return null;
		Line l = GtmFactory.eINSTANCE.createLine();
		
		l.setBinaryZoneId(jz.getBinaryLineId().getBytes());
		l.setCarrier(getCarrier(jz.getCarrier()));
		l.setCity(jz.getCity());
		if (jz.getEntryStation()!= null) {
			l.setEntryStation(getStation(jz.getEntryStation().getCode()));
		}
		if (jz.getTerminalStation()!= null) {
			l.setTerminalStation(getStation(jz.getTerminalStation().getCode()));
		}		
		l.setNutsCode(getNutsCode(jz.getNutsCode()));
		
		l.getLineId().addAll(jz.getLineId());
		
		return l;
	}


	private ReductionConstraints convertReductionConstraints(List<ReductionConstraintDef> jl) {
		ReductionConstraints o = GtmFactory.eINSTANCE.createReductionConstraints();
		for (ReductionConstraintDef jr : jl) {
			o.getReductionConstraints().add(convert(jr));
		}
		return o;
	}


	private ReductionConstraint convert(ReductionConstraintDef jr) {
		ReductionConstraint o = GtmFactory.eINSTANCE.createReductionConstraint();
		
		o.setId(jr.getId());
		o.getRequiredReductionCards().addAll(convertReductionCardList(jr.getRequiredCards()));

		return o;
	}


	private Collection<? extends RequiredReductionCard> convertReductionCardList(List<ReductionCardReferenceDef> jl) {
		ArrayList<RequiredReductionCard> o = new ArrayList<RequiredReductionCard>();
		if (jl == null || jl.isEmpty()) return o;
		
		for ( ReductionCardReferenceDef jr : jl) {
			RequiredReductionCard r = GtmFactory.eINSTANCE.createRequiredReductionCard();
			r.setCard(findReductionCard(jr.getCardValue()));
			r.setName(jr.getCardName());
			
			o.add(r);
		}
		return o;
	}


	private ReductionCard findReductionCard(String id) {
		if (id == null || id.length() < 1) return null;
		for (ReductionCard card : fareStructure.getReductionCards().getReductionCards()) {
			if (card.getId().equals(id)) return card;
		}
		return null;
	}


	private ReductionCards convertReductionCards(List<ReductionCardDef> jl) {
		
		ReductionCards l = GtmFactory.eINSTANCE.createReductionCards();
		if (jl == null || jl.isEmpty()) return l;
		for (ReductionCardDef jr : jl) {
			ReductionCard o = GtmFactory.eINSTANCE.createReductionCard();
			o.setId(jr.getId());
			o.setIdRequiredForBooking(jr.getCardIdRequired());
			o.setCardIssuer(getCarrier(jr.getIssuer()));
			o.setName(findText(jr.getNameRef()));
					
			l.getReductionCards().add(o);
		}
		return l;
	}


	private Prices convertPrices(List<PriceDef> jo) {
		Prices o = GtmFactory.eINSTANCE.createPrices();
		if (jo == null || jo.isEmpty()) return o;
		
		for (PriceDef jp : jo) {
			Price p = convert(jp);
			if (p != null) {
				o.getPrices().add(p);
			}
		}
		return o;
	}


	private CurrencyPrice convert(CurrencyPriceDef jcp) {
		if (jcp == null) return null;
		CurrencyPrice o = GtmFactory.eINSTANCE.createCurrencyPrice(); 
		o.setAmount(jcp.getAmount().floatValue() / 100);
		o.setCurrency(getCurrency(jcp.getCurrency()));
		return o;
	}


	private PersonalDataConstraints convertPersonalDataConstraints(List<PersonalDataConstraintDef> jl) {

		PersonalDataConstraints o = GtmFactory.eINSTANCE.createPersonalDataConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (PersonalDataConstraintDef jp:jl) {
			o.getPersonalDataConstraints().add(convert(jp));
		}
		return o;
	}


	private PersonalDataConstraint convert(PersonalDataConstraintDef jp) {
		if (jp == null) return null;
		PersonalDataConstraint p = GtmFactory.eINSTANCE.createPersonalDataConstraint();
		p.setId(jp.getId());
		p.getRequiredPersonalData().addAll(convertRequiredPersonalDataList(jp.getRequiredData()));
		p.getAllowedChanges().addAll(convertAllowedChangesList(jp.getAllowedChanges()));
		return p;
	}




	private Collection<? extends AllowedPersonalDataChanges> convertAllowedChangesList(List<AllowedChange> jl) {

		ArrayList<AllowedPersonalDataChanges> l = new ArrayList<AllowedPersonalDataChanges>();
		if (jl == null || jl.isEmpty()) return l;
		for (AllowedChange ja : jl) {
			AllowedPersonalDataChanges o = GtmFactory.eINSTANCE.createAllowedPersonalDataChanges();
			o.setTimeLimit(ja.getTimeLimit()); 
			if (ja.getAcceptedReason()!= null) {
				o.setAcceptedReason(PersonalDataChangeReason.getByName(ja.getAcceptedReason().name()));
			}
		}
		return l;
	}


	private Collection<? extends RequiredPersonalData> convertRequiredPersonalDataList(	List<RequiredDatum> jr) {
		ArrayList<RequiredPersonalData> l = new ArrayList<RequiredPersonalData>();
		if (jr == null || jr.isEmpty()) return l;
		for (RequiredDatum jd : jr) {
			RequiredPersonalData o = GtmFactory.eINSTANCE.createRequiredPersonalData();
			o.setDataItem(PersonalDataItemsType.getByName(jd.getDataItem()));
			o.setTicketHolderOnly(jd.getTicketHolderOnly() );
			o.getCrossBorder().addAll(convertCrossBorderList(jd.getCrossBorder()));
			o.getFulfillmentType().addAll(convertFulfillmentTypes(jd.getFulfillmentType()));
			o.getTransfer().addAll(convertTransferTypes(jd.getTransfer()));
		
		}
		return l;
	}


	private Collection<? extends PersonalDataTransferType> convertTransferTypes(List<Transfer> list) {
		ArrayList<PersonalDataTransferType> l = new ArrayList<PersonalDataTransferType>(); 
		if (list == null || list.isEmpty()) return l;
		for (Transfer s : list){
			l.add(PersonalDataTransferType.getByName(s.name()));	
		}
		return null;
	}


	private Collection<? extends CrossBorderCondition> convertCrossBorderList(List<CrossBorderConditionDef> jl) {
		ArrayList<CrossBorderCondition> l = new ArrayList<CrossBorderCondition>(); 
		if (jl == null || jl.isEmpty()) return l;
		for (CrossBorderConditionDef s : jl){
			l.add(convert(s));	
		}
		return null;
	}


	private CrossBorderCondition convert(CrossBorderConditionDef js) {
		if (js == null) return null;
		CrossBorderCondition c = GtmFactory.eINSTANCE.createCrossBorderCondition();
		c.setFromCountry(getCountry(js.getFromCountry()));
		c.setToCountry(getCountry(js.getToCountry()));
		c.getAffectedServiceBrands().addAll(convertServiceBrandList(js.getAffectedServiceBrands()));
		return c;
	}


	private Collection<? extends ServiceBrand> convertServiceBrandList(List<Integer> jl) {
		ArrayList<ServiceBrand> l = new ArrayList<ServiceBrand>();
		if (jl == null || jl.isEmpty()) return l;
		for (Integer i : jl) {
			l.add(getServiceBrand(i));
		}
		return l;
	}


	private PassengerConstraints convertPassengerConstraints(List<PassengerConstraintDef> jl) {
		PassengerConstraints o = GtmFactory.eINSTANCE.createPassengerConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (PassengerConstraintDef jp : jl ) {
			o.getPassengerConstraints().add(convert(jp));
		}
		return o;
	}


	private PassengerConstraint convert(PassengerConstraintDef jp) {
		if (jp == null) return null;
		PassengerConstraint p = GtmFactory.eINSTANCE.createPassengerConstraint();
		p.setId(jp.getId());
		p.getIncludedFreePassengers().addAll(convertIncludedFreePassengers(jp.getIncludedFreePassenger()));
		p.setIsAncilliary(jp.getIsAncillaryItem());
		p.setLowerAgeLimit(jp.getLowerAgeLimit());
		p.setUpperAgeLimit(jp.getUpperAgeLimit());
		p.getExcludedPassengerCombinations().addAll(convertPassengerCombinationList(jp.getCombinationConstraint()));
		p.setMaxTotalPassengerWeight(jp.getMaxWeightedPassengers());
		p.setMinTotalPassengerWeight(jp.getMinWeightedPassengers());
		p.setPassengerWeight(jp.getPassengerWeight());
		p.setReservationAgeLimit(jp.getAgeLimitForReservation());
		p.setText(findText(jp.getNameRef()));
		p.setTravelerType(TravelerType.getByName(jp.getPassengerType()));

		return p;
	}


	private Collection<? extends PassengerCombinationConstraint> convertPassengerCombinationList(List<gtm.CombinationConstraint> jl) {
		ArrayList<PassengerCombinationConstraint> l = new ArrayList<PassengerCombinationConstraint>();
		if (jl == null || jl.isEmpty()) return l;
		for (gtm.CombinationConstraint jc : jl) {
			PassengerCombinationConstraint o = GtmFactory.eINSTANCE.createPassengerCombinationConstraint();
			o.setMaxNumber(jc.getMaxNumber());
			o.setPassengerType(TravelerType.getByName(jc.getPassengerTypeRef()));
			l.add(o);
		}

		return l;
	}


	private Collection<? extends IncludedFreePassengerLimit> convertIncludedFreePassengers(List<IncludedFreePassenger> jl) {

		ArrayList<IncludedFreePassengerLimit> l = new ArrayList<IncludedFreePassengerLimit>();
		if (jl == null || jl.isEmpty()) return l;
		for (IncludedFreePassenger jc : jl) {
			IncludedFreePassengerLimit o = GtmFactory.eINSTANCE.createIncludedFreePassengerLimit();
			o.setNumber(jc.getNumber());
			o.setPassengerType(TravelerType.getByName(jc.getPassengerTypeRef()));
			l.add(o);
		}

		return l;
	}


	private FulfillmentConstraints convertFulfillmentList(List<FulfillmentConstraintDef> jl) {
		FulfillmentConstraints o = GtmFactory.eINSTANCE.createFulfillmentConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (FulfillmentConstraintDef jf : jl) {
			o.getFulfillmentConstraints().add(convert(jf));
		}
		return o;
	}


	private FulfillmentConstraint convert(FulfillmentConstraintDef jf) {
		if (jf == null) return null;
		FulfillmentConstraint f = GtmFactory.eINSTANCE.createFulfillmentConstraint();
		f.setId(jf.getId());
		f.setIndividualTicketingPermitted(jf.getIndividualTicketingPermitted());
		if (jf.getAcceptedBarCodes() != null && !jf.getAcceptedBarCodes().isEmpty()) {
			AcceptedBarcodes ab = GtmFactory.eINSTANCE.createAcceptedBarcodes();
			f.setAcceptedBarcodes(ab);
			ab.getAcceptedBarcodes().addAll(convertBarCodeTypes(jf.getAcceptedBarCodes()));
		}
		if (jf.getRequiredBarCodes() != null && !jf.getRequiredBarCodes().isEmpty()) {
			RequiredBarcodes rb = GtmFactory.eINSTANCE.createRequiredBarcodes();
			f.setRequiredBarcodes(rb);
			rb.getRequiredBarcodes().addAll(convertBarCodeTypes(jf.getRequiredBarCodes()));
		}
		f.getAcceptedFulfilmentTypes().addAll(convertFulfillmentTypes(jf.getAcceptedControlSecurityTypes()));
		f.getRequiredControlDataExchange().addAll(convertControlDataExchange(jf.getRequiredSiS()));
		return f;
	}


	private Collection<? extends BarcodeTypes> convertBarCodeTypes(List<BarCodeTypesDef> list) {
		ArrayList<BarcodeTypes> l = new ArrayList<BarcodeTypes> ();
		if (list == null || list.isEmpty()) return l;
		for (BarCodeTypesDef s : list) {
			l.add(BarcodeTypes.getByName(s.name()));
		}
		return l;
	}


	private Collection<? extends ControlDataExchangeTypes> convertControlDataExchange(List<RequiredSi> list) {
		ArrayList<ControlDataExchangeTypes> l = new ArrayList<ControlDataExchangeTypes> ();
		if (list == null || list.isEmpty()) return l;
		for (RequiredSi s : list) {
			l.add(convert(s));
		}
		return l;
	}


	private ControlDataExchangeTypes convert(RequiredSi s) {
		if (s == RequiredSi.PEER_TO_PEER) {
			return ControlDataExchangeTypes.IRS90918_4PEER2PEER;
		}
		if (s == RequiredSi.REGISTRY) {
			return ControlDataExchangeTypes.IRS90918_4REGISTRY;
		}

		return null;
	}


	private Collection<? extends FulfillmentType> convertFulfillmentTypes(List<ControlSecurityTypeDef> list) {
		ArrayList<FulfillmentType> l = new ArrayList<FulfillmentType>();
		if (list == null || list.isEmpty()) return l;
		for (ControlSecurityTypeDef jf : list) {
			l.add(FulfillmentType.getByName(jf.name()));
		}
		return l;
	}


	private FareResourceLocations convertFareResourceList(FareResourceLocationDef j) {
		if (j == null) return null;
		FareResourceLocations o = GtmFactory.eINSTANCE.createFareResourceLocations();
		o.setCarrierResourceLocations(convertCarrierResourceLocations(j.getCarrierLocations()));
		o.setStationResourceLocations(convertStationResourceLocations(j.getStationLocations()));		
		o.setTrainResourceLocations(convertTrainResourceLocations(j.getTrainLocations()));
		return o;
	}


	private StationResourceLocations convertStationResourceLocations(List<StationResourceLocationDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		StationResourceLocations o = GtmFactory.eINSTANCE.createStationResourceLocations();
		for (StationResourceLocationDef js : jl) {
			o.getStationResourceLocations().add(convert(js));
		}
		return o;
	}


	private StationResourceLocation convert(StationResourceLocationDef js) {
		if (js == null) return null;
		StationResourceLocation r = GtmFactory.eINSTANCE.createStationResourceLocation();
		r.getConnectionPoints().addAll(getConnectionPointList(js.getConnectionPointIds()));
		r.getStations().addAll(convertStationList(js.getStations()));
		r.getOnlineResources().addAll(convertOnlineResources(js.getOnlineResource()));
		return r;
	}


	private Collection<? extends ConnectionPoint> getConnectionPointList(List<String> jl) {
		ArrayList<ConnectionPoint> l = new ArrayList<ConnectionPoint>();
		if (jl == null || jl.isEmpty()) return l;
		for (String s : jl) {
			l.add(findConnectionPoint(s));
		}
		return l;
	}


	private TrainResourceLocations convertTrainResourceLocations(List<TrainResourceLocationDef> jl) {
		TrainResourceLocations l = GtmFactory.eINSTANCE.createTrainResourceLocations();
		if (jl == null || jl.isEmpty()) return null;
		for (TrainResourceLocationDef jt : jl) {
			l.getTrainResourceLocations().add(convert(jt));
		}
		return l;
	}


	private TrainResourceLocation convert(TrainResourceLocationDef jt) {
		if (jt == null) return null;
		TrainResourceLocation o = GtmFactory.eINSTANCE.createTrainResourceLocation();
		o.setCarrier(getCarrier(jt.getCarrier()));
		o.setTrainId(jt.getTrainId());
		o.getOnlineResources().addAll(convertOnlineResources(jt.getOnlineResource()));
		return o;
	}


	private Collection<? extends OnlineResource> convertOnlineResources(List<OnlineResourceDef> jl) {

		ArrayList<OnlineResource> l = new ArrayList<OnlineResource>();
		if (jl == null || jl.isEmpty()) return l;
		for (OnlineResourceDef jo: jl ) {
			l.add(convert(jo));
		}
		return l;
	}


	private OnlineResource convert(OnlineResourceDef jo) {
		if (jo == null) return null;
		OnlineResource o = GtmFactory.eINSTANCE.createOnlineResource();
		o.setInterfaceType(InterfaceType.getByName(jo.getInterfaceType()));
		o.setOfferRequestType(OfferRequestType.getByName(jo.getOfferType()));
		o.setSystem(jo.getSystem());
		o.setVersion(jo.getVersion());
		return o;
	}


	private ConnectionPoint findConnectionPoint(String id) {	
		if (id == null || id.length() < 1) return null;
		for (ConnectionPoint c :  fareStructure.getConnectionPoints().getConnectionPoints() ) {
			if (c.getId().equals(id)) return c;
		}
		return null;
	}


	private Collection<? extends Station> convertStationList(List<StationDef> jl) {

		ArrayList<Station> l = new ArrayList<Station>();
		if (jl == null || jl.isEmpty()) return l;
		for (StationDef s : jl) {
			try {
				int code = Integer.parseInt(s.getCode());
				int uicCountry = code / 100000;
				int localCode = code - (uicCountry * 100000);		
				Station station = getStation(uicCountry,localCode);
				if (station != null) {
					l.add(station);
				}
			} catch (Exception e) {
				// nothing
			}
		}
		return l;
	}




	private CarrierResourceLocations convertCarrierResourceLocations(List<CarrierResourceLocationDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		CarrierResourceLocations o = GtmFactory.eINSTANCE.createCarrierResourceLocations();
		for (CarrierResourceLocationDef jr : jl) {
			o.getCarrierResourceLocations().add(convert(jr));
		}
		return o;
	}


	private CarrierResourceLocation convert(CarrierResourceLocationDef jr) {
		if (jr == null) return null;
		CarrierResourceLocation o = GtmFactory.eINSTANCE.createCarrierResourceLocation();
		o.setCarrier(getCarrier(jr.getCarrier()));
		o.setServiceBrand(getServiceBrand(jr.getServiceBrandCode()));
	    o.getOnlineResources().addAll(convertOnlineResources(jr.getOnlineResource()));
		return o;
	}


	private FareElements convertFareElementList(List<FareDef> jl) {
		
		
		boolean importConvertablesOnly = !PreferencesAccess.getBoolFromPreferenceStore(PreferenceConstants.P_IMPORT_CONVERABLE_ONLY);
		
		if (jl == null || jl.isEmpty()) return null;
		FareElements o = GtmFactory.eINSTANCE.createFareElements();
		for (FareDef jf : jl) {
			
			FareElement fare = convert(jf);
			if (!importConvertablesOnly || fare.getLegacyConversion()  == LegacyConversionType.YES || fare.getLegacyConversion()  == LegacyConversionType.ONLY) {
				o.getFareElements().add(fare);
			}
		}
		return o;
	}


	private FareElement convert(FareDef jf) {
		if (jf == null) return null;
		FareElement f = GtmFactory.eINSTANCE.createFareElement();
		
		f.setType(convert(jf.getFareType()));
		
		f.setId(jf.getId());
		f.setAfterSalesRule(findAfterSaleRule(jf.getAfterSalesRulesRef()));
		f.setCarrierConstraint(findCarrierConstraint(jf.getCarrierConstraintRef()));
		f.setDataSource(DataSource.IMPORTED);
		f.setCombinationConstraint(findCombinationConstraint(jf.getCombinationConstraintRef()));
		f.setFulfillmentConstraint(findFulfillmentConstraint(jf.getFullfillmentConstraintRef()));
		f.setLegacyAccountingIdentifier(convert(jf.getLegacyAccountingIdentifier()));
		f.setPassengerConstraint(findPassengerConstraint(jf.getPassengerConstraintRef()));
		f.setPersonalDataConstraint(finePersonalDataConstraint(jf.getPersonalDataConstraintRef()));
		f.setPrice(findPrice(jf.getPriceRef()));
		f.setReductionConstraint(findReductionConstraint(jf.getReductionConstraintRef()));
		f.setRegionalConstraint(findRegionalConstraint(jf.getRegionalConstraintRef()));
		f.setReservationParameter(findReservationParams(jf.getReservationParameterRef()));
		f.setSalesAvailability(findSalesAvailability(jf.getSalesAvailabilityConstraintRef()));
		f.setServiceClass(findServiceClass(jf.getServiceClassRef()));
		f.setServiceConstraint(findServiceConstraint(jf.getServiceConstraintRef()));
		f.setServiceLevel(findServiceLevel(jf.getServiceLevelRef()));
		f.setText(findText(jf.getNameRef()));
		f.setTravelValidity(findTravelValidity(jf.getTravelValidityConstraintRef()));
		f.setLegacyConversion(LegacyConversionType.getByName(jf.getLegacyConversion()));
		f.setIndividualContracts(jf.getIndividualContracts());
		
		if (jf.getRegulatoryConditions()!= null && !jf.getRegulatoryConditions().isEmpty()) {
			
			for (RegulatoryConditionsDef rcj : jf.getRegulatoryConditions() ) {
				RegulatoryCondition r = RegulatoryCondition.getByName(rcj.name());
				if (r != null) {
					f.getRegulatoryConditions().add(r);
				}
			}
	    }

		return f;
	}

	private FareType convert(FareTypeDef fareType) {
		
		if (fareType == FareTypeDef.ADMISSION) {
			return FareType.NRT;
		}
		if (fareType == FareTypeDef.RESERVATION) {
			return FareType.RES;
		}		
		if (fareType == FareTypeDef.INTEGRATED_RESERVATION) {
			return FareType.IRT;
		}		
		if (fareType == FareTypeDef.ANCILLARY) {
			return FareType.ANCILLARY;
		}		
		return null;
	}


	private Text findText(String id) {
		if (id == null || id.length() < 1) return null;
		for (Text  o : fareStructure.getTexts().getTexts()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private TravelValidityConstraint findTravelValidity(String id) {
		if (id == null || id.length() < 1) return null;
		for (TravelValidityConstraint  o : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ServiceLevel findServiceLevel(String id) {
		if (id == null || id.length() < 1) return null;
		for (ServiceLevel o : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ServiceConstraint findServiceConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (ServiceConstraint o : fareStructure.getServiceConstraints().getServiceConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ServiceClass findServiceClass(String id) {
		if (id == null || id.length() < 1) return null;
		for (ServiceClass  o : fareStructure.getServiceClassDefinitions().getServiceClassDefinitions()) {
			if (o.getId().getName().equals(id)) return o;
		}
		return null;
	}


	private SalesAvailabilityConstraint findSalesAvailability(String id) {
		if (id == null || id.length() < 1) return null;
		for (SalesAvailabilityConstraint  o : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ReservationParameter findReservationParams(String id) {
		if (id == null || id.length() < 1) return null;
		for (ReservationParameter  o : fareStructure.getReservationParameters().getReservationParameters()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private RegionalConstraint findRegionalConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (RegionalConstraint  o : fareStructure.getRegionalConstraints().getRegionalConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ReductionConstraint findReductionConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (ReductionConstraint  o : fareStructure.getReductionConstraints().getReductionConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private Price findPrice(String id) {
		if (id == null || id.length() < 1) return null;
		for (Price o : fareStructure.getPrices().getPrices()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private PersonalDataConstraint finePersonalDataConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (PersonalDataConstraint  o : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private PassengerConstraint findPassengerConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (PassengerConstraint  o : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private LegacyAccountingIdentifier convert(LegacyAccountingIdentifierDef jo) {
		if (jo == null) return null;
		LegacyAccountingIdentifier o = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		o.setAddSeriesId(jo.getAddId());
		o.setSeriesId(jo.getSerialId());
		o.setTariffId(jo.getTariffId());
		return o;
	}


	private FulfillmentConstraint findFulfillmentConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (FulfillmentConstraint  o : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private CombinationConstraint findCombinationConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (CombinationConstraint  o : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private CarrierConstraint findCarrierConstraint(String id) {
		if (id == null || id.length() < 1) return null;
		for (CarrierConstraint  o : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private AfterSalesRule findAfterSaleRule(String id) {
		if (id == null || id.length() < 1) return null;
		for (AfterSalesRule  o : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ConnectionPoints convertConnectionPointList(List<ConnectionPointDef> jl) {
		ConnectionPoints o = GtmFactory.eINSTANCE.createConnectionPoints();
		for (ConnectionPointDef jc : jl) {
			o.getConnectionPoints().add(convert(jc));
		}
		return o;
	}


	private ConnectionPoint convert(ConnectionPointDef jc) {
		if (jc == null) return null;
		ConnectionPoint p = GtmFactory.eINSTANCE.createConnectionPoint();
		p.setDataSource(DataSource.IMPORTED);
		p.setId(jc.getId());
		p.setLegacyBorderPointCode(Integer.parseInt(jc.getLegacyBorderPointCode()));
		p.setName(jc.getName());
		p.setNameUtf8(jc.getName());
		if (jc.getStationSets() != null) {
			for (List<StationDef> js:  jc.getStationSets()) {
				StationSet ss = GtmFactory.eINSTANCE.createStationSet();
				ss.getStations().addAll(convertStationList(js));
				p.getConnectedStationSets().add(ss);
			}
		}
		return p;
	}


	private CombinationConstraints convertCombinationConstraintList(List<FareCombinationConstraintDef> jl) {

		CombinationConstraints o = GtmFactory.eINSTANCE.createCombinationConstraints();
		if (jl == null || jl.isEmpty()) return o;
		for (FareCombinationConstraintDef jf:jl) {
			o.getCombinationConstraints().add(convert(jf));
		}
		return o;
	}


	private CombinationConstraint convert(FareCombinationConstraintDef jf) {
		if (jf == null) return null;
		CombinationConstraint o = GtmFactory.eINSTANCE.createCombinationConstraint();
		o.setId(jf.getId());
		for  (FareCombinationModelDef jm: jf.getCombinationModels()) {
			o.getCombinationModels().add(convert(jm));
		}
		return o;
	}

	private FareCombinationModel convert(FareCombinationModelDef jm) {
		if (jm == null) return null;
		FareCombinationModel o = GtmFactory.eINSTANCE.createFareCombinationModel();
		o.setModel(CombinationModel.getByName(jm.getModel()));
		o.setOnlyWhenCombined(jm.getOnlyWhenCombined());
		o.setReferenceCluster(Clusters.getByName(jm.getReferenceCluster()));
		o.getAllowedAllocators().addAll(convertCarrierList(jm.getAllowedAllocators()));
		o.getAllowedClusters().addAll(convertClusterList(jm.getAllowedClusters()));
		o.getCombinableCarriers().addAll(convertCarrierList(jm.getCombinableCarrier()));
		return o;
	}


	private Collection<? extends Clusters> convertClusterList(List<String> jl) {
		ArrayList<Clusters> l = new ArrayList<Clusters>();
		if (jl == null || jl.isEmpty()) return l;
		for (String s : jl) {
			l.add(Clusters.getByName(s));
		}
		return l;
	}


	private CarrierConstraints convertCarrierConstraintList(List<CarrierConstraintDef> jo) {
		if (jo == null) return null;
		CarrierConstraints o = GtmFactory.eINSTANCE.createCarrierConstraints();
		for (CarrierConstraintDef cc : jo) {
			o.getCarrierConstraints().add(convert(cc));
		}
		return o;
	}


	private CarrierConstraint convert(CarrierConstraintDef cc) {
		if (cc == null) return null;
		CarrierConstraint o = GtmFactory.eINSTANCE.createCarrierConstraint();
		o.setId(cc.getId());
		o.getExcludedCarriers().addAll(convertCarrierList(cc.getExcludedCarrier()));
		o.getIncludedCarriers().addAll(convertCarrierList(cc.getIncludedCarrier()));		
		return o;
	}


	private Collection<? extends Carrier> convertCarrierList(List<String> jl) {
		ArrayList<Carrier> l = new ArrayList<Carrier>();
		if (jl == null || jl.isEmpty()) return l;
		for (String jc: jl) {
			l.add(getCarrier(jc));
		}
		return l;
	}


	private Calendars convertCalendarList(List<CalendarDef> jo) {
		Calendars o = GtmFactory.eINSTANCE.createCalendars();
		if (jo == null) return o;
		for (CalendarDef jc:  jo) {
			o.getCalendars().add(convert(jc));
		}
		return o;
	}


	private Calendar convert(CalendarDef jc) {
		if (jc == null) return null;
		Calendar o = GtmFactory.eINSTANCE.createCalendar();
		o.setId(jc.getId());
		o.setDataSource(DataSource.IMPORTED);
		o.setFromDate(jc.getFromDate());
		o.setUntilDate(jc.getUntilDate());	

		if ( jc.getDates() != null && !jc.getDates().isEmpty()) {
			o.getDates().addAll(jc.getDates());
		}
		o.setUtcOffset(jc.getUtcOffset());
		return o;
	}



	private Texts convertTextList(List<TextDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		Texts o = GtmFactory.eINSTANCE.createTexts();
		for (TextDef jo : jl) {
			o.getTexts().add(convert(jo));
		}
		return o;
	}


	private Text convert(TextDef jo) {
		if (jo == null) return null;
		Text o = GtmFactory.eINSTANCE.createText();
		o.setId(jo.getId());
		o.setShortTextICAO(jo.getShortText());
		o.setShortTextUTF8(jo.getShortTextUtf8());
		o.setTextICAO(jo.getText());
		o.setTextUTF8(jo.getTextUTF8());
		
		for (TranslationDef jt :  jo.getTranslations()) {
			Translation t = GtmFactory.eINSTANCE.createTranslation();
			t.setLanguage(getLanguage(jt.getLanguage()));
			t.setShortTextICAO(jt.getShortText());
			t.setShortTextUTF8(jt.getShortTextUtf8());
			t.setTextICAO(jt.getText());
			t.setTextUTF8(jt.getTextUTF8());
			o.getTranslations().add(t);
		}

		return o;
	}


	private AfterSalesRules convertAfterSalesRulesList(List<AfterSalesConditionDef> jl) {
		if (jl == null || jl.isEmpty()) return null;
		AfterSalesRules o = GtmFactory.eINSTANCE.createAfterSalesRules();
		
		for (AfterSalesConditionDef ja : jl) {
			AfterSalesRule r = GtmFactory.eINSTANCE.createAfterSalesRule();
			r.setId(ja.getId());
			for (AfterSalesRuleDef jr : ja.getAfterSalesRules()) {
				r.getConditions().add(convert(jr));
			}
			o.getAfterSalesRules().add(r);
		}
		return o;
	}


	

	private AfterSalesCondition convert(AfterSalesRuleDef jr) {
		if (jr == null) return null;
		AfterSalesCondition c = GtmFactory.eINSTANCE.createAfterSalesCondition();
		c.setApplicationTime(convert(jr.getApplicationTime()));
		Price fee = convert(jr.getFee());
		c.setFee(fee);
		c.setCarrierFee(jr.getCarrierFee());
		c.setIndividualContracts(jr.getIndividualContracts());
		c.setTransactionType(AfterSalesTransactionType.getByName(jr.getTransactionType()));
		return c;
	}


	private Price convert(PriceDef jp) {
		if (jp == null) return null;
		Price p = GtmFactory.eINSTANCE.createPrice();

		p.setId(jp.getId());
		p.setDataSource(DataSource.IMPORTED);
		
		for (CurrencyPriceDef jcp : jp.getPrice()) {
			CurrencyPrice cp = convert(jcp);
			if (jp != null) {
				p.getCurrencies().add(cp);
			}
		}	
		return p;
	}


	private ApplicationTime convert(RelativeTimeDef ja) {
		if (ja == null) return null;
		ApplicationTime a = GtmFactory.eINSTANCE.createApplicationTime();
		if (ja.getTimeReference()!= null) {
			a.setReference(TimeReferenceType.getByName(ja.getTimeReference().name()));
		}
		if (ja.getTimeUnit()!= null) {
			a.setUnit(TimeUnit.getByName(ja.getTimeUnit().name()));
		}
		a.setValue(ja.getTimeValue());
		return a;
	}


	private Delivery convert(FareDeliveryDetailsDef jo) {
		if (jo == null) return null;
		Delivery o = GtmFactory.eINSTANCE.createDelivery();
		o.setAcceptedSchemaVersion(SchemaVersion.get(jo.getAcceptedVersion()));
		o.setId(jo.getDeliveryId());
		o.setOptional(jo.getOptionalDelivery());
		o.setPreviousDeliveryId(jo.getPreviousDeliveryId());
		o.setProvider(getCarrier(jo.getFareProvider()));
		o.setReplacedDeliveryId(jo.getReplacementDeliveryId());
		o.setSchemaVersion(SchemaVersion.get(jo.getVersion()));
		return o;
	}
	

	private Station getStation (String code) {
		try {
			Integer icode = Integer.parseInt(code);
			return stations.get(icode);
		} catch (Exception e) {
			//non-standard station code
			return null;
		}

	}	
	
	private Station getStation (int country, int localCode) {
		return stations.get(Integer.valueOf(country * 100000 + localCode));
	}


	private ServiceBrand getServiceBrand (int code) {
		return serviceBrands.get(code);
	}

	private Carrier getCarrier (String code) {
		return carriers.get(code);
	}
	
	private Language getLanguage (String code) {
		return languages.get(code);
	}

	private Country getCountry (String code) {
		return countriesISO.get(code);
	}
	
	private Currency getCurrency (String code) {
		return currencies.get(code);
	}
	private NutsCode getNutsCode (String code) {
		return nutsCodes.get(code);
	}

	

}
