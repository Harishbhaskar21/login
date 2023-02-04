package TestCasesProduct1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import util.TestUtil;

public class LoginCases  extends TestBase {
	
	LoginPage loginpage;
	TestUtil testUtil;
	
	public LoginCases() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginpage = new LoginPage();

	}
	
	@Test(priority = 1)
	public void ValidateLoginwithvalidEmail () {
		
		Assert.assertTrue(loginpage.LoginWithvalidEmail());
		

	}
	
	
	
	
	@Test(priority = 2)
	public void ValidateLoginwithInvalidEmail () {
		
		Assert.assertTrue(loginpage.LoginWithInvalidEmail());
		

	}
	
	
	
	@Test(priority = 3)
	public void ValidateLoginwithWrongPassword() {
		
		Assert.assertTrue(loginpage.LoginWithWrongPassword());
		

	}
	

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
