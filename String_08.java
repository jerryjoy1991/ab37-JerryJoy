package package_Stringfunctions;

import java.util.Arrays;

public class String_08 {

	public static void main(String[] args) {
		
		//repeated printing of given string
		String name="abhishek";
		System.out.println(name.repeat(3));
		System.out.println();
		
		//split the string and print in each line
		String s1="My name is Manish";
		String s2[]=s1.split("n");
		/*System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);*/
		System.out.println();

		System.out.println(Arrays.toString(s2));

	}

}
