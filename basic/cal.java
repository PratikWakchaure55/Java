package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class cal {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat s = new SimpleDateFormat();
		
		System.out.println(c.getCalendarType());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.getTime());
		System.out.println(s.format(c.getTime()));
		
		
	}

}
