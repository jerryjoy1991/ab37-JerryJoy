package assignments_2;

import java.util.Scanner;

public class Assignment_39 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("I am adult");
		}
		else
		{
			System.out.println("I am young");
		}

	}

}
