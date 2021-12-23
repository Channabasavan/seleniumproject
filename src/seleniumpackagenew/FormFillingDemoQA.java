package seleniumpackagenew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillingDemoQA {
   
	public static void main(String[] args ) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demo.automationtesting.in/Register.html");
//	 FirstName
	 driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("channa");
//	 LastName
	 driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Nidebane");
//	 Adress
	 driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Karnataka");
//	 Email
	 driver.findElement(By.xpath("//input[contains(@type,\"email\")]")).sendKeys("xyz@gmail.com");
//	 Phone no
	 driver.findElement(By.xpath("//input[starts-with(@type,\"tel\")]")).sendKeys("9856475558");
//	 Gender
	 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
//	 Hobbies
	 List<WebElement> check=driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
	 System.out.println(+check.size());
	 for(int i=0;i<=check.size()-1;i++)
		{
		 check.get(i).click();
		}
//	 language
	 driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[2]/a")).click();
//	 Skills
	 WebElement w= driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
	 Select se =new Select(w);
	 se.selectByIndex(4);
//	 country
	 WebElement w2= driver.findElement(By.xpath("//*[@id=\"countries\"]"));
	 Select se2 =new Select(w2);
	 se.selectByIndex(0);
//	 year
	 WebElement w3= driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
	 Select se3 =new Select(w3);
	 se.selectByIndex(5);
//	 month
	 WebElement w4= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	 Select se4 =new Select(w4);
	 se.selectByIndex(3);
//	 day
	 WebElement w5= driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
	 Select se5 =new Select(w5);
	 se.selectByIndex(4);
//	 password
	 driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("124558855");
//	 confirmpasswod
	 driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("124558855");
//	 photo upload
	 driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Mayuri\\Desktop\\Siddaganga-Swamiji.jpg");
//	submit
	 driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).submit();

	}

}
