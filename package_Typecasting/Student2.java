package package_Typecasting;

// 92 -- Upcasting and downcasting Problem 4 as per Diagram during Class
class Teacher2{
	void login1() {
		System.out.println("login");
	}
}

class Mentor2 extends Teacher2{
	void logout() {
		System.out.println("logout");
	}
}
public class Student2 extends Mentor2{
	void studentdetails() {
		System.out.println("studentdetails");
	}

	public static void main(String[] args) {
		
		Mentor2 m2=new Student2();
		m2.login1();
		m2.logout();
		
		Student2 s1=(Student2)m2;
		s1.login1();
		s1.logout();
		s1.studentdetails();
		
	}
}
