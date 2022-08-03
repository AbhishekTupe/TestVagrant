package path;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClaass {
public WebDriver driver;
public void InitializeBrowser() throws IOException
    {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\git\\Wikipedia\\Wikipedia\\Browser\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get(UtilityClass.getPFdata("URL1"));
	driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	driver.manage().window().maximize();
    }
   
public void InitializeBrowser2() throws IOException
   {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\git\\Wikipedia\\Wikipedia\\Browser\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get(UtilityClass.getPFdata("URL2"));
   driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
   driver.manage().window().maximize();
   }





}
