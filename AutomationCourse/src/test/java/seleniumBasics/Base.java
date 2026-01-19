package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;  //WebDriver Declaration globally
	
	public void browserLaunch()
	{
		driver =new ChromeDriver(); //indicating the browser in which testing happens
		driver.get("https://selenium.qabible.in/");  //test url
		driver.manage().window().maximize();   //for window maximization
	}
	public void browserCloseQuit()
	{
		//driver.close(); 
		driver.quit();
	};

	public static void main(String[] args) {
		Base base = new Base();
		base.browserLaunch();
		base.browserCloseQuit();

	}
	
}
