package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoggedinCustomerHomePage {


	private WebDriver driver ;


	public LoggedinCustomerHomePage (WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By logoutBtn = By.xpath("/html/body/div/div/div[1]/button[2]") ;
	private final By welcomeLbl = By.xpath("/html/body/div/div/div[2]/div/div[1]/strong") ;

	private final By depositBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
	private final By depositAmountTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input") ;
	private final By confirmDepositBtn = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button") ;
	private final By successfulDepositMsg = By.cssSelector("span.error.ng-binding") ;

	private final By withdrawlBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]") ;
	private final By withdrawlAmountTxtBox = By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required") ;
	private final By confirmWithdrawlBtn = By.cssSelector("button.btn.btn-default") ;
	private final By successfulWithdrawlMsg = By.cssSelector("span.error.ng-binding") ;

	private final By transacctionsBtn = By.cssSelector("button.btn.btn-lg.tab") ;




	public String welcomelbltxt ()

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000)) ;
		wait.until(ExpectedConditions.presenceOfElementLocated(logoutBtn)) ;

		return  driver.findElement(welcomeLbl).getText() ;
	}


	public void customerCanLogout ()

	{
		driver.findElement(logoutBtn).click();
	}


	public void customerCanDeposit (String depositamount)

	{
		driver.findElement(depositBtn).click();
		driver.findElement(depositAmountTxtBox).sendKeys(depositamount);
		driver.findElement(confirmDepositBtn).click();
	}


	public String depositsuccessfulmsgtxt ()

	{
		return driver.findElement(successfulDepositMsg).getText() ;
	}


	public void customerCanWithdrawl (String withdrawlamount)

	{
		driver.findElement(withdrawlBtn).click();
		driver.findElement(withdrawlAmountTxtBox).sendKeys(withdrawlamount);
		driver.findElement(confirmWithdrawlBtn).click();
	}


	public String withdrawlsuccessfulmsgtxt ()

	{
		return driver.findElement(successfulWithdrawlMsg).getText() ;
	}


	public void goToTransacctionsPage ()

	{
		driver.findElement(transacctionsBtn).click();
	}

}
