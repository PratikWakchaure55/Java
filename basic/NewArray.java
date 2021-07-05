package basic;

import java.util.*;

public class NewArray {

	Scanner sc = new Scanner(System.in);
	
	
	public int[] name()   //if this is static method then you don't have to create class object in main method you can directly call it
	{
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int brr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int mul=1;
		for(int i =0;i<arr.length;i++)
		{
			
			mul *= arr[i];
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			brr[i]= mul/arr[i];
		}
		
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
		
		return brr;	
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		NewArray n = new NewArray();
		int []b = n.name();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
			

	}

}
