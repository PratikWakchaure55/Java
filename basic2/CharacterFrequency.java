package basic2;

import java.util.Scanner;

public class CharacterFrequency {

	static Scanner sc = new Scanner(System.in);

	
	void convert(String str)
	{
		
		int[] freq = new int[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			freq[i] = -1;
		}
		
		char[] string = str.toCharArray();
		
		int count = 1;
		
		for(int i =0;i<str.length();i++)
		{
			
			for(int j=i+1;j<str.length();j++)
			{
			
				
				if(string[i] == string[j])
				{
					count ++;
					freq[j] = 0;
				}
				
			}
			
			if(freq[i] != 0)
			{
				freq[i] = count;
				
			}
			count = 1;
			
		}
		
		
		for(int i =0;i<str.length();i++)
		{
			if(freq[i]!=0)
			{
				System.out.println(string[i]);
			}
		}
		
		System.out.println();
		
		for(int i =0;i<str.length();i++)
		{
			if(freq[i]!=0)
			{
				System.out.println(string[i] + " " + freq[i]);
			}
		}	
		
	}
	
	public static void main(String[] args) {
		
		
		
		String s = sc.next();
		
		new CharacterFrequency().convert(s);
		
		
		
		
	}

}
