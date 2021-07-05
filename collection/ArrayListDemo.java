package collection;



import java.util.*;


class Convert
{
	
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	Convert()
	{
		
		
		a.add(50);
		a.add(4);
		a.add(30);
		a.add(9);
		a.add(9);
		a.add(59);	
		
	}
	
	void op()
	{
		
		System.out.println(a);
		
		System.out.println();
		
		Integer i[] = new Integer[a.size()]; 
			 a.toArray(i);
			 
			 for(int k : i)
			 {
				 System.out.println(k);
			 }
			 
			 System.out.println();
			
			 int j[] = new int[3];
			 
			 j[0]=6;
			 j[1]=8;
			 j[2]=98;
			 
			 
			 ArrayList<Integer> a1 = new ArrayList<Integer>(a);
			 System.out.println(a1);
		
			 
			Collections.sort(a1);
			System.out.println(a1);
			Collections.reverse(a1);
			
			System.out.println(a1);
		
		
		
	}
	
	
	
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Convert().op();

	}

}
