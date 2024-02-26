package package_Assert;

// 108 - Assert syntax 1
public class Assert_01 {

	public static void main(String[] args) {
	String name="Jerry";
	assert name.length()<10;
	String ans=name.concat(" Joy");
	System.out.println(ans);

	}

}
