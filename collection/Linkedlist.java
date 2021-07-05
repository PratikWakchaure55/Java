package collection;

import java.util.LinkedList;

class book
{
	int id;
	String name;
	String autor;
	
	public book(int id, String name, String autor) {
		super();    //Object class
		this.id = id;
		this.name = name;
		this.autor = autor;
	}
	
	
}

public class Linkedlist {

	public static void main(String[] args) {
	
		LinkedList<book> ll= new LinkedList<book>();
		LinkedList<Integer> k=new LinkedList<Integer>();
		
		
		k.add(10);
		k.add(30);
		
		ll.add(new book(1, "c++", "rohan"));
		ll.add(new book(2, "java", "rakesh"));
		ll.add(new book(3, "ds", "roh"));
		
		for(book b: ll)
		{
			System.out.println(b.id+" "+b.name +" " + b.autor);
		}
		
		System.out.println();
		System.out.println(ll);
		
		for(Object b: ll)
		{
			
			if(b instanceof book)
			{
				book l = (book)b;  
				System.out.println(l.id+" "+l.name +" " + l.autor);
			}
			
			
		}
		
		
		for(Object b: k)   //if object is primitive type we dont have to type cast
		{
			System.out.println(b);
		}
		

	}

}
