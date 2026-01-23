package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	
	public void verifyDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drpdwn=driver.findElement(By.id("dropdowm-menu-1"));
		Select select =new Select(drpdwn);  //Select is predefined class
	//	select.selectByIndex(2); //give the index value of radio button needed
	//	select.selectByValue("sql");
		select.selectByVisibleText("C#");
		
		
	}
	public void verifyCheckBox()
	{
		//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check=driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		WebElement check1=driver.findElement(By.xpath("//input[@value='option-4']"));
		check1.click();		
	}
	
	public void verifyRadiobutton()
	{
		//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio=driver.findElement(By.xpath("//input[@value='yellow']"));
		radio.click();
		
	}

	public static void main(String[] args) {
		HandlingDropDown dropdown =new HandlingDropDown();
		dropdown.browserLaunch();
		dropdown.verifyDropDown();
		dropdown.verifyCheckBox();
		dropdown.verifyRadiobutton();
	}

}
