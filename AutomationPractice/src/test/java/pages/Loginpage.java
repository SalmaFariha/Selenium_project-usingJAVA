package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Loginpage extends Basepage {

	//public By signupbutton = By.xpath("//a[contains(text(),'Sign in')]");
	
	public By email_field = By.xpath("//input[@id='email_create']");
	public By createanaccount = By.xpath("//span[normalize-space()='Create an account']");
	public By Title = By.xpath("//label[normalize-space()='Mrs.']");
	public By firstname = By.xpath("//input[@id='customer_firstname']");
	public By lastname = By.xpath("//input[@id='customer_lastname']");
	public By password = By.xpath("//input[@id='passwd']");
	public By days = By.xpath("//select[@id='days']");
	public By months = By.xpath("//select[@id='months']");
	public By years = By.xpath("//select[@id='years']");
	public By register_button = By.xpath("//span[normalize-space()='Register']");
	public By signin_email = By.xpath("//input[@id='email']");
	public By signin_pass = By.xpath("//input[@id='passwd']");
	public By signin_signin = By.xpath("//span[normalize-space()='Sign in']");
	
	public void login(String email) {
		
		
		write( email_field,email);
		
		
}
	public void register()  {
		
		
		clickeonbutton(createanaccount);
	}
	public void create_account(String username,String Lastname,String Password) {
		  
		  write(firstname ,username);
		 write(lastname,Lastname);
		 write(password,Password);
		  
	}
	public void Register_button() {
		 clickeonbutton(register_button);
	}
public void Signin(String email_add, String Signin_Password) {
		
		write(signin_email,email_add);
		write(signin_pass,Signin_Password);
	}
  
}
