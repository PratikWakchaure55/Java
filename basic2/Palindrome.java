package basic2;

import java.util.Scanner;

public class Palindrome {
	

	static Scanner sc = new Scanner(System.in);
	
	void check(int n ,String s)
	{
		
		int j= n-1;
		
		int flag =0;
		for(int i=0;i<n/2;i++)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				flag =1;
				
			}
			else
			{
				flag=0;
				break;
			}
			
			j--;
		}
		
		
		System.out.println(flag);
	}

	public static void main(String[] args) {
		

		String x;
		x = sc.next();
		int n = x.length();
		new Palindrome().check(n,x);
		

	}

}
