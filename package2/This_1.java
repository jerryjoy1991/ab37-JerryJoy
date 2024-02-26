package package2;

public class This_1 {
	int age;
	String name;
	
	void student(int age, String name)
	{
		this.age=age;
		this.name=name;
		System.out.println("student details");
	}
	public static void main(String[] args) {
		This_1 t1=new This_1();
		t1.student(20, "anu");
		System.out.println(t1.age);
		System.out.println(t1.name);


	}

}
