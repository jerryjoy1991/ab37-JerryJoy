package assignments_2;
class Mother{
	void fun() {
		System.out.println("mother");
	}}
	class Father{
		void fun() {
			System.out.println("father");
		}
	}

class Kid extends Mother
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Kid k1=new Kid();
		k1.fun();
	}

}
