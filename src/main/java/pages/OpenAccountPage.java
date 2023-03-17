package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {


	private WebDriver driver ;


	public OpenAccountPage (WebDriver driver)

	{
		this.driver = driver ;
	}



	private final By processBtn = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button") ;



	public void managerOpenAccount ()

	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)) ;

		WebElement customerNameList = driver.findElement(By.xpath("//*[@id=\"userSelect\"]")) ;
		customerNameList.click() ;

		Select select = new Select(customerNameList) ;
		select.selectByIndex(3);

		WebElement currencyList = driver.findElement(By.xpath("//*[@id=\"currency\"]")) ;
		currencyList.click() ;

		Select select2 = new Select(currencyList) ;
		select2.selectByIndex(2) ;

		driver.findElement(processBtn).click();

		Alert alert = driver.switchTo().alert() ;
		System.out.println(alert.getText());
		alert.accept();


	}

}
