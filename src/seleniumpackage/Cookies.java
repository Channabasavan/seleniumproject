package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set<Cookie> cookie=driver.manage().getCookies();
		int x= cookie.size();
		System.out.println(x);
		Cookie c2= new Cookie("channa","1234");
		cookie.add(c2);
		int y= cookie.size();
		System.out.println(y);
		for(Cookie c3:cookie) {
			System.out.println(c3.getName()+" "+c3.getValue());
		}
		Cookie s=driver.manage().getCookieNamed("session-id-time");
		System.out.println(s);
	}

}
