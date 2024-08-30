package Ep13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProciderParallel extends data {
	@Test(dataProvider = "field")
public void remit(String data[]) {
	
		//System.out.println(data[2]);
		
		
		
		  WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		  driver.get("https://letcode.in/edit");
		  
		  
		  driver.findElement(By.id("fullName")).sendKeys(data[0]);
		  
		  WebElement second=driver.findElement(By.id("join")); second.clear();
		  second.sendKeys(data[1]);
		  
		  WebElement third=driver.findElement(By.id("getMe")); third.clear();
		  third.sendKeys(data[2]);
		  
		  WebElement fourth=driver.findElement(By.id("clearMe")); fourth.clear();
		  fourth.sendKeys(data[3]);
		 
}

}
