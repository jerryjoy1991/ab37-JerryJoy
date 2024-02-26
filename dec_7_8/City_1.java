package dec_7_8;

// super calling statements, constructors can never be inherited
class State_1
{
	State_1(String a)
	{
		System.out.println("1");
	}
}
public class City_1 extends State_1{
	City_1()
	{
	//	super();  //non-parameterized super calling statement.... can either write super() or not
		super("jerry");  // parameterized super calling statement .... can be written only in explicit way
		System.out.println("2");
		
	}
	public static void main(String[] args) {
		new City_1();
	}

}
