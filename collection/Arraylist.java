package collection;

import java.util.ArrayList;


//collection not type safe

class emp
{
	
	String s;
	int id;
	
	public emp(String s, int id) {
		super();
		this.s = s;
		this.id = id;
	}
	
	
}

class student
{
	
	String s;
	int id;
	
	public student(String s, int id) {
		super();
		this.s = s;
		this.id = id;
	}
	
	
}

public class Arraylist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {


		
		
		@SuppressWarnings("rawtypes")
		ArrayList a  =new ArrayList(); //take all type of values  //old type of implementation of arraylist
		
		
		a.add("ll");
		a.add(null);
		a.add(10);  //autoboxing
		a.add(Integer.valueOf(33));  //not autoboxing. here we have to convert we convert data to wrapper class
		a.add(Double.valueOf(11.45));
		a.add(new emp("rakesh",440));  //this is how we insert class object in arraylist
		a.add(new student("pratiks",20));
		a.add(new student("pritesh",44));
		
		
		
		
		
		System.out.println(a); //if you use this printing style then object values print as hash values
		
		
		
		
		
		for(Object o : a)   //object type is like auto in c++ we don't have to mention type for each data
		{
			if(o instanceof emp)  //instanceof checking which class object it is
			{
				emp e= (emp) o ;   //here we type cast object into that class before printing
				System.out.println(e.s+ " "+ e.id);  
			}
			else if(o instanceof student)
			{
				student s= (student) o;
				System.out.println(s.id+ " "+ s.s);
			}
			else
			{
				System.out.println(o);  //don't need type casting for primitive type
			}
			
			
		}
		
		
	}

	

}





