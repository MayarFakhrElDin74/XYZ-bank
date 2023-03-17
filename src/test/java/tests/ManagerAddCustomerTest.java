package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.AddCustomerPage;
import pages.HomePage;
import pages.ManagerHomePage;

public class ManagerAddCustomerTest extends TestBase {


	HomePage homeObject ;
	ManagerHomePage managerhomeObject ;
	AddCustomerPage addcustomerObject ;



	@Test (priority = 1)

	public void managerCanAddCustomer () throws FileNotFoundException, IOException, ParseException

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToManagerHomePage();

		managerhomeObject = new ManagerHomePage(driver) ;
		managerhomeObject.goToAddCustomerPage();

		JsonDataReader jsonDataReader = new JsonDataReader () ;
		jsonDataReader.jsonReader();

		addcustomerObject = new AddCustomerPage(driver) ;
		addcustomerObject.managerFillsCustomerData
		(jsonDataReader.customerfn , jsonDataReader.customerln , jsonDataReader.postalcode) ;

	}


}
