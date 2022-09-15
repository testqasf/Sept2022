package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {

	@Parameters("browserName")
	@Test
	public void TC1(String browserName) {

		WebDriver driver = null;

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit\\Downloads\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.friver",
					"C:\\Users\\ankit\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\ankit\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		}

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.quit();
	}
}
