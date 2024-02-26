package assignments;

import java.util.Scanner;

public class Assignment_41 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
	
		switch(a)
		{
		case 1:System.out.println("Addition");
				break;
		case 2 :System.out.println("Subtraction");
				break;
		case 3:System.out.println("Multiplication");
				break;
		case 4:System.out.println("Division");
				break;
		default:System.out.println("default");
	}

}}
