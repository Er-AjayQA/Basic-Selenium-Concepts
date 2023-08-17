package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ajay Kumar.
 * This class consist of get URL method.
 * It is used to navigate to any given URL.
 */
public class GetUrlMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");

	}

}
