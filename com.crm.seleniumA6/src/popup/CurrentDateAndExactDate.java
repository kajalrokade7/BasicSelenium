package popup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDateAndExactDate 
{
    public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		String current_date = sim.format(date);
		System.out.println(current_date);
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 77);
		String after_date = sim.format(cal.getTime());
		System.out.println(after_date);
	}

}
