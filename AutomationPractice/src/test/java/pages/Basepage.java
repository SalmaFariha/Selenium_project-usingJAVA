package pages;

import static Utilities.DriverSetup.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {

	public WebElement getElement(By locator) {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(70)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		//return getDriver().findElement(locator); //SINCE presenceofElementLocated returns WebElement, so don't need to write extra line
		
		// WE USE DYNAMIC WAIT SO THAT WHENEVER THE ELEMENT IS FOUND THE RESULT SHOWS , IT WON'T WAIT FOR WHOLE TIME.
		//bUT IN THREAD.SLEEP EVEN IF THE ELEMENT IS FOUND EARLIER IT STILL WAITS FOR THE WHOLE TIME.
		
			
	}
	
	public String getElementtext(By locator) {
	
		return getElement(locator).getText();
		
	}
	
	
	public void clickeonbutton(By locator) {
		getElement(locator).click();
	}
	public void write(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
public void hover(By locator) {
		
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
}
public void Hover(By locator) {
	
	Actions action = new Actions(getDriver());
	action.moveToElement(getElement(locator)).click().perform();
}
public void dropdown2(By locator) {
	
	Select select = new Select(getElement(locator));
	select.selectByValue("3");
}

	public void dropdown(By locator) {
		 Select select = new Select(getElement(locator)); 
		 select.selectByIndex(1);
	}
	
	public void iFrame(By locator) {
	  getDriver().switchTo().frame(getElement(locator));
	}
	public void iFrameexit(By locator) {
		getDriver().switchTo().defaultContent();
	}
	public void JSscroll(By locator) throws InterruptedException {
		
		 ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();",getElement(locator) );

		
	}
		

}
