package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionsPage {

	private WebDriver driver ;

	public TransactionsPage (WebDriver driver)

	{
		this.driver = driver ;
	}

	private final By depositAmount = By.xpath("//*[@id=\"anchor0\"]/td[2]") ;
	private final By withdrawlAmount = By.xpath("//*[@id=\"anchor1\"]/td[2]") ;

	private final By backBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]") ;
	private final By resetBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]") ;


	public String depositAmountTxt ()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(depositAmount)) ;

		return driver.findElement(depositAmount).getText() ;
	}


	public String withdrawlAmountTxt ()

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(withdrawlAmount)) ;

		return driver.findElement(withdrawlAmount).getText() ;

	}


	public void customerMustGoBackTocheckHisTransacctions ()

	{

		driver.findElement(backBtn).click();
	}


	public void customerCanResetHisTransacctions ()

	{

		driver.findElement(resetBtn).click();
	}

}
