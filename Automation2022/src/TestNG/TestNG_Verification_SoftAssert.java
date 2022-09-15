package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {
	@Test
	public void test() {
		String expResult = "good morning";
		String actResult = "good night";
		boolean result = false;
		
		SoftAssert soft=new SoftAssert();
		
		//verification1
		soft.assertNotEquals(actResult, expResult, "verification1: act&exp result is same");
		
		//verification2
		soft.assertEquals(actResult, expResult, "verification2: act&exp result is different");
		
		//verification3
		soft.assertTrue(result, "verification3:result is false");
		
		soft.assertAll();
}
}