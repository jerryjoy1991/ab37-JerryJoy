package dec_1_4;

// method overriding , super keyword.....

class Demo_Parent{
	void add()
	{
		System.out.println("add 2 numbers");
	}
}
public class Demo_child extends Demo_Parent{

	void add()
	{
		super.add();
		System.out.println("add 3 numbers");
	}
	public static void main(String[] args) {
		Demo_child d1=new Demo_child();
		d1.add();

	}

}
