package seleniumpackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation and manual\\automation\\java code\\AutomationFiles\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//*[@class=\"dropdown\"]/ul/li[1]/a"));
		Thread.sleep(5000);
		System.out.println(dropdown.getText());
	}
}
		
