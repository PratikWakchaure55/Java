package basic2;

import java.util.Scanner;

public class Fibbonaci {

static Scanner sc = new Scanner(System.in);
	

int n = 0;

int t1 =0;
int t2 =1;



	 void pr(int i)
	{
		
		if(i == 0)
		{
			System.out.println(t1);
		}
		else
		{
			
		
			for(int j=0;j<i;j++)
			{
			System.out.println(t1);	
			n = t1+t2;
			t1=t2;
			t2 =n;
			}
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		int i = sc.nextInt();  //fibonnaci terms
		Fibbonaci f = new Fibbonaci();
		
		  f.pr(i);
		 
		 
		
		
	}

}
