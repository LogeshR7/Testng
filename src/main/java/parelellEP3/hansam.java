package parelellEP3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hansam {
	@Test
	public void han() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://hansamsh.dyndns.biz:1205/demo/");
		
		driver.findElement(By.name("email")).sendKeys("durai",Keys.TAB,"Mani1206*",Keys.ENTER);
	}

}
