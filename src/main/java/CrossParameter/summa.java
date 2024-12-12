package CrossParameter;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class summa {
	public static void main(String[] args) {
	 RemoteWebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
	 driver.get("https://ui.vision/demo/webtest/frames/");
	 
	WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	 driver.switchTo().frame(Frame1);
	 driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("logesh da");
	 
	 
	
	 
	 
	 
	}

}
