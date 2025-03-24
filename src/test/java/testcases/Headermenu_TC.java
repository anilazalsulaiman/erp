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
	@Test(enabled = false, priority = 5)
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

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_GandR")
	// @Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_GandR_RatingPending() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_GandR_RatingPending_BeforeAfterInitiation();
			String expectedTextBefore = Constants.verify_redirection_AND_LandingPageValue_GandR_RatingPending_expectedTextBefore;
			String expectedTextAfter = Constants.verify_redirection_AND_LandingPageValue_GandR_RatingPending_expectedTextAfter;
			if (actualText.equals(expectedTextBefore) || actualText.equals(expectedTextAfter)) {
				softAssert.assertTrue(true, "Valid Page Text Found: " + actualText);
			} else {
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

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_GandR")
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

	@Test(enabled = false, priority = 6)
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

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyReferral")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyReferral_ReferralProgram() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyReferral_ReferralProgram();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_MyReferral_ReferralProgram;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/referralProgram/employeeReferralProgram/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_MyReferral")
//		@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_MyReferral_ReferredList() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_MyReferral_ReferredList();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_MyReferral_ReferredList;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/referralProgram/referredResumes/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

//HELPDESK
	@Test(enabled = false, priority = 6)
	public void mouseHover_Header_Apps_visibilityCheck_of_Helpdesk() {
		String actual = hm.getValue_of__header_apps_Helpdesk();
		String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Helpdesk;
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Helpdesk")
	// @Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_Helpdesk() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_Helpdesk();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_Helpdesk;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/helpdesk/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

//EMS
	@Test(enabled = false, priority = 7)
	public void mouseHover_Header_Apps_visibilityCheck_of_EMS() {
		String actual = hm.getValue_of_header_apps_EMS();
		String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_EMS;
		try {
			Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
		} catch (AssertionError e) {
			System.out.println("Assertion Failed! " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//	 @Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_EMS_resignationList() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_EMS_resignationList();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_commonTable_value;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/resignationList/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//	 @Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_EMS_LwdRequestList() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_EMS_LwdRequestList();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_commonTable_value;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/lwdRequestList/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
	// @Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_EMS_RelievingClearance() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_EMS_RelievingClearance();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_commonTable_value;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/relievingclearance/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	 @Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//	@Test(enabled = true)
	public void verify_redirection_AND_LandingPageValue_EMS_LetterApproval() {
		SoftAssert softAssert = new SoftAssert();
		try {
			String actualText = hm.get_LandingPageValue_EMS_LetterApproval();
			String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_commonTable_value;
			softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/letterApproval/";
			softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
			softAssert.assertAll();
		} catch (AssertionError e) {
			System.err.println("Assertion Error: " + e.getMessage());
			throw e;
		}
	}

	 @Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_EMS_ClearanceAssignment() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_EMS_ClearanceAssignment();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_ClearanceAssignment;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/clearanceAssignment/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_EMS_ResignationbehalfEmp() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_EMS_ResignationbehalfEmp();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_ResignationbehalfEmp;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/resignationBehalfEmployee/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_EMS_Termination() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_EMS_Termination();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_Termination;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/terminationRequest/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_EMS_TerminationList() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_EMS_TerminationList();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_EMS_commonTable_value;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/terminationRequestList/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_EMS")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_EMS_Resignation() throws Exception {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_EMS_Resignation();
				String expectedText1 = Constants.verify_redirection_AND_LandingPageValue_EMS_Resignation_text1;
				String expectedText2 = Constants.verify_redirection_AND_LandingPageValue_EMS_Resignation_text2;
				String expectedText3 = Constants.verify_redirection_AND_LandingPageValue_EMS_Resignation_text3;
				
				if(actualText.equals(expectedText1) || actualText.equals(expectedText2) || actualText.equals(expectedText3)) {
					softAssert.assertTrue(true, "Valid Page Text Found: " + actualText);
				} else {
					softAssert.fail("Unexpected page Text: " + actualText);
				}

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/ems/resignation/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		
//USERS
		@Test(enabled = false, priority = 8)
		public void mouseHover_Header_Apps_visibilityCheck_of_Users() {
			String actual = hm.getValue_of_header_apps_Users();
			String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Users;
			try {
				Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
			} catch (AssertionError e) {
				System.out.println("Assertion Failed! " + e.getMessage());
				throw e;
			}
		}	
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Users")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_Users_UsersList() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_Users_UsersList();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_Users_UsersList;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/user/list/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}

// HIRING - HR ADMIN

		@Test(enabled = false, priority = 9)
		public void mouseHover_Header_Apps_visibilityCheck_of_HrAdmin() {
			String actual = hm.getValue_of_header_apps_HrAdmin();
			String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_HrAdmin;
			try {
				Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
			} catch (AssertionError e) {
				System.out.println("Assertion Failed! " + e.getMessage());
				throw e;
			}
		}
		
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_HrAdmin")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_HrAdmin_Jobs() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_HrAdmin_Jobs();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_HrAdmin_Jobs;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/hrAdminJobs/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_HrAdmin")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_HrAdmin_Candidates() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_HrAdmin_Candidates();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_HrAdmin_Candidates;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/allCandidatesList/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_HrAdmin")
//		@Test(enabled = true)
		public void verify_redirection_AND_LandingPageValue_HrAdmin_OfferApproval() {
			SoftAssert softAssert = new SoftAssert();
			try {
				String actualText = hm.get_LandingPageValue_HrAdmin_OfferApproval();
				String expectedText = Constants.verify_redirection_AND_LandingPageValue_HrAdmin_OfferApproval;
				softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

				String actualURL = driver.getCurrentUrl();
				String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/offerApprovalHr/";
				softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
				softAssert.assertAll();
			} catch (AssertionError e) {
				System.err.println("Assertion Error: " + e.getMessage());
				throw e;
			}
		}
		
		
// HIRING - HIRING

				@Test(enabled = false, priority = 10)
				public void mouseHover_Header_Apps_visibilityCheck_of_Hiring() {
					String actual = hm.getValue_of_header_apps_Hiring();
					String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Hiring;
					try {
						Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
					} catch (AssertionError e) {
						System.out.println("Assertion Failed! " + e.getMessage());
						throw e;
					}
				}
				
				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Hiring")
//				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_mg1() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Hiring_OfferApproval_mg1();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_common;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/offerApprovalMgt1/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}
				
				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Hiring")
//				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_mg2() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Hiring_OfferApproval_mg2();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_common;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/offerApprovalMgt2/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}
				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Hiring")
//				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_CDO() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Hiring_OfferApproval_cdo();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_common;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/offerApprovalCdo/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}
				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Hiring")
//				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Hiring_JobApproval() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Hiring_JobApproval();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Hiring_JobApproval;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/jobapproval/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}
	
		
// HIRING - RECRUITMENT

				@Test(enabled = false, priority = 11)
				public void mouseHover_Header_Apps_visibilityCheck_of_Recruitment() {
					String actual = hm.getValue_of_header_apps_Recruitment();
					String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Recruitment;
					try {
						Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
					} catch (AssertionError e) {
						System.out.println("Assertion Failed! " + e.getMessage());
						throw e;
					}
				}
				
				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Recruitment")
//				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Recruitment_Jobs() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Recruitment_Jobs();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Recruitment_Jobs;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/assignedJobs/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}	
				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Recruitment")
//				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Recruitment_MyCandidates() throws Exception {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Recruitment_MyCandidates();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Recruitment_MyCandidates;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);
						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/recruitment/myAllCandidates/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}	
		
// CV BANK
				@Test(enabled = true, priority = 12)
				public void mouseHover_Header_Apps_visibilityCheck_of_CvBank() {
					String actual = hm.getValue_of_header_apps_CvBank();
					String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_CvBank;
					try {
						Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
					} catch (AssertionError e) {
						System.out.println("Assertion Failed! " + e.getMessage());
						throw e;
					}
				}
				
//				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_CvBank")
				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_CvBank() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_CvBank();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_CvBank;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/cvBank/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}		

				// CV BANK
				@Test(enabled = true, priority = 13)
				public void mouseHover_Header_Apps_visibilityCheck_of_Onboarding() {
					String actual = hm.getValue_of_header_apps_Onboarding();
					String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Onboarding;
					try {
						Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
					} catch (AssertionError e) {
						System.out.println("Assertion Failed! " + e.getMessage());
						throw e;
					}
				}
				
//				@Test(enabled = false, dependsOnMethods = "mouseHover_Header_Apps_visibilityCheck_of_Onboarding")
				@Test(enabled = true)
				public void verify_redirection_AND_LandingPageValue_Onboarding() {
					SoftAssert softAssert = new SoftAssert();
					try {
						String actualText = hm.get_LandingPageValue_Onboarding();
						String expectedText = Constants.verify_redirection_AND_LandingPageValue_Onboarding;
						softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

						String actualURL = driver.getCurrentUrl();
						String expectedURL = prop.getProperty("HomepageURL") + "apps/onboarding/";
						softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
						softAssert.assertAll();
					} catch (AssertionError e) {
						System.err.println("Assertion Error: " + e.getMessage());
						throw e;
					}
				}		
		
		
}

