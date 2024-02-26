package package_01;
// 117 - Launch (JSAM) HTML page get elements by xpath(absolute xpath)
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_08 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Jerry123");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Jerry");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("jerryjoy");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Jerry");
		//driver.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("Joy");
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		//driver.findElement(By.xpath("(/html/body/form/input)[7]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		driver.findElement(By.xpath("(/html/body/select)")).click();
		driver.findElement(By.xpath("(/html/body/select/option)[2]")).click();
		//driver.findElement(By.xpath("(/html/body/input)[7]")).click();
	}

}
