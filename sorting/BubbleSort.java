package sorting;

import java.util.*;

public class BubbleSort {
	
	
	static void bubble(int arr[],int n)
	{
		
		for(int i=0 ;i<n ;i++)
		{
			for(int j=1 ;j<n-i ;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		bubble(arr,n);
	
   
 		for(int i =0 ;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	
 		sc.close();
 		

	}

}
