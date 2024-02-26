package assignments_2;
//61*****

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_1 {

	public static void main(String[] args) {
		
		try {
			Scanner s1=new Scanner(System.in);
			int c=1/0;
			System.out.println(c);
			int a= s1.nextInt();
			
		}
		catch(ArithmeticException a1){
			System.out.println("infinity");
			
		}
		catch(InputMismatchException a2){
			System.out.println("input mismatch");
			
		}
		finally {
			System.out.println("I will always work");
		}
		
		System.out.println("run");
	}


}
