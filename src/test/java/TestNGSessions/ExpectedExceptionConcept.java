package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void getNameTest() {
		System.out.println("getNameTest");
		int i = 9/0;
	}
}
