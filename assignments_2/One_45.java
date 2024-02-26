package assignments_2;
//WAP for multilevel inheritance in a single program and make all the methods are non static
	class Three{
		void add() {
			System.out.println("ADD");
		}
	}
	class Two extends Three {
		void subtract() {
			System.out.println("SUBTRACT");
		}
	}
	public class One_45 extends Two{
		void multiply() {
			System.out.println("MULTIPLY");
		}
	public static void main(String[] args) {
		One_45 o1=new One_45();
		o1.multiply();
		o1.add();
		o1.subtract();

	}

}
