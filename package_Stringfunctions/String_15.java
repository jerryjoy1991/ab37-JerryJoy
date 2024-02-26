package package_Stringfunctions;

import java.util.Arrays;

//84 --- strings are anagram

public class String_15 {

	public static void main(String[] args) {
		String a1= "animal";
		String a2="maline";
		if(a1.length()!=a2.length())
		{
			System.out.println("not an anagram");
		}
		else
		{
			char c1[]=a1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char c2[]=a2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram decoded");
			}
			else 
			{
				System.out.println("not anagram");
			}
			
			
		}
		

	}

}
