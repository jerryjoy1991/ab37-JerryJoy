package assignments_2;

class Teacher{
	void selenium() {
		System.out.println("Selenium");
	}
	void java() {
		System.out.println("java");
	}
}
	
public class Student_43 extends Teacher{

	void gk() {
		System.out.println("general knowledge");
}
	public static void main(String[] args) {
		
		Student_43 s1=new Student_43();
		s1.selenium();
		s1.java();
		s1.gk();

	}

}
