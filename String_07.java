package package_Stringfunctions;

public class String_07 {

	public static void main(String[] args) {
	/*	
	//Abhishek  to bhishek	

	String name="Abhishek";
	System.out.println(name.replaceAll("A",""));
	System.out.println();
	System.out.println(name.replaceAll("e","E"));
	System.out.println();
	
	// write the string with no spaces
	String quote="i love my country";
	System.out.println(quote.replaceAll(" ", ""));
	System.out.println();

	//print only numbers
	String a= "country123";
	System.out.println(a.replaceAll("[a-z]",""));
	System.out.println();

	//remove all small letters print the same with no spaces
	String b="My Name Is Manish";
	String c=b.replaceAll("[a-z]","");
	System.out.println(c);
	System.out.println(c.replaceAll(" ",""));
	System.out.println();  */

	//output 1= all capital letters  output 2=all small letters
	String s1="MaNiSh";
	String s01=s1.replaceAll("[a-z]","");
	System.out.println(s01);
	String s02=s1.replaceAll("[A-Z]","");
	System.out.println(s02);
	}

}
