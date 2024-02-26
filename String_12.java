package package_Stringfunctions;

// 74 -- output1 - upper case  output2 - lower case
public class String_12 {

	public static void main(String[] args) {
		String s1="GroTechMinds";
		String s01=s1.replaceAll("[a-z]","");
		System.out.println(s01);
		String s02=s1.replaceAll("[A-Z]","");
		System.out.println(s02);
		System.out.println(s1.repeat(3));
	}

}
