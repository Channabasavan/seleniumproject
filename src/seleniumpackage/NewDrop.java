package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("searchDirectory_job_title"));
		Select se=new Select(e);
		se.selectByValue("");
		se.selectByIndex(0);
		se.selectByVisibleText("");
		List<WebElement> w  =se.getOptions();
		for(WebElement f:w) {
			System.out.println(f.getText());
		}
		

	}

}
