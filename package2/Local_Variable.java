package package2;

public class Local_Variable {
	static int c=30;     //global variable
	static void add(){
		int b=20;
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;  // local variable
		System.out.println(a);
		add();
		System.out.println(c);
	}

}
