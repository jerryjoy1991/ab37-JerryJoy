package package1;

public class Calling_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		subtract();
		Calling_Methods c1=new Calling_Methods();
		c1.multiply();
		c1.division();
	}
	static void add()
	{
		int a= 100;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		int a=100;
		int b=50;
		int difference=a-b;
		System.out.println(difference);
	}
	void multiply()
	{
		int a=100;
		int b=50;
		int product=a*b;
		System.out.println(product);
	}
	void division()
	{
		int a=100;
		int b=50;
		int div=a/b;
		System.out.println(div);
	}
	

}
