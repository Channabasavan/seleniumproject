package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchStatement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Set<Cookie> c=driver.manage().getCookies();
		Cookie c2= new Cookie("channa","bbb");
		c.add(c2);
		for(Cookie w:c) {
			System.out.println(w.getName()+" "+w.getValue());
		}
		System.out.println(c.size());

	}

}
