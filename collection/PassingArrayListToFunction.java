package collection;

import java.util.ArrayList;
import java.util.Iterator;

class fun
{
	
	//in order to call method directly without creating object of class method must be static. 
	
	static void call(ArrayList<Integer> l)   //  object directly pass as reference in java
 	{
											  //here we change l but it also reflect in a
		
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext())
		{
			Integer kk =i.next();
			
//			System.out.println(kk);
			if(kk==20)
			{
				i.remove();
			}
			
		}
		
		for(Integer m : l)
		{
			System.out.println(m);
		}
			
	}
	
	
	void ar(int b[])
	{
		
		b[2] = 66;
		
		for(int bb : b )
		{
			System.out.println(bb);
		}
			
		
	}
	
	
	
	
}


public class PassingArrayListToFunction {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		fun f = new fun();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		int arr[] = new int[10];
		
		arr[0]=1;
		arr[1]=45;
		
		
		//passing object as a reference is by default in java applies to array also 
		
		fun.call(a);     //can directly call method without creating object if method is static
		
		System.out.println();
		
		for(Integer z : a)   //20 also remove from a
		{
			System.out.println(z);
		}
		
		System.out.println();
		
		f.ar(arr);
		
		System.out.println();
		
		for(int bb : arr)
		{
			System.out.println(bb);
		}
		

}

}
