package inheritance_single;

public class Student extends Teacher{

	void gk() {
		System.out.println("general knowledge");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.gk();
		s1.java();
		s1.selenium();
	}

}
