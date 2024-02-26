package assignments;

public class Assignment_5 {
	void add() {
		int a = 100;
		int b = 50;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling non static method");
		Assignment_5 a1 = new Assignment_5();
		a1.add();
	}

}
