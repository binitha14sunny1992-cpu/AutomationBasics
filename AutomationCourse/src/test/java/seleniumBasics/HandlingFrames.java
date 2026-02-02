package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HandlingFrames extends Base{
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		WebElement firstfr=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(firstfr);
		WebElement framehead=driver.findElement(By.id("sampleHeading"));
		System.out.println(framehead.getText());
		driver.switchTo().defaultContent(); //control giving back to main page
		
	}

	public static void main(String[] args) {
		HandlingFrames frame=new HandlingFrames();
		frame.browserLaunch();
		frame.verifyFrames();

	}

}
