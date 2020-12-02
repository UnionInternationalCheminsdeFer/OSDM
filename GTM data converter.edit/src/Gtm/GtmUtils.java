package Gtm;

public class GtmUtils {
	
	public static String toPrintableAscII(String text) {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", ""); //$NON-NLS-1$ //$NON-NLS-2$
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", ""); //$NON-NLS-1$ //$NON-NLS-2$
         
        // removes non-printable characters from Unicode
        return text.replaceAll("\\p{C}", ""); //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	public static String limitStringLength(String s, int maxChar) {
		if (s == null) return " "; //$NON-NLS-1$
		return s.substring(0, Math.min(maxChar, s.length()));
	}

}
