package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	
public WebDriver driver;  //WebDriver Declaration globally
	
	@BeforeMethod
	public void browserLaunch()
	{
		driver =new ChromeDriver(); //indicating the browser in which testing happens
		driver.get("https://www.saucedemo.com/v1/");  //Demo Project url
		driver.manage().window().maximize();   //for window maximization
	}
	
	@AfterMethod
	public void browserCloseQuit()
	{
		
		//driver.quit();
	}

}
