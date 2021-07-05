package basic;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String s1 = "ab";
		System.out.println(s1);
		
		String s2 = "cd";
		
		System.out.println(s1==s2); //address comparison
		
		String s3 = "ab";
		
		System.out.println(s1.equals(s3));  //content comparison
		
		System.out.println(s1==s3); //address comparison //as if string pool having same content(ab) present there in that case s3 also pointing there in case of 
														//placing it on new address
		
		
		s3 = s3.toUpperCase();
		
		System.out.println(s3);
		System.out.println(s1==s3); //address comparison //now s3 having new content(AB) it will give new address to variable
		
		System.out.println(s1);
		
		s1 = s1.toUpperCase();   // when you change the variables initial value after that both variables have different address
		System.out.println(s1==s3); //false
		
		System.out.println(s1.equals(s3));
		
		String s4 = "AB";  
		
		System.out.println(s4 == s3); //once s3's initial value changes then its not matches with newly initialize variable
		
		
		
		String s5 = "xyz";
		
		System.out.println(s5.charAt(1));    //gives character
		System.out.println(s5.indexOf("y"));  //gives index
		
		
		
		String s6 = "xyz";
		
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
		StringBuilder b = new StringBuilder(s5);
		b.append(" lmn");
		
		System.out.println(b);
		
		
		StringBuffer r = new StringBuffer();
		r.insert(0,s5);
		
		System.out.println(r);
		
		
		String s7 = "pratik";
		
		char ch[] = s7.toCharArray(); //conversion of string to char array
		
		for(int i = 0;i<ch.length;i++)
		{
			System.out.println(ch[i]);   //you cannot use []  to access elements in string you have to use char array to access it
											
		}
		
		System.out.println();
		
		for(int i = 0;i<s7.length();i++)
		{
			System.out.println(s7.charAt(i));   //you have to use charAt function to access elements in string to access it
							
		}
		
		System.out.println();
		
		String m = "My Name Is Pratik";
		
		String arr[] = m.split(" ");  // use spit function to convert whole long string to string array using delimiter present in long string  
		
		for(int i=0 ;i<arr.length;i++)
		{
			
			
			System.out.println(arr[i]);
			
			
		}
		System.out.println();
		
		String brr[] = m.split("a");  // use spit function to convert whole long string to string array using delimiter present in long string  
		
		for(int i=0 ;i<brr.length;i++)
		{
			System.out.println(brr[i]);
		}
		
		System.out.println();
		
		for(int i=0 ;i<arr.length;i++) 
		{
			
			if(Arrays.asList(arr[i]).contains("Name"))   //if we have to check string array value convert array into list and use contains method for check
			{
				System.out.println("print now");
			}
			else
			{
				System.out.println(arr[i]);
			}
			
			
			
		}
		

	}

}
