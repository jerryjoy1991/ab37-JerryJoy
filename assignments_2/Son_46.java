package assignments_2;
//46----write a program for hierarchical inheritance and create a three classes(son, daughter, parent) in a single program
	class Parent{
		void add() {
			System.out.println("ADD");
		}
	}
	class Daughter extends Parent{
		void subtract() {
			System.out.println("SUBTRACT");
		}
	}
	public class Son_46 extends Parent{
		void multiply() {
			System.out.println("MULTIPLY");
		}
		public static void main(String[] args) {
			Son_46 s1=new Son_46();
			s1.add();
			s1.multiply();
			System.out.println();
			
			Daughter d1=new Daughter();
			d1.add();
			d1.subtract();
			
	}

}
