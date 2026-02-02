package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleFileUpload extends Base{
	
	public void verifyFileUploadUsingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadbtn=driver.findElement(By.id("uploadfile_0"));
		uploadbtn.sendKeys("C:\\Users\\ACER\\git\\AutomationBasics\\AutomationCourse\\src\\main\\resources\\sample.pdf");
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		WebElement submitbtn=driver.findElement(By.id("submitbutton"));
		submitbtn.click();		
		
	}
	public void verifyFileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pdffilebtn=driver.findElement(By.id("pickfiles"));
		pdffilebtn.click();
		StringSelection selection=new StringSelection("C:\\Users\\ACER\\git\\AutomationBasics\\AutomationCourse\\src\\main\\resources\\sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot r=new Robot();
		r.delay(2500); //2500  illiseconds
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		HandleFileUpload fileup=new HandleFileUpload();
		fileup.browserLaunch();
		//fileup.verifyFileUploadUsingSendkeys();
		try
		{
			fileup.verifyFileUploadUsingRobot();
		}
		catch(AWTException e)
		{
			
		}

	}

}
