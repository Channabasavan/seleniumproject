package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCookie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Set<Cookie> c=driver.manage().getCookies();
		Cookie c1=new Cookie("channa","1234");
		c.add(c1);
		for(Cookie c3:c) {
			System.out.println(c3.getName()+" "+c3.getValue());
		}
	  

	}

}
