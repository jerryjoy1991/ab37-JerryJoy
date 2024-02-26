package package1;

public class Constructor1 {

	Constructor1()
	{
		System.out.println("one");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		//new Constructor1();   //one method for calling constructor
		
		Constructor1 a1= new Constructor1(); //second method for calling constructor
		
		System.out.println("End");
	}

}
