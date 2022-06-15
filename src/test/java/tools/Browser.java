package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browser  {
	
	public static WebDriver Open(String browserType)
	{
		if(browserType.equalsIgnoreCase("Chrome"))
		{
	    String path1=".\\WebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path1);
	    return new ChromeDriver();  
		}
		
		else if(browserType.equalsIgnoreCase("Firefox"))
		{
			String path3=".\\WebDriver\\geckodriver.exe";
	        System.setProperty("webdriver.gecko.driver", path3);
		
		    return new  FirefoxDriver();
			}
		else if(browserType.equalsIgnoreCase("Edge"))
		{
			String path4=".\\WebDriver\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", path4);

			return new EdgeDriver();
		}
		
		else 
		{
		String path2=".\\WebDriver\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", path2);
	
	    return new  InternetExplorerDriver();
		}
		
	}
}



