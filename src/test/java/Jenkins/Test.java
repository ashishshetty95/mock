package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	@org.testng.annotations.Test
	public void testA() {
		String un=System.getProperty("username");
		System.out.println(un);
		System.out.println("Hi");
		System.out.println("Hello");
		WebDriver driver=new ChromeDriver();
	}
}
