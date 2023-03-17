package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomersPage {
	
private WebDriver driver ;
	
	
	public CustomersPage (WebDriver driver)
	
	{
		this.driver = driver ;
	}
	
	
	private final By deleteBtn = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button") ;
	
	
	
	public void managerCanDeleteCustomer ()
	
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(deleteBtn)) ;
		
		driver.findElement(deleteBtn).click(); ;
	}

}
