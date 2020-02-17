package SeleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		
		//xpath - XML HTML PATH
		//locator
		//address of the element
		//abs xpath --> /html/body/div[6]/div/div[2]/div/input .......not good practice
		//relative xpath --> //input[@id = 'name']
			//other xpath functions:
			//some imp xpath Axes:
			
		//input -- 3
		//input[@id = 'username']
		//*[@id= 'username'] - very slow, bcos it is searching line by line for each tag 
		
		//input[@id = 'username' and @type = 'email']
		//input[@class='form-control private-form__control login-email']
		
		//contains() function:
		//used for dynamic attribute handling
		//input[contains(@id,'username')]
		//input[contains(@id,'user')]
		//input[contains(@id,'name')]
		//input[contains(@class,'login-email')] -- 1
		//input[contains(@class,'private-form__control')] -- 2.......not good practice, bcos not unique
		//input[@id='username' and contains(@class, 'login-email')]
		//input[@id='username' and contains(@class, ' ')]
		
//		<input id = 'test_123'>
//		<input id = 'test_345'>
//		<input id = 'test_155'>
		
		//input[contains(@id, 'test_')] -- to address above scenario
		
//		(//input[contains(@class, 'form-control')])[1] - username
//		(//input[contains(@class, 'form-control')])[2] - password
		
//		(//i18n-string)[10]
//		(//input[contains(@class, 'form-control')])[position( )=1] - username
//		(//input[contains(@class, 'form-control')])[position( )=2] - password
		
		//text() function:
		//htmltag[text()='value']
		//i18n-string[text()='Forgot my password']
		//span[text( ) = 'Show Password']
		//span[contains(text( ), 'Show Password')]
		//span[contains(text( ), 'Show')]
		//span[contains(text( ), 'Password')]
		
		//a[text()='Sign Up']
		//a[starts-with(text(),'Sign Up')]
		//a[starts-with(text(),'Sign')]
		//input[starts-with(@id, 'username')]
		//input[starts-with(@id, 'user')]
		//input[starts-with(@id, 'user') and @type='email']
		//input[starts-with(@id, 'pass') and @type='password']
		
		
		
		
		
	}

}
