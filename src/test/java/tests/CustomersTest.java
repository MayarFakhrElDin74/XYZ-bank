package tests;

import org.testng.annotations.Test;

import pages.CustomersPage;
import pages.HomePage;
import pages.ManagerHomePage;

public class CustomersTest extends TestBase {

	HomePage homeObject ;
	ManagerHomePage managerhomeObject ;
	CustomersPage customerObject ;



	@Test (priority = 1)

	public void managerCanDeleteCustomers ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToManagerHomePage();

		managerhomeObject = new ManagerHomePage(driver) ;
		managerhomeObject.goToCustomersPage();

		customerObject = new CustomersPage(driver) ;
		customerObject.managerCanDeleteCustomer();
	}

}
