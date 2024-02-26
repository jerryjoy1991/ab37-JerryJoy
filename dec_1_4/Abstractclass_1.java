package dec_1_4;

// Abstract class

abstract class Razorpay
{
	abstract void login();  //abstract method
}
public class Abstractclass_1 extends Razorpay{

	public static void main(String[] args) {
		Abstractclass_1 a1=new Abstractclass_1();
		a1.login();

	}

	@Override
	void login() {
		System.out.println("internal logic");
		
	}

}
