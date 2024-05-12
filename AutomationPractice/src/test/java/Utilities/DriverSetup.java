package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import Utilities.DriverSetup;

public class DriverSetup {

	private static String browsername = System.getProperty("browser", "Chrome");
	private static final ThreadLocal<WebDriver> Driver_Local = new ThreadLocal<>(); //static final--value will not change  // threadlocal use to seperate steps
	
	
	
	public static WebDriver getDriver() {
		return Driver_Local.get();  //getter method to get value in private variable driver_local 
		
	}
	
	public static void setDriver(WebDriver driver) {
		DriverSetup.Driver_Local.set(driver);  //setter method to set value in private variable driver_local throgh public class Driversetup
	}
	
	
	
	

	public static WebDriver getBrowser(String browsername) {
		
		
		switch(browsername.toLowerCase()) {       //tolowercase used if we used browser name uppercase or anyother case it will convert to lower case to match with condition; as condition is given in lowecase
		case"chrome":
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.chromedriver().clearDriverCache().setup();
		    return new ChromeDriver();
		    
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
		    return new FirefoxDriver();
		    
		 default:
			 throw new RuntimeException("Browser not found");
			     
			 
		}	
		
	}
	
	@BeforeMethod
	public static synchronized void setBrowser() {
		
		WebDriver webDriver = getBrowser(browsername);
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}
	
	@AfterMethod
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}
}
