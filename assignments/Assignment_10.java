package assignments;

public class Assignment_10 {

	public static void main(String[] args) {   //calling static and non static methods in main() method
		// TODO Auto-generated method stub
		add();
		subtract();
		Assignment_10 c1=new Assignment_10();
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
