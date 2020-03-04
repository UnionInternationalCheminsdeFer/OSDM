package Gtm.presentation;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;


public class DateTimeCellEditor extends CellEditor
{

	private DateTime dateTime;


	public DateTimeCellEditor(Composite composite)
	{
		super(composite);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.CellEditor#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createControl(Composite parent)
	{
		dateTime = new DateTime(parent, SWT.TIME);
		return dateTime;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.CellEditor#doGetValue()
	 */
	@Override
	protected Object doGetValue()
	{
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.HOUR_OF_DAY, dateTime.getHours());
		calendar.set(Calendar.MINUTE, dateTime.getMinutes());
		calendar.set(Calendar.SECOND, dateTime.getSeconds());
		return calendar.getTime();
	}


	@Override
	protected void doSetFocus()
	{
		// Do nothing
	}


	@Override
	protected void doSetValue(Object value)
	{
		if (dateTime != null)
		{
			Calendar calendar = new GregorianCalendar();
			if (value instanceof Date)
			{
				calendar.setTime((Date) value);
			}
			else
			{
				calendar.setTime(new Date());
			}
			dateTime.setTime(calendar.get(Calendar.HOUR_OF_DAY),
					calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
		}
	}
}
