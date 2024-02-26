package assignments_2;
//Assignment_55  
interface logic21{
	void login_2();
	void logout_2();
}

interface logic11 extends logic21{
	void login_1();
	void logout_1();
}
abstract class Abstract1 implements logic11{
	abstract void login_0();
}
public class Child_3 extends Abstract1{
	public static void main(String[] args) {
		Child_3 c1=new Child_3();
				c1.login_2();
				c1.login_1();
				c1.logout_2();
				c1.logout_1();
				c1.login_0();
	}
	public void login_1() {
		System.out.println("1");
	}
	public void logout_1() {
		System.out.println("2");
	}
	public void login_2() {
		System.out.println("3");
	}
	public void logout_2() {
		System.out.println("4");
	}
	void login_0() {
		System.out.println("5");
	}

}
