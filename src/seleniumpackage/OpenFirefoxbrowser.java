package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\automation files\\drivers\\geckodriver.exe");
		 WebDriver driver = new  FirefoxDriver();
		 driver.get("https://google.com");
			System.out.println("browser opned");
			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			driver.quit();

	}

}
