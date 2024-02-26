package assignments;

public class Assignment_17 {
	Assignment_17(){
		System.out.println("Constructor 1");
	}
	Assignment_17(int a){
		System.out.println("Constructor 2");
	}
	Assignment_17(double a){
		System.out.println("Constructor 3");
	}
	Assignment_17(char c){
		System.out.println("Constructor 4");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		new Assignment_17();
		new Assignment_17(10);
		new Assignment_17(5.34);
		new Assignment_17('c');

	}

}
