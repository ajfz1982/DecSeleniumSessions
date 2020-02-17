package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10, priority=1, expectedExceptions=ArithmeticException.class)
	public void createUserTest() {
		System.out.println("createUserTest - Naveen");
		int i = 9/0;
	}
}
