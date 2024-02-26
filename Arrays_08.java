package package_arrays;

public class Arrays_08 {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=3;
		num[1]=4;
		num[2]=5;
		num[3]=6;
		//double avg=(num[0]+num[1]+num[2]+num[3])/num.length;
		//System.out.println(avg);
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
		double avg=sum/num.length;
		System.out.println(avg);
		double remainder=sum%num.length;
		System.out.println(remainder);

	}

}
