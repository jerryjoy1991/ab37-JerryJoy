package assignments_2;

import java.util.Scanner;

public class Throws_1 {

	public static void main(String[] args) throws  ArithmeticException{
		Scanner s = new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("allow to visit google");
		}
		else
		{
			//throw new ArithmeticException("not an adult");
			throw new ArithmeticException();
		}
		System.out.println("program will not stop");
	}

}
