package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test(groups="customer")
public class DemoA {
	
	public void testA1(){
		Reporter.log("testA1",true);
	}

	public void testA2(){
		Reporter.log("testA2",true);
	}
}
