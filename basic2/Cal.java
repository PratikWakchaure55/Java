package basic2;
	
import java.util.LinkedHashMap;
import java.util.Scanner;

	class Cal
	{

	 static LinkedHashMap<Integer,String> month = new LinkedHashMap<Integer,String>();
	 static LinkedHashMap<Integer,Integer> total = new LinkedHashMap<>();
	
	 
		

	 
	 static int MonthStartsOn(int mon , int year)
	 {
		 //random hardcoded data
		 if(mon == 0 || mon == 3 || mon == 6)
		 {
			 return 3;
		 }
		 else if(mon == 1 ||mon == 2 || mon == 4)
		 {
			 return 4;
		 }
		 else if(mon == 5 || mon == 7 || mon ==9)
		 {
			 return 2;
		 }
		 else if(mon == 10 || mon == 11 || mon == 8)
		 {
			 return 0;
		 }
		 
		 return -1;
		 
	 }
	 
	static int startMonth(int mon,int year)
	{
	  return MonthStartsOn(mon-1,year);

	}

	 static void printMonth(int mon, int year)
	 {
		 
		 	month.put(1,"January");
			month.put(2,"February");
			month.put(3,"March");
			month.put(4,"April");
			month.put(5,"May");
			month.put(6,"June");
			month.put(7,"July");
			month.put(8,"August");
			month.put(9,"September");
			month.put(10,"Octobar");
			month.put(11,"November");
			month.put(12,"December");
			
			
			total.put(1,31);
			if(year % 4 == 0)
			{
				total.put(2,29);
			}
			else
			{
				total.put(2,28);
			}
			total.put(3,31);
			total.put(4,30);
			total.put(5,31);
			total.put(6,30);
			total.put(7,31);
			total.put(8,31);
			total.put(9,30);
			total.put(10,31);
			total.put(11,30);
			total.put(12,31);
		 

	   if(year<1980 || year >2480)
	   {
	      System.out.println("Invalid Year");
	   }
	   else
	   {

		int startDay = startMonth(mon,year);

		if(startDay==-1)
		{
		System.out.println("Invalid Month");

		}
		else
		{

			String gap = "";
		for(int i=0;i<startDay;i++)
			{
			gap = gap+"    ";   // 4 spaces for each gap because we have written day in 3 word format like mon tue so one extra space for moving forward
			}

			
		
			System.out.println( month.get(mon) + " " + year);
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			System.out.print(gap);

			int dayOfMonth = 1;

			int totalDay = total.get(mon);
			
			for(int i=0;dayOfMonth<=totalDay;i++)
			{
	    		for(int j=((i==0)?startDay:0);j<7 && dayOfMonth<=totalDay;j++)
				{
	    			if(dayOfMonth>9)
	    			{
	    				System.out.print(dayOfMonth + "  "); //2 spaces for grater than 9

	    			}
	    			else
	    			{
	    				System.out.print(dayOfMonth + "   ");  // 3 spaces for lower than 10
	    			}
				
				dayOfMonth++;
				}

			System.out.println();
	  		}

	   }
	   
	   }
	 }  
	   

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
	int mon = sc.nextInt();
		System.out.println("Enter Year");
	int year = sc.nextInt();
	printMonth(mon, year);

	
	sc.close();
	
	}

	

}
