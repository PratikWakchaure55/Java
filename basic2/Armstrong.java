package basic2;

import java.util.Scanner;

public class Armstrong {

	static Scanner sc = new Scanner(System.in);

	
	double cal( int x, int n)
	{
		
		double sum =0;
		int ori = x;
		
		while(x>0)
		{
			int rem = x%10;
			 x= x/10;
			 sum = sum + Math.pow(rem , n);
		}
		
		
		System.out.println("original " + ori ); 
		
		return sum;
		
		
	}
	
	
	public static void main(String[] args) {

		int x = 371;
		 int n=  String.valueOf(x).length();
		System.out.println(n);
		
		double s = new Armstrong().cal(x,n);
		
		if(s == x)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
		
		

		

	}

}
