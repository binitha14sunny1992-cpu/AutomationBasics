package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		//WebElement username=driver.findElement(By.id("user-name"));
		//username.sendKeys("standard_user");
		//WebElement pwd=driver.findElement(By.id("password"));
		//pwd.sendKeys("secret_sauce");
		//WebElement loginbtn=driver.findElement(By.id("login-button"));
		//loginbtn.click();
		String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUserNameOnUserNameField(usernamevalue);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
		
	}
	
	@Test
	public void verifyUserLoginWithValidUserNameAndInvalidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUserNameOnUserNameField(usernamevalue);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUserNameOnUserNameField(usernamevalue);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithInvalidUserNameAndValidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUserNameOnUserNameField(usernamevalue);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
	}
	
}
