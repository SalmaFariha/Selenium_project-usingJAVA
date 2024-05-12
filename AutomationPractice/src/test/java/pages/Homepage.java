package pages;

import org.openqa.selenium.By;

public class Homepage extends Basepage {
	
	public By signupbutton = By.xpath("//a[contains(text(),'Sign in')]");
	
	public void signinbutton() {
		clickeonbutton(signupbutton);
	}
	
}
