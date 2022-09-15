package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	
	@BeforeClass
public void OpenBrowser() {
		// open browser
	}
	
	@BeforeMethod
	public void LogIn() {
		// login
	}
	
	@Test
	public void VerifyUsername() {
		// actual test case verify user name
	}
	
	@Test
	public void VerifyPassword() {
		// actual test case Verify Password
	}
	
	
	@AfterMethod
	public void LogOut() {
		// logout
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		// close browser
	}
}
