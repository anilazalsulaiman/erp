package pageObjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Headermenus {
	WebDriver driver;
	
	public Headermenus(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void mouseHover_header_apps() {
		
	}
}
