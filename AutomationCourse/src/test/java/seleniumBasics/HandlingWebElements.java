package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base{
	
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox=driver.findElement(By.id("single-input-field"));
		msgbox.sendKeys("Welcome");
		WebElement shwbtn=driver.findElement(By.id("button-one"));
		shwbtn.click();
		WebElement msgtxt=driver.findElement(By.id("message-one"));
		System.out.println(msgtxt.getText());
		msgbox.clear();
		System.out.println(shwbtn.getTagName());
				
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElements webelmnt =new HandlingWebElements();
		webelmnt.browserLaunch();
		webelmnt.verifyWebElement();
	}

}
