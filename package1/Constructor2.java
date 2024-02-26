package package1;

public class Constructor2 {   // constructor overloading

	Constructor2(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	Constructor2(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	Constructor2(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Constructor2(10, 4.22);
	//	new Constructor2(10, 50);
		Constructor2 c1=new Constructor2(20, 20.31);
		Constructor2 c2=new Constructor2(20, 40);
		new Constructor2(50,60);
		new Constructor2(4.852, 6.324);
	}

}
