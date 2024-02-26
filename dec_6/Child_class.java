package dec_6;
//  Assignment_54
//  2 parent interfaces  <---  1 abstract class  <-  1 child class
interface Country1
{
	void countrydetails_1();
}
interface Country2
{
	void countrydetails_2();
}
abstract class Country3 implements Country1, Country2
{
	abstract void countrydetails_3();
}
public class Child_class extends Country3{

	public static void main(String[] args) {
		Child_class c1=new Child_class();
		c1.countrydetails_1();
		c1.countrydetails_2();
		c1.countrydetails_3();
	}
	public void countrydetails_1() {
		System.out.println("1");
	}
	public void countrydetails_2() {
		System.out.println("2");
	}
	void countrydetails_3() {
		System.out.println("3");
	}

}
