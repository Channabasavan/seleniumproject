package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	    WebElement row=driver.findElement(By.tagName("table"));
		List<WebElement> al=driver.findElements(By.tagName("tr"));
		for(WebElement w:al) {
			List<WebElement> al2=w.findElements(By.tagName("th"));
			for(WebElement w2:al2) {
				System.out.print(w2.getText());
			}
			List<WebElement> al3=w.findElements(By.tagName("td"));
			for(WebElement w3:al3) {
				System.out.print(w3.getText());
			}
			System.out.println();
			
		}
	}

}