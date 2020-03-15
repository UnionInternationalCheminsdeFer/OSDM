package Gtm.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import Gtm.presentation.GtmEditorPlugin;

public class PreferenceInitializer extends AbstractPreferenceInitializer
{

	public void initializeDefaultPreferences()
	{
		
		IPreferenceStore store = GtmEditorPlugin.getPreferenceStore();

		store.setDefault(PreferenceConstants.P_IMPORT_CONVERABLE_ONLY, false);
		store.setDefault(PreferenceConstants.P_IMPORT_CONTRY_FILTER, " ");

	}


}

