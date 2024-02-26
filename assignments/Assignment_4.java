package assignments;

public class Assignment_4 {

	static void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);

	}

	static void subtract() {
		int a = 20;
		int b = 5;
		int diff = a - b;
		System.out.println(diff);
	}

	static void multiply() {
		int a = 20;
		int b = 30;
		int prod = a * b;
		System.out.println(prod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling static method");
		add();
		subtract();
		multiply();
	}

}
