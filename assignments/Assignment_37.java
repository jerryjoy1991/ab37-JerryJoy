package assignments;
//WAP to do addition, subtraction,multiplication,
//division by using scanner class and  a and b as global variables
import java.util.Scanner;

public class Assignment_37 {
	
		static int a;
		static int b;
		
		static void add() {
			int sum=a+b;
			System.out.println(sum);
			}
		static void subtract() {
			int diff=a-b;
			System.out.println(diff);
		}
		static void multiply() {
			int prod=a*b;
			System.out.println(prod);
		}
		static void division() {
			int div=a/b;
			System.out.println(div);
			
		}
		public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter value of a");
			a=s1.nextInt();
			System.out.println("Enter value of b");
			b=s1.nextInt();
			add();
			subtract();
			multiply();
			division();
	}


	}


