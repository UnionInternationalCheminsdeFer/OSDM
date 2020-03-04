package Gtm.presentation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

public class CalendarCellEditor extends ExtendedDialogCellEditor{



		/**
		 * Constructor.
		 * @param composite
		 * @param labelProvider
		 */
		public CalendarCellEditor(Composite composite, ILabelProvider labelProvider)
		{
			super(composite, labelProvider);
		}


		@Override
		protected Object openDialogBox(Control cellEditorWindow)
		{
			final DateTime dateTime[] = new DateTime[1];
			final Date[] date = new Date[1];

			Dialog d = new Dialog(cellEditorWindow.getShell())
			{
				protected Control createDialogArea(Composite parent)
				{
					Composite dialogArea = (Composite) super.createDialogArea(parent);
					dateTime[0] = new DateTime(dialogArea, SWT.CALENDAR);
					dateTime[0].addSelectionListener(
						new SelectionAdapter()
						{

							@Override
							public void widgetSelected(SelectionEvent e)
							{
								Calendar calendar = new GregorianCalendar();
								calendar.set(Calendar.YEAR, dateTime[0].getYear());
								calendar.set(Calendar.MONTH, dateTime[0].getMonth());
								calendar.set(Calendar.DAY_OF_MONTH, dateTime[0].getDay());
								date[0] = calendar.getTime();
								super.widgetSelected(e);
							}
						}
					);
					return dialogArea;
				}
			};
			d.setBlockOnOpen(true);
			d.open();
			if (d.getReturnCode() == Dialog.OK)
			{
				return date[0];
			}
			return null;
		}
	}
