package basic2;

import java.util.*;

public class Prime {
	
	static Scanner sc = new Scanner(System.in);
	
	static boolean pr(int i)
	{
		
		if(i==1)
		{
			return false;
		}
		
		for(int j= 2;j*j <=i ;j++)
		{
			if(i%j==0)
			{
				return false;
			}
			
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		
		
		int i = sc.nextInt();
		
		 System.out.println(pr(i));
		 
		 
		
		
	}

}
