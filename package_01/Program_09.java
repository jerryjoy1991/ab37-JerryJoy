package package_01;

// 111 - Get the title of flipkart.com and save each word in an array
import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_09 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String s1=driver.getTitle();
		System.out.println(s1);
		String s2[]=s1.split(" ");
		System.out.println(Arrays.toString(s2));
	}

}
