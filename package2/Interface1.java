package package2;

interface logic2
{
	void login1();
	void auth();
}
interface logic1 extends logic2
{
	void logout();
	void signin();
}

public class Interface1 implements logic1{
	
	public static void main(String[] args) {
		Interface1 i1=new Interface1();
		i1.auth();
		i1.login1();
		i1.logout();
		i1.signin();

	}

	@Override
	public void login1() {
		System.out.println("login 1");
		
	}

	@Override
	public void auth() {
		System.out.println("auth");
	}

	@Override
	public void logout() {
		System.out.println("log out");
		
	}

	@Override
	public void signin() {
		System.out.println("sign in");
		
	}

}
