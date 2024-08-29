package Ep11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

@org.testng.annotations.DataProvider(name="login")
	public String[][] data() {
		String[][]da=new String[2][2];
		da[0][0]="dosth";
		da[0][1]="itsmedosth";
		
		da[1][0]="ragu";
		da[1][1]="ragu@123";
		return da;
	}
@Test(dataProvider = "login")
public void login(String email ,String p) {
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
