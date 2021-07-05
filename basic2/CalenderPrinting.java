package basic2;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class CalenderPrinting {

	public static void main(String[] args) {

		
		Calendar cal = new GregorianCalendar(2021,7,9);
		System.out.println(cal.get(Calendar.MONTH)); //returns given month
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		cal.set(Calendar.DAY_OF_MONTH,1); //sets day of month
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));  //returns day of that month
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//if in calendar day 1 start from wednsday then friday will be 3 day of week
		
		//	int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
	
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));  //will return total days of that month
		
		int dayinmonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(new SimpleDateFormat("MMMM YYYY").format(cal.getTime()));
		
		System.out.println("S  M  T  W  T  F  S");
		
		
		
		String initial = "";
		
		for(int i = 0;i<=4;i++)
		{
			initial += "  ";
		}
		System.out.print(initial);
		
		int dayofmonth = 1;
		
		for(int i=0 ; dayofmonth <= dayinmonth; i++ )
		{
			for(int j=((i==0)?4:0); j<7 && (dayofmonth <= dayinmonth);j++)
			{
			
				System.out.printf("%3d",dayofmonth);
				dayofmonth++;
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

}
