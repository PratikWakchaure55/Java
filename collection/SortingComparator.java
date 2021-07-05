package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//if you want sort primitive data go with comparable if you want to sort object data go with comparator 

class emp3 
{
	
	int id;
	String name;
	
	
	public emp3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}


@SuppressWarnings("rawtypes")
class Idcomparator implements Comparator   //normal type comparator 
{

	@Override
	public int compare(Object o1, Object o2) {
		
		emp3 e1 = (emp3) o1;   // by default emp class object
		emp3 e2 = (emp3) o2;   //incoming object for comparison with other objects
		
		if(e1.id==e2.id)   //e1 is class object while e2 is new incoming object
		{
			return 0;
		}
		else if(e1.id>e2.id)    //comparing int here
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
		
		
	}
	
	
	
	
}


class Namecomparator implements Comparator<emp3>    //generic type comparator
{

	@Override
	public int compare(emp3 o1, emp3 o2) {   //dont need to type cast for generic comparator
		
		return o1.name.compareTo(o2.name);   //comparing strings here
	}

	
	
}



public class SortingComparator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<emp3> a= new ArrayList<emp3>();
		
		a.add(new emp3(1,"pratik"));
		a.add(new emp3(4,"akash"));
		a.add(new emp3(2,"chetan"));
		
		 //only one use at a time either name comparator or id comparator  to show the correct result
		
		Collections.sort(a,new  Idcomparator());    //we have to pass that comparator object in order to sort
		
		
		//Collections.sort(a,new  Namecomparator());  

		

		for(emp3 e: a)
		{
			System.out.println(e.id +" " + e.name);
		}
		
		

	}

}
