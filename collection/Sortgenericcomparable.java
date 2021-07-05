package collection;


import java.util.ArrayList;
import java.util.Collections;

//if same package contains multiple same name classes it gives error 


//2.using generic comparable

class emp1 implements Comparable<emp1>{     //have to implement comparable in order to sort object

	int eid;
	String ename;
	
	
	
	public emp1(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}



	@Override
	public int compareTo(emp1 o) {  //comparable interface contains compareto method which we have to implement
									//for generic type we don't have to perform type casting from object type to emp type
		
		return ename.compareTo(o.ename); 
	}
	
}



public class Sortgenericcomparable {

	public static void main(String[] args) {

		ArrayList<emp1> a= new ArrayList<emp1>();
		
		a.add(new emp1(1,"pratik"));
		a.add(new emp1(4,"akash"));
		a.add(new emp1(2,"chetan"));
		
		Collections.sort(a);
		
		for(emp1 e : a)
		{
			System.out.println(e.eid+" "+e.ename);
		}

	}

}
