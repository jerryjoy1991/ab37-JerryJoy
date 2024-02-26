package assignments;

import java.util.Scanner;

public class Assignment_36 {
	
		static void add() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter value of a");	
			int a=s1.nextInt();
			System.out.println("Enter value of b");
			int b=s1.nextInt();
			int sum=a+b;
			System.out.println(sum);
			}
		static void subtract() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter value of a");
			int a=s1.nextInt();
			System.out.println("Enter value of b");
			int b=s1.nextInt();
			int diff=a-b;
			System.out.println(diff);
		}
		static void multiply() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter value of a");	
			int a=s1.nextInt();
			System.out.println("Enter value of b");
			int b=s1.nextInt();
			int prod=a*b;
			System.out.println(prod);
		}
		static void division() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter value of a");	
			int a=s1.nextInt();
			System.out.println("Enter value of b");
			int b=s1.nextInt();
			int div=a/b;
			System.out.println(div);
			
		}
		public static void main(String[] args) {
			add();
			subtract();
			multiply();
			division();
	}

}
