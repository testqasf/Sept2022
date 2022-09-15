package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword {

	/*@Test(invocationCount=5)
	public void TC1() {
	Reporter.log("Ankita Ambekar", true);
	}*/
	
	
	@Test(priority=-1,timeOut=2000)
	public void TC2() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("running TC2", true);
	}
	
	@Test(priority=1, enabled=true)
	public void TC3() {
		Reporter.log("running TC3", true);
	}	
	@Test
	public void TC4() {
		Reporter.log("running TC4", true);
	}
	@Test(priority=0, dependsOnMethods= {"TC2"})
	public void TC5() {
		Reporter.log("running TC5", true);
	
	}	
}
