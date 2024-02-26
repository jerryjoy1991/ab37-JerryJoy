package package2;

public class SIB_IIB {

	SIB_IIB(){
		System.out.println("constructor");
	}
	static {
		System.out.println("SIB");
	}
	static{
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		new SIB_IIB();
		
	}

}
