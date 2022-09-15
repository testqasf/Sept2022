package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

	
	@DataProvider(name="data_provider")
public Object[][] dataprovidermethod(){
	return new Object[][] {{"Ankita"},{"Ankit"},{"Bhargav"},{"Nurvi"}} ;
}
	
	@Test(dataProvider = "data_provider")
	public void TC1(String value) {
		System.out.println(value);
	}
}
