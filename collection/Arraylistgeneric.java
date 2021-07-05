package collection;

import java.util.*;

//generics are type safe
class em
{
	
	String s;
	int id;
	
	public em(String s, int id) {
		super();
		this.s = s;
		this.id = id;
	}
	
	
}


public class Arraylistgeneric {

	public static void main(String[] args) {
		

		
		ArrayList<Integer> a = new ArrayList<Integer>();  //for generic we use specific type wrapper class
		
		a.add(45); //autoboxing is performed here
		a.add(44);
		a.add(99);
		a.add(67);
	//	a.add("ramesh")   //invalid because of generic 
		
		
		System.out.println(a);  //for printing method 1  //direct printing 

		
		for(int f : a)
		{
			System.out.println(f); //method 2  // specific type printing
		}
		
		System.out.println();
		for(Object o : a)
		{
			System.out.println(o);  //method 3   //for all type printing
		}
		
		
		
		
		ArrayList<em> e =new ArrayList<em>();
		
		
		e.add(new em("pratik",2));
		e.add(new em("rakesh",4));
		e.add(new em("kara",99));
		
		
		System.out.println();
		for(em l: e)
		{
			System.out.println(l.id+ " " + l.s );   //here we dont want to check type or type cast like regular Arraylist
		}
		
		
		
	}

}
