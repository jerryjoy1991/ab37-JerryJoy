package package_Stringfunctions;

public class String_06 {

	public static void main(String[] args) {
		String name="JERRY";
		
		String myname=name.toLowerCase();
		System.out.println(myname);
		
		for(int i=myname.length()-1;i>=0;i--)
		{
			System.out.println(myname.charAt(i));
		}
	}

}
