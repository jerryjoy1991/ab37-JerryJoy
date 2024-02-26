package inheritance_3;
class Teacher {
	static void selenium() {
		System.out.println("Selenium");
	}
	static void java() {
		System.out.println("java");
	}

}
public class Student extends Teacher {

	static void gk() {
		System.out.println("general knowledge");
	}
	public static void main(String[] args) {
		gk();
		selenium();
		java();

	}

}
