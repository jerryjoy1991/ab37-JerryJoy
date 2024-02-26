package package_Typecasting;

// 90 --Upcasting and downcasting Problem 2 as per Diagram during Class

	class Excelsheet{    //parent class
		void datafetch()
		{
			System.out.println("parent class method");
		}
	}
	public class Testcase1 extends Excelsheet
	{
		void login()
		{
			System.out.println("child class method");
		}
	

	public static void main(String[] args) {
		Excelsheet e1=new Testcase1();
		e1.datafetch();
		
		Testcase1 t1=(Testcase1)e1;
		t1.datafetch();
		t1.login();

	}

	}
