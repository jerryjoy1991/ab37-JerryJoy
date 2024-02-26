package dec_6;
// Assignment_52
// 2 interface parent  <----1 child class  [multiple level inheritance]

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
public class City_2 implements State_tax, Country_tax{

	public static void main(String[] args) {
		City_2 c1=new City_2();
		c1.country_gsttax();
		c1.country_ittax();
		c1.state_gsttax();
		c1.state_ittax();
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

}
