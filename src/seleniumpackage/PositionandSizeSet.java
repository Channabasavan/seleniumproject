package seleniumpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionandSizeSet {

	public static void main(String[] args) throws InterruptedException {
		            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("http://demo.automationtesting.in/Windows.html");
					driver.manage().window().maximize();
					Dimension size=driver.manage().window().getSize();
					System.out.println(size);
					Dimension csize=new Dimension(size.getWidth()/2,size.getHeight()/2);
					driver.manage().window().setSize(csize);
					System.out.println(driver.manage().window().getSize());
					Thread.sleep(5000);
					Point p=driver.manage().window().getPosition();
					System.out.println(p);
					Thread.sleep(5000);
					Point p2 =new Point(100,150);
					driver.manage().window().setPosition(p2);
					System.out.println(driver.manage().window().getPosition());
	}

}
