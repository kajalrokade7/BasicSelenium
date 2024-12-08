package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPopup {

	public static void main(String[] args) {
                                                                                   
        // first create object of a date
//		Date date = new Date();
//		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-YYYY");
//		String current_date = sim.format(date);
//		System.out.println(current_date);
//		
		//Calendar cal = sim.getCalendar();
		//cal.add(Calendar.DAY_OF_MONTH,70);
		//String after_date = sim.format(cal.getTime());
		//System.out.println("after date is :"+after_date);
//		Date date1 = new Date();
//		SimpleDateFormat sim1 = new SimpleDateFormat("dd-mm-yyyy");
//		System.out.println(sim1.format(date1));
//		
//		Calendar cal1 = sim1.getCalendar();
//		cal1.add(Calendar.DAY_OF_MONTH, 60);
//		System.out.println(sim1.format(cal1.getTime()));

		
		
		Date date = new Date();
	    SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
	    String current_date = sim.format(date);
	    
	    Calendar cal = sim.getCalendar();
	    cal.add(Calendar.DAY_OF_MONTH, 77);
	    String after_date = sim.format(cal.getTime());
	    
		
		
		
		
		

	}

}
