package inheritance_44;

public class Student extends Teacher{
	static void gk() {
		System.out.println("general knowledge");
	}
	public static void main(String[] args) {
		gk();
		Student s1=new Student();
		s1.selenium();
		s1.java();
	
	}

}
