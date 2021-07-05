package basic;

import java.util.*;

class Book
{
	int number;
	String name;
	
	Book(int n, String b)
	{
		number =n;
		name =b;
	}
	
	
}


class Try
{
	
	Vector<Book> b = new Vector<Book>();
	
	Try()
	{
		
		b.add(new Book(1,"rahil"));
		b.add(new Book(8,"rachit"));
		b.add(new Book(7,"nisha"));
		b.add(new Book(9,"pandurang"));
		b.add(new Book(10,"sunny"));
		
	}
	
	void op()
	{
		
		for(Book l : b)
		{
			System.out.println(l.number);
			System.out.println(l.name);
			
		}
		
		
		Iterator<Book> z = b.iterator();
		
		

		while(z.hasNext())
		{
			
			Book a = z.next();
			
			String s = a.name;
			
			if(s.equals("nisha"))
			{
				z.remove();
			}
			
			
		}
		
		System.out.println();
		
		
		Enumeration<Book> e = b.elements();
		
		while(e.hasMoreElements())
		{
			
			Book l = e.nextElement();
			
			System.out.println(l.number);
			System.out.println(l.name);
			
		}
		
		
		
	}
	
	
	
}




public class VectorDemo {

	public static void main(String[] args) {
		

		new Try().op();
		
		
	}

}
