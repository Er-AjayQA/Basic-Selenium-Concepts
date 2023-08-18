package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Ajay Kumar
 * In this class code is return to launch browsers by taking browser value externally.
 * It is the example of "Run-Time Polymorphism"
 */
public class RunTimeBrowserLaunching {

	public static WebDriver driver;
	public static String browser= "firefox";
	
	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			System.out.println("==Chrome browser launched==");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
			System.out.println("==Firefox browser launched==");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			System.out.println("==Edge browser launched==");
		}
		else
		{
			System.out.println("==Invalid browser value==");
		}
		driver.get("https://google.com");

	}

}
