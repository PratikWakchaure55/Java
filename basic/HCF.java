package basic;


import java.util.*;


public class HCF {
	
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
	
	static void findHCF(int arr[],int n)
	{
		
		int count = 0;
		int m =0;
		
		int m1 = max(arr,n);
		
		for(int i=1;i<=m1;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(arr[j]%i == 0)
				{
					count++;
				}
			}
			
			
			if(count == n)
			{
				m = Math.max(i,m);
				
			}
			
			count =0;
			
		}
		
		
		System.out.println(m);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		
		int arr[] =  new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
	
		findHCF(arr,n);
		
	}

}
