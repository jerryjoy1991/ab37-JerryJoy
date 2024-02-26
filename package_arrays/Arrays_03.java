package package_arrays;

import java.util.Scanner;

public class Arrays_03 {

	public static void main(String[] args) {
		int rollno[]=new int[5];
		for(int i=0;i<5;i++)
		{
			Scanner s1 = new Scanner(System.in); 
			System.out.println("Enter roll no. at index "+i);
			rollno[i]=s1.nextInt();
			
			
		}
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
	
	}

}
