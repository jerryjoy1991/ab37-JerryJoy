package package_Stringfunctions;

// 82 - reverse the string
public class String_13 {

	public static void main(String[] args) {
		String input="jerry";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev=input.charAt(i);
			output=output+rev;
			
		}
		System.out.println(output);

	}

}
