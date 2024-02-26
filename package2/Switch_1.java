package package2;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		System.out.println("Enter value of a ");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		switch(a)
		{
		case 1:System.out.println("one");
			//	break;
		case 2:System.out.println("two");
			//	break;
		case 3:System.out.println("three");
			//	break;
		case 4:System.out.println("four");
			//	break;
		case 5:System.out.println("five");
			//	break;
		default:System.out.println("default");
		
		}
	}

}
