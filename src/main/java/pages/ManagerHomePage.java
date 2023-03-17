package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerHomePage {


	private WebDriver driver ;


	public ManagerHomePage (WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By addCustomerBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]") ;
	private final By openAccountBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]") ;
	private final By customersBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]") ;



	public void goToAddCustomerPage ()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(addCustomerBtn)) ;

		driver.findElement(addCustomerBtn).click();

	}

	public void goToOpenAccountPage ()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(openAccountBtn)) ;

		driver.findElement(openAccountBtn).click();

	}

	public void goToCustomersPage ()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(customersBtn)) ;

		driver.findElement(customersBtn).click();

	}

}
