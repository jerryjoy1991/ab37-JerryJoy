package package_mathclass;

// 94 --findout the area of a circle for ten times,take pi value from math.pi
//      and take r value from math.random and solve this problem 10 times.
public class Area_circle {

	public static void main(String[] args) {
	
		double pi=Math.PI;
		System.out.println(pi);
		
		
		for(int i=0;i<10;i++)
		{
			double r=Math.random();
			System.out.println(r);
			double area_circle=pi*r*r;
			System.out.println("Area of circle is  "+area_circle);
		}
		
	

	}

}
// int ans=Math.addExact(10,20);
//int ans=Math.subtractExact(10,20);
//int ans=Math.multiplyExact(10,20);
