package basic2;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	static Scanner sc = new Scanner(System.in);
	
	
	void binary(int arr[],int n,int x)
	{
	int mid = 0;
	int left = 0;
	int right = n-1;
	
	
	
	while(left<=right)
	{
		mid = (left+right)/2;
		
		
		if(arr[mid] == x)
		{
			System.out.println(1);
			break;
		}
		else if(x<arr[mid])
		{
			right = mid -1;	
			
		}
		else
		{
			left = mid + 1;
		}
	}
	
	System.out.println(0);
	
	}
	
	public static void main(String[] args) {
	
		
		BinarySearch b = new BinarySearch();
		
		int arr[] = {4,7,8,43,6,342,2};
		int n = arr.length;
		Arrays.sort(arr);
		
		
		int x = sc.nextInt();
		b.binary(arr,n,x);
		

	}

}
