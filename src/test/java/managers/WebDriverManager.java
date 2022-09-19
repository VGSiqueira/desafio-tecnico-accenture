package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	private WebDriver driver;
	
	public WebDriverManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebDriver getWebDriver() {
		
		return (driver == null) ? driver = new ChromeDriver() : driver;
	}
	
	public void closeDriver() {
		
		driver.close();
		driver.quit();
	}
}
