package Gtm.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

import Gtm.presentation.GtmEditorPlugin;

public class PreferencesAccess {
	

		/**
		 * Get boolean from preference store. Default is false.
		 */
		public static boolean getBoolFromPreferenceStore(final String key) {
			IPreferenceStore store = GtmEditorPlugin.getPreferenceStore();
			boolean val = store.getBoolean(key);
			return val;
		}

		/**
		 * Get string from preference store
		 */
		public static String getStringFromPreferenceStore(final String key) {
			IPreferenceStore store =  GtmEditorPlugin.getPreferenceStore();
			String val = store.getString(key);
			return val;
		}

		/**
		 * Get int from preference store
		 */
		public static int getIntFromPreferenceStore(final String key) {
			IPreferenceStore store =  GtmEditorPlugin.getPreferenceStore();
			int val = store.getInt(key);
			return val;
		}


		/**
		 * Insert or update string in preference store
		 *
		 */
		public static void putStringToPreferenceStore(final String key, final String val) {
			IPreferenceStore store =  GtmEditorPlugin.getPreferenceStore();
			store.putValue(key,val);
		}


}
