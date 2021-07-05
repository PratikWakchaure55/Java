package collection;

import java.util.*;
import java.util.Map.Entry;

public class FrequencyUsingMaps {
	
	
	public static void main(String args[])
	{
		
		int arr[] = {5,5,3,5,34,3,2,343,34,3,4,1,1,1,1,53,5};
		
		
		Map<Integer,Integer> m = new LinkedHashMap<>();  //for order preseve use linkedhashmap for non preserve use only hashmap
														//if you use treemap it will give sorting order and frequency as well
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(m.containsKey(arr[i]))
			{
				m.put(arr[i],m.get(arr[i])+1);
				
			}
			else
			{
				m.put(arr[i],1);
			}
			
		}
		
		
		
		Set<Entry<Integer,Integer>> s =  m.entrySet();       //instead of writing this whole code you can simply use Map.Entry in loop to fetch value
		
		Iterator<Entry<Integer,Integer>> i = s.iterator();
		
		
		while(i.hasNext())
		{
			
			Entry<Integer,Integer> e = i.next();
			
			System.out.println(e.getKey() + " " + e.getValue());
			
			
		}
		
		
		System.out.println();
		
		
		for(Map.Entry<Integer,Integer> e : m.entrySet())  // small chunk of code instead of writing whole code as above
		{
			
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
		
		
	}
	

}
