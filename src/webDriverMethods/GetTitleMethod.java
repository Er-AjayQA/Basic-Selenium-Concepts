package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ajay Kumar.
 * This class consist of "getTitle" method.
 * It is used to get the title of the current page.
 */
public class GetTitleMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		String title= driver.getTitle();
		System.out.println(title);

	}

}
