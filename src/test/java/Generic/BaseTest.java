package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant {
	public static WebDriver driver; 
	static{ 
	System.setProperty(GECKO_KEY, GECKO_VALUE); 
	System.setProperty(CHROME_KEY, CHROME_VALUE); 
	} 
	@BeforeMethod
	public void openApplication() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = Lib.getProperty(CONFIG_PATH,"URL"); 
		driver.get(url); 
		String ITO = Lib.getProperty(CONFIG_PATH,"ImplicitTimeOut"); 
		int timeoutPeriod = Integer.parseInt(ITO); 
		driver.manage().timeouts().implicitlyWait(timeoutPeriod,TimeUnit.SECONDS); 
		
	}
	@AfterMethod 
	public void closeApplication(){ 
	driver.close(); 
	} 
}

