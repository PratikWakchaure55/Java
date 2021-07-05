package collection;

import java.util.*;

public class Conversion {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. array to list
		
		Integer[] arr = {1,2,3,4};  //type should be wrapper class in order to convert that
		
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));  //passing array as constructor
		
		a.add(9);
		a.add(10);
		
		System.out.println(a);
		
		
		//2. list to array
		
		ArrayList<Integer> b =new ArrayList<Integer>();
		b.add(40);
		b.add(50);
		
		Integer brr[]=new Integer[b.size()+2];     
		
		b.toArray(brr);  //making list to array
		
		brr[2]=60;
		brr[3]=80;
		
		for(int i: brr)
		{
			System.out.println(i);
		}

			
			
		
		//3.normal list to array
		
		ArrayList c = new ArrayList();
		
		c.add(100);
		c.add("oral");
		c.add(10.33);
		c.add(null);
		
		System.out.println();
		
		Object[] o = c.toArray();   //don't have to pass array because it is heterogeneous directly store in object array
		
		
		for(Object oo : o)
		{
			System.out.println(oo);
		}
	
		
		
		
	}

}
