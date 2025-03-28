package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralUtilities {
	
//	public boolean isElementVisible(WebDriver driver, WebElement element) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		return element.isDisplayed();
//	}
	public boolean isElementVisible(WebDriver driver, WebElement element) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        return element.isDisplayed();
	    } catch (TimeoutException e) {
	        return false; // Return false instead of throwing an exception
	    } catch (NoSuchElementException e) {
	        return false; // Handle cases where the element is not in the DOM
	    } catch (StaleElementReferenceException e) {
	        return false; // Handle cases where the element is no longer attached to the DOM
	    }
	}

	public void visibility_wait_utility(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(element)));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static boolean waitForUrl(WebDriver driver, String expectedURL, long timeoutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            wait.until(ExpectedConditions.urlToBe(expectedURL));
            return true;
        } catch (Exception e) {
            // Log the exception if needed (e.g., using Log4j)
            System.err.println("Failed to wait for URL: " + expectedURL + ". Error: " + e.getMessage());
            return false;
        }
    }
	
	public void element_Click(WebElement element) {
		element.click();
	}
	
	public void sendKey_Elements(WebElement element, String sendValue) {
		element.sendKeys(sendValue);
	}
	
	public String getCurrent_Url(WebDriver driver){
		return driver.getCurrentUrl();
	}
	
	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void mousehower(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
}
