package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;
import pageObjects.loginPage.LoginPage_PG;
import utils.ExcelReadUtils;

public class Loginpage_TC extends BaseClass{
	LoginPage_PG lp;
	
	@BeforeMethod
	public void perform_loginFor_QAaccount_allAccess() throws IOException {
		lp = new LoginPage_PG(driver);
		lp.perform_login(ExcelReadUtils.readStringData(2, 2, "Sheet1"), ExcelReadUtils.readStringData(2, 3, "Sheet1"));
		lp.visibility_ofElement_in_Dashboard();
	}
	
  @Test(enabled=true)
  public void print_url() {
	  String pageTitle = driver.getTitle();
	  System.out.println("Page Title: " + pageTitle);
	  
  }
  
  @Test(enabled=true)
  public void Validate_dashboardElement_afterLogin() throws IOException {
	  String actual=lp.getElement_textValue_in_Dashboard();
	  String expected="VIEW PROFILE";
	  Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
  }
  
  @Test
  public void Validate_dashboardURL_afterLogin() throws IOException, InterruptedException {
	  String actual=lp.get_Dashboard_URL();
	  //String expected="https://ytr.insemitech.com/dashboard/home/";
	  String expected = prop.getProperty("HomepageURL") + "dashboard/home/";
	  Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
  }
  
  
  
}
