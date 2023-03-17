package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


	private WebDriver driver ;


	public HomePage (WebDriver driver)

	{
		this.driver = driver ;
	}



	private final By customerLoginBtn = By.cssSelector("button.btn.btn-primary.btn-lg") ;	
	private final By managerLoginBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button") ;




	public void goToCustomerLoginPage ()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(customerLoginBtn)) ;

		driver.findElement(customerLoginBtn).click();

	}


	public void goToManagerHomePage ()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(managerLoginBtn)) ;

		driver.findElement(managerLoginBtn).click();	
	}



}
