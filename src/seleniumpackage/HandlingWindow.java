package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
		System.out.println(driver.getTitle());
		Set<String> s=driver.getWindowHandles();
		for(String i:s) {
			System.out.println(s);
			String t=  driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
			if(parentid.equals(s)) {
				System.out.println("keep open");
			}
			else {
				driver.close();
			}
		}
	}
