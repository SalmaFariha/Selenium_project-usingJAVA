package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Utilities.DriverSetup;
import pages.Homepage;
import pages.Loginpage;
import Utilities.DataSet;


public class Logintest extends DriverSetup {
	
	 Loginpage loginpage = new  Loginpage();
	 Homepage homepage = new Homepage();
	
	@Test(priority=0,dataProvider = "invalidcredentials", dataProviderClass = DataSet.class)
	public void login(String email_add,String first_name,String last_name, String password) throws InterruptedException {
		
	getDriver().get("http://www.automationpractice.pl/index.php");
		
		homepage.signinbutton();
		 
//		try {
//			loginpage.JSscroll(loginpage.email_field);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		
	
		loginpage.login(email_add);
		
		loginpage.register();
		Thread.sleep(3000);
		
		loginpage.clickeonbutton(loginpage.Title);
		loginpage.create_account(first_name,last_name, password);
		
		loginpage.dropdown(loginpage.days);
		loginpage.dropdown(loginpage.months);
		loginpage.dropdown(loginpage.years);
		loginpage.Register_button();
		
		Thread.sleep(3000);
	}
	
	

}
	
	
