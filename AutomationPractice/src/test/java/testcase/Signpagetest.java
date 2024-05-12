package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilities.DataSet;
import Utilities.DataSet2;
import Utilities.DriverSetup;
import pages.Homepage;
import pages.Loginpage;
import pages.PLP;


public class Signpagetest extends DriverSetup {
	 Loginpage loginpage = new  Loginpage();
	 Homepage homepage = new Homepage();
	 PLP plppage = new PLP();
	 
		@Test(priority=0,dataProvider = "invalidcredentials", dataProviderClass = DataSet.class)
		public void Signin1(String email_address1,String Password1) throws InterruptedException {
			
			getDriver().get("http://www.automationpractice.pl/index.php");
			
				homepage.signinbutton();
				loginpage.Signin(email_address1,Password1);
				 loginpage.clickeonbutton(loginpage.signin_signin);
				 plppage.choose();
				 
				 Thread.sleep(6000);
		}
		
}