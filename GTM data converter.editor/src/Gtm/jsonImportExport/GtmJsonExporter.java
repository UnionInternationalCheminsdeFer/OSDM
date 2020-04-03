package Gtm.jsonImportExport;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;

import Gtm.AfterSalesCondition;
import Gtm.AfterSalesRule;
import Gtm.AfterSalesRules;
import Gtm.AllowedPersonalDataChanges;
import Gtm.AlternativeRoute;
import Gtm.BarcodeTypes;
import Gtm.Calendar;
import Gtm.Calendars;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CarrierConstraints;
import Gtm.CarrierResourceLocation;
import Gtm.CarrierResourceLocations;
import Gtm.Clusters;
import Gtm.CombinationConstraints;
import Gtm.ConnectionPoint;
import Gtm.ConnectionPoints;
import Gtm.ControlDataExchangeTypes;
import Gtm.CurrencyPrice;
import Gtm.Edge;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareElements;
import Gtm.FareResourceLocations;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentConstraints;
import Gtm.FulfillmentType;
import Gtm.GeneralTariffModel;
import Gtm.IncludedFreePassengerLimit;
import Gtm.Line;
import Gtm.NutsCode;
import Gtm.OnlineResource;
import Gtm.OnlineServiceType;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.PassengerConstraints;
import Gtm.PersonalDataConstraint;
import Gtm.PersonalDataConstraints;
import Gtm.PersonalDataTransferType;
import Gtm.Polygone;
import Gtm.Price;
import Gtm.Prices;
import Gtm.ReductionCard;
import Gtm.ReductionCards;
import Gtm.ReductionConstraint;
import Gtm.ReductionConstraints;
import Gtm.RegionalConstraint;
import Gtm.RegionalConstraints;
import Gtm.RegionalValidity;
import Gtm.RelativeTime;
import Gtm.RequiredPersonalData;
import Gtm.RequiredReductionCard;
import Gtm.ReservationParameter;
import Gtm.ReservationParameters;
import Gtm.ReservationPreferenceGroup;
import Gtm.ReturnValidityConstraint;
import Gtm.Route;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesAvailabilityConstraints;
import Gtm.SalesRestriction;
import Gtm.ServiceBrand;
import Gtm.ServiceClass;
import Gtm.ServiceClassDefinitions;
import Gtm.ServiceConstraint;
import Gtm.ServiceConstraints;
import Gtm.ServiceLevel;
import Gtm.ServiceLevelDefinitions;
import Gtm.ServiceMode;
import Gtm.Station;
import Gtm.StationNames;
import Gtm.StationResourceLocation;
import Gtm.StationResourceLocations;
import Gtm.StationSet;
import Gtm.Text;
import Gtm.Texts;
import Gtm.TimeRange;
import Gtm.TrainResourceLocation;
import Gtm.TrainResourceLocations;
import Gtm.Translation;
import Gtm.TravelValidityConstraint;
import Gtm.TravelValidityConstraints;
import Gtm.VATDetail;
import Gtm.ViaStation;
import Gtm.WeekDay;
import Gtm.Zone;
import Gtm.ZoneDefinition;
import Gtm.ZoneDefinitions;
import Gtm.nls.NationalLanguageSupport;
import gtm.AfterSalesConditionDef;
import gtm.AfterSalesRuleDef;
import gtm.AllowedChange;
import gtm.CalendarDef;
import gtm.CarrierConstraintDef;
import gtm.CarrierResourceLocationDef;
import gtm.CombinationConstraint;
import gtm.ConnectionPointDef;
import gtm.CrossBorderCondition;
import gtm.CurrencyPriceDef;
import gtm.Delivery;
import gtm.ExcludedTimeRange;
import gtm.FareCombinationConstraintDef;
import gtm.FareCombinationModelDef;
import gtm.FareDef;
import gtm.FareDelivery;
import gtm.FareReferenceStationSetDef;
import gtm.FareResourceLocationDef;
import gtm.FareStructure;
import gtm.FareStructureDeliveryDef;
import gtm.FulfillmentTypeDef;
import gtm.FullfillmentConstraintDef;
import gtm.GeoCoordinateDef;
import gtm.IncludedFreePassenger;
import gtm.LegacyAccountingIdentifier;
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
import gtm.ReservationOptions;
import gtm.ReservationParameterDef;
import gtm.ReservationParams9181;
import gtm.ReturnConstraint;
import gtm.SalesAvailabilityConstraintDef;
import gtm.ServiceClassDef;
import gtm.ServiceConstraintDef;
import gtm.ServiceLevelDef;
import gtm.StationDef;
import gtm.StationNamesDef;
import gtm.StationResourceLocationDef;
import gtm.TextDef;
import gtm.TrainResourceLocationDef;
import gtm.TranslationDef;
import gtm.TravelValidityConstraintDef;
import gtm.VatDetail;
import gtm.ViaStationsDef;
import gtm.ZoneDef;
import gtm.ZoneDefinitionDef;

public class GtmJsonExporter {
	
	
	/*
	 *  y   = year   (yy or yyyy)
	 *	M   = month  (MM)
	 *	d   = day in month (dd)
	 *	h   = hour (0-12)  (hh)
	 *	H   = hour (0-23)  (HH)
	 *	m   = minute in hour (mm)
	 *	s   = seconds (ss)
	 *	S   = milliseconds (SSS)
	 *	z   = time zone  text        (e.g. Pacific Standard Time...)
	 *	Z   = time zone, time offset (e.g. -0800)
	 *
	 *
	 * "2012-04-21T18:25:43-05:00"             ISO 8601
	 */
	private DateFormat jsondf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //$NON-NLS-1$

	
	public GtmJsonExporter () {
		
	}
	
	public FareDelivery convertToJson(GeneralTariffModel gtm, IProgressMonitor monitor) {
		
		if (gtm == null || gtm.getDelivery() == null || gtm.getFareStructure() == null) return null;
		
	
		FareDelivery export = new FareDelivery();
		FareStructureDeliveryDef exportData = new FareStructureDeliveryDef();
		export.setFareStructureDelivery(exportData);
		
		exportData.setDelivery(convertDeliveryToJson(gtm.getDelivery()));
		
		FareStructure fares = new FareStructure();
		exportData.setFareStructure(fares);

					
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_1);
		if (gtm.getFareStructure().getAfterSalesRules() != null) {
			fares.setAfterSalesConditions(convertAfterSalesConditionsToJson(gtm.getFareStructure().getAfterSalesRules()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_2);
		if (gtm.getFareStructure().getCalendars() != null) {
			fares.setCalendars(convertCalendars(gtm.getFareStructure().getCalendars()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_3);
		if (gtm.getFareStructure().getCarrierConstraints() != null) {
			fares.setCarrierConstraints(convertCarrierConstraints(gtm.getFareStructure().getCarrierConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_4);
		if (gtm.getFareStructure().getCombinationConstraints() != null) {
			fares.setCombinationConstraints(convertCombinationConstraints(gtm.getFareStructure().getCombinationConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_5);
		if (gtm.getFareStructure().getConnectionPoints() != null) {
			fares.setConnectionPoints(convertConnectionPoints(gtm.getFareStructure().getConnectionPoints()));
		}
		monitor.worked(1);
				
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_6);
		if (gtm.getFareStructure().getFareElements() != null) {
			fares.setFares(convertFareElements(gtm.getFareStructure().getFareElements()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_7);
		if (gtm.getFareStructure().getFareResourceLocations() != null) {
			fares.setFareResourceLocation(convertFareResourceLocation(gtm.getFareStructure().getFareResourceLocations()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_8);
		if (gtm.getFareStructure().getFulfillmentConstraints() != null) {
			fares.setFullfillmentConstraints(convertFullfillmentConstraints(gtm.getFareStructure().getFulfillmentConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_9);
		if (gtm.getFareStructure().getPassengerConstraints() != null) {
			fares.setPassengerConstraints(convertPassengerConstraints(gtm.getFareStructure().getPassengerConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_10);
		if (gtm.getFareStructure().getPersonalDataConstraints() != null) {
			fares.setPersonalDataConstraints(convertPersonalDataConstraints(gtm.getFareStructure().getPersonalDataConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_11);
		if (gtm.getFareStructure().getPrices() != null) {
			fares.setPrices(convertPrices(gtm.getFareStructure().getPrices()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_12);
		if (gtm.getFareStructure().getReductionCards() != null) {
			fares.setReductionCards(convertReductionCards(gtm.getFareStructure().getReductionCards()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_13);
		if (gtm.getFareStructure().getReductionConstraints() != null) {
			fares.setReductionConstraints(convertReductionConstraints(gtm.getFareStructure().getReductionConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_14);
		if (gtm.getFareStructure().getRegionalConstraints() != null) {
			fares.setRegionalConstraints(convertRegionalConstraints(gtm.getFareStructure().getRegionalConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_15);
		if (gtm.getFareStructure().getReservationParameters() != null) {
			fares.setReservationParameters(convertReservationParameters(gtm.getFareStructure().getReservationParameters()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_16);
		if (gtm.getFareStructure().getSalesAvailabilityConstraints() != null) {
			fares.setSalesAvailabilityConstraint(convertSalesAvailabilityConstraints(gtm.getFareStructure().getSalesAvailabilityConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_17);
		if (gtm.getFareStructure().getServiceClassDefinitions() != null) {
			fares.setServiceClassDefinitions(convertServiceClassDefinitions(gtm.getFareStructure().getServiceClassDefinitions()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_18);
		if (gtm.getFareStructure().getServiceConstraints() != null) {
			fares.setServiceConstraints(convertServiceConstraints(gtm.getFareStructure().getServiceConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_19);
		if (gtm.getFareStructure().getServiceLevelDefinitions() != null) {
			fares.setServiceLevelDefinitions(convertServiceLevelDefinitions(gtm.getFareStructure().getServiceLevelDefinitions()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_20);
		if (gtm.getFareStructure().getSupportedOnlineServices() != null && !gtm.getFareStructure().getSupportedOnlineServices().getSupportedOnlineServices().isEmpty()) {
			ArrayList<String> services = new ArrayList<String>();
			for (OnlineServiceType serviceType : gtm.getFareStructure().getSupportedOnlineServices().getSupportedOnlineServices()) {
				services.add(serviceType.getName());
			}
			fares.setSupportedOnlineServices(services);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_21);
		if (gtm.getFareStructure().getTexts() != null) {
			fares.setTexts(convertTexts(gtm.getFareStructure().getTexts()));
		}
		monitor.worked(1);
			
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_22);
		if (gtm.getFareStructure().getTravelValidityConstraints() != null) {
			fares.setTravelValidityConstraints(convertTravelValidityConstraints(gtm.getFareStructure().getTravelValidityConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_23);
		if (gtm.getFareStructure().getFareStationSetDefinitions() != null) {
			fares.setFareReferenceStationSetDefinitions(convertFareStationSetDefinitions(gtm.getFareStructure().getFareStationSetDefinitions()));
		}
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_24);
		if (gtm.getFareStructure().getZoneDefinitions() != null) {
			fares.setZoneDefinitions(convert(gtm.getFareStructure().getZoneDefinitions()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_25);
		if (gtm.getFareStructure().getStationNames()!= null) {
			fares.setStationNames(convertStationNames(gtm.getFareStructure().getStationNames()));
		}
		monitor.worked(1);
		
		
		return export;
	}




	private List<StationNamesDef> convertStationNames(StationNames names) {
		ArrayList<StationNamesDef> jl = new ArrayList<StationNamesDef>();
		if (names == null || names.getStationName() == null || names.getStationName().isEmpty()) return jl;
		
		for (Station s : names.getStationName()) {
			
			try {
				StationNamesDef js = new StationNamesDef();
				js.setCountry(s.getCountry().getCode());
				js.setLocalCode(Integer.parseInt(s.getCode()));
				js.setName(s.getNameCaseASCII());
				js.setNameUtf8(s.getNameCaseUTF8());
				js.setLegacyBorderPointCode(s.getLegacyBorderPointCode());
				jl.add(js);
			}
			catch (Exception e) {
				//alphanumeric station code
			}
			
		}
		return jl;
	}

	private List<ZoneDefinitionDef> convert(ZoneDefinitions zones) {
		if (zones == null) return null;
		if (zones.getZoneDefinition().isEmpty()) return null;
		ArrayList<ZoneDefinitionDef> listJson = new ArrayList<ZoneDefinitionDef>();
		for (ZoneDefinition element: zones.getZoneDefinition()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private ZoneDefinitionDef convertToJson(ZoneDefinition z) {
		ZoneDefinitionDef jz = new ZoneDefinitionDef();
		if (z.getProvider()!=null) {
			jz.setCarrier(z.getProvider().getCode());
		}
		jz.setName(z.getName());
		jz.setNameUTF8(z.getNameUtf8());
		jz.setZoneId(z.getZoneId());
		jz.setNutsCodes(convertNuts(z.getNutsCodes()));
		jz.setPloygone(convertToJson(z.getPolygone()));
		jz.setStationList(convertStationsToJson(z.getStationSet().getStations()));
		
		return jz;
	}




	private List<String> convertNuts(EList<NutsCode> nutsCodes) {
		if (nutsCodes == null || nutsCodes.isEmpty()) return null;
		
		List<String> jl = new ArrayList<String>();
		
		for (NutsCode code : nutsCodes) {
			jl.add(code.getCode());
		}
		return jl;
	}




	private List<FareReferenceStationSetDef> convertFareStationSetDefinitions(FareStationSetDefinitions fareStationSetDefinitions) {
		if (fareStationSetDefinitions == null) return null;
		if (fareStationSetDefinitions.getFareStationSetDefinitions().isEmpty()) return null;
		ArrayList<FareReferenceStationSetDef> listJson = new ArrayList<FareReferenceStationSetDef>();
		for (FareStationSetDefinition element: fareStationSetDefinitions.getFareStationSetDefinitions()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}


	private FareReferenceStationSetDef convertToJson(FareStationSetDefinition o) {
		if (o == null) return null;
		FareReferenceStationSetDef oJ = new FareReferenceStationSetDef();
		
		oJ.setCode(o.getCode());
		oJ.setLegacyCode(o.getLegacyCode());
		if (o.getCarrier() != null) {
			oJ.setFareProvider(o.getCarrier().getCode());
		}
		oJ.setName(o.getName());
		oJ.setNameUTF8(o.getNameUtf8());

		
		if (o.getStations()!= null && !o.getStations().isEmpty()) {
			
			Set<StationDef> list = new HashSet<StationDef>();
		
			for (Station station: o.getStations()) {
				
				StationDef stationJ = new StationDef();
				stationJ.setCountry(Integer.toString(station.getCountry().getCode()));
				stationJ.setLocalCode(station.getCode());
				list.add(stationJ);
			}
			oJ.setStations(list);
		}
		return oJ;
	}




	private List<TravelValidityConstraintDef> convertTravelValidityConstraints(TravelValidityConstraints list) {
		if (list == null) return null;
		if (list.getTravelValidityConstraints().isEmpty()) return null;
		ArrayList<TravelValidityConstraintDef> listJson = new ArrayList<TravelValidityConstraintDef>();
		for (TravelValidityConstraint element: list.getTravelValidityConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private TravelValidityConstraintDef convertToJson(TravelValidityConstraint tv) {
		if (tv == null) return null;
		TravelValidityConstraintDef tvJ = new TravelValidityConstraintDef();
		
		tvJ.setId(tv.getId());
				
		tvJ.setNumberOfTravelDays(tv.getTravelDays()); 
		
		if (tv.getReturnConstraint() != null) {
			tvJ.setReturnConstraint(convertToJson(tv.getReturnConstraint()));
		}
		
		if (tv.getValidDays() != null) {
			tvJ.setValidTravelDates(convertToJson(tv.getValidDays()));
		}
		
		if (tv.getExcludedTimeRange()!= null && !tv.getExcludedTimeRange().isEmpty()) {
			
			ArrayList<ExcludedTimeRange> listJ = new ArrayList<ExcludedTimeRange>();
			
			for (Gtm.ExcludedTimeRange tr : tv.getExcludedTimeRange()) {				
				listJ.add(convertToJson(tr));
			}
			tvJ.setExcludedTimeRange(listJ);
		}
		return tvJ;
	}




	private static ExcludedTimeRange convertToJson(TimeRange tr) {
		if (tr == null) return null;
		ExcludedTimeRange trJ = new ExcludedTimeRange();
		trJ.setFrom(tr.getFrom());
		trJ.setUntil(tr.getUntil());
		trJ.setScope(tr.getScope().getName());

		return trJ;
	}


	private static ReturnConstraint convertToJson(ReturnValidityConstraint rc) {
		if (rc == null) return null;
		ReturnConstraint rcJ = new ReturnConstraint();
		rcJ.setEarliestReturn(rc.getEarliestReturn());
		rcJ.setLatestReturn(rc.getLatestReturn());
		
		if (rc.getExcludedWeekdays() != null && !rc.getExcludedWeekdays().isEmpty() ) {
			
			ArrayList<Integer> listJ = new ArrayList<Integer>();
			
			for (WeekDay day : rc.getExcludedWeekdays()) {
				listJ.add(Integer.valueOf(day.getValue()));
			}		
			rcJ.setExcludedWeekdays(listJ);
		}
		return rcJ;
	}




	private static List<TextDef> convertTexts(Texts list) {
		if (list == null) return null;
		if (list.getTexts().isEmpty()) return null;
		ArrayList<TextDef> listJson = new ArrayList<TextDef>();
		for (Text element: list.getTexts()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static TextDef convertToJson(Text text) {
		if (text == null) return null;
		TextDef textJ = new TextDef();
		
		textJ.setId(text.getId());
		textJ.setShortText(text.getShortTextICAO());
		textJ.setShortTextUtf8(text.getShortTextUTF8());
		textJ.setText(text.getTextICAO());
		textJ.setTextUTF8(text.getTextUTF8());
		
		if (text.getTranslations() != null && !text.getTranslations().isEmpty()) {
			
			ArrayList<TranslationDef> listJ = new ArrayList<TranslationDef>();
			
			for (Translation trans: text.getTranslations()) {
				
				TranslationDef transJ = new TranslationDef();
				
				if (trans.getLanguage()!=null) {
					transJ.setLanguage(trans.getLanguage().getName());
				}
				transJ.setShortText(trans.getShortTextICAO());
				transJ.setShortTextUtf8(trans.getShortTextUTF8());
				transJ.setText(trans.getTextICAO());
				transJ.setTextUTF8(trans.getTextUTF8());				
								
				listJ.add(transJ);
			}
			
			
			
			textJ.setTranslations(listJ);
		}

		return textJ;
	}




	private static List<ServiceLevelDef> convertServiceLevelDefinitions(ServiceLevelDefinitions list) {
		if (list == null) return null;
		if (list.getServiceLevelDefinition().isEmpty()) return null;
		ArrayList<ServiceLevelDef> listJson = new ArrayList<ServiceLevelDef>();
		for (ServiceLevel element: list.getServiceLevelDefinition()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ServiceLevelDef convertToJson(ServiceLevel sl) {
		if (sl == null) return null;
		 ServiceLevelDef slJ = new  ServiceLevelDef();
		 
		 slJ.setId(sl.getId());
		 if (sl.getText()!= null) {
			 slJ.setTextRef(sl.getText().getId());
		 }
		 if (sl.getReservationParameter()!= null) {
			 slJ.setReservationParameterId(sl.getReservationParameter().getId());
		 }
		 slJ.setIncludesClassName(sl.isIncludesClassName());
		
		return slJ;
	}




	private static List<ServiceConstraintDef> convertServiceConstraints(ServiceConstraints list) {
		if (list == null) return null;
		if (list.getServiceConstraints().isEmpty()) return null;
		ArrayList<ServiceConstraintDef> listJson = new ArrayList<ServiceConstraintDef>();
		for (ServiceConstraint element: list.getServiceConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ServiceConstraintDef convertToJson(ServiceConstraint sc) {
		if (sc == null) return null;
		ServiceConstraintDef scJ = new ServiceConstraintDef();
		
		scJ.setId(sc.getId());
		
		scJ.setExcludedServiceBrands(convertServiceBrandsToJson(sc.getExcludedServiceBrands()));

		scJ.setIncludedServiceBrands(convertServiceBrandsToJson(sc.getIncludedServiceBrands()));		
		
		return scJ;

	}


	private static List<Integer> convertServiceBrandsToJson(EList<ServiceBrand> sbl) {
		if (sbl == null || sbl.isEmpty()) return null;
			
		ArrayList<Integer> listJ = new ArrayList<Integer>();
		for (ServiceBrand sb : sbl) {
				listJ.add(Integer.valueOf(sb.getCode()));				
		}
			
		return listJ;
	}

	private static List<String> convertCarriersToJson(EList<Carrier> cl) {
		if (cl == null || cl.isEmpty()) return null;
			
		ArrayList<String> listJ = new ArrayList<String>();
		for (Carrier c : cl) {
				listJ.add(c.getCode());				
		}
			
		return listJ;
	}


	private static List<ServiceClassDef> convertServiceClassDefinitions(ServiceClassDefinitions list) {
		if (list == null) return null;
		if (list.getServiceClassDefinitions().isEmpty()) return null;
		ArrayList<ServiceClassDef> listJson = new ArrayList<ServiceClassDef>();
		for (ServiceClass element: list.getServiceClassDefinitions()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ServiceClassDef convertToJson(ServiceClass sc) {
		if (sc == null) return null;
		ServiceClassDef scJ = new ServiceClassDef();
		
		if (sc.getId()!= null) {
			scJ.setId(sc.getId().getName());
		}
		if (sc.getText()!=null) {
			scJ.setTextRef(sc.getText().getId());
		}
		if (sc.getClassicClass()!= null) {
			scJ.setClassicClass(sc.getClassicClass().getName());
		}
		return scJ;
	}




	private static List<ReservationParameterDef> convertReservationParameters(ReservationParameters list) {
		if (list == null) return null;
		if (list.getReservationParameters().isEmpty()) return null;
		ArrayList<ReservationParameterDef> listJson = new ArrayList<ReservationParameterDef>();
		for (ReservationParameter element: list.getReservationParameters()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ReservationParameterDef convertToJson(ReservationParameter r) {
		if (r == null) return null;
		ReservationParameterDef rJ = new ReservationParameterDef();
		
		rJ.setId(r.getId());
		rJ.setReservationRequired(r.isMandatoryReservation());
		rJ.setReservationParams9181(convertToJson(r.getParams9181()));
		rJ.setReservationOptions(convertToJson(r.getOptions()));
		
		rJ.setReservationRequiredForBrand(convertServiceBrandsToJson(r.getMandatoryReservationForBrands()));
		rJ.setReservationRequiredForMode(convertTransportModesToJson(r.getMandatoryReservationsForMode()));

		return rJ;
	}




	private static List<String> convertTransportModesToJson(EList<ServiceMode> sl) {
		if (sl == null || sl.isEmpty()) return null;
		
		ArrayList<String> listJ = new ArrayList<String>();
		for (ServiceMode sb : sl) {
				listJ.add(Integer.toString(sb.getValue()));				
		}
			
		return listJ;
	}

	private static ReservationOptions convertToJson(Gtm.ReservationOptions o) {
		if (o == null) return null;
		ReservationOptions oJ = new ReservationOptions();
		if (o.getGraphicalReservation()!=null) {
			oJ.setGraficalReservation(o.getGraphicalReservation().getName());
		}
		if (o.getPreferences() != null && !o.getPreferences().isEmpty()) {
			ArrayList<ReservationOptionGroupDef> rolJ = new ArrayList<ReservationOptionGroupDef>();
			
			for (ReservationPreferenceGroup p :  o.getPreferences()) {
				rolJ.add(convertToJson(p));
			}
			oJ.setPreferences(rolJ);
		
		}
		oJ.setServiceBrands(convertServiceBrandsToJson(o.getServiceBrands()));

		return oJ;
	}




	private static ReservationOptionGroupDef convertToJson(ReservationPreferenceGroup p) {
		if (p == null) return null;
		ReservationOptionGroupDef oJ = new ReservationOptionGroupDef();
		oJ.setPreferenceGroup(p.getGroup());
		
		if (p.getPreference() != null && !p.getPreference().isEmpty()) {
			
			ArrayList<String> pL = new ArrayList<String>();
			
			for (String s: p.getPreference()) {
				pL.add(s);
			}
			oJ.setPreference(pL);
		}
		
		return oJ;
	}




	private static ReservationParams9181 convertToJson(Gtm.ReservationParams9181 p) {
		if (p == null) return null;
		ReservationParams9181 pJ = new ReservationParams9181();
		
		pJ.setBerthType(p.getBerthType().getName());
		pJ.setCoachTypeCode(Integer.toString(p.getCoachType()));
		if (p.getBerthType()!=null) {
			pJ.setCompartmentTypeCode(p.getBerthType().getName());
		}
		if (p.getService()!=null) {
			pJ.setServiceCode(p.getService().getName());
		}
		if (p.getServiceLevel()!=null) {
			pJ.setServiceLevelCode(p.getServiceLevel().getName());
		}
		pJ.setTariff(Integer.toString(p.getTariff()));
		
		if (p.getTravelClass()!=null) {
			pJ.setTravelClass(p.getTravelClass().getName());
		}
		return pJ;
	}




	private static List<SalesAvailabilityConstraintDef> convertSalesAvailabilityConstraints(SalesAvailabilityConstraints list){
		if (list == null) return null;
		if (list.getSalesAvailabilityConstraints().isEmpty()) return null;
		ArrayList<SalesAvailabilityConstraintDef> listJson = new ArrayList<SalesAvailabilityConstraintDef>();
		for (SalesAvailabilityConstraint element: list.getSalesAvailabilityConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static SalesAvailabilityConstraintDef convertToJson(SalesAvailabilityConstraint sa) {
		if (sa == null) return null;
		SalesAvailabilityConstraintDef saJ = new SalesAvailabilityConstraintDef();
		saJ.setId(sa.getId());
		
		if (sa.getRestrictions() != null && !sa.getRestrictions().isEmpty()) {
			
			ArrayList<gtm.SalesRestriction> listJ = new ArrayList<gtm.SalesRestriction>();
			for (SalesRestriction  r: sa.getRestrictions()) {
				listJ.add(convertToJson(r));
			}
			saJ.setSalesRestrictions(listJ);
		}
		return saJ;
	}




	private static gtm.SalesRestriction convertToJson(SalesRestriction r) {
		if (r == null) return null;
		gtm.SalesRestriction rJ = new gtm.SalesRestriction();
		
		rJ.setEndOfSale(convertToJson(r.getEndOfSale()));
		if (r.getSalesDates() != null) {
			rJ.setSalesDatesRef(r.getSalesDates().getId());
		}
		rJ.setStartOfSale(convertToJson(r.getStartOfSale()));

		return rJ;
	}




	private static List<RegionalConstraintDef> convertRegionalConstraints(RegionalConstraints list) {
		if (list == null) return null;
		if (list.getRegionalConstraints().isEmpty()) return null;
		ArrayList<RegionalConstraintDef> listJson = new ArrayList<RegionalConstraintDef>();
		for (RegionalConstraint element: list.getRegionalConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static RegionalConstraintDef convertToJson(RegionalConstraint r) {
		if (r == null) return null;
		RegionalConstraintDef rJ = new RegionalConstraintDef();
		rJ.setId(r.getId());
		rJ.setDistance(r.getDistance());
		if (r.getEntryConnectionPoint() != null) {
			rJ.setEntryConnectionPointId(r.getEntryConnectionPoint().getId());
		}
		if (r.getExitConnectionPoint() != null) {
			rJ.setExitConnectionPointId(r.getExitConnectionPoint().getId());
		}
		if (r.getRegionalValidity()!= null && !r.getRegionalValidity().isEmpty()) {
			
			ArrayList<RegionalValidityDef> rvlJ  = new ArrayList<RegionalValidityDef>();
			
			for (RegionalValidity rv: r.getRegionalValidity()) {				
				rvlJ.add(convertToJson(rv));							
			}
			rJ.setRegionalValidity(rvlJ);
		}
		return rJ;
	}




	private static RegionalValidityDef convertToJson(RegionalValidity rv) {
		if (rv == null) return null;
		RegionalValidityDef rvJ = new RegionalValidityDef();
		rvJ.setSeqNb(rv.getSeqNb());
		rvJ.setViaStations(convertToJson(rv.getViaStation()));
		rvJ.setLine(convertToJson(rv.getLine()));
		rvJ.setZone(convertToJson(rv.getZone()));
		rvJ.setPolygone(convertToJson(rv.getPolygone()));
		
		return rvJ;
	}




	private static PolygoneDef convertToJson(Polygone p) {
		if (p == null) return null;
		PolygoneDef pJ = new PolygoneDef();
		
		if (p.getEdge()!= null && !p.getEdge().isEmpty()){
			
			ArrayList<GeoCoordinateDef> listJ = new ArrayList<GeoCoordinateDef>();
			
			for ( Edge e : p.getEdge()) {
				listJ.add(convertToJson(e));
			}
					
			pJ.setEdge(listJ);
		}
		
		return pJ;
	}




	private static GeoCoordinateDef convertToJson(Edge e) {
		if (e == null) return null;
		GeoCoordinateDef gJ = new GeoCoordinateDef();
		
		gJ.setAccuracy(e.getAccuracy().getName());
		gJ.setLatitude(e.getLatitude());
		gJ.setLongitude(e.getLongitude());
		gJ.setSystem(GeoCoordinateDef.System.fromValue(e.getSystem().getName()));
		gJ.setUnit(GeoCoordinateDef.GeoCoordinateUnitDef.fromValue(e.getUnit().getName()));

		return gJ;
	}




	private static ZoneDef convertToJson(Zone z) {
		if (z == null) return null;
		ZoneDef zJ = new ZoneDef();
		if (z.getBinaryZoneId()!= null && z.getBinaryZoneId().length > 0) {
			zJ.setBinaryZoneId(Base64.encode(z.getBinaryZoneId()));
		}
		if (z.getCarrier()!=null) {
			zJ.setCarrier(z.getCarrier().getCode());
		}
		zJ.setCity(z.getCity());
		if (z.getEntryStation()!= null) {
			zJ.setEntryStation(convertToJson(z.getEntryStation()));
		}
		if (z.getNutsCode()!=null) {
			zJ.setNutsCode(z.getNutsCode().getCode());
		}
		if (z.getTerminalStation()!= null) {
			zJ.setTerminalStation(convertToJson(z.getTerminalStation()));
		}

		return zJ;
	}




	private static LineDef convertToJson(Line z) {
		if (z == null) return null;
		LineDef zJ = new LineDef();
		if (z.getBinaryZoneId()!= null && z.getBinaryZoneId().length > 0) {
			zJ.setBinaryZoneId(Base64.encode(z.getBinaryZoneId()));
		}
		if (z.getCarrier()!=null) {
			zJ.setCarrier(z.getCarrier().getCode());
		}
		zJ.setCity(z.getCity());
		if (z.getEntryStation()!= null) {
			zJ.setEntryStation(convertToJson(z.getEntryStation()));
		}
		if (z.getNutsCode()!=null) {
			zJ.setNutsCode(z.getNutsCode().getCode());
		}
		if (z.getTerminalStation()!= null) {
			zJ.setTerminalStation(convertToJson(z.getTerminalStation()));
		}
		if (z.getLineId()!= null && !z.getLineId().isEmpty()) {
			
			ArrayList<String> lineIds = new ArrayList<String>();
			
			for (String id : z.getLineId()) {
				lineIds.add(id);
			}
			zJ.setLineId(lineIds);

		}

		return zJ;
	}




	private static ViaStationsDef convertToJson(ViaStation v) {
		if (v == null) return null;
		ViaStationsDef vJ = new ViaStationsDef();
		if (v.getCarrier()!= null) {
			vJ.setCarrier(v.getCarrier().getCode());
		}
		if (v.getAlternativeRoutes()!=null) {
			vJ.setAlternativeRoute(convertToJson(v.getAlternativeRoutes()));
		}
		vJ.setIsBorder(false);
		if (v.getRoute()!=null) {
			vJ.setRoute(convertToJson(v.getRoute()));
		}
		if (v.getStation() != null) {
			vJ.setStation(convertToJson(v.getStation()));
		}
		return vJ;
	}




	private static List<ViaStationsDef> convertToJson(Route r) {
		if (r == null || r.getStations() == null || r.getStations().isEmpty()) return null;
		
		ArrayList<ViaStationsDef> listJ = new ArrayList<ViaStationsDef>();
		
		for ( ViaStation s : r.getStations()) {
			listJ.add(convertToJson(s));
		}
		
		return listJ;
	}




	private static List<ViaStationsDef> convertToJson(EList<AlternativeRoute> ar) {
		
		if (ar == null || ar.isEmpty()) return null;
		
		ArrayList<ViaStationsDef>  arlJ = new ArrayList<ViaStationsDef>(); 
		
		for ( AlternativeRoute r : ar) {
			
			if (r.getStations() != null && r.getStations().isEmpty()) {
				
				ViaStationsDef arJ = new ViaStationsDef();
				ArrayList<ViaStationsDef>  arslJ = new ArrayList<ViaStationsDef>(); 
				arJ.setAlternativeRoute(arslJ);
				
				for (ViaStation s : r.getStations()) {
					arslJ.add(convertToJson(s));
				}
				
				arlJ.add(arJ);			
			}

		}

		return arlJ;
	}




	private static List<ReductionConstraintDef> convertReductionConstraints(ReductionConstraints list) {
		if (list == null) return null;
		if (list.getReductionConstraints().isEmpty()) return null;
		ArrayList<ReductionConstraintDef> listJson = new ArrayList<ReductionConstraintDef>();
		for (ReductionConstraint element: list.getReductionConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ReductionConstraintDef convertToJson(ReductionConstraint rc) {
		if (rc == null) return null;
		ReductionConstraintDef rcJ = new ReductionConstraintDef();
		
		rcJ.setId(rc.getId());
		
		if (rc.getRequiredReductionCards() != null && !rc.getRequiredReductionCards().isEmpty()) {
			ArrayList<RequiredCard> listJ = new ArrayList<RequiredCard>();
			
			for (RequiredReductionCard e : rc.getRequiredReductionCards()) {
				
				RequiredCard eJ = new RequiredCard();
				if (e.getCardClass() != null) {
					eJ.setCardClassId(e.getCardClass().getId().getName());
				}
				
				if (e.getCard() != null) {
					eJ.setCardId(e.getCard().getId());
				}
				eJ.setCardName(e.getName());
				
			}

			rcJ.setRequiredCards(listJ);
		}

		return rcJ;
	}




	private static List<ReductionCardDef> convertReductionCards(ReductionCards list) {
		if (list == null) return null;
		if (list.getReductionCards().isEmpty()) return null;
		ArrayList<ReductionCardDef> listJson = new ArrayList<ReductionCardDef>();
		for (ReductionCard element: list.getReductionCards()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}



	private static ReductionCardDef convertToJson(ReductionCard card) {
		if (card == null) return null;
		ReductionCardDef cardJ = new ReductionCardDef();
		
		cardJ.setId(card.getId());
		if (card.getCardIssuer() != null) {
			cardJ.setIssuer(card.getCardIssuer().getCode());
		}
		if (card.getServiceClasses()!= null && !card.getServiceClasses().isEmpty()) {
			
			ArrayList<ServiceClassDef> listJ = new ArrayList<ServiceClassDef>();
			
			for (ServiceClass sc : card.getServiceClasses()) {
				listJ.add(convertToJson(sc));
			}
			
			cardJ.setServiceClasses(listJ);
		}

		cardJ.setCardIdRequired(card.isIdRequiredForBooking());
		
		if (card.getName() != null) {
			cardJ.setName(convertToJson(card.getName()));
		}

		return cardJ;
	}




	private static List<PriceDef> convertPrices(Prices list) {
		if (list == null) return null;
		if (list.getPrices().isEmpty()) return null;
		ArrayList<PriceDef> listJson = new ArrayList<PriceDef>();
		for (Price element: list.getPrices()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static List<PersonalDataConstraintDef> convertPersonalDataConstraints(PersonalDataConstraints list) {
		if (list == null) return null;
		if (list.getPersonalDataConstraints().isEmpty()) return null;
		ArrayList<PersonalDataConstraintDef> listJson = new ArrayList<PersonalDataConstraintDef>();
		for (PersonalDataConstraint element: list.getPersonalDataConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static PersonalDataConstraintDef convertToJson(PersonalDataConstraint pc) {
		if (pc == null) return null;
		PersonalDataConstraintDef pcJ = new PersonalDataConstraintDef();
		
		pcJ.setId(pc.getId());
		
		pcJ.setRequiredData(convertRequiredPersonalDataToJson(pc.getRequiredPersonalData()));
		
		pcJ.setAllowedChanges(convertAllowedPersonalDataChangesToJson(pc.getAllowedChanges()));

		return pcJ;
	}




	private static List<AllowedChange> convertAllowedPersonalDataChangesToJson(EList<AllowedPersonalDataChanges> ac) {
		if (ac == null || ac.isEmpty()) return null;

		ArrayList<AllowedChange> listJ = new ArrayList<AllowedChange>();
		
		for (AllowedPersonalDataChanges apc : ac) {
			
			AllowedChange acJ = new AllowedChange();
			acJ.setAcceptedReason(apc.getAcceptedReason().getName());
			acJ.setTimeLimit((float) apc.getTimeLimit());
			
		}

		return listJ;
	}




	private static List<RequiredDatum> convertRequiredPersonalDataToJson(EList<RequiredPersonalData> rpdl) {
		if (rpdl == null || rpdl.isEmpty()) return null;
		
		ArrayList<RequiredDatum> listJ = new ArrayList<RequiredDatum>();
		for (RequiredPersonalData  rpd : rpdl) {
			
			RequiredDatum it = new RequiredDatum();
			it.setCrossBorder(convertCrossBorderConditionToJson(rpd.getCrossBorder()));
			it.setDataItem(rpd.getDataItem().getName());
			it.setFulfillmentType(convertFulFillmentTypesToJson(rpd.getFulfillmentType()));
			it.setTicketHolderOnly(rpd.isTicketHolderOnly());
			it.setTransfer(convertPersonalDataTransferToJson(rpd.getTransfer()));
			
			
		}

		return listJ;
	}









	private static List<String> convertPersonalDataTransferToJson(EList<PersonalDataTransferType> trl) {
		if (trl == null || trl.isEmpty()) return null;
			
		ArrayList<String> listJ = new ArrayList<String>();
		
		for (PersonalDataTransferType t : trl) {
			listJ.add(t.getName());
		}

		return listJ;
	}



	private static List<FulfillmentTypeDef> convertFulFillmentTypesToJson(EList<FulfillmentType> ftl) {
		
		if (ftl == null || ftl.isEmpty()) return null;
		ArrayList<FulfillmentTypeDef> listJ = new ArrayList<FulfillmentTypeDef>();
		for (FulfillmentType f : ftl) {
			listJ.add(FulfillmentTypeDef.fromValue(f.getName()));
		}
		return listJ;
	}
	

	private static List<CrossBorderCondition> convertCrossBorderConditionToJson(EList<Gtm.CrossBorderCondition> cbl) {
		if (cbl == null || cbl.isEmpty()) return null;
		
		ArrayList<CrossBorderCondition> cblJ = new ArrayList<CrossBorderCondition>();
		
		for (Gtm.CrossBorderCondition c : cbl) {
			
			CrossBorderCondition cJ = new CrossBorderCondition();
			cJ.setAffectedServiceBrands(convertServiceBrandsToJson(c.getAffectedServiceBrands()));
			cJ.setFromCountry(c.getFromCountry().getISOcode());
			cJ.setToCountry(c.getToCountry().getISOcode());
			
		}
		return cblJ;
	}




	private static List<PassengerConstraintDef> convertPassengerConstraints(PassengerConstraints list) {
		if (list == null) return null;
		if (list.getPassengerConstraints().isEmpty()) return null;
		ArrayList<PassengerConstraintDef> listJson = new ArrayList<PassengerConstraintDef>();
		for (PassengerConstraint element: list.getPassengerConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static PassengerConstraintDef convertToJson(PassengerConstraint pass) {
		if (pass == null) return null;
		PassengerConstraintDef passJ = new PassengerConstraintDef();
		
		passJ.setId(pass.getId());
		passJ.setAgeLimitForReservation(pass.getReservationAgeLimit()); 
		passJ.setAgeLimitToTravelAlone(pass.getTravelAloneAgeLimit()); 
		
		if (pass.getIncludedFreePassengers() != null && !pass.getIncludedFreePassengers().isEmpty()) {
			ArrayList<IncludedFreePassenger> listJ = new ArrayList<IncludedFreePassenger>();
			
			for (IncludedFreePassengerLimit freeP : pass.getIncludedFreePassengers()) {
				
				IncludedFreePassenger freeJ = new IncludedFreePassenger();
				
				freeJ.setNumber(freeP.getNumber());
				if (freeP.getPassengerType() != null) {
					freeJ.setPassengerTypeRef(freeP.getPassengerType().getName());
				}
				
				listJ.add(freeJ);
			}
			
			passJ.setIncludedFreePassenger(listJ);
		}

		if (pass.getExcludedPassengerCombinations() != null && !pass.getExcludedPassengerCombinations().isEmpty()) {
			ArrayList<CombinationConstraint> listJ = new ArrayList<CombinationConstraint>();
			
			for (PassengerCombinationConstraint freeP : pass.getExcludedPassengerCombinations()) {
				
				CombinationConstraint freeJ = new CombinationConstraint();
				
				freeJ.setMaxNumber(freeP.getMaxNumber());
				if (freeP.getPassengerType() != null) {
					freeJ.setPassengerTypeRef(freeP.getPassengerType().getName());
				}
				
				listJ.add(freeJ);
			}
			
			passJ.setCombinationConstraint(listJ);
		}
		
		passJ.setIsAncilliaryItem(pass.isIsAncilliary());
		passJ.setLowerAgeLimit(pass.getLowerAgeLimit());
		passJ.setMaxWeightedPasseners(pass.getMaxTotalPassengerWeight());
		passJ.setMinWeightedPassengers(pass.getMinTotalPassengerWeight());
		if (pass.getText()!= null) {
			passJ.setNameRef(pass.getText().getId());
		}
		if (pass.getTravelerType() != null) {
			passJ.setPassengerType(pass.getTravelerType().getName());
		}
		
		passJ.setPassengerWeight(pass.getPassengerWeight());
		passJ.setUpperAgeLimit(pass.getUpperAgeLimit()); 
		
		return passJ;
	}




	private static List<FullfillmentConstraintDef> convertFullfillmentConstraints(FulfillmentConstraints list) {
		if (list == null) return null;
		if (list.getFulfillmentConstraints().isEmpty()) return null;
		ArrayList<FullfillmentConstraintDef> listJson = new ArrayList<FullfillmentConstraintDef>();
		for (FulfillmentConstraint element: list.getFulfillmentConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static FullfillmentConstraintDef convertToJson(FulfillmentConstraint fc) {
		if (fc == null) return null;
		FullfillmentConstraintDef fcJ = new FullfillmentConstraintDef();
		fcJ.setId(fc.getId());
		
		if (fc.getAcceptedBarcodes() != null && fc.getAcceptedBarcodes().getAcceptedBarcodes() != null && !fc.getAcceptedBarcodes().getAcceptedBarcodes().isEmpty()) {
			fcJ.setAcceptedBarCodes(convertBarCodeTypes(fc.getAcceptedBarcodes().getAcceptedBarcodes()));
		}
		fcJ.setAcceptedFullfillmentTypes(convertFulFillmentTypesToJson(fc.getAcceptedFulfilmentTypes()));
		fcJ.setIndividualTicketingPermitted(fc.isIndividualTicketingPermitted());
		
		if (fc.getRequiredBarcodes() != null && fc.getRequiredBarcodes().getRequiredBarcodes() != null && !fc.getRequiredBarcodes().getRequiredBarcodes().isEmpty()) {
			fcJ.setRequiredBarCodes(convertBarCodeTypes(fc.getRequiredBarcodes().getRequiredBarcodes()));
		}
		fcJ.setRequiredSiS(convertControlDataExchangeTypesToJson(fc.getRequiredControlDataExchange()));
		
		return fcJ;
	}


	private static List<String> convertBarCodeTypes(EList<BarcodeTypes> el) {
		if (el == null || el.isEmpty()) return null;
		ArrayList<String> listJ = new ArrayList<String>();
		for (Enumerator e : el) {	listJ.add(e.getName());	}
		return listJ;
	}




	private static List<String> convertControlDataExchangeTypesToJson(EList<ControlDataExchangeTypes> el) {
		if (el == null || el.isEmpty()) return null;
		ArrayList<String> listJ = new ArrayList<String>();
		for (Enumerator e : el) {	listJ.add(e.getName());	}
		return listJ;
	}




	private static FareResourceLocationDef convertFareResourceLocation(FareResourceLocations rl) {
		if (rl == null) return null;
		FareResourceLocationDef rlJ = new FareResourceLocationDef();
		rlJ.setCarrierLocations(convertResourceCarrierLocations(rl.getCarrierResourceLocations()));
		rlJ.setStationLocations(convertStationResourceLocations(rl.getStationResourceLocations()));
		rlJ.setTrainLocations(convertTrainResourceLocations(rl.getTrainResourceLocations()));

		return rlJ;
	}




	private static List<TrainResourceLocationDef> convertTrainResourceLocations(TrainResourceLocations l) {
		if (l == null || l.getTrainResourceLocations().isEmpty()) return null;
		
		ArrayList<TrainResourceLocationDef> lJ = new ArrayList<TrainResourceLocationDef>();
		
		for (TrainResourceLocation t : l.getTrainResourceLocations()) {
			lJ.add(convertToJson(t));
		}
		return lJ;
	}



	private static TrainResourceLocationDef convertToJson(TrainResourceLocation t) {
		if (t == null) return null;
		TrainResourceLocationDef trJ = new TrainResourceLocationDef();
		if (t.getCarrier()!= null) {
			trJ.setCarrier(t.getCarrier().getCode());
		}
		trJ.setTrainId(t.getTrainId());
		
		trJ.setOnlineResource(convertOnlineResourcesToJson(t.getOnlineResources()));
		
		return trJ;
	}




	private static List<OnlineResourceDef> convertOnlineResourcesToJson(EList<OnlineResource> rl) {
		if (rl == null || rl.isEmpty()) return null;
		
		ArrayList<OnlineResourceDef> lJ = new ArrayList<OnlineResourceDef>();
		
		for (OnlineResource r : rl){
			OnlineResourceDef rJ = new OnlineResourceDef();
			if (r.getInterfaceType() !=null) {
				rJ.setInterfaceType(r.getInterfaceType().getName());
			}
			if (r.getOfferRequestType()!=null) {
				rJ.setOfferType(r.getOfferRequestType().getName());
			}
			rJ.setSystem(r.getSystem());
			rJ.setVersion(r.getVersion());
			
			lJ.add(rJ);
		}

		return lJ;
	}




	private static List<StationResourceLocationDef> convertStationResourceLocations(StationResourceLocations l) {
		if (l == null || l.getStationResourceLocations().isEmpty()) return null;
		
		ArrayList<StationResourceLocationDef> lJ = new ArrayList<StationResourceLocationDef>();
		
		for (StationResourceLocation t : l.getStationResourceLocations()) {
			lJ.add(convertToJson(t));
		}
		
		return lJ;
	}




	private static StationResourceLocationDef convertToJson(StationResourceLocation t) {
		if (t == null) return null;
		StationResourceLocationDef srJ = new StationResourceLocationDef();
		
		srJ.setOnlineResource(convertOnlineResourcesToJson(t.getOnlineResources()));
		
		if (t.getConnectionPoints()!= null && !t.getConnectionPoints().isEmpty()) {
			
			ArrayList<String> lJ = new ArrayList<String>();
			
			for (ConnectionPoint p : t.getConnectionPoints()) {
				lJ.add(p.getId());
			}
			
			srJ.setConnectionPointIds(lJ);
			
		}
		

		
		srJ.setStations(convertStationsToJson(t.getStations()));

		return srJ;
	}




	private static List<CarrierResourceLocationDef> convertResourceCarrierLocations(CarrierResourceLocations l) {
		if (l == null || l.getCarrierResourceLocations().isEmpty()) return null;
		
		ArrayList<CarrierResourceLocationDef> lJ = new ArrayList<CarrierResourceLocationDef>();
		
		for (CarrierResourceLocation t : l.getCarrierResourceLocations()) {
			lJ.add(convertToJson(t));
		}
		
		return lJ;
	}




	private static CarrierResourceLocationDef convertToJson(CarrierResourceLocation t) {
		if (t == null) return null;
		CarrierResourceLocationDef lJ = new CarrierResourceLocationDef();
		
		if (t.getCarrier()!= null) {
			lJ.setCarrier(t.getCarrier().getCode());
		}
		if (t.getServiceBrand()!= null) {
			lJ.setServiceBrandCode(t.getServiceBrand().getCode());
		}
		lJ.setOnlineResource(convertOnlineResourcesToJson(t.getOnlineResources()));
		
		return lJ;
	}




	private static List<FareDef> convertFareElements(FareElements list) {
		if (list == null) return null;
		if (list.getFareElements().isEmpty()) return null;
		ArrayList<FareDef> listJson = new ArrayList<FareDef>();
		for (FareElement element: list.getFareElements()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}

	private static FareDef convertToJson(FareElement fare) {
		if (fare == null) return null;
		FareDef fareJ = new FareDef();
		
		fareJ.setId(fare.getId());
		
		if (fare.getType() != null) {
			fareJ.setFareType(fare.getType().getName());
		}
		
		if (fare.getAfterSalesRule() != null) {
			fareJ.setAfterSalesRulesRef(fare.getAfterSalesRule().getId());
		}
		if (fare.getCarrierConstraint()!= null) {
			fareJ.setCarrierConstraintRef(fare.getCarrierConstraint().getId());
		}
		
		if (fare.getCombinationConstraint()!= null) {
			fareJ.setCombinationConstraintRef(fare.getCombinationConstraint().getId());
		}
		
		if (fare.getFareDetailDescription() != null){
			fareJ.setFareDetailDescriptionRef(fare.getFareDetailDescription().getId());
		}
		
		if (fare.getFulfillmentConstraint() != null) {
			fareJ.setFullfillmentConstraintRef(fare.getFulfillmentConstraint().getId());
		}
		
		if (fare.getLegacyAccountingIdentifier()!= null) {
			
		
			LegacyAccountingIdentifier lai = new LegacyAccountingIdentifier();
			
			lai.setSerialId(fare.getLegacyAccountingIdentifier().getSeriesId());
			lai.setTariffId(fare.getLegacyAccountingIdentifier().getTariffId());
			lai.setAddId(fare.getLegacyAccountingIdentifier().getAddSeriesId());			
			
			fareJ.setLegacyAccountingIdentifier(lai);
			
		}
		
		if (fare.getText() != null) {
			fareJ.setNameRef(fare.getText().getId());
		}
		
		if (fare.getPassengerConstraint() != null) {
			fareJ.setPassengerConstraintRef(fare.getPassengerConstraint().getId());
		}
		
		if (fare.getPersonalDataConstraint()!= null) {
			fareJ.setPersonalDataConstraintRef(fare.getPersonalDataConstraint().getId());
		}
		
		if (fare.getPrice() != null) {
			fareJ.setPriceRef(fare.getPrice().getId());
		}
		
		if (fare.getReductionConstraint()!= null) {
			fareJ.setReductionConstraintRef(fare.getReductionConstraint().getId());
		}
		
		if (fare.getRegionalConstraint()!= null) {
			fareJ.setRegionalConstraintRef(fare.getRegionalConstraint().getId());
		}
		
		if (fare.getReservationParameter() != null) {
			fareJ.setReservationParameterRef(fare.getReservationParameter().getId());
		}
		
		if (fare.getSalesAvailability()!=null) {
			fareJ.setSalesAvailabilityConstraintRef(fare.getSalesAvailability().getId());
		}
		
		if (fare.getTravelValidity() != null) {
			fareJ.setTravelValidityConstraintRef(fare.getTravelValidity().getId());
		} 
		
		if (fare.getServiceClass()!= null) {
			fareJ.setServiceClassRef(fare.getServiceClass().getId().getName());
		}
		
		if (fare.getServiceConstraint()!=null) {
			fareJ.setServiceConstraintRef(fare.getServiceConstraint().getId());
		}
		
		if (fare.getServiceLevel()!=null) {
			fareJ.setServiceLevelRef(fare.getServiceLevel().getId());
		}
		
		if (fare.getLegacyConversion() != null) {
			fareJ.setLegacyConversion(fare.getLegacyConversion().getName());
		} else {
			fareJ.setLegacyConversion("NO"); //$NON-NLS-1$
		}
		
		
		fare.setIndividualContracts(fareJ.getIndividualContracts());
		
		return fareJ;
	}




	private static List<ConnectionPointDef> convertConnectionPoints(ConnectionPoints list) {
		if (list == null) return null;
		if (list.getConnectionPoints().isEmpty()) return null;
		ArrayList<ConnectionPointDef> listJson = new ArrayList<ConnectionPointDef>();
		for (ConnectionPoint element: list.getConnectionPoints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ConnectionPointDef convertToJson(ConnectionPoint cp) {
		if (cp == null) return null;
		ConnectionPointDef cpJ = new ConnectionPointDef();
		cpJ.setId(cp.getId());
		cpJ.setLegacyBorderPointCode(Integer.toString(cp.getLegacyBorderPointCode()));
		cpJ.setName(cp.getName());
		cpJ.setStationSets(convertStationSetsToJson(cp.getConnectedStationSets()));
		return cpJ;
	}




	private static List<List<StationDef>> convertStationSetsToJson(EList<StationSet> ssl) {
		if (ssl == null || ssl.isEmpty()) return null;
		
		ArrayList<List<StationDef>> listJ = new ArrayList<List<StationDef>>();
		
		for (StationSet set : ssl) {
			listJ.add(convertStationsToJson(set.getStations()));	
		}
		return listJ;
	}




	private static List<StationDef> convertStationsToJson(EList<Station> set) {
		if (set == null || set.isEmpty()) return null;
		
		ArrayList<StationDef> listJ = new ArrayList<StationDef>();
		for (Station s :  set) {
			listJ.add(convertToJson(s));
		}
		return listJ;
	}


	private static StationDef convertToJson(Station s) {
		if (s == null) return null;
		StationDef sJ = new StationDef();
		if (s.getCountry() == null) {
			sJ.setCountry(NationalLanguageSupport.GtmJsonExporter_27);
		} else {
			sJ.setCountry(Integer.toString(s.getCountry().getCode()));
		}
		sJ.setLocalCode(s.getCode());
		return sJ;
	}




	private static List<FareCombinationConstraintDef> convertCombinationConstraints(CombinationConstraints list) {
		if (list == null) return null;
		if (list.getCombinationConstraints().isEmpty()) return null;
		ArrayList<FareCombinationConstraintDef> listJson = new ArrayList<FareCombinationConstraintDef>();
		for (Gtm.CombinationConstraint element: list.getCombinationConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static FareCombinationConstraintDef convertToJson(Gtm.CombinationConstraint fc) {
		if (fc == null) return null;
		FareCombinationConstraintDef fcJ = new FareCombinationConstraintDef();
		
		fcJ.setId(fc.getId());
		
		fcJ.setCombinationModels(convertCombinationModelsToJson(fc.getCombinationModels()));
		
		return fcJ;
	}





	private static List<FareCombinationModelDef> convertCombinationModelsToJson(EList<FareCombinationModel> cmL) {
		if (cmL == null || cmL.isEmpty()) return null;
		
		ArrayList<FareCombinationModelDef> listJ = new ArrayList<FareCombinationModelDef>();
		
		for (FareCombinationModel m : cmL) {
		
			FareCombinationModelDef fcJ = new FareCombinationModelDef();
			
			fcJ.setAllowedAllocators(convertCarriersToJson(m.getAllowedAllocators()));
			fcJ.setAllowedClusters(convertClusterListToJson(m.getAllowedClusters()));
			fcJ.setAllowedCommonContracts(convertCarriersToJson(m.getAllowedCommonContracts()));
			fcJ.setCombinableCarrier(convertCarriersToJson(m.getCombinableCarriers()));
			fcJ.setModel(m.getModel().getName());
			fcJ.setOnlyWhenCombined(m.isOnlyWhenCombined());
			fcJ.setReferenceCluster(m.getReferenceCluster().getName());
		
			
			listJ.add(fcJ);
		
		}
		return listJ;
	}




	private static List<String> convertClusterListToJson(EList<Clusters> acs) {
		
		if (acs == null || acs.isEmpty()) return null;
		ArrayList<String> acJ = new ArrayList<String>();
		for (Clusters c : acs) {
			acJ.add(c.getName());
		}
		return acJ;
	}




	private static List<CarrierConstraintDef> convertCarrierConstraints(CarrierConstraints list) {
		if (list == null) return null;
		if (list.getCarrierConstraints().isEmpty()) return null;
		ArrayList<CarrierConstraintDef> listJson = new ArrayList<CarrierConstraintDef>();
		for (CarrierConstraint element: list.getCarrierConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private List<CalendarDef> convertCalendars(Calendars list) {
		if (list == null) return null;
		if (list.getCalendars().isEmpty()) return null;
		ArrayList<CalendarDef> listJson = new ArrayList<CalendarDef>();
		for (Calendar element: list.getCalendars()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private CalendarDef convertToJson(Calendar cal) {
		if (cal == null) return null;
		CalendarDef calJ = new CalendarDef();
		calJ.setId(cal.getId());
		calJ.setUTCoffset(cal.getUtcOffset());		
		
		calJ.setFromDate(jsondf.format(cal.getFromDate()));
		calJ.setUntilDate(jsondf.format(cal.getUntilDate()));		
		
		if (cal.getDates() != null && !cal.getDates().isEmpty()) {
			ArrayList<String> days = new ArrayList<String>();
			for (Date date : cal.getDates()) {
				days.add(jsondf.format(date));
			}
			calJ.setDates(days);
		}
			
		return calJ;
	}




	private List<AfterSalesConditionDef> convertAfterSalesConditionsToJson(AfterSalesRules afterSalesRules) {
		if (afterSalesRules == null) return null;
		if (afterSalesRules.getAfterSalesRules().isEmpty()) return null;
		
		ArrayList<AfterSalesConditionDef> result = new ArrayList<AfterSalesConditionDef>();

		
		for (AfterSalesRule rule :  afterSalesRules.getAfterSalesRules()) {
			AfterSalesConditionDef condJ = new AfterSalesConditionDef();
			condJ.setId(rule.getId());
			condJ.setAfterSalesRules(new ArrayList<AfterSalesRuleDef>());
			
			for (AfterSalesCondition cond : rule.getConditions()) {
				
				AfterSalesRuleDef ruleJ = new AfterSalesRuleDef();
				
				ruleJ.setCarrierFee(cond.isCarrierFee());
				ruleJ.setIndividualContracts(cond.isIndividualContracts());
				ruleJ.setTransactionType(cond.getTransactionType().getName());
				
				ruleJ.setApplicationTime(convertToJson(cond.getApplicationTime()));
												
				ruleJ.setFeeRef(cond.getFee().getId());
				condJ.getAfterSalesRules().add(ruleJ);
				
			}

			result.add(condJ);
		}

		return result;
	}
	
	private static RelativeTimeDef convertToJson(RelativeTime rt) {
		if (rt == null) return null;
		
		RelativeTimeDef rtJ = new RelativeTimeDef();
		rtJ.setTimeUnit(rt.getUnit().getName());
		rtJ.setTimeReference(rt.getReference().getName());
		rtJ.setTimeValue(rt.getValue());
			
		return rtJ;
	}




	private static CarrierConstraintDef convertToJson(CarrierConstraint constraint) {
		if (constraint == null) return null;
		CarrierConstraintDef constraintDef = new CarrierConstraintDef();
		
		constraintDef.setId(constraint.getId());
		
		if (constraint.getIncludedCarriers() != null && !constraint.getIncludedCarriers().isEmpty()) {
			
			ArrayList<String> includedCarriers = new ArrayList<String>();
			for (Carrier carrier : constraint.getIncludedCarriers()) {
				includedCarriers.add(carrier.getCode());			
			}
			constraintDef.setIncludedCarrier(includedCarriers);

			
		} else if (constraint.getExcludedCarriers() != null && !constraint.getExcludedCarriers().isEmpty()) {
			
			ArrayList<String> excludedCarriers = new ArrayList<String>();
			for (Carrier carrier : constraint.getExcludedCarriers()) {
				excludedCarriers.add(carrier.getCode());			
			}
			constraintDef.setIncludedCarrier(excludedCarriers);
			
		}  
		
		return constraintDef;
	}
	
	private static PriceDef convertToJson(Price price) {
		if (price == null) return null;
		PriceDef priceDef = new PriceDef();
		
		priceDef.setId(price.getId());
		
		ArrayList<CurrencyPriceDef> currencyList = new ArrayList<CurrencyPriceDef>();
		priceDef.setPrice(currencyList);
		
		for (CurrencyPrice cur : price.getCurrencies()) {
			
			CurrencyPriceDef curDef = new CurrencyPriceDef();
			
			curDef.setAmount(cur.getAmount());
			curDef.setCurrency(cur.getCurrency().getIsoCode());
			
			ArrayList<VatDetail> vatDefs = new ArrayList<VatDetail>();
									
			for ( VATDetail vat : cur.getVATdetails()) {
				
				VatDetail vatDef = new VatDetail();
				vatDef.setAmount(vat.getAmount());
				vatDef.setTaxId(vat.getTaxId());
				vatDef.setScope(vat.getScope().getName());
				vatDef.setPercentage(vat.getPercentage());
				vatDef.setCountry(vat.getCountry().getISOcode());
				vatDefs.add(vatDef);
			}
			
			currencyList.add(curDef);	
		}

		return priceDef;
		
	}
	

	private static Delivery convertDeliveryToJson(Gtm.Delivery idelivery) {
		if (idelivery == null) return null;
		Delivery delivery = new Delivery();
		delivery.setFareProvider(idelivery.getProvider().getCode());
		delivery.setDeliveryId(idelivery.getId());
		delivery.setOptionalDelivery(idelivery.isOptional());
		delivery.setReplacementDeliveryId(idelivery.getReplacedDeliveryId());
		delivery.setPreviousDeliveryId(idelivery.getPreviousDeliveryId());
		if (idelivery.getSchemaVersion()!=null)	{
			delivery.setVersion(idelivery.getSchemaVersion().getName());
		}
		if (idelivery.getAcceptedSchemaVersion()!=null) {
			delivery.setAcceptedVersion(idelivery.getAcceptedSchemaVersion().getName());
		}
		return delivery;
	}

}
