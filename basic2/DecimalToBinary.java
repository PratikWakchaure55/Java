package basic2;


import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class DecimalToBinary {

	static Scanner sc = new Scanner(System.in);

	Vector<Integer> v= new Vector<Integer>();
	
	void binary(int x)
	{
		
		while(x>0)
		{
			
			v.add(x%2);
			x=x/2;
			
		}
		
		
		Collections.reverse(v);
		
		System.out.println(v);
		
		
	}
	
	
	public static void main(String[] args) {
		DecimalToBinary b = new DecimalToBinary();
		
		int x;
		x = sc.nextInt();
		b.binary(x);

	}

}
