package package_Stringfunctions;
// 73 --- Print all upper case letters with no spaces
public class String_11 {

	public static void main(String[] args) {
		String b="My Name Is Jerry";
		String c=b.replaceAll("[a-z]","");
		System.out.println(c);
		System.out.println(c.replaceAll(" ",""));
	}

}
