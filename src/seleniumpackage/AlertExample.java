package seleniumpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//accept
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
//		dismiss
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.dismiss();
	
		}
	}