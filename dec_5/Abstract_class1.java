package dec_5;

// abstract class, abstract methods

abstract class Api
{
	abstract void login();
	abstract void auth();
	abstract void logout();
}
public class Abstract_class1 extends Api {

	public static void main(String[] args) {
		Abstract_class1 a1=new Abstract_class1();
		a1.login();
		a1.auth();
		a1.logout();
	}

	
	void login() {
		System.out.println("login");
	}

	
	void auth() {
		System.out.println("authentication");
	}

	
	void logout() {
		System.out.println("logout");
	}

}
