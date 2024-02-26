package assignments_2;

//Assignment_53 -- 4 parent interfaces  <---- 1 child class  (multiple level inheritance)
interface State_tax
{
	void state_ittax();
	void state_gsttax();
}
interface Country_tax
{
	void country_ittax();
	void country_gsttax();
}
interface log1
{
	void login1();
}
interface log2
{
	void login2();
}
public class City implements State_tax, Country_tax, log1, log2{
	public static void main(String[] args) {
		City c1=new City();
		c1.country_gsttax();
		c1.country_ittax();
		c1.state_gsttax();
		c1.state_ittax();
		c1.login1();
		c1.login2();
	}
	public void country_ittax() {
		System.out.println("country it tax");
	}
	public void country_gsttax() {
		System.out.println("country gst tax");
	}
	public void state_ittax() {
		System.out.println("state it tax");
	}
	public void state_gsttax() {
		System.out.println("state gst tax");
	}
	

	public void login2() {
		System.out.println("login 1 1");
	}

	public void login1() {
		System.out.println("login 2 2");
	}
	

}
