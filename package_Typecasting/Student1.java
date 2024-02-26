package package_Typecasting;

//91 -- Upcasting and downcasting Problem 3 as per Diagram during Class

class Teacher1{
	void login1() {
		System.out.println("login");
	}
}

class Mentor extends Teacher1{
	void logout() {
		System.out.println("logout");
	}
}
public class Student1 extends Mentor{
	void studentdetails() {
		System.out.println("studentdetails");
	}

	public static void main(String[] args) {
		
		Teacher1 t1=new Student1(); //upcasting
		t1.login1();
		
		Student1 s1=(Student1)t1;  //downcasting
		s1.login1();
		s1.logout();
		s1.studentdetails();
	}

}
