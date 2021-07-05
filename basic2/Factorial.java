package basic2;

import java.util.Scanner;

public class Factorial {
	

static Scanner sc = new Scanner(System.in);
	

	 void pr(int key)
	{
		 int fact = 1;

		 for(int i=1;i<=key;i++)
		 {
			 
			 fact = fact*i;
		 }
		 
		 System.out.println(fact);
		
	}

	public static void main(String[] args) {
		
		
		int i = sc.nextInt();  //fibonnaci terms
		Factorial f = new Factorial();
		
		  f.pr(i);
		 
		 
		
		
	}


}
