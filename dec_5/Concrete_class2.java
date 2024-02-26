package dec_5;
// Assignment 48
// 1 concrete parent class, 1 abstract class which extends parent class, 1 concrete child class
// C  <-  CA <- C
class Parent1{
	static void add() {
		System.out.println("add");
	}
	void subtract() {
		System.out.println("subtract");
	}
}
abstract class  Abstractclass__1 extends Parent1{
	abstract void multiply();
	abstract void division();
}
public class Concrete_class2 extends Abstractclass__1 {
	void login() {
		System.out.println("login");
	}
	void logout() {
		System.out.println("logout");
	}
	public static void main(String[] args) {
		Concrete_class2 c1=new Concrete_class2();
		c1.multiply();
		c1.division();
		add();
		c1.subtract();
		c1.login();
		c1.logout();
	}
	void multiply() {
		System.out.println("multiply");
	}
	void division() {
		System.out.println("division");
	}
}
