package package_arrays;

// 75 --- roll no is present in array or not 

public class Arrays_09 {

	public static void main(String[] args) {
	int num[]= {78,89, 100,41};
	//System.out.println(num[0]);
	int rollno=41;
	
	for(int i=0;i<4;i++)
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

