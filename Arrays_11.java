package package_arrays;
//  76 -- find number and index position from array

public class Arrays_11 {

	public static void main(String[] args) {
		int num[]= {78,89,100,41,50};
		int rollno=41;
		
		for(int i=0;i<5;i++)
		{
			if(rollno==num[i])
			{
			System.out.println(num[i]+" roll number present");	
			System.out.println(num[i]+ "  is on the index position " +i);
			}
			else
			{
				System.out.println(num[i]+" roll number not present");
			}
		}

	}

}
