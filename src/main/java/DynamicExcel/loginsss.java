package DynamicExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginsss {
	@Test(dataProvider = "logins" , dataProviderClass = data.class)
	void h(String data []) {
		System.out.println(data[0]);
		System.out.println(data[1]);
	
		
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://remittance.ocs.org/remittance/public/login");
		  
		  
		  driver.findElement(By.id("login")).sendKeys(data[0]);
		  driver.findElement(By.id("password")).sendKeys(data[1],Keys.ENTER);
		 
	}
}
