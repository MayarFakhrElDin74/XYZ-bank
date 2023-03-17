package tests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {


	public WebDriver driver ;



	@BeforeSuite

	@Parameters ({"browser"})

	public void startDriver (@Optional ("chrome") String browsername)

	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver() ;

			if (browsername.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver() ;

				if (browsername.equalsIgnoreCase("ie")) {
					driver = new InternetExplorerDriver() ;

				}
			}
		}
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
	}


	
	@AfterSuite

	public void closeDriver ()

	{
		driver.quit();
	}
	
	@AfterMethod
	
	public void takeScreenShotOnFailure (ITestResult result) throws IOException
	
	{
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed! Taking screenshot .." +result.getStatus());
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
			
			FileUtils.copyFile(srcFile, new File("Errors Screenshots\\" + result.getName()
			+ Arrays.toString(result.getParameters()) +".jpg"));
			
		}
		
	}



}
