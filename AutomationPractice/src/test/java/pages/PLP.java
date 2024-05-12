package pages;

import static Utilities.DriverSetup.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PLP extends Basepage {

	public By Women = By.xpath("//a[@title='Women']");
	public By dresses = By.xpath("(//a[@title='Dresses'][normalize-space()='Dresses'])[1]");
	public By product = By.xpath("(//div[@class='product-image-container'])[5]");
	//public By quick_view = By.xpath("(//span[contains(text(),'Quick view')])[2]");
	public By ATC = By.xpath("//button[@name='Submit']");
	public By iframe = By.xpath("//iframe[contains(@id,'fancybox-frame')]");
	public By proceedTochout = By.xpath("//a[@title='Proceed to checkout']");
	public By proceedTochkout = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
	public By chkbox = By.xpath("//input[@id='cgv']");
	public By proceedTochkoutShipp = By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
	
	public void choose() throws InterruptedException {
		hover(Women);
		clickeonbutton(dresses);
		hover(product);
		
		//To Prevent Timeout Exception i need to use wait here for quick view
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
	   WebElement quickView = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Quick view')])[5]")));
	   quickView.click();
		
		//WebDriverWait wait2 = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
		 // WebElement Size = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("group_1")));
		
	   //Need to switch to iframe containing quick view popup 
	   iFrame(iframe);
	  //dropdown2(Size);
		
	   //Need to use  wait with condition presence of elementlocated..

		  WebElement Size = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("group_1")));
		  Select select = new Select(Size); 
		  select.selectByValue("3");
		  
		  
		  clickeonbutton(ATC);
		  getDriver().switchTo().defaultContent();
		  
		  clickeonbutton(proceedTochout);
		  clickeonbutton(proceedTochkout);
		  clickeonbutton(chkbox);
		  clickeonbutton(proceedTochkoutShipp);
		  
		  
		 
		}

	
	
}

