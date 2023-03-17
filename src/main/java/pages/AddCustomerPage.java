package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage {

private WebDriver driver ;
	
	
	public AddCustomerPage (WebDriver driver)
	
	{
		this.driver = driver ;
	}
	
	private final By customerFNTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input") ;
	private final By customerLNTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input") ;
	private final By postalCodeTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input") ;
	private final By confirmAddCustomerBtn = By.cssSelector("button.btn.btn-default") ;
	
	
	public void managerFillsCustomerData (String customerfn , String customerln , String postalcode ) 
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(customerFNTxtBox)) ;
		
		driver.findElement(customerFNTxtBox).click();
		driver.findElement(customerFNTxtBox).sendKeys(customerfn);
		
		driver.findElement(customerLNTxtBox).click();
		driver.findElement(customerLNTxtBox).sendKeys(customerln);
		
		driver.findElement(postalCodeTxtBox).click();
		driver.findElement(postalCodeTxtBox).sendKeys(postalcode);
		
		driver.findElement(confirmAddCustomerBtn).click();
		
		Alert alert = driver.switchTo().alert() ;
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
}
