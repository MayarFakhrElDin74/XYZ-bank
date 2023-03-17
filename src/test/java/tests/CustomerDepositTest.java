package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.LoggedinCustomerHomePage;
import pages.YourNamePage;

public class CustomerDepositTest extends TestBase {

	
	HomePage homeObject ;
	YourNamePage yournameObject ;
	LoggedinCustomerHomePage loggedincustomerObject ;

	

	@Test (priority = 1)

	public void customerCanLogin () 

	{

		homeObject = new HomePage(driver);
		homeObject.goToCustomerLoginPage();

		yournameObject = new YourNamePage(driver) ;
		yournameObject.customerCanLogin();

		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		assertTrue(loggedincustomerObject.welcomelbltxt().contains("Welcome"));

	}

	

	@Test (priority = 2)

	public void customerCanDeposit () throws FileNotFoundException, IOException, ParseException

	{
		JsonDataReader jsonDataReader = new JsonDataReader() ;
		jsonDataReader.jsonReader();

		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		loggedincustomerObject.customerCanDeposit(jsonDataReader.depositamount);

		assertTrue(loggedincustomerObject.depositsuccessfulmsgtxt().equals("Deposit Successful"));
	}


}
