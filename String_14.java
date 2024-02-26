package package_Stringfunctions;

//83 --- string is palindrome or not
public class String_14 {

	public static void main(String[] args) {
		String input="Malayalam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev=input.charAt(i);
			output=output+rev;
			
		}	
		System.out.println(input);
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("it is a palindrome string");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
