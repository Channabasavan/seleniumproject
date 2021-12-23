package seleniumpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sle = new Select(dropdown);
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		sle.selectByVisibleText("Beauty");
		Thread.sleep(5000);
		sle.selectByIndex(1);
		Thread.sleep(5000);
		List<WebElement> l=sle.getOptions();
		for(WebElement e:l) {
			System.out.println(e.getText());
		}
		
	}
}