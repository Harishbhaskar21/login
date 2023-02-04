package pages;

import java.util.UUID;
import org.openqa.selenium.By;
import org.testng.Assert;
import base.TestBase;

public class RegisterPage extends TestBase {
	
	public void NavigateToRegister() 
	{
		
		driver.findElement(By.xpath("//*[@id=\"kc-registration\"]/span/a")).click();
		
	}
	
	
	public boolean RegisterInvalidEmail() 
	{
		    NavigateToRegister();
			driver.findElement(By.id("email")).sendKeys(prop.getProperty("invalidemail"));   
		    driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		    driver.findElement(By.id("password-confirm")).sendKeys(prop.getProperty("validpassword"));
			driver.findElement(By.xpath("//div/input[@value='Register']")).click();
			return driver.findElement(By.xpath("//span[contains(text(),'Invalid email address')]")).isDisplayed();

		}

	
	public boolean RegisterMismatchPassword() 
	{
		    NavigateToRegister();
			driver.findElement(By.id("email")).sendKeys(prop.getProperty("email"));   
		    driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		    driver.findElement(By.id("password-confirm")).sendKeys(prop.getProperty("invalipassword"));
			driver.findElement(By.xpath("//div/input[@value='Register']")).click();
			return driver.findElement(By.xpath("//span[contains(text(),'Password confirmation doesn')]")).isDisplayed();
			
			
			
	}
	
	
					
	
	
	public boolean RegisterNoEmail() 
	{
		    NavigateToRegister();  
		    driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		    driver.findElement(By.id("password-confirm")).sendKeys(prop.getProperty("validpassword"));
			driver.findElement(By.xpath("//div/input[@value='Register']")).click();
			return driver.findElement(By.xpath("//span[contains(text(),'Please specify username')]")).isDisplayed();

		}
	
	
	public boolean RegisterNoPassword() 
	{
		    NavigateToRegister();  
		    driver.findElement(By.id("email")).sendKeys(prop.getProperty("email")); 
			driver.findElement(By.xpath("//div/input[@value='Register']")).click();
			return driver.findElement(By.xpath("//span[contains(text(),'Please specify password')]")).isDisplayed();

		}

	
	public boolean RegisterSuccessfully() 
	{
		    NavigateToRegister();  
		    String uuid = UUID.randomUUID().toString().substring(0,3);
		    driver.findElement(By.id("email")).sendKeys("username"+ uuid +"@gmail.c"); 
		    driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		    driver.findElement(By.id("password-confirm")).sendKeys(prop.getProperty("validpassword"));
			driver.findElement(By.xpath("//div/input[@value='Register']")).click();
			return driver.findElement(By.xpath("//button/span[contains(text(),'Join a member')]")).isDisplayed();

		}
}


