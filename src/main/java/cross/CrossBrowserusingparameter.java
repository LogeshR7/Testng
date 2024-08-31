package cross;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserusingparameter {
	
		RemoteWebDriver  driver;
		@Parameters({"Browser"})
		@Test()
		public void login(String b) {
			switch (b) {
			case "chrome":
			driver=new ChromeDriver();
				
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			default:
				break;
			}
			
			driver.get("http://remittance.ocs.org/remittance/public/login");
			
			
			driver.findElement(By.id("login")).sendKeys("dosth");
			driver.findElement(By.id("password")).sendKeys("itsmedosth",Keys.ENTER);
			
			
			
			
			
			
			
		}

	}



