package package_Stringfunctions;

public class String_09 {

	public static void main(String[] args) {
		String name="Rahul321";
		char c1[]=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if(answer==true)
			{
			System.out.println(c1[i]+ "  is a digit");
		
			
			
		}
			
			else {
				System.out.println(c1[i]+"  is a character");
			}
	}

	}}
