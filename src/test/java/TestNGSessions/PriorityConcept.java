package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("login Test");
	}
	@Test(priority=3, dependsOnMethods= {"loginTest","homeSearchTest"})
	public void homeTest() {
		System.out.println("home Test");
	}
	@Test(priority=2, enabled=true)
	public void homeSearchTest() {
		System.out.println("home Search Test");
	}
	@Test(enabled=false)
	public void test3() {
		System.out.println("test 3");
	}
	@Test(enabled=true)
	public void test4() {
		System.out.println("test 4");
	}
}
