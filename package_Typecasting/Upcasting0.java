package package_Typecasting;
// 93 --Upcasting and downcasting Problem 5 as per Diagram during Class

class Upcasting3{
	void upcast3()
	{
		System.out.println("333");
	}
}
class Upcasting2 extends Upcasting3{
	void upcast2()
	{
		System.out.println("222");
	}
}
class Upcasting1 extends Upcasting2{
	void upcast1()
	{
		System.out.println("111");
	}
}
public class Upcasting0 extends Upcasting1 {
	void upcast0()
	{
		System.out.println("000");
	}

	public static void main(String[] args) {
		Upcasting2 u2=new Upcasting1();
		u2.upcast2();
		u2.upcast3();
		
		Upcasting1 u1=(Upcasting1)u2;
		u1.upcast1();
		u1.upcast2();
		u1.upcast3();
		System.out.println(u1.getClass());
		
	}

}
