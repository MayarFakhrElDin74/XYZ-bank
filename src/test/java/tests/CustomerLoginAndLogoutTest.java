package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoggedinCustomerHomePage;
import pages.YourNamePage;

public class CustomerLoginAndLogoutTest extends TestBase {


	HomePage homeObject ;
	YourNamePage yournameObject ;
	LoggedinCustomerHomePage loggedincustomerObject ;



	@Test (priority = 1)

	public void customerCanLogin () throws FileNotFoundException, IOException, ParseException

	{

		homeObject = new HomePage(driver);
		homeObject.goToCustomerLoginPage();

		yournameObject = new YourNamePage(driver) ;
		yournameObject.customerCanLogin();

		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		assertTrue(loggedincustomerObject.welcomelbltxt().contains("Welcome"));

	}



	@Test (priority = 2)


	public void CustomerCanLogout ()

	{
		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		loggedincustomerObject.customerCanLogout();

		yournameObject = new YourNamePage(driver) ;
		assertTrue(yournameObject.urnamelbltxt().equals("Your Name :")) ;

	}

}
