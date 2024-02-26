package dec_7_8;

//  usage of super keyword implicitly in the programs having constructors

class Two
{
	Two()
	{
		System.out.println("2");
	}
}
class One extends Two
{
	One()
	{
		System.out.println("1");
	}
}
public class Three extends One{
	Three(){
		System.out.println("3");
	}
	public static void main(String[] args) {
		new One();
		}

}
