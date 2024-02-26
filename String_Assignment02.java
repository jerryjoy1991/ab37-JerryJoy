package package_Stringfunctions;

public class String_Assignment02 {

	public static void main(String[] args) {
		String m1="software";
		String m2="testing";
		String m3=m1.concat(m2);
		System.out.println(m3);
		
		for(int i=0;i<m3.length();i++)
		{
			System.out.println(m3.charAt(i));
		}
	}

}
