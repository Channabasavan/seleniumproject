package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
//		1.identifiy the element
//		2do actions on the element
		
System.setProperty("webdriver.edge.driver", "C:\\Program Files\\automation files\\drivers\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=7RAT5WTMRB7BBZ78T11H&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		System.out.println("browser opned");
		driver.manage().window().maximize();
	    WebElement element=driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
	   String   Header     =element.getText();
	   System.out.println("the text is:"+Header);
	           
		

	}

}
