package pageObjects.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locators.LoginPage_LC;
import utils.GeneralUtilities;

public class LoginPage_PG {
	private WebDriver driver;
	private GeneralUtilities gu;
	private LoginPage_LC locators;
	//GeneralUtilities gu = new GeneralUtilities();
	
	public LoginPage_PG(WebDriver driver) {
		this.driver=driver;
		this.gu = new GeneralUtilities();
		this.locators = new LoginPage_LC(driver);
		PageFactory.initElements(driver, this);
	}

	public void enter_username(String username) {
		try {
		gu.visibility_wait_utility(driver, locators.byp_username);
		gu.sendKey_Elements(locators.byp_username, username);
		}catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
	        throw e;
		}
	}
	
	public void enter_password(String password) {
		gu.visibility_wait_utility(driver, locators.byp_password);
		gu.sendKey_Elements(locators.byp_password, password);
	}
	
	public void click_Loginsubmit() {
		gu.visibility_wait_utility(driver, locators.click_Login_Button);
		gu.element_Click(locators.click_Login_Button);
	}
	
	public void perform_login(String username, String Password) {
		enter_username(username);
		enter_password(Password);
		click_Loginsubmit();
	}
	
	public void visibility_ofElement_in_Dashboard() {
		gu.visibility_wait_utility(driver, locators.visibility_ofAny_DashboardElement);
	}
	
	public String  getElement_textValue_in_Dashboard() {
		return gu.getElementText(locators.visibility_ofAny_DashboardElement);
	}
	
	public String get_Dashboard_URL() {
		//gu.visibility_wait_utility(driver, locators.visibility_ofAny_DashboardElement);
		return gu.getCurrent_Url(driver);
	}

}
