/**
 * Copyright (c) 2010 DB Systel GmbH
 */
package Gtm.presentation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Type HelpHandler
 * 
*/
public class HelpHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public HelpHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		window.getWorkbench().getHelpSystem().displayHelp();

		return null;
	}
}
