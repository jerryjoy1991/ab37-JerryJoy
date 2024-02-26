package assignments;

import java.util.Scanner;

public class Assignment_39 {

	public static void main(String[] args) {{
	 	System.out.println("Enter age");
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		
		if(age>18) {
		System.out.println("I am adult");
	}
		else {
			System.out.println("I am young");
		}
	}

}
