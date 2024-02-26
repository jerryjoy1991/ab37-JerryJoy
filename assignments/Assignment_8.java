package assignments;

public class Assignment_8 {
	
	Assignment_8(int a){
		System.out.println(a);
	}
	Assignment_8(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	Assignment_8(double a, double b){

		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment_8(10);
		new Assignment_8(50,100);
		new Assignment_8(1.56,4.23);

	}

}
