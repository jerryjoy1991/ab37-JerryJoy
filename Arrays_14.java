
package package_arrays;

import java.util.Arrays;

// 79 --  take alphanumeric string print which all are numeric and alphabets
//80 --- index position of all digits
//81 -- count no. of alphabets and digits
public class Arrays_14 {

	public static void main(String[] args) {
		String name1="Jerry1991";
		char n1[]=name1.toCharArray();
		System.out.println(Arrays.toString(n1));
		int count1=0;
		int count2=0;
		for(int i=0;i<name1.length();i++)
		{
			boolean answer=Character.isDigit(n1[i]);
			if(answer==true)
			{
				count1++;
				System.out.println(n1[i]+" is a digit which is in index "+i);
				
			}
			
			else
			{
				count2++;
				System.out.println(n1[i]+" is an alphabet");
			}
			
		}
		System.out.println("number of digits = " +count1);
		System.out.println("number of alphabets = " +count2);
	}

}
