package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralUtilities {
	
	public boolean isElementVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	public void visibility_wait_utility(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(element)));
		wait.until(ExpectedConditions.visibilityOf(element));
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
