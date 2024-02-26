package package_arrays;

import java.util.Arrays;

public class Arrays_06 {

	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Abishek";
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		int rollno[]=new int[3];
		rollno[0]=40;
		rollno[1]=20;
		rollno[2]=30;
		System.out.println(Arrays.toString(rollno));
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
		

		
	}

}
