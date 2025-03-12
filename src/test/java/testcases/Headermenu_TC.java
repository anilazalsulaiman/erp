package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import constants.Constants;
import pageObjects.header.Headermenus_PG;
import pageObjects.loginPage.LoginPage_PG;
import utils.ExcelReadUtils;

public class Headermenu_TC extends BaseClass {
	LoginPage_PG lp;
	Headermenus_PG hm;

	@BeforeMethod
	public void perform_loginFor_QAaccount_allAccess() throws IOException {
		lp = new LoginPage_PG(driver);
		lp.perform_login(ExcelReadUtils.readStringData(2, 2, "sheet1"), ExcelReadUtils.readStringData(2, 3, "sheet1"));
		lp.visibility_ofElement_in_Dashboard();
		hm = new Headermenus_PG(driver);
	}

//TIMESHEET
	@Test(enabled = false, priority = 1)
	public void mouseHover_Header_Apps_visibilityCheck_of_Timesheet() {
		String actual = hm.getValue_of_header_apps_timesheet();
		String expected = "Time Sheet";
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
			// Assert.assertEquals(actual, expected, "Expected: ===> " + expected + ", BUT
			// Actual: ===> " + actual);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Timesheet")
	public void verify_redirection_AND_LandingPageValue_Timesheet() {
		SoftAssert softAssert = new SoftAssert();
		try {
			// Assertion 1: Check the Landing Page Value
			String actualText = hm.get_LandingPageValue_Timesheet();
			String expectedText = "My TimeSheet";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			// Assertion 2: Check if the correct URL is loaded
			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/timesheet/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			// e.printStackTrace();
			throw e; // Ensure failure is reported to TestNG
		}
	}

// LEAVES
	@Test(enabled = false, priority = 2)
	public void mouseHover_Header_Apps_visibilityCheck_of_Leaves() {
		String actual = hm.getValue_of__header_apps_Leaves();
		String expected = "Leaves";
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
			// Assert.assertEquals(actual, expected, "Expected: ===> " + expected + ", BUT
			// Actual: ===> " + actual);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Leaves")
//  @Test(enabled=true)
	public void verify_redirection_AND_LandingPageValue_ApplyLeaves() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_Leaves_ApplyLeave();
			String expectedText = "Leave Application";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/leaves/apply/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Leaves")
//  @Test(enabled=true)
	public void verify_redirection_AND_LandingPageValue_MyLeaveHistory() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_Leaves_MyLeaveHistory();
			String expectedText = "My Leaves";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/leaves/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Leaves")
//@Test(enabled=true)
	public void verify_redirection_AND_LandingPageValue_ForMyApproval() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_Leaves_ForMyApproval();
			String expectedText = "Leave Applications";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/leaves/requests/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

// GROUP CHANGE
	@Test(enabled = false, priority = 3)
	public void mouseHover_Header_Apps_visibilityCheck_of_GroupChange() {
		String actual = hm.getValue_of__header_apps_GroupChange();
		String expected = "Group";
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_GroupChange")
//	@Test(enabled = false)
	public void verify_redirection_AND_LandingPageValue_GroupChange() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GroupChange();
			String expectedText = "GROUP CHANGE REQUEST";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/groupchange/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

// MY BILLS
	@Test(enabled = false, priority = 4)
	public void mouseHover_Header_Apps_visibilityCheck_of_MyBills() {
		String actual = hm.getValue_of__header_apps_MyBills();
		String expected = "My Bills";
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = false)
	public void verify_redirection_AND_LandingPageValue_MyBills_CreateNewRequest() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_CreateNewRequest();
			String expectedText = "Create Bill";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/createnew/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_MyBillsHistory() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_myBillsHistory();
			String expectedText = "My Bills History";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/createnew/billshistory/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_BuApproval() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_BuApproval();
			String expectedText = "BU APPROVALS";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/Buapprove/Buapprove/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_BuHistory() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_BuHistory();
			String expectedText = "BU HISTORY";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/Buapprove/Buhistory/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_Category() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_category();
			String expectedText = "Reimbursement Master";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/admin/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_DepartmentApproval() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_DepartmentApproval();
			String expectedText = "DEPARTMENT APPROVALS";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/deptapprove/Deptapprove/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_DepartmentHistory() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_DepartmentHistory();
			String expectedText = "DEPARTMENT HISTORY";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/deptapprove/Depthistory/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyBills_FinanceApproval() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_FinanceApproval();
			String expectedText = "FINANCE APPROVALS";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/finapproval/Finapproval/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyBills")
//	@Test(enabled = false)
	public void verify_redirection_AND_LandingPageValue_MyBills_FinanceHistory() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyBills_FinanceHistory();
			String expectedText = "FINANCE HISTORY";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/Reim/finapproval/Financehistory/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

// GOALS AND REVIEWS
	@Test(enabled = false, priority = 4)
	public void mouseHover_Header_Apps_visibilityCheck_of_GandR() {
		String actual = hm.getValue_of__header_apps_GandR();
		String expected = "Goals and Reviews";
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_GandR")
//	@Test(enabled = false)
	public void verify_redirection_AND_LandingPageValue_GandR_Initiation() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GandR_Initiation();
			String expectedText = "Initiate G&R";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/GandR/admin/initiate/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_GandR")
	// @Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_GandR_MyGoals() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GandR_MyGoals();
			String expectedText = "Current Year Goals";
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/GandR/employee/mygoals/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	 @Test(enabled = false, dependsOnMethods ="mouseHover_Header_Apps_visibilityCheck_of_GandR")
	//@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_GandR_RatingPending() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GandR_RatingPending_BeforeAfterInitiation();
			String expectedTextBefore = Constants.verify_redirection_AND_LandingPageValue_GandR_RatingPending_expectedTextBefore;
	        String expectedTextAfter = Constants.verify_redirection_AND_LandingPageValue_GandR_RatingPending_expectedTextAfter;
			if (actualText.equals(expectedTextBefore) || actualText.equals(expectedTextAfter)) {
	            softAssert.assertTrue(true, "Valid Page Text Found: " + actualText);
	        }else {
				 softAssert.fail("Unexpected page Text: " + actualText);
			}

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/GandR/rm/peruserreport/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}
	@Test(enabled = false, dependsOnMethods ="mouseHover_Header_Apps_visibilityCheck_of_GandR")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_GandR_AddCustomGoals() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GandR_AddCustomGoals();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_GandR_AddCustomGoals;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);
			

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/GandR/customgoals/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}
	
	@Test(enabled = false, priority = 5)
	public void mouseHover_Header_Apps_visibilityCheck_of_MyReferral() {
		String actual = hm.getValue_of__header_apps_MyReferral();
		String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_MyReferral;
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}
	//@Test(enabled = false, dependsOnMethods ="mouseHover_Header_Apps_visibilityCheck_of_MyReferral")
	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyReferral_ReferralProgram() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GandR_ReferralProgram();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_MyReferral_ReferralProgram;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);
			

//			String actualURL = driver.getCurrentUrl();
//			String expectedURL = prop.getProperty("HomepageURL") + "apps/referralProgram/employeeReferralProgram/";
//			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
//			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

}
