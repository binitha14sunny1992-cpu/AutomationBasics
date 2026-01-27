package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void verfiySimpleAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alertbtn1=driver.findElement(By.id("alertButton"));
		alertbtn1.click();
		//We need to switch the control from the entire page to the alert small window and reference also created as follows:
		
		Alert alert=driver.switchTo().alert(); 
		alert.accept();
		
	}
	public void verifyConfirmAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmbtn=driver.findElement(By.id("confirmButton"));
		confirmbtn.click();
		
		Alert alert=driver.switchTo().alert(); 
		//alert.accept();
		alert.dismiss();
		
	}
	public void verifyPromptAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptbtn=driver.findElement(By.id("promtButton"));
		promptbtn.click();		
		
		Alert alert=driver.switchTo().alert(); 		
		alert.sendKeys("Binitha");
		alert.accept();
	}

	public static void main(String[] args) {
		HandlingAlerts handalert =new HandlingAlerts();
		handalert.browserLaunch();
	//	handalert.verfiySimpleAlerts();
	//	handalert.verifyConfirmAlerts();
		handalert.verifyPromptAlerts();
		

	}

}
