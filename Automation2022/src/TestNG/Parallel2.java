package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {

	@Test
public void TC2() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ankit\\Downloads\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");

driver.manage().window().maximize();
}
}