package dec_7_8;

public class Accessspecifier_1 {
	public void add()
	{
		System.out.println("add");
	}
	private void subtract()
	{
		System.out.println("subtract");
	}
	protected void div()
	{
		System.out.println("div");
	}
	void multiply()
	{
		System.out.println("multiply");
	}
	public static void main(String[] args) {
		Accessspecifier_1 a1=new Accessspecifier_1();
		a1.add();
		a1.subtract();
		a1.div();
		a1.multiply();

	}

}
