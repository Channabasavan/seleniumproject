package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\automation files\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Test=driver.findElement(By.xpath("//*[@id=\"u_0_2_sd\"]"));
	    Test.click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement t=driver.findElement(By.xpath("//span[@class=\"_5k_2 _5dba\"]/input[preceding-sibling: :label[for=\"u_3_4_jI\"]]"));
	    System.out.println(t.isSelected());
		
		
		
		
		
		
		
		
		
		
//		WebElement password =driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//		if(Email.isDisplayed()&&Email.isEnabled())
//		{
//			Email.sendKeys("xyz@gamil");
//		}
//		if(password.isDisplayed()&&password.isEnabled())
//		{
//			password.sendKeys("xxxyy");
//		}

	}

}
