package InvocationcountEP6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nvocation {
	@Test(invocationCount = 3,invocationTimeOut=10000)
	public void Find() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Football",Keys.ENTER);
		
		List<WebElement>elements=driver.findElements(By.xpath("//*[contains (text(),'Football') or contains (text(),'football')]"));
		System.out.println(elements.size());
		
	}

}
