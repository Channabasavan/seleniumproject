package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe ");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/frames");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame1\"]")));
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame2\"]")));
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
		 driver.switchTo().defaultContent();
	}

}
