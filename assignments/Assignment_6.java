package assignments;

public class Assignment_6 {

	void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);

	}

	void subtract() {
		int a = 20;
		int b = 5;
		int diff = a - b;
		System.out.println(diff);
	}

	void multiply() {
		int a = 20;
		int b = 30;
		int prod = a * b;
		System.out.println(prod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling non static method");
		Assignment_6 a1 = new Assignment_6();
		a1.add();
		a1.subtract();
		a1.multiply();
	}

}
