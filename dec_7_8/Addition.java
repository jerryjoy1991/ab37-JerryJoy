package dec_7_8;

// usage of this() calling statement

public class Addition {
	Addition()
	{
		this("jerry");  // parameterized
		System.out.println("hello");
	}
	Addition(int a)
	{	this();  //non parameterized
		System.out.println(a+10);
	}
	Addition(String name)
	{	
		
		System.out.println(name);
	}
	public static void main(String[] args) {
		new Addition();

	}

}
