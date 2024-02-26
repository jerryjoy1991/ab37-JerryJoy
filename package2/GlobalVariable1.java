package package2;

public class GlobalVariable1 {
	static String name="Jerry";
	 double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		GlobalVariable1 g1=new GlobalVariable1();
		System.out.println(g1.pi);
	}

}
