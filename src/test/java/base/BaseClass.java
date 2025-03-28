package base;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenshotUtils;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	protected WebDriver driver; 
	//public – Accessible from anywhere.
	//private – Accessible only within the same class.
	//protected – Accessible within the same package and subclasses.
	//default (no modifier) – Accessible only within the same package.
	ScreenshotUtils scUT;
	public static Properties prop;
	private static final Logger logger = LogManager.getLogger(BaseClass.class);
	
	public static void loadConfig() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//resources//PropertiesConfig//Config.properties");
		prop.load(ip);
	}
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  loadConfig();

      logger.info("Initializing WebDriver...");
      //String browser = prop.getProperty("browser").trim().toLowerCase();
      //boolean headless = Boolean.parseBoolean(prop.getProperty("headless"));
      
      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Insemi\\Selenium\\chromedriver-win64\\chromedriver.exe");
      WebDriverManager.chromedriver().setup(); //add dependency also to pom.xml, it will automatically update the chrome versions
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      
      boolean isHeadless = Boolean.parseBoolean(prop.getProperty("headless").trim().toLowerCase());
      if (isHeadless) {
          // Enable headless mode if specified in the config
          options.addArguments("--headless");
          options.addArguments("--disable-gpu");  // Disable GPU for headless mode
          options.addArguments("--window-size=" + prop.getProperty("viewport.width") + "x" + prop.getProperty("viewport.height"));
      }
      
	  driver=new ChromeDriver(options);
	  driver.get(prop.getProperty("BaseURL"));
	  driver.manage().window().maximize();
//	  int width = Integer.parseInt(prop.getProperty("viewport.width"));
//    int height = Integer.parseInt(prop.getProperty("viewport.height"));
//    driver.manage().window().setSize(new Dimension(width, height));

	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
  }

  @AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult itestResult) throws IOException {
		if (itestResult.getStatus() == ITestResult.FAILURE) { // for capturing failed screenshots
			scUT = new ScreenshotUtils();
			scUT.capture_Screenshot_failures(driver, itestResult.getName());
			System.out.println("Test Case Failed: " + itestResult.getName()); 
		}else if(driver != null) {
			driver.quit();
			logger.info("Browser closed successfully.");
		}
		
	}
}
