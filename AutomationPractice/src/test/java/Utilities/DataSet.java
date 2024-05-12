package Utilities;



import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataSet {
	
	@DataProvider (name = "invalidcredentials")
	public Object[][] dataset(Method m)
	{
		Object[][] testdata = null;
		if(m.getName().equals("login")) {
		testdata = new Object[][]{
				{"sdsdfd@gmail.com","abcd", "cde", "ghhjhhh"},
				{"shdsfj@gmail.com","efdadg", "hij", "jjkkhhhh"}};
	}
				else if(m.getName().equals("Signin1"))
				{
					
					testdata = new Object[][]{
						{"sdsdfd@gmail.com", "ghhjhhh"},
					};
				}
	 return testdata;
	}}

	