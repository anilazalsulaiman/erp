package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_LC {

	 // Constructor to initialize elements
    public LoginPage_LC(WebDriver driver) {
        PageFactory.initElements(driver, this);  // Initialize PageFactory elements
    }
    
@FindBy(css = "input[placeholder='IN1234']")
		public WebElement byp_username;
@FindBy(css= "input[type='password']")
		public WebElement byp_password;
@FindBy(css="button[type='submit']")
		public WebElement click_Login_Button;
@FindBy(xpath = "//button[normalize-space()='View Profile']")
	public WebElement visibility_ofAny_DashboardElement;
	
}
