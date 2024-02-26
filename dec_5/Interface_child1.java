package dec_5;
//Assignment_ 49
// interface  <---  child class

interface Amazon{
	void login();
	void logout();
}
public class Interface_child1 implements Amazon{
	
	public static void main(String[] args) {
		Interface_child1 i1=new Interface_child1();
		i1.login();
		i1.logout();
	}

	public void login() {
		System.out.println("login");
	}

	public void logout() {
		System.out.println("logout");
	}

}
