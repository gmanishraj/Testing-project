package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test(groups="product")
public class DemoB {

	public void testB1(){
		Reporter.log("testB1",true);
	}
	
	public void testB2(){
		Reporter.log("testB2",true);
	}
}
