package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe ");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/nested_frames");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(0);
		 System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(1);
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]")).getText());
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(2);
		 System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(1);
		 System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		 
		 
	}

}
