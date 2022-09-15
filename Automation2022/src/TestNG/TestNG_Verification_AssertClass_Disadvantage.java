package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verification_AssertClass_Disadvantage {
@Test
public void test() {
	String expResult = "good morning";
	String actResult = "good night";
	boolean result = false;
	
	//verification1
	Assert.assertNotEquals(expResult, actResult, "verification1: act&exp result is same");
	
	//verification2
	Assert.assertEquals(actResult, expResult, "verification2: act&exp result is different");
	
	//verification3
	Assert.assertTrue(result, "verification3: result is false");
}
}
