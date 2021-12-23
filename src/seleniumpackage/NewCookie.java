package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCookie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1");
		driver.manage().window().maximize();
		Set<Cookie> se= driver.manage().getCookies();
		Cookie f= new Cookie("chanan","basava");
		se.add(f);
		for(Cookie c:se) {
			System.out.println(c.getName()+" "+c.getValue());
		}
		driver.manage().deleteCookieNamed("channa");
		driver.manage().getCookieNamed("channa");
		driver.manage().deleteAllCookies();
	}

}
