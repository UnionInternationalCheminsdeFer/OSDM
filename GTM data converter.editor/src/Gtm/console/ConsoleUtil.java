/**
 * <copyright>
 *
 * Copyright (c) 2004, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

package Gtm.console;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;


/**
 * A Util Class: provides convinient api to write to the Eclipse Console View  
 * 
 * The client of printXXXX(String name, String msg) methods does not need to do any 
 * housekeeping work to use this method. All pre-work for example registering the console 
 * with the Eclipse console manager if neccessary, creating the message stream, setting 
 * the default color are handled ny the method if neccesary.
 * 
 * However once they are done printing all there messages and have no more requirement
 * for the console and know that the console is not shared by others they can call 
 * unregisterConsole(String name) to dispose of the console
 * 
 * Also if the client wants to have more control over the console and streams or want
 * to display addititional message types in different colors (other than error:red, 
 * info:blue and warning:yellow) they can call registerConsole(String name, 
 * ImageDescriptor image) to create/register/get the console and then use standard 
 * eclipse api to do what they want.
 * 
 * @author Saurabh Bagrodia (bagrodia) 
 */
public class ConsoleUtil {
	
	/** cache for console name to actual console object mapping*/
	private static Map<String, MessageConsole> nameToConsole =
		new HashMap<String, MessageConsole>();
	
	/** cache for 'console name' to 'default streams for error, warning and info for that console' mapping */
	private static Map<String, MessageConsoleStream> nameToDefaultStream =
		new HashMap<String, MessageConsoleStream>();
	
	
	// Strings for error, info, warning and default message types
	private final static String ERROR = "ERROR"; //$NON-NLS-1$
	private final static String INFO = "INFO";//$NON-NLS-1$
	private final static String WARNING = "WARNING";//$NON-NLS-1$
	private final static String DEFAULT= "DEFAULT";//$NON-NLS-1$
	
	//  Colors for error , info and warning message colors: By Default
	//  error messages are red, warnings yellow and info blue.
	
	/** Default color used for logging error messages to the console. */
	public final static Color DEFAULT_ERROR =  new Color(null,255,0,0);
	
	/** Default color used for logging info messages to the console. */
	public final static Color DEFAULT_INFO =  new Color(null,0,0,255);
	
	/** Default color used for logging warning messages to the console. */
	public final static Color DEFAULT_WARNING =  new Color(null,255,255,0);

	/**
	 * Registers the console with the Eclipse Console Manager.
	 * 
	 * @param name - the name for the console
	 * @param image - the image associated with the console
	 * @return the message console 
	 */
	public static MessageConsole registerConsole(String name, ImageDescriptor image){		
		
		if(nameToConsole.get(name) == null){	
			
			MessageConsole console = new MessageConsole(name,image);
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(
				new IConsole[]{console});			
			
			nameToConsole.put(name, console);
		}
		
		return nameToConsole.get(name);
	}
	
	
	/**
	 * Registers the console with the Eclipse Console Manager
	 * 
	 * @param name - the name name for the console	 
	 * @return message console  
	 */
	public static MessageConsole registerConsole(String name){		
		return registerConsole(name,null);
	}
	
	
	/**
	 *  Unregisters the console with the Eclipse Console Manager
	 * 
	 * 	@param name - the name name for the console	   
	 */
	public static void unregisterConsole(String name){		
		if(nameToConsole.containsKey( name)){		
			ConsolePlugin.getDefault().getConsoleManager().removeConsoles(
				new IConsole[]{nameToConsole.get(name)});
			nameToConsole.remove( name);
			nameToDefaultStream.remove(name+ERROR );
			nameToDefaultStream.remove(name+INFO );
			nameToDefaultStream.remove(name+WARNING );
			
		}		
	}
	
	
	
	/**
	 * returns the default (cached) MessageConsoleStream for the specified console name of the 
	 * specified type (error, info or warning)
	 * 
	 * @param name - the specified console name
	 * @param type - the specified type (error, info or warning)
	 * @return the default MessageConsoleStream 
	 */
	private static MessageConsoleStream getDefaultStream(String name, String type){
		if(nameToDefaultStream.get(name+type)== null){
			MessageConsole console = registerConsole(name);			
			MessageConsoleStream defaultStream = console.newMessageStream();
			
			nameToDefaultStream.put(name+type, defaultStream);
			
		}
		
		return nameToDefaultStream.get(name+type);
		
	}
	
		
	/**
	 * Convinient static method to print an error string on the specified console.
	 * The color of the error message printed is by red. 
	 *  
	 * The client of this method does not need to do any housekeeping work to use 
	 * this method. All pre-work for example registering the console with the Eclipse 
	 * console manager if neccessary, creating the message stream, setting the color
	 * are handled by the method if neccesary.
	 * 
	 * @param name - specifies the console
	 * @param errMsg - the error message
	 */	
	public static void printError(String name, String errMsg){		
		MessageConsoleStream defaultStream = getDefaultStream(name, ERROR);
		defaultStream.setColor(DEFAULT_ERROR);
		defaultStream.println(errMsg);		
	}
	
	/** 
	 * Convinient static method to print an info string on the specified console.
	 * The color of the info message printed is by blue. 
	 *  
	 * The client of this method does not need to do any housekeeping work to use 
	 * this method. All pre-work for example registering the console with the Eclipse 
	 * console manager if neccessary, creating the message stream, setting the color
	 * are handled by the method if neccesary.  
	 * 
	 * @param name - specifies the console
	 * @param infoMsg - the info message
	 */
	public static void printInfo(String name, String infoMsg){			
		MessageConsoleStream defaultStream = getDefaultStream(name,INFO);
		defaultStream.setColor(DEFAULT_INFO);
		defaultStream.println(infoMsg);	
	}
	
	
	
	/** 
	 * Convinient static method to print an warning string on the specified console.
	 * The color of the warning message printed is by yellow. 
	 *  
	 * The client of this method does not need to do any housekeeping work to use 
	 * this method. All pre-work for example registering the console with the Eclipse 
	 * console manager if neccessary, creating the message stream, setting the color
	 * are handled by the method if neccesary.   
	 * 
	 * @param name - specifies the console
	 * @param warnMsg  - the warning message
	 */
	public static void printWarning(String name, String warnMsg){			
		MessageConsoleStream defaultStream = getDefaultStream(name, WARNING);
		defaultStream.setColor(DEFAULT_WARNING);
		defaultStream.println(warnMsg);	
	}
	

	/** 
	 * Convinient static method to print an string on the specified console.
	 * The color of the message printed is by black. 
	 *  
	 * The client of this method does not need to do any housekeeping work to use 
	 * this method. All pre-work for example registering the console with the Eclipse 
	 * console manager if neccessary, creating the message stream, setting the color
	 * are handled by the method if neccesary.   
	 * 
	 * @param name - specifies the console
	 * @param msg  - the warning message
	 */
	public static void println(String name, String msg){
		MessageConsoleStream defaultStream = getDefaultStream(name, DEFAULT);		
		defaultStream.println(msg);			
	}
	

	
	/**
	 * Shows the Eclipse console view and brings on top the specified console.
	 * 
	 * Also creates and registers the console with the Eclipse console manager 
	 * if necessary.
	 * 
	 * @param name - specifies the console
	 */
	public static void showConsole(String name){
		MessageConsole console = registerConsole(name);	
		
		// Need to call the following Eclipse API twice as there is a bug in the 
		// API. 
		// Expected: The API method should open the console view and display given the console.
		// If the view is already open, it should be brought to the front.
		// Actual: if the view is not already open, the method opens it but does not bring it 
		// to front; A second invocation of the method is a workaround to bring to front the 
		// opened view.
		// Submitted Bugzilla Bug #70864 to track the defect
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
	}

	
}
