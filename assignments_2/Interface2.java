package assignments_2;

// Assignment_56    I <--- I  <--- I  <---  C
interface logic3
{
	void login3();
	void logout3();
}
interface logic2 extends logic3
{
	void login2();
	void logout2();
}
interface logic1 extends logic2
{
	void login1();
	void logout1();
}
public class Interface2 implements logic1{
	public static void main(String[] args) {
		Interface2 i2=new Interface2();
		i2.login1();
		i2.logout1();
		i2.login2();
		i2.logout2();
		i2.login3();
		i2.logout3();
	}
	public void login2() {
		System.out.println("login2");
	}
	public void logout2() {
		System.out.println("logout2");
	}
	public void login3() {
		System.out.println("login3");
	}
	public void logout3() {
		System.out.println("logout3");
	}
	public void login1() {
		System.out.println("login1");
	}
	public void logout1() {
		System.out.println("logout1");
	}
}
	
