package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all#:~:text=Click%20%22Run%20SQL%22%20to%20execute%20the%20SQL%20statement,You%20can%20restore%20the%20database%20at%20any%20time.");
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
	
	
}

}