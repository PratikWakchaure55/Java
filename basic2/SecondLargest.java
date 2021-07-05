package basic2;

import java.util.ArrayList;
import java.util.Scanner;
public class SecondLargest {

	
	static int call(ArrayList<Integer> a )
	{
	
		int largest = Integer.MIN_VALUE;
		int seclargest = Integer.MIN_VALUE;
		
//		
//		for(int i=0;i<a.size();i++)
//		{
//			
//			if(a.get(i)>largest)
//			{
//				largest = a.get(i);
//			}
//			else if(a.get(i)>seclargest && a.get(i)!= largest)
//			{
//				seclargest = a.get(i);
//			}
//			
//		}
		
		for(int i=0;i<a.size();i++)
		{
			largest = Math.max(a.get(i),largest);
		}
		
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)!= largest)
			{
				seclargest = Math.max(seclargest,a.get(i));
			}
		}
		
		return seclargest;
		
	}
	
		
		
	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
		{
			
			int value = sc.nextInt();
			a.add(value);
			
		}
		
//		for(int i=0;i<n;i++)
//		{
//			
//			System.out.println(a.get(i));
//			
//		}
		
		
		System.out.println(call(a));
		
		sc.close();
		
		
		
		
		
	}

}
