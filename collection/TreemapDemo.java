package collection;

import java.util.*;
import java.util.Map.Entry;


class Demo 
{
	
	TreeMap<Integer,String> t = new TreeMap<Integer,String>();
	Demo()
	{
		t.put(1, "pratik");
		t.put(4, "chakar");
		t.put(2, "rama");
		
		t.put(9, "amol");
		t.put(3, "pritam");
		t.put(18, "suresh");
		
	}
	
	
	
	void add()
	{
		
		
		System.out.println(t);
		System.out.println();
		
	}
	
	void print()
	{
		
		
		Set<Integer> s = t.keySet();
		System.out.println(s);
		
		Collection<String> c = t.values();
		System.out.println(c);
		
		
		System.out.println();
		
		Set<Entry<Integer,String>> z = t.entrySet();
		
		for(Entry<Integer,String> h : z )
		{
			
			System.out.print(h.getKey());
			System.out.println(h.getValue());
			
			
		}
		
		System.out.println();
		
		
		Iterator<Entry<Integer,String>> it = z.iterator();
		
		while(it.hasNext())
		{
			
			Entry<Integer,String> e = it.next();
			
			Integer i = e.getKey();
			System.out.print(i);
			
			String m = e.getValue();
			System.out.println(m);
			
				
			
		}
		System.out.println();
			
	}
	
	
	public void funtions()
	{
		
		
		SortedMap<Integer,String> s1 = t.subMap(2, 10);
		TreeMap<Integer,String> t1 = new TreeMap<Integer, String>(s1);
		System.out.println(t1);
		
		
		SortedMap<Integer,String> s2 = t.tailMap(4);
		TreeMap<Integer,String> t2 = new TreeMap<Integer, String>(s2);
		System.out.println(t2);
		
		SortedMap<Integer,String> s3 = t.headMap(9);
		TreeMap<Integer,String> t3 = new TreeMap<Integer, String>(s3);
		System.out.println(t3);
		
		
	}
	
}

public class TreemapDemo {

	public static void main(String[] args) {
		
		
		new Demo().add();
		new Demo().print();
		new Demo().funtions();


	}

}
