package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class SeleniumClass extends BaseClass{ 
	
	static WebDriver driver;
	public enum locatorType {id, name, className, tagName,css,xpath,linkText, partialLinkText};
	public WebElement element;
	
	public void getScreenShot()
	{
	    String currentPath = System.getProperty("user.dir");
		
		currentPath = currentPath + "\\src\\test\\java\\utils\\";
			
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile,new File(currentPath +"screenShot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
   
		
		
	}
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
		
		String actualUrl=driver.getCurrentUrl();
		
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void performAction(WebElement elem, String actionType, String value) {
		
		if(actionType.equalsIgnoreCase("index") || actionType.equalsIgnoreCase("text")||actionType.equalsIgnoreCase("value")) {
			Select sel = new Select(elem);
			
			if(actionType.equalsIgnoreCase("index")) {
				sel.selectByIndex(Integer.parseInt(value));
			}
			else if(actionType.equalsIgnoreCase("text")) {
				sel.selectByVisibleText(value);
			}
			else if(actionType.equalsIgnoreCase("value")) {
				sel.selectByValue(value);
			}		
		}
		else if(actionType.equalsIgnoreCase("click")) {
			elem.click();
		}
		
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
	
	public void CloseApplication()
	{
		driver.close();
	}
	
	
	
}
