package package2;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		System.out.println("Enter value of a ");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		System.out.println("Enter values b and c");
		int b=s1.nextInt();
		int c=s1.nextInt();
		switch(a)
		{
		case 1:
			int sum=b+c;
			System.out.println("b+c="+sum);
			break;
		case 2:
			int diff=b-c;
			System.out.println("b-c="+diff);
			break;
		case 3:
			int prod=b*c;
			System.out.println("b*c="+prod);
			break;
		case 4:
			int div=b/c;
			System.out.println("b/c="+div);
			break;
		default:
			System.out.println("default");
		}
	}

}
