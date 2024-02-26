package dec_1_4;

// method overriding .... super keyword..

class Karnataka
{
	void ithub()
	{
		System.out.println("1");
	}
}
public class Bangalore extends Karnataka{

	void ithub()
	{	
		super.ithub();
		System.out.println("2");
		
	}
	public static void main(String[] args) {
		Bangalore b1=new Bangalore();
		b1.ithub();

	}

}

