package package_arrays;

// 81 - count no. of alphabets and digits
public class Arrays_15 {

	public static void main(String[] args) {
		String name1="Rahul123";
		char n1[]=name1.toCharArray();
		
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


