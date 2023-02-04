package TestCasesProduct1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.RegisterPage;
import util.TestUtil;

public class RegisterCases extends TestBase {
	
	
	
	RegisterPage registerpage;
	TestUtil testUtil;
	
	public RegisterCases() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		registerpage = new RegisterPage();

	}
	
	@Test(priority = 4)
	public void RegisterWithInvalidEmail () {
		
		Assert.assertTrue(registerpage.RegisterInvalidEmail());
		

	}

	@Test(priority = 5)
	public void RegisterWithMismatchPassword() {
		
		Assert.assertTrue(registerpage.RegisterMismatchPassword());
		

	}
	
	@Test(priority = 6)
	public void RegisterWithNOEmail() {
		
		Assert.assertTrue(registerpage.RegisterNoEmail());
		

	}
	
	@Test(priority = 7)
	public void RegisterWithNOPassword() {
		
		Assert.assertTrue(registerpage.RegisterNoPassword());
		

	}
	
	@Test(priority = 8)
	public void Registeration() {
		
		Assert.assertTrue(registerpage.RegisterSuccessfully());
		

	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
