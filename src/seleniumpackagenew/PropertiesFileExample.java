package seleniumpackagenew;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFileExample {

	static WebDriver driver;
	static String browser;
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin =new FileInputStream("C:\\Users\\Mayuri\\eclipse-workspace\\seleniumproject\\Atipune\\config.properties");
		Properties prop=new Properties();
		prop.load(fin);
		browser=prop.getProperty("browser");
		if("chrome".equalsIgnoreCase(browser))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
			driver=new ChromeDriver();
		}else if("firefox".equalsIgnoreCase(browser))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxexepath"));
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("wait")),TimeUnit.SECONDS);
		driver.get(prop.getProperty("baseurl"));
		driver.manage().window().maximize();
		driver.quit();		
	}
}