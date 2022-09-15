package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {

//1.Assert Equals
	@Test
	public void test1() {
		Reporter.log("running test1 method",true);
		String expresult = "good morning";
		String actresult = "good morning";
		
		Assert.assertEquals(actresult, expresult, "act & exp result is different");
	}
	
	
	//2.Assert NotEquals
		@Test
		public void test2() {
			Reporter.log("running test2 method",true);
			String expresult = "good morning";
			String actresult = "good night";
			
			Assert.assertNotEquals(actresult, expresult, "act & exp result is same");
		}
	
		
		//3.AssertTrue
	@Test
	public void test3() {
		Reporter.log("running test3 method",true);
		boolean result = false;
		Assert.assertTrue(result, "result is false");
	}
	
	
	
	//4.AssertFalse
	@Test
	public void test4() {
		Reporter.log("running test4 method",true);
		boolean result = true;
		Assert.assertFalse(result, "result is true");
	}
	
	//5.AssertNull
	@Test
	public void test5() {
		Reporter.log("running test5 method",true);
		 Object result = null;
	     Assert.assertNull(result, "result is not null");
	}	
	
	
	//6.assertNotNull
	@Test
	public void test6() {
		Reporter.log("running test6 method",true);
		 Object result =null;
		 Assert.assertNotNull(result, "result is null");
}
	
	@Test
	public void test7() {
		Reporter.log("running test7 method",true);
		Assert.fail();
}
}
