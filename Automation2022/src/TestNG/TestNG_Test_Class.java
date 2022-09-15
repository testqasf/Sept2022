package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {

	@Test //@- annotation- summary of method
	public void test() {
		//System.out.println("quantum academy");
		
		//Reporter.log("quantum academy", false);// msg will be displayed in report but not on console
		
		Reporter.log("Anku", true);
	}
}
