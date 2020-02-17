package Gtm.jsonImportExport;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import Gtm.*;
import Gtm.actions.GtmUtils;
import gtm.AfterSalesConditionDef;
import gtm.AfterSalesRuleDef;
import gtm.AllowedChange;
import gtm.CalendarDef;
import gtm.CarrierConstraintDef;
import gtm.CarrierResourceLocationDef;
import gtm.ConnectionPointDef;
import gtm.CurrencyPriceDef;
import gtm.FareCombinationConstraintDef;
import gtm.FareCombinationModelDef;
import gtm.FareDef;
import gtm.FareDelivery;
import gtm.FareReferenceStationSetDef;
import gtm.FareResourceLocationDef;
import gtm.FulfillmentTypeDef;
import gtm.FullfillmentConstraintDef;
import gtm.GeoCoordinateDef;
import gtm.IncludedFreePassenger;
import gtm.LineDef;
import gtm.OnlineResourceDef;
import gtm.PassengerConstraintDef;
import gtm.PersonalDataConstraintDef;
import gtm.PolygoneDef;
import gtm.PriceDef;
import gtm.ReductionCardDef;
import gtm.ReductionConstraintDef;
import gtm.RegionalConstraintDef;
import gtm.RegionalValidityDef;
import gtm.RelativeTimeDef;
import gtm.RequiredCard;
import gtm.RequiredDatum;
import gtm.ReservationOptionGroupDef;
import gtm.ReservationParameterDef;
import gtm.ReturnConstraint;
import gtm.SalesAvailabilityConstraintDef;
import gtm.ServiceClassDef;
import gtm.ServiceConstraintDef;
import gtm.ServiceLevelDef;
import gtm.StationDef;
import gtm.StationResourceLocationDef;
import gtm.TextDef;
import gtm.TrainResourceLocationDef;
import gtm.TranslationDef;
import gtm.TravelValidityConstraintDef;
import gtm.ViaStationsDef;
import gtm.ZoneDef;


public class GTMJsonImporter {
	
	private HashMap<Integer,Station> stations = null;	
	private HashMap<String,Carrier> carriers = null;
	private HashMap<String,Language> languages = null;
	private HashMap<Integer,Country> countries = null;
	private HashMap<String,Country> countriesISO = null;	
	private HashMap<String,Currency> currencies = null;	
	private HashMap<Integer,ServiceBrand> serviceBrands = null;
	private HashMap<String,NutsCode> nutsCodes = null;
	
	final DateFormat fmtZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	final DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	GTMTool tool = null;
	

	
	public GTMJsonImporter(GTMTool tool) {
		this.tool = tool;
		stations = new HashMap<Integer,Station>();
		carriers = new HashMap<String,Carrier>();
		languages = new HashMap<String,Language>();
		countriesISO = new HashMap<String,Country>();
		countries = new HashMap<Integer,Country>();
		currencies = new HashMap<String,Currency>();	
		serviceBrands = new HashMap<Integer,ServiceBrand>();
		nutsCodes = new HashMap<String,NutsCode>();	
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			stations.put(Integer.valueOf(station.getCountry().getCode())*100000 + Integer.parseInt(station.getCode()) , station);
		}
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
	

	private FareStructure convert(gtm.FareStructure jo) {
		
		FareStructure o = GtmFactory.eINSTANCE.createFareStructure();
		
		o.setCalendars(convertCalendarList(jo.getCalendars()));
		
		o.setTexts(convertTextList(jo.getTexts()));
		
		o.setAfterSalesRules(convertAfterSalesRulesList(jo.getAfterSalesConditions()));
		
		o.setCarrierConstraints(convertCarrierConstraintList(jo.getCarrierConstraints()));
		
		o.setCombinationConstraints(convertCombinationConstraintList(jo.getCombinationConstraints()));
		
		o.setConnectionPoints(convertConnectionPointList(jo.getConnectionPoints()));
		
		o.setFareResourceLocations(convertFareResourceList(jo.getFareResourceLocation()));
		
		o.setFulfillmentConstraints(convertFulfillmentList(jo.getFullfillmentConstraints()));
		
		o.setPassengerConstraints(convertPassengerConstraints(jo.getPassengerConstraints()));
		
		o.setPersonalDataConstraints(convertPersonalDataConstraints(jo.getPersonalDataConstraints()));
		
		o.setPrices(convertPrices(jo.getPrices()));
		
		o.setReductionCards(convertReductionCards(jo.getReductionCards()));
		
		o.setReductionConstraints(convertReductionConstraints(jo.getReductionConstraints()));
		
		o.setRegionalConstraints(convertRegionalConstraints(jo.getRegionalConstraints()));
		
		o.setReservationParameters(convertReservationParameters(jo.getReservationParameters()));
		
		o.setSalesAvailabilityConstraints(convertSalesAvailabilities(jo.getSalesAvailabilityConstraint()));
		
		o.setServiceClassDefinitions(convertServiceClassDefinitions(jo.getServiceClassDefinitions()));
		
		o.setServiceConstraints(convertServiceConstraints(jo.getServiceConstraints()));
		
		o.setServiceLevelDefinitions(convertServiceLevelDefinitions(jo.getServiceLevelDefinitions()));
		
		o.setSupportedOnlineServices(convertSupportedOnlineServices(jo.getSupportedOnlineServices()));
		
		o.setTravelValidityConstraints(convertTravelValidityConstraints(jo.getTravelValidityConstraints()));
		
		o.setFareStationSetDefinitions(convertFareStationSetDefinitions(jo.getFareReferenceStationSetDefinitions()));
		
		o.setFareElements(convertFareElementList(jo.getFares()));		
		
		return o;
	}
	
	private FareStationSetDefinitions convertFareStationSetDefinitions(List<FareReferenceStationSetDef> list) {
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
		ReturnValidityConstraint o = GtmFactory.eINSTANCE.createReturnValidityConstraint();
		o.setEarliestReturn(jr.getEarliestReturn());
		o.setLatestReturn(jr.getLatestReturn());
		o.getExcludedWeekdays().addAll(convertWeekdays(jr.getExcludedWeekdays()));
		return o;
	}


	private Collection<? extends WeekDay> convertWeekdays(List<Integer> jl) {
		ArrayList<WeekDay> o = new ArrayList<WeekDay>();
		for (Integer i : jl) {
			o.add(WeekDay.get(i.intValue()));
		}
		return o;
	}


	private ValidityRange convert(gtm.ValidityRange jv) {
		ValidityRange v = GtmFactory.eINSTANCE.createValidityRange();
		v.setHoursAfterMidnight(jv.getHoursAfterMidnight());  
		v.setUnit(TimeUnit.getByName(jv.getTimeUnit()));
		v.setValue(jv.getValue());   
		return v;
	}


	private SupportedOnlineServices convertSupportedOnlineServices(List<String> jl) {
		SupportedOnlineServices o = GtmFactory.eINSTANCE.createSupportedOnlineServices();
		
		for ( String jo : jl) {
			o.getSupportedOnlineServices().add(OnlineServiceType.getByName(jo));
		}
		return o;
	}


	private ServiceLevelDefinitions convertServiceLevelDefinitions(List<ServiceLevelDef> jl) {
		ServiceLevelDefinitions o = GtmFactory.eINSTANCE.createServiceLevelDefinitions();
		
		for (ServiceLevelDef js : jl) {
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


	private ServiceClassDefinitions convertServiceClassDefinitions(List<ServiceClassDef> jl) {
		ServiceClassDefinitions o = GtmFactory.eINSTANCE.createServiceClassDefinitions();
		for (ServiceClassDef js : jl) {
			o.getServiceClassDefinitions().add(convert(js));
		}
		return o;
	}


	private ServiceClass convert(ServiceClassDef js) {
		ServiceClass s = GtmFactory.eINSTANCE.createServiceClass();
		s.setId(ClassId.getByName(js.getId()));
		s.setText(findText(js.getTextRef()));
		s.setClassicClass(ClassicClassType.getByName(js.getClassicClass()));
		return s;
	}


	private SalesAvailabilityConstraints convertSalesAvailabilities(List<SalesAvailabilityConstraintDef> jl) {
		SalesAvailabilityConstraints o = GtmFactory.eINSTANCE.createSalesAvailabilityConstraints();
		
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
		
		for (gtm.SalesRestriction jr : jl) {
			SalesRestriction r = GtmFactory.eINSTANCE.createSalesRestriction();
			r.setEndOfSale(convertEndDate(jr.getEndOfSale()));
			r.setStartOfSale(convertStartDate(jr.getStartOfSale()));
			r.setSalesDates(findCalendar(jr.getSalesDatesRef()));
		}

		return l;
	}
	
	
	
	private Calendar findCalendar(String id) {
		for (Calendar cal : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (cal.getId() == id) return cal;
		}
		return null;
	}


	private StartOfSale convertStartDate(RelativeTimeDef jo) {
		StartOfSale o = GtmFactory.eINSTANCE.createStartOfSale();
		o.setReference(TimeReferenceType.getByName(jo.getTimeReference()));
		o.setUnit(TimeUnit.getByName(jo.getTimeUnit()));
		o.setValue(jo.getTimeValue());
		return o;
	}


	private EndOfSale convertEndDate(RelativeTimeDef jo) {
		EndOfSale o = GtmFactory.eINSTANCE.createEndOfSale();
		o.setReference(TimeReferenceType.getByName(jo.getTimeReference()));
		o.setUnit(TimeUnit.getByName(jo.getTimeUnit()));
		o.setValue(jo.getTimeValue());
		return o;
	}


	private ReservationParameters convertReservationParameters(List<ReservationParameterDef> jl) {
		ReservationParameters o = GtmFactory.eINSTANCE.createReservationParameters();
		for (ReservationParameterDef jr : jl) {
			o.getReservationParameters().add(convert(jr));
		}
		return o;
	}


	private ReservationParameter convert(ReservationParameterDef jr) {
		ReservationParameter o = GtmFactory.eINSTANCE.createReservationParameter();
		
		o.setId(jr.getId());
		o.setOptionalReservation(!jr.getReservationRequired());
		o.setOptions(convert(jr.getReservationOptions()));
		o.setParams9181(convert(jr.getReservationParams9181()));

		return o;
	}


	private ReservationParams9181 convert(gtm.ReservationParams9181 jr) {
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
		ReservationOptions o = GtmFactory.eINSTANCE.createReservationOptions();
		o.setGraphicalReservation(GraphicalReservationType.getByName(jr.getGraficalReservation()));
		o.getPreferences().addAll(convertPreferencesList(jr.getPreferences()));
		o.getServiceBrands().addAll(convertServiceBrandList(jr.getServiceBrands()));
		return o;
	}


	private Collection<? extends ReservationPreferenceGroup> convertPreferencesList(List<ReservationOptionGroupDef> jl) {
		ArrayList <ReservationPreferenceGroup> o = new ArrayList<ReservationPreferenceGroup>();
		for (ReservationOptionGroupDef jr : jl) {
			ReservationPreferenceGroup rg = GtmFactory.eINSTANCE.createReservationPreferenceGroup();
			rg.getPreference().addAll(convert(jr));
			rg.setGroup(jr.getPreferenceGroup());
		}
		return o;
	}

	
	private Collection<? extends String> convert(ReservationOptionGroupDef jr) {
		return jr.getPreference();
	}


	private RegionalConstraints convertRegionalConstraints(List<RegionalConstraintDef> jl) {
		RegionalConstraints o = GtmFactory.eINSTANCE.createRegionalConstraints();
		for (RegionalConstraintDef jr : jl) {
			o.getRegionalConstraints().add(convert(jr));
		}
		return o;
	}


	private RegionalConstraint convert(RegionalConstraintDef jr) {
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
		
		for (RegionalValidityDef jr : jl) {
			RegionalValidity r = GtmFactory.eINSTANCE.createRegionalValidity();
			r.setLine(convert(jr.getLine()));
			r.setPolygone(convert(jr.getPolygone()));
			r.setViaStation(convert(jr.getViaStations()));
			r.setSeqNb(jr.getSeqNb());
			r.setZone(convert(jr.getZone()));
			r.setLine(convert(jr.getLine()));
			
			l.add(r);
		}

		return l;
	}


	private Zone convert(ZoneDef jz) {
		
		Zone z = GtmFactory.eINSTANCE.createZone();
		z.setBinaryZoneId(jz.getBinaryZoneId().getBytes());
		z.setCarrier(getCarrier(jz.getCarrier()));
		z.setCity(jz.getCity());
		if (jz.getEntryStation()!= null) {
			z.setEntryStation(getStation(jz.getEntryStation().getCountry(),jz.getEntryStation().getLocalCode()));
		}
		if (jz.getTerminalStation()!= null) {
			z.setTerminalStation(getStation(jz.getTerminalStation().getCountry(),jz.getTerminalStation().getLocalCode()));
		}		
		z.setNutsCode(getNutsCode(jz.getNutsCode()));
		
		for (Integer id : jz.getZoneId()) {
			z.getZoneId().add(id.toString());
		}
		return z;
	}


	private ViaStation convert(ViaStationsDef jv) {
		ViaStation v = GtmFactory.eINSTANCE.createViaStation();
		v.setCarrier(getCarrier(jv.getCarrier()));
		if (jv.getStation() != null) {
			v.setStation(getStation(jv.getStation().getCountry(),jv.getStation().getLocalCode()));
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


	private Polygone convert(PolygoneDef jp) {
		Polygone p = GtmFactory.eINSTANCE.createPolygone();
		p.getEdge().addAll(convertEdgeList(jp.getEdge()));

		return p;
	}


	private Collection<? extends Edge> convertEdgeList(List<GeoCoordinateDef> jl) {
		ArrayList<Edge> l = new ArrayList<Edge>();
		for (GeoCoordinateDef jg : jl) {
			Edge e = GtmFactory.eINSTANCE.createEdge();
            e.setLatitude(jg.getLatitude());
            e.setLongitude(jg.getLongitude());
            e.setAccuracy(GeoUnit.getByName(jg.getAccuracy()));
			
			l.add(e);
		}
		return l;
	}


	private Line convert(LineDef jz) {
		Line l = GtmFactory.eINSTANCE.createLine();
		
		l.setBinaryZoneId(jz.getBinaryZoneId().getBytes());
		l.setCarrier(getCarrier(jz.getCarrier()));
		l.setCity(jz.getCity());
		if (jz.getEntryStation()!= null) {
			l.setEntryStation(getStation(jz.getEntryStation().getCountry(),jz.getEntryStation().getLocalCode()));
		}
		if (jz.getTerminalStation()!= null) {
			l.setTerminalStation(getStation(jz.getTerminalStation().getCountry(),jz.getTerminalStation().getLocalCode()));
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


	private Collection<? extends RequiredReductionCard> convertReductionCardList(List<RequiredCard> jl) {
		ArrayList<RequiredReductionCard> o = new ArrayList<RequiredReductionCard>();
		
		for ( RequiredCard jr : jl) {
			RequiredReductionCard r = GtmFactory.eINSTANCE.createRequiredReductionCard();
			r.setCard(findReductionCard(jr.getCardId()));
			r.setCardClass(findServiceClass(jr.getCardClassId()));
			r.setName(jr.getCardName());
			
			o.add(r);
		}
		return o;
	}


	private ReductionCard findReductionCard(String cardId) {
		for (ReductionCard card : tool.getGeneralTariffModel().getFareStructure().getReductionCards().getReductionCards()) {
			if (card.getId() == cardId) return card;
		}
		return null;
	}


	private ReductionCards convertReductionCards(List<ReductionCardDef> jl) {
		
		ReductionCards l = GtmFactory.eINSTANCE.createReductionCards();
		
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
		
		for (PriceDef jp : jo) {
			Price p = convert(jp);
			if (p != null) {
				o.getPrices().add(p);
			}
		}
		return o;
	}


	private CurrencyPrice convert(CurrencyPriceDef jcp) {
		CurrencyPrice o = GtmFactory.eINSTANCE.createCurrencyPrice(); 
		o.setAmount(jcp.getAmount().floatValue());
		o.setCurrency(getCurrency(jcp.getCurrency()));
		return o;
	}


	private PersonalDataConstraints convertPersonalDataConstraints(List<PersonalDataConstraintDef> jl) {
		PersonalDataConstraints o = GtmFactory.eINSTANCE.createPersonalDataConstraints();
		for (PersonalDataConstraintDef jp:jl) {
			o.getPersonalDataConstraints().add(convert(jp));
		}
		return o;
	}


	private PersonalDataConstraint convert(PersonalDataConstraintDef jp) {
		PersonalDataConstraint p = GtmFactory.eINSTANCE.createPersonalDataConstraint();
		p.setId(jp.getId());
		p.getRequiredPersonalData().addAll(convertRequiredPersonalDataList(jp.getRequiredData()));
		p.getAllowedChanges().addAll(convertAllowedChangesList(jp.getAllowedChanges()));
		return p;
	}




	private Collection<? extends AllowedPersonalDataChanges> convertAllowedChangesList(List<AllowedChange> jl) {
		ArrayList<AllowedPersonalDataChanges> l = new ArrayList<AllowedPersonalDataChanges>();
		for (AllowedChange ja : jl) {
			AllowedPersonalDataChanges o = GtmFactory.eINSTANCE.createAllowedPersonalDataChanges();
			o.setTimeLimit(ja.getTimeLimit()); 
			o.setAcceptedReason(PersonalDataChangeReason.getByName(ja.getAcceptedReason()));
		}
		return l;
	}


	private Collection<? extends RequiredPersonalData> convertRequiredPersonalDataList(	List<RequiredDatum> jr) {
		ArrayList<RequiredPersonalData> l = new ArrayList<RequiredPersonalData>();
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


	private Collection<? extends PersonalDataTransferType> convertTransferTypes(List<String> jl) {
		ArrayList<PersonalDataTransferType> l = new ArrayList<PersonalDataTransferType>(); 
		for (String s : jl){
			l.add(PersonalDataTransferType.getByName(s));	
		}
		return null;
	}


	private Collection<? extends CrossBorderCondition> convertCrossBorderList(List<gtm.CrossBorderCondition> jl) {
		ArrayList<CrossBorderCondition> l = new ArrayList<CrossBorderCondition>(); 
		for (gtm.CrossBorderCondition s : jl){
			l.add(convert(s));	
		}
		return null;
	}


	private CrossBorderCondition convert(gtm.CrossBorderCondition js) {
		CrossBorderCondition c = GtmFactory.eINSTANCE.createCrossBorderCondition();
		c.setFromCountry(getCountry(js.getFromCountry()));
		c.setToCountry(getCountry(js.getToCountry()));
		c.getAffectedServiceBrands().addAll(convertServiceBrandList(js.getAffectedServiceBrands()));
		return c;
	}


	private Collection<? extends ServiceBrand> convertServiceBrandList(List<Integer> jl) {
		ArrayList<ServiceBrand> o = new ArrayList<ServiceBrand>();
		for (Integer i : jl) {
			o.add(getServiceBrand(i));
		}
		return null;
	}


	private PassengerConstraints convertPassengerConstraints(List<PassengerConstraintDef> jl) {
		PassengerConstraints o = GtmFactory.eINSTANCE.createPassengerConstraints();
		for (PassengerConstraintDef jp : jl ) {
			o.getPassengerConstraints().add(convert(jp));
		}
		return o;
	}


	private PassengerConstraint convert(PassengerConstraintDef jp) {
		PassengerConstraint p = GtmFactory.eINSTANCE.createPassengerConstraint();
		p.setId(jp.getId());
		p.getIncludedFreePassengers().addAll(convertIncludedFreePassengers(jp.getIncludedFreePassenger()));
		p.setIsAncilliary(jp.getIsAncilliaryItem());
		p.setLowerAgeLimit(jp.getLowerAgeLimit());
		p.setUpperAgeLimit(jp.getUpperAgeLimit());
		p.getExcludedPassengerCombinations().addAll(convertPassengerCombinationList(jp.getCombinationConstraint()));
		p.setMaxTotalPassengerWeight(jp.getMaxWeightedPasseners());
		p.setMinTotalPassengerWeight(jp.getMinWeightedPassengers());
		p.setPassengerWeight(jp.getPassengerWeight());
		p.setReservationAgeLimit(jp.getAgeLimitForReservation());
		p.setText(findText(jp.getNameRef()));
		p.setTravelerType(TravelerType.getByName(jp.getPassengerType()));

		return p;
	}


	private Collection<? extends PassengerCombinationConstraint> convertPassengerCombinationList(List<gtm.CombinationConstraint> jl) {
		
		ArrayList<PassengerCombinationConstraint> l = new ArrayList<PassengerCombinationConstraint>();
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
		for (IncludedFreePassenger jc : jl) {
			IncludedFreePassengerLimit o = GtmFactory.eINSTANCE.createIncludedFreePassengerLimit();
			o.setNumber(jc.getNumber());
			o.setPassengerType(TravelerType.getByName(jc.getPassengerTypeRef()));
			l.add(o);
		}

		return l;
	}


	private FulfillmentConstraints convertFulfillmentList(List<FullfillmentConstraintDef> jl) {
		FulfillmentConstraints o = GtmFactory.eINSTANCE.createFulfillmentConstraints();
		for (FullfillmentConstraintDef jf : jl) {
			o.getFulfillmentConstraints().add(convert(jf));
		}
		return o;
	}


	private FulfillmentConstraint convert(FullfillmentConstraintDef jf) {
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
		f.getAcceptedFulfilmentTypes().addAll(convertFulfillmentTypes(jf.getAcceptedFullfillmentTypes()));
		f.getRequiredControlDataExchange().addAll(convertControlDataExchange(jf.getRequiredSiS()));
		return f;
	}


	private Collection<? extends BarcodeTypes> convertBarCodeTypes(List<String> jl) {
		ArrayList<BarcodeTypes> l = new ArrayList<BarcodeTypes> ();
		for (String s : jl) {
			l.add(BarcodeTypes.getByName(s));
		}
		return l;
	}


	private Collection<? extends ControlDataExchangeTypes> convertControlDataExchange(List<String> jl) {
		ArrayList<ControlDataExchangeTypes> l = new ArrayList<ControlDataExchangeTypes> ();
		for (String s : jl) {
			l.add(ControlDataExchangeTypes.getByName(s));
		}
		return l;
	}


	private Collection<? extends FulfillmentType> convertFulfillmentTypes(List<FulfillmentTypeDef> jl) {
		ArrayList<FulfillmentType> l = new ArrayList<FulfillmentType>();
		for (FulfillmentTypeDef jf : jl) {
			l.add(FulfillmentType.getByName(jf.name()));
		}
		return l;
	}


	private FareResourceLocations convertFareResourceList(FareResourceLocationDef j) {
		FareResourceLocations o = GtmFactory.eINSTANCE.createFareResourceLocations();
		o.setCarrierResourceLocations(convertCarrierResourceLocations(j.getCarrierLocations()));
		o.setStationResourceLocations(convertStationResourceLocations(j.getStationLocations()));		
		o.setTrainResourceLocations(convertTrainResourceLocations(j.getTrainLocations()));
		return o;
	}


	private StationResourceLocations convertStationResourceLocations(List<StationResourceLocationDef> jl) {
		StationResourceLocations o = GtmFactory.eINSTANCE.createStationResourceLocations();
		for (StationResourceLocationDef js : jl) {
			o.getStationResourceLocations().add(convert(js));
		}
		return o;
	}


	private StationResourceLocation convert(StationResourceLocationDef js) {
		StationResourceLocation r = GtmFactory.eINSTANCE.createStationResourceLocation();
		r.getConnectionPoints().addAll(getConnectionPointList(js.getConnectionPointIds()));
		r.getStations().addAll(convertStationList(js.getStations()));
		r.getOnlineResources().addAll(convertOnlineResources(js.getOnlineResource()));
		return r;
	}


	private Collection<? extends ConnectionPoint> getConnectionPointList(List<String> jl) {
		ArrayList<ConnectionPoint> l = new ArrayList<ConnectionPoint>();
		for (String s : jl) {
			l.add(findConnectionPoint(s));
		}
		return l;
	}


	private TrainResourceLocations convertTrainResourceLocations(List<TrainResourceLocationDef> jl) {
		TrainResourceLocations o = GtmFactory.eINSTANCE.createTrainResourceLocations();
		for (TrainResourceLocationDef jt : jl) {
			o.getTrainResourceLocations().add(convert(jt));
		}
		return o;
	}


	private TrainResourceLocation convert(TrainResourceLocationDef jt) {
		TrainResourceLocation o = GtmFactory.eINSTANCE.createTrainResourceLocation();
		o.setCarrier(getCarrier(jt.getCarrier()));
		o.setTrainId(jt.getTrainId());
		o.getOnlineResources().addAll(convertOnlineResources(jt.getOnlineResource()));
		return o;
	}


	private Collection<? extends OnlineResource> convertOnlineResources(List<OnlineResourceDef> jl) {
		ArrayList<OnlineResource> l = new ArrayList<OnlineResource>();
		for (OnlineResourceDef jo: jl ) {
			l.add(convert(jo));
		}
		return l;
	}


	private OnlineResource convert(OnlineResourceDef jo) {
		OnlineResource o = GtmFactory.eINSTANCE.createOnlineResource();
		o.setInterfaceType(InterfaceType.getByName(jo.getInterfaceType()));
		o.setOfferRequestType(OfferRequestType.getByName(jo.getOfferType()));
		o.setSystem(jo.getSystem());
		o.setVersion(jo.getVersion());
		return o;
	}


	private ConnectionPoint findConnectionPoint(String id) {	
		for (ConnectionPoint c :  tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints() ) {
			if (c.getId().equals(id)) return c;
		}
		return null;
	}


	private Collection<? extends Station> convertStationList(List<StationDef> stations) {
		ArrayList<Station> l = new ArrayList<Station>();
		for (StationDef s : stations) {
			try {
				Station station = getStation(Integer.parseInt(s.getCountry()), Integer.parseInt(s.getLocalCode()));
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
		CarrierResourceLocations o = GtmFactory.eINSTANCE.createCarrierResourceLocations();
		for (CarrierResourceLocationDef jr : jl) {
			o.getCarrierResourceLocations().add(convert(jr));
		}
		return o;
	}


	private CarrierResourceLocation convert(CarrierResourceLocationDef jr) {
		CarrierResourceLocation o = GtmFactory.eINSTANCE.createCarrierResourceLocation();
		o.setCarrier(getCarrier(jr.getCarrier()));
		o.setServiceBrand(getServiceBrand(jr.getServiceBrandCode()));
	    o.getOnlineResources().addAll(convertOnlineResources(jr.getOnlineResource()));
		return o;
	}


	private FareElements convertFareElementList(List<FareDef> jl) {
		FareElements o = GtmFactory.eINSTANCE.createFareElements();
		for (FareDef jf : jl) {
			o.getFareElements().add(convert(jf));
		}
		return o;
	}


	private FareElement convert(FareDef jf) {
		FareElement f = GtmFactory.eINSTANCE.createFareElement();
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
		return f;
	}


	private Text findText(String id) {
		for (Text  o : tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private TravelValidityConstraint findTravelValidity(String id) {
		for (TravelValidityConstraint  o : tool.getGeneralTariffModel().getFareStructure().getTravelValidityConstraints().getTravelValidityConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ServiceLevel findServiceLevel(String id) {
		for (ServiceLevel o : tool.getGeneralTariffModel().getFareStructure().getServiceLevelDefinitions().getServiceLevelDefinition()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ServiceConstraint findServiceConstraint(String id) {
		for (ServiceConstraint o : tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ServiceClass findServiceClass(String id) {
		for (ServiceClass  o : tool.getGeneralTariffModel().getFareStructure().getServiceClassDefinitions().getServiceClassDefinitions()) {
			if (o.getId().getName() == id) return o;
		}
		return null;
	}


	private SalesAvailabilityConstraint findSalesAvailability(String id) {
		for (SalesAvailabilityConstraint  o : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ReservationParameter findReservationParams(String id) {
		for (ReservationParameter  o : tool.getGeneralTariffModel().getFareStructure().getReservationParameters().getReservationParameters()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private RegionalConstraint findRegionalConstraint(String id) {
		for (RegionalConstraint  o : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private ReductionConstraint findReductionConstraint(String id) {
		for (ReductionConstraint  o : tool.getGeneralTariffModel().getFareStructure().getReductionConstraints().getReductionConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private Price findPrice(String id) {
		for (Price o : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private PersonalDataConstraint finePersonalDataConstraint(String id) {
		for (PersonalDataConstraint  o : tool.getGeneralTariffModel().getFareStructure().getPersonalDataConstraints().getPersonalDataConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private PassengerConstraint findPassengerConstraint(String id) {
		for (PassengerConstraint  o : tool.getGeneralTariffModel().getFareStructure().getPassengerConstraints().getPassengerConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private LegacyAccountingIdentifier convert(gtm.LegacyAccountingIdentifier jo) {
		LegacyAccountingIdentifier o = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		o.setAddSeriesId(jo.getAddId());
		o.setSeriesId(jo.getSerialId());
		o.setTariffId(jo.getTariffId());
		return o;
	}


	private FulfillmentConstraint findFulfillmentConstraint(String id) {
		for (FulfillmentConstraint  o : tool.getGeneralTariffModel().getFareStructure().getFulfillmentConstraints().getFulfillmentConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private CombinationConstraint findCombinationConstraint(String id) {
		for (CombinationConstraint  o : tool.getGeneralTariffModel().getFareStructure().getCombinationConstraints().getCombinationConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private CarrierConstraint findCarrierConstraint(String id) {
		for (CarrierConstraint  o : tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints()) {
			if (o.getId().equals(id)) return o;
		}
		return null;
	}


	private AfterSalesRule findAfterSaleRule(String id) {
		for (AfterSalesRule  o : tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules().getAfterSalesRules()) {
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
		for (FareCombinationConstraintDef jf:jl) {
			o.getCombinationConstraints().add(convert(jf));
		}
		return o;
	}


	private CombinationConstraint convert(FareCombinationConstraintDef jf) {
		CombinationConstraint o = GtmFactory.eINSTANCE.createCombinationConstraint();
		o.setId(jf.getId());
		for  (FareCombinationModelDef jm: jf.getCombinationModels()) {
			o.getCombinationModels().add(convert(jm));
		}
		return o;
	}

	private FareCombinationModel convert(FareCombinationModelDef jm) {
		FareCombinationModel o = GtmFactory.eINSTANCE.createFareCombinationModel();
		o.setModel(CombinationModel.getByName(jm.getModel()));
		o.setOnlyWhenCombined(jm.getOnlyWhenCombined());
		o.setReferenceCluster(Clusters.getByName(jm.getReferenceCluster()));
		o.getAllowedAllocators().addAll(convertCarrierList(jm.getAllowedAllocators()));
		o.getAllowedClusters().addAll(convertClusterList(jm.getAllowedClusters()));
		o.getCombinableCarriers().addAll(convertCarrierList(jm.getCombinableCarrier()));
		return o;
	}


	private Collection<? extends Clusters> convertClusterList(List<String> cluster) {
		ArrayList<Clusters> l = new ArrayList<Clusters>();
		for (String s : cluster) {
			l.add(Clusters.getByName(s));
		}
		return l;
	}


	private CarrierConstraints convertCarrierConstraintList(List<CarrierConstraintDef> jo) {
		CarrierConstraints o = GtmFactory.eINSTANCE.createCarrierConstraints();
		for (CarrierConstraintDef cc : jo) {
			o.getCarrierConstraints().add(convert(cc));
		}
		return o;
	}


	private CarrierConstraint convert(CarrierConstraintDef cc) {
		CarrierConstraint o = GtmFactory.eINSTANCE.createCarrierConstraint();
		o.setId(cc.getId());
		o.getExcludedCarriers().addAll(convertCarrierList(cc.getExcludedCarrier()));
		o.getIncludedCarriers().addAll(convertCarrierList(cc.getIncludedCarrier()));		
		return o;
	}


	private Collection<? extends Carrier> convertCarrierList(List<String> jl) {
		ArrayList<Carrier> l = new ArrayList<Carrier>();
		for (String jc: jl) {
			l.add(getCarrier(jc));
		}
		return l;
	}


	private Calendars convertCalendarList(List<CalendarDef> jo) {
		Calendars o = GtmFactory.eINSTANCE.createCalendars();
		for (CalendarDef jc:  jo) {
			o.getCalendars().add(convert(jc));
		}
		return o;
	}


	private Calendar convert(CalendarDef jc) {
		Calendar o = GtmFactory.eINSTANCE.createCalendar();
		o.setId(jc.getId());
		o.setDataSource(DataSource.IMPORTED);
		o.setFromDate(convertDate(jc.getFromDate()));
		o.setUntilDate(convertDate(jc.getUntilDate()));	
		for ( String jd : jc.getDates()) {
			o.getDates().add(convertDate(jd));
		}
		o.setUtcOffset(jc.getUTCoffset());
		return o;
	}


	private Date convertDate(String dateString) {
	    try {
	    	if (dateString.endsWith("Z")) {
				return fmtZ.parse(dateString);
	    	} else {
	    		return fmt.parse(dateString);
	    	}
		} catch (ParseException e) {
			// something strange happend
			String message = "error in date format: " + dateString;
			GtmUtils.writeConsoleError(message);
		}
		return null;	
	}


	private Texts convertTextList(List<TextDef> jos) {
		Texts o = GtmFactory.eINSTANCE.createTexts();
		for (TextDef jo : jos) {
			o.getTexts().add(convert(jo));
		}
		return o;
	}


	private Text convert(TextDef jo) {
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


	private AfterSalesRules convertAfterSalesRulesList(List<AfterSalesConditionDef> jos) {
		AfterSalesRules o = GtmFactory.eINSTANCE.createAfterSalesRules();
		
		for (AfterSalesConditionDef ja : jos) {
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
		ApplicationTime a = GtmFactory.eINSTANCE.createApplicationTime();
		a.setReference(TimeReferenceType.getByName(ja.getTimeReference()));
		a.setUnit(TimeUnit.getByName(ja.getTimeUnit()));
		a.setValue(ja.getTimeValue());
		return a;
	}


	private Delivery convert(gtm.Delivery jo) {
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
	

	private Station getStation (String country, String code) {
		return stations.get(Integer.valueOf(Integer.parseInt(country,0) * 1000000 + Integer.parseInt(code,0)));
	}	
	
	private Station getStation (int country, int localCode) {
		return stations.get(Integer.valueOf(country * 1000000 + localCode));
	}

	private Station getStation (Integer code) {
		return stations.get(code);
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

	private Country getCountry (Integer code) {
		return countries.get(code);
	}
	
	private Country getCountry (int code) {
		return countries.get(Integer.valueOf(code));
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
