package package_Stringfunctions;

public class String_04 {

	public static void main(String[] args) {
		String name="Grotechminds";
		
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('i'));
		System.out.println();
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(3,7));
		System.out.println();
		
		System.out.println(name.contains("men"));
		System.out.println(name.matches("Grotechminds"));
		System.out.println();
		
		System.out.println(name.isEmpty());
		String name1="";
		System.out.println(name1.isEmpty());
		System.out.println();
		
		System.out.println(name.endsWith("s"));


	}

}
