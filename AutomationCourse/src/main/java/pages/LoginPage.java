package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) //constructor creation
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //to intialize web elements in PageFactory predefined class --this should be done for all Page class
		
	}
	@FindBy(id="user-name")WebElement username; //Annotation by Page Factory (locator=value in double cords)
	@FindBy(id="password")WebElement pwd;
	@FindBy(id="login-button")WebElement loginbtn;
	
	
	//Actions needs to given as methods
	public void enterUserNameOnUserNameField(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
	}
	public void enterPasswordOnPasswordField(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
	
	

}
