package browserLaunching;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

	}

}
