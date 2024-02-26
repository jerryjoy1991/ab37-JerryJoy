package package_gettersetter;
// 95 -- WAP to update the value of private variable username = "abc@grotechmind.com" 
//       to something else using getter and setter
class Amazon
{
	private String username="abc@grotechmind.com";
	
	public String getUsername() {
		
		return username;
	
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println(username);
	}

	/*public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}*/
	
}
public class Encapsulation_01 {

	public static void main(String[] args) {

		Amazon a1=new Amazon();
		a1.setUsername("jerryjoy0110@gmail.com");
		System.out.println(a1.getUsername());
		
	}

}
