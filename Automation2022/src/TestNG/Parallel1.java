package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void TC1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ankit\\Downloads\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
}
}
