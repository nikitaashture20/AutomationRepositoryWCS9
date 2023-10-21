package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Spotify_Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?gad=1&gclid=EAIaIQobChMI06K64PusgQMVhqeWCh0oXwVrEAAYASAAEgIAT_D_BwE&gclsrc=aw.ds");
		driver.findElement(By.id("login-username")).sendKeys("nikitaashture@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("nikita"); 
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
