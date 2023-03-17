package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ManagerHomePage;
import pages.OpenAccountPage;

public class ManagerOpenAccountTest extends TestBase {


	HomePage homeObject ;
	ManagerHomePage managerhomeObject ;
	OpenAccountPage openaccountObject ;



	@Test (priority = 1)

	public void managerCanOpenAccount () 

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToManagerHomePage();

		managerhomeObject = new ManagerHomePage(driver) ;
		managerhomeObject.goToOpenAccountPage();

		openaccountObject = new OpenAccountPage(driver) ;
		openaccountObject.managerOpenAccount () ;

	}
}
