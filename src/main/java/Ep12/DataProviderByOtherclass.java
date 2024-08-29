package Ep12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;                                      //One type extends data
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderByOtherclass  {
	@Test(dataProviderClass =data.class,dataProvider = "login")
	public void login(String email ,String p)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("login")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(p);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//driver.manage().window().maximize();
	}

}
