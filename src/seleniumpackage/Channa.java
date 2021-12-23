package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Channa {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
//		shopmenu clicking
		driver.findElement(By.xpath("//*[text()=\"Shop\"]")).click(); 
//		Homemenu clicking
		driver.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
//		sliders present in home page
		int x=driver.findElements(By.xpath("//img[starts-with(@width,\"300\")]")).size();
		System.out.println(x);
//		expected sliders
		


	}

}
