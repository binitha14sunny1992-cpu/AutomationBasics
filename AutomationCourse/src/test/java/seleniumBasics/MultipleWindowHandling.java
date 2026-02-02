package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle(); //fetching the unique id of each window
		System.out.println(parentwindow);
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Set<String> handleids=driver.getWindowHandles(); //multiple windows id will be stored in handleids set;
		System.out.println(handleids);
		Iterator<String> it=handleids.iterator();
		while(it.hasNext())
		{
			String currentid=it.next();
			if(!currentid.equals(parentwindow)) //both ids are different
			{
				driver.switchTo().window(currentid);
				WebElement email=driver.findElement(By.name("emailid"));				
				email.sendKeys("test@gmail.com");
				WebElement submit=driver.findElement(By.name("btnLogin"));
				submit.click();
				
				
			}
		}
	}

	public static void main(String[] args) {
		
		MultipleWindowHandling windowhandle=new MultipleWindowHandling();
		windowhandle.browserLaunch();
		windowhandle.verifyMultipleWindow();
	}

}
