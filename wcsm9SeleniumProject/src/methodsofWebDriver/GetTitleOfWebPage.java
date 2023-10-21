package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleOfWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://Filipkart.com");
		driver.getTitle();
		Thread.sleep(2000);
		driver.close();

	}

}
