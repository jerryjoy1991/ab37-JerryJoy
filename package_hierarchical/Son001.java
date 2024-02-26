package package_hierarchical;

public class Son001 extends Parent001{
	void multiply() {
		System.out.println("son");
	}
	public static void main(String[] args) {
		Son001 s1=new Son001();
		s1.add();
		s1.multiply();
		System.out.println();
		
		Daughter001 d1=new Daughter001();
		d1.add();
		d1.subtract();
	}
}
