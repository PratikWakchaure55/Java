package collection;

import java.util.*;

public class RemoveDublicatesusingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = {5,34,54,4,5,3,5,35,3,53,3,5,3,6,87,43,2};
		
		Set<Integer> s = new HashSet<Integer>(Arrays.asList(arr));   //order is not going to preserve after removing duplicate elements
		
		System.out.println(s + " unique, order not preserved");
		
		Set<Integer> s1 = new LinkedHashSet<Integer>(Arrays.asList(arr)); // order will preserve after removing duplicate elements
		
		System.out.println(s1 +  " unique, order wil preserved");
		
		Set<Integer> s2 = new TreeSet<Integer>(Arrays.asList(arr)); // order will not preserve after removing duplicate elements but gives sorted order
		
		System.out.println(s2 + " unique, order not preserved but sorted");
		
		
		
		
		
		String str = "remove all duplicates and print the remaining character from this string";  // first of all take a string 
		
		char ch[] = str.toCharArray();  //convert String into char array 
		
 		String brr[] = new String[ch.length];
 		
 		for(int i=0;i<ch.length;i++)   //then convert char into into string type as we make set string type
 		{
 			brr[i] = String.valueOf(ch[i]); //use this method to directly change character to string 
 		}
 		
// 		for(int i=0;i<brr.length;i++)
// 		{
// 			System.out.println(brr[i]);
// 		}
 		
		Set<String> str1 = new LinkedHashSet<String>(Arrays.asList(brr));
		
		System.out.println(str1 + " using set as a String type");
		
		
		
		
		String str2 = "character from this string";  // first of all take a string 
		
		//Character ch2 [] =str2.toCharArray(); //only work for conversion of string to char not Character
		
		Character ch2 [] = new Character[str2.length()];
		
		for(int i=0;i<str2.length();i++)
		{
			ch2[i] = Character.valueOf(str2.charAt(i));
		}
		
//		for(Character c : ch2)
//		{
//			
//			System.out.println(c);
//		}
		
		
		Set<Character> str3 = new LinkedHashSet<Character>(Arrays.asList(ch2));  //you can directly take type as Character instead of making string as 
																				//character array and  then convert it into again string type
		
		System.out.println(str3 + " using set as a Character type");
		

	}

}
