package browserLaunching;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdge {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");

	}

}
