package dec_5;

//2 parent abstract class, 1 child concrete class

abstract class Abstract_class3
{
	abstract void login();
	abstract void otp();
}

abstract class 	Abstract_class2 extends Abstract_class3
{
	abstract void logout();
	void add()
	{
		System.out.println("add");
	}
	static void subtract() {
		System.out.println("subtract");
	}
}
public class Concrete_class1 extends Abstract_class2{

	public static void main(String[] args) {
		Concrete_class1 c1=new Concrete_class1();
		c1.logout();
		c1.login();
		c1.otp();
		c1.add();
		subtract();
			}

	
	void logout() {
		System.out.println("logout");
	}

	
	void login() {
		System.out.println("login");
	}

	
	void otp() {
		System.out.println("otp");
	}

}
