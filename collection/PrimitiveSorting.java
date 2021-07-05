package collection;

import java.util.ArrayList;
import java.util.Collections;

public class PrimitiveSorting {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		ArrayList<String> b =new ArrayList<String>();

		
		
		a.add(10);
		a.add(39);
		a.add(2);
		a.add(33);
		a.add(23);
		
		b.add("pratik");
		b.add("akash");
		b.add("charul");
		b.add("pritsh");
		
		Collections.sort(b);
		
		
		Collections.sort(a);    //primitive data directly sort by using sort function 
		
	System.out.println(a);
	
	System.out.println(b);
		

	}

}
