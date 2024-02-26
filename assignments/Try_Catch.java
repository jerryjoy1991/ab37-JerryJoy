package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		try {
		//int a=1/0;
		//Scanner s1=new Scanner(System.in);
		//int b=s1.nextInt();
			int num[]=new int[2];
			num[0]=10;
			num[1]=20;
			num[2]=30;
			
			
		}
		catch(ArithmeticException a1)
		{
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("InputMismatchException");
		}
		catch(ArrayIndexOutOfBoundsException a3)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}

	}

}
