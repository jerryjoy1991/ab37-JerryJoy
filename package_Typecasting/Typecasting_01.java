package package_Typecasting;

//  Assignment 86 --  int -->  double,   double ---> int
//  Assignment_87 --   byte --->short
//  Assignment_88 --  byte -->double ----> int
//  Assignment_89 --  int ---> double --->byte
public class Typecasting_01 {

	public static void main(String[] args) {
	
		// int ---->  double
		double w1=900;  //widening ...  implicit
		System.out.println(w1);
		System.out.println();
		
		// double ---->  int
		int w2=(int)67.12;  // narrowing 
		System.out.println(w2);
		System.out.println();
		
		//byte ----> short
		//byte a1=120;
		short a2=120;
		System.out.println(a2);
		System.out.println();
		
		//byte -->double ----> int
		double d1=100;
		System.out.println(d1);
		int i1=(int)d1;
		System.out.println(i1);
		System.out.println();
		
		//int ---> double --->byte
		double d2=50;
		System.out.println(d2);
		byte b=(byte)d2;
		System.out.println(b);
		
		

	}

}
