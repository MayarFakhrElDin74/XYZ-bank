package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YourNamePage {


	private WebDriver driver ;


	public YourNamePage (WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By loginBtn = By.cssSelector("button.btn.btn-default") ;
	private final By urNameLbl = By.xpath("/html/body/div/div/div[2]/div/form/div/label") ;



	public void customerCanLogin ()

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;
		WebElement urNameList = driver.findElement(By.xpath("//*[@id=\"userSelect\"]")) ;

		Select select = new Select(urNameList);
		select.selectByIndex(2) ;

		driver.findElement(loginBtn).click();
		
	}

	
	public String urnamelbltxt ()

	{
		return driver.findElement(urNameLbl).getText() ;
	}

}
