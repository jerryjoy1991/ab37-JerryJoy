package dec_6;

//  Assignment_50
//  interface  <---- interface  <----  child class
interface logic2
{
	void login2();
	void logout2();
}
interface logic1 extends logic2
{
	void login1();
	void logout1();
}
public class Child1 implements logic1{
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.login2();
		c1.logout2();
		c1.login1();
		c1.logout1();
	}
	public void login2() {
		System.out.println("login 2");
	}
	public void logout2() {
		System.out.println("logout 2");
	}	
	public void login1() {
		System.out.println("login 1");
	}	
	public void logout1() {
		System.out.println("logout 1");
	}

}
