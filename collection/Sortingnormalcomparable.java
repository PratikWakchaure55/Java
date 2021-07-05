package collection;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("rawtypes")


//if same package contains multiple same name classes it gives error 


//1.using normal comparable
class emp2 implements Comparable{      //have to implement comparable in order to sort object

	int eid;
	String ename;
	
	
	
	public emp2(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}



	@Override
	public int compareTo(Object o) {     //comparable interface contains compareto method which we have to implement
		
		emp2 e = (emp2) o;    //for normal type we have to perform type casting from object type to emp type
		
		if(eid==e.eid)
		{
			return 0;   //no change required 
		}
		else if(eid>e.eid)   //if current id is less than previous id
		{
			return 1; //change required
		}
		else
		{
			return -1;  // //no change required 
		}
		
		
	}
	
	
}

public class Sortingnormalcomparable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<emp2> a= new ArrayList<emp2>();
		
		a.add(new emp2(1,"pratik"));
		a.add(new emp2(4,"akash"));
		a.add(new emp2(2,"chetan"));
		
		Collections.sort(a);   //sorting method
		
		for(emp2 e: a)
		{
			System.out.println(e.eid +" " + e.ename);
		}
		
		
	
	}

}
