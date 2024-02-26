package package_return;

//106 --WAP for return keyword for int and double
public class Return_01 {

	int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	double subtract(int a, double b)
	{
		double sub=a-b;
		return sub;
	}
	public static void main(String[] args) {
		Return_01 r1=new Return_01();
		System.out.println(r1.add(100, 200));
		System.out.println(r1.subtract(100, 10.654));

	}

}
