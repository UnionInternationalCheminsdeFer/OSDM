package Gtm.nls;

import org.eclipse.osgi.util.NLS;


public class NationalLanguageSupport extends NLS{

    private static final String BUNDLE_NAME = "plugin"; //$NON-NLS-1$

	public static String GtmValidator_in;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, NationalLanguageSupport.class);

    }

    public static String Validation_GenericConstraint_diagnostic;    
	public static String Validation_CarrierConstraint_diagnostic;
	public static String Validation_ServiceConstraint_diagnostic;


}
