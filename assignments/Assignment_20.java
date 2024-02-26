package assignments;

public class Assignment_20 {

	static int a;
	static int b;
	static void add() {
		a=500;
		b=300;
		int sum = a + b;
		System.out.println(sum);
	}
	static void subtract() {
		a=1000;
		b=500;
		int diff = a - b;
		System.out.println(diff);
	}
	public static void main(String[] args) {
		add();
		subtract();
	}
}