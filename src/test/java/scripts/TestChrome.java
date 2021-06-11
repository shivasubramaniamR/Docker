package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class TestChrome {
	
	WebDriver driver;
	String host="localhost";
	DesiredCapabilities dc;
	
	@Test
	public void sample() throws MalformedURLException {
		
			dc = new DesiredCapabilities();
			//dc.setBrowserName("firefox");
			
			
			if(System.getProperty("BROWSER")!=null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
				dc.setBrowserName("firefox");
			}
			else  {
				dc.setBrowserName("chrome");
			} 
			
			
			
			if(System.getProperty("SE_EVENT_BUS_HOST") !=null) {
				host = System.getProperty("SE_EVENT_BUS_HOST");
			}
			
			
			String completeUrl = "http://"+host+":4444";
			
			//WebDriverManager.chromedriver().setup();
			driver = new RemoteWebDriver(new URL(completeUrl),dc);
			driver.get("https://www.google.co.in");
			System.out.println("Current URL = "+driver.getCurrentUrl());
			System.out.println("Page Title = "+driver.getTitle());
			//driver.close();
			driver.quit();
		
	}
	

}
