package Utilities;

import org.testng.annotations.DataProvider;

public class DataSet2 {

	@DataProvider (name = "invalidcredentials")
	public static Object dataset()
	{
		Object[][] objects = {
				{"sdfd@gmail.com","abcd", "cde", "ghhjhhh"},
				{"shsdfj@gmail.com","efdadg", "hij", "jjkkhhhh"}};
		
	
	for (Object[] row : objects) {
        // Accessing the 1st and 4th elements from each row
        String email_address1 = (String) row[0];
        String Password1 = (String) row[3];
        return email_address1;
        
        
        
        }
	return objects;}}
        
	


