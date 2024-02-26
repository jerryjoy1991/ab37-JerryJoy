package package_arrays;

import java.util.Arrays;

public class Arrays_07 {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]=98;
		rollno[1]=65;
		rollno[2]=43;
		rollno[3]=32;
		int rn1[]=new int[4];
		for(int i=0;i<3;i++)
		{
			rn1[i]=rollno[i];
		}
		System.out.println("original array is "+Arrays.toString(rollno));
		System.out.println("copied array is "+Arrays.toString(rn1));
		
	}

}
