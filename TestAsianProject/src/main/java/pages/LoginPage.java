package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

import base.TestBase;


public class LoginPage extends TestBase {
	



public boolean LoginWithvalidEmail() 
{
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("validemail"));   
	    driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.xpath("//div/input[@name='login']")).click();
		return driver.findElement(By.xpath("//button/span[contains(text(),'Join a member')]")).isDisplayed();

	}


public boolean LoginWithInvalidEmail() 
{
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("invalidemail"));   
	    driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.xpath("//div/input[@name='login']")).click();
		return driver.findElement(By.xpath("//span[contains(text(),'Invalid username or password')]")).isDisplayed();


}


public boolean LoginWithWrongPassword() 
{
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("validemail"));   
	    driver.findElement(By.id("password")).sendKeys(prop.getProperty("invalipassword"));
		driver.findElement(By.xpath("//div/input[@name='login']")).click();
		return driver.findElement(By.xpath("//span[contains(text(),'Invalid username or password')]")).isDisplayed();


}


@AfterMethod
public void tearDown() throws IOException {
}

}