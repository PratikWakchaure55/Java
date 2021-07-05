package basic;

import java.util.Scanner;

public class LCM {

	
	static Scanner sc = new Scanner(System.in);
	
	
	static int max(int arr[],int n)
	{
		int max1 = 0;
		for(int i =0;i<n;i++)
		{
			
			max1 = Math.max(arr[i],max1);
			
		}
		return max1;
		
	}
	
	static void findLCM(int arr[],int n) 
	{
	
		int m1  = max(arr, n);
		int count =0;
		while(true)
		{
			
			for(int i=0;i<n;i++) 
			{
			if(m1 % arr[i] == 0)
			{
				count++;
			}
			
			}
			
			if(count == n)
			{
				System.out.println(m1);
				break;
			}
			else
			{
				m1 *= 2;
				count =0;
			}
			
		}
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int n = sc.nextInt();
		
		int arr[] =  new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
	
		findLCM(arr,n);

	}

}
