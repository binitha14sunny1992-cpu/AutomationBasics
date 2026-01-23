package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocators()
	{
		driver.findElement(By.id("button-one"));  							//using id()
		driver.findElement(By.className("btn btn-primary")); 				//using classname()
		driver.findElement(By.tagName("button")); 							//using tagname()
		driver.findElement(By.name("viewport")); 							//using name()
		driver.findElement(By.linkText("Simple Form Demo")); 				//using linktext()
		driver.findElement(By.partialLinkText("Simple")); 					//using partialLinkText()
		driver.findElement(By.cssSelector("button[id='button-one']")); 		//cssSelector()
		driver.findElement(By.xpath("//button[@id='button-one']"));			//relative xpath using attribute
		driver.findElement(By.xpath("//button[text()='Show Message']"));    //relative xpath using text
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @type='superbutton']"));
		driver.findElement(By.xpath("//div[contains(text(), 'Single Input Field')]//parent::div[@class='card']"));   //   //div[contains(text(), 'Single Input Field')]/.. to find parent	
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		
		// /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button   //absolute xpath
	}

	public static void main(String[] args) {
		Locators locate=new Locators();
		locate.browserLaunch();
		locate .verifyLocators();

	}

}
