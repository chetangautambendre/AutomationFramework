package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

<<<<<<< HEAD
//import selenium.AutoClass.locatorType;

public class SeleniumClass {
=======
public class SeleniumClass { 
>>>>>>> 3ab1d00333311cfd2ab5c70f66fbe0e5483dd1b7
	
	WebDriver driver;
	public enum locatorType {id, name, className, tagName,css,xpath,linkText, partialLinkText};
	public WebElement element;
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
		
		driver.get(url);
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
	
	public WebElement identifyElements(String LocatorValue, locatorType type) {
		
		WebElement element = null;
		switch(type) {
				case id : element = driver.findElement(By.id(LocatorValue));
					break;
				case name : element = driver.findElement(By.name(LocatorValue));
				        break;
				case className : element = driver.findElement(By.className(LocatorValue));
					break;
				case tagName : element = driver.findElement(By.tagName(LocatorValue));
					break;
				case css : element = driver.findElement(By.cssSelector(LocatorValue));
					break;
				case xpath : element = driver.findElement(By.xpath(LocatorValue));
					break;
				case linkText : element = driver.findElement(By.linkText(LocatorValue));
					break;
				case partialLinkText : element = driver.findElement(By.partialLinkText(LocatorValue));
					break;
			
				}
		
		return element;
		
	}
	
	
	
}
