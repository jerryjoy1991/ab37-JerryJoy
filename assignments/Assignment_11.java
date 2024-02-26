package assignments;

public class Assignment_11 {						//method overloading , same method name with different argument list//
	static void numbers(int a) {
		System.out.println("integer");
		System.out.println(a);
	}

	static void numbers(double a) {
		System.out.println("decimal number");
		System.out.println(a);
	}

	static void numbers(char a) {
		System.out.println("character");
		System.out.println(a);
	}

	void numbers(boolean a) {
		System.out.println("Boolean value");
		System.out.println(a);
	}

	void numbers(String a) {
		System.out.println("String");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(100);
		numbers(5.31);
		numbers('a');
		Assignment_11 a1 = new Assignment_11();
		a1.numbers(true);
		a1.numbers("this is a string");
	}

}
