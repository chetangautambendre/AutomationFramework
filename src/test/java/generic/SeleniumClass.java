package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumClass {
	
	WebDriver driver;
	
	public void launchBrowser(String browserName)  {
		
		String currentPath = System.getProperty("user.dir");
		
		currentPath = currentPath + "\\src\\test\\java\\utils\\";
		
		if(browserName.equalsIgnoreCase("chrome")) {	
			System.setProperty("webdriver.chrome.driver", currentPath+"chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currentPath+"geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", currentPath+"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void launchApplication(String url) {
		
	}
	
	public void verifyPageByURL(String expectedURL) {
		
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void performAction() {
		
	}
	
	public void identifyElement() {
		
	}
	
	public void identifyElements() {
		
	}
}
