package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJSExecutor extends Base{
	public void verifyJSExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement shwbtn=driver.findElement(By.id("button-one"));
		JavascriptExecutor js=(JavascriptExecutor)driver; //casting control from entire apge to interface
		js.executeScript("arguments[0].click();", shwbtn); //sysntax..ony need to change webelement name(here=shwbtn)
		js.executeScript("window.scrollBy(0,350)", "");  //to scroll x=0 and y=350 if we need vertical scroll give value only to y axis(y=+value means scroll down and y=-ve value means scroll up)
		js.executeScript("window.scrollBy(0,-350)", "");
		
	}

	public static void main(String[] args) {
		HandlingJSExecutor JSExecutor=new HandlingJSExecutor();
		JSExecutor.browserLaunch();
		JSExecutor.verifyJSExecutor();

	}

}
