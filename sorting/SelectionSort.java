package sorting;

import java.util.*;

public class SelectionSort {

	static Scanner sc = new Scanner(System.in);
	
	
	static void selection (int arr[],int n)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i; j<arr.length;j++)
			{
				
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
				
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		selection(arr,n);
		
		for(int i =0 ;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	
 		sc.close();

	}

}
