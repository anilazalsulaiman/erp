package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.SkipException;

import base.BaseClass;
import constants.Constants;
import pageObjects.header.Headermenus_PG;
import pageObjects.loginPage.LoginPage_PG;
import utils.ExcelReadUtils;
import utils.GeneralUtilities;

public class Headermenu_TC extends BaseClass {
    LoginPage_PG lp;
    Headermenus_PG hm;
    
    // Flags to track test status for each group
    private static boolean timesheetMainPassed = false;
    private static boolean leavesMainPassed = false;
    private static boolean groupChangeMainPassed = false;
    private static boolean myBillsMainPassed = false;
    private static boolean gandRMainPassed = false;
    private static boolean myReferralMainPassed = false;
    private static boolean helpdeskMainPassed = false;
    private static boolean emsMainPassed = false;
    private static boolean usersMainPassed = false;
    private static boolean hrAdminMainPassed = false;
    private static boolean hiringMainPassed = false;
    private static boolean recruitmentMainPassed = false;
    private static boolean cvBankMainPassed = false;
    private static boolean onboardingMainPassed = false;
    private static boolean travelMainPassed = false;
    private static boolean assetMainPassed = false;
    private static boolean landDMainPassed = false;
    private static boolean managerFBMainPassed = false;

    @BeforeMethod
    public void perform_loginFor_QAaccount_allAccess() throws IOException {
        lp = new LoginPage_PG(driver);
        lp.perform_login(ExcelReadUtils.readStringData(2, 2, "sheet1"), ExcelReadUtils.readStringData(2, 3, "sheet1"));
        lp.visibility_ofElement_in_Dashboard();
        hm = new Headermenus_PG(driver);
    }

    // TIMESHEET
    @Test(priority = 1)
    public void mouseHover_Header_Apps_visibilityCheck_of_Timesheet() {
        try {
            String actual = hm.getValue_of_header_apps_timesheet();
            String expected = "Time Sheet";
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            timesheetMainPassed = true;
        } catch (AssertionError e) {
            timesheetMainPassed = false;
            System.out.println("Timesheet main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 2)
    public void verify_redirection_AND_LandingPageValue_Timesheet() {
        if (!timesheetMainPassed) {
            throw new SkipException("Skipping because Timesheet main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Timesheet();
            String expectedText = "My TimeSheet";
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/timesheet/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    // LEAVES
    @Test(priority = 3)
    public void mouseHover_Header_Apps_visibilityCheck_of_Leaves() {
        try {
            String actual = hm.getValue_of__header_apps_Leaves();
            String expected = "Leaves";
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            leavesMainPassed = true;
        } catch (AssertionError e) {
            leavesMainPassed = false;
            System.out.println("Leaves main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 4)
    public void verify_redirection_AND_LandingPageValue_ApplyLeaves() {
        if (!leavesMainPassed) {
            throw new SkipException("Skipping because Leaves main test failed");
        }
        
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

    @Test(priority = 5)
    public void verify_redirection_AND_LandingPageValue_MyLeaveHistory() {
        if (!leavesMainPassed) {
            throw new SkipException("Skipping because Leaves main test failed");
        }
        
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

    @Test(priority = 6)
    public void verify_redirection_AND_LandingPageValue_ForMyApproval() {
        if (!leavesMainPassed) {
            throw new SkipException("Skipping because Leaves main test failed");
        }
        
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
    @Test(priority = 7)
    public void mouseHover_Header_Apps_visibilityCheck_of_GroupChange() {
        try {
            String actual = hm.getValue_of__header_apps_GroupChange();
            String expected = "Group";
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            groupChangeMainPassed = true;
        } catch (AssertionError e) {
            groupChangeMainPassed = false;
            System.out.println("Group Change main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 8)
    public void verify_redirection_AND_LandingPageValue_GroupChange() {
        if (!groupChangeMainPassed) {
            throw new SkipException("Skipping because Group Change main test failed");
        }
        
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
    @Test(priority = 9)
    public void mouseHover_Header_Apps_visibilityCheck_of_MyBills() {
        try {
            String actual = hm.getValue_of__header_apps_MyBills();
            String expected = "My Bills";
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            myBillsMainPassed = true;
        } catch (AssertionError e) {
            myBillsMainPassed = false;
            System.out.println("My Bills main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 10)
    public void verify_redirection_AND_LandingPageValue_MyBills_CreateNewRequest() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 11)
    public void verify_redirection_AND_LandingPageValue_MyBills_MyBillsHistory() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 12)
    public void verify_redirection_AND_LandingPageValue_MyBills_BuApproval() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 13)
    public void verify_redirection_AND_LandingPageValue_MyBills_BuHistory() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 14)
    public void verify_redirection_AND_LandingPageValue_MyBills_Category() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 15)
    public void verify_redirection_AND_LandingPageValue_MyBills_DepartmentApproval() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 16)
    public void verify_redirection_AND_LandingPageValue_MyBills_DepartmentHistory() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 17)
    public void verify_redirection_AND_LandingPageValue_MyBills_FinanceApproval() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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

    @Test(priority = 18)
    public void verify_redirection_AND_LandingPageValue_MyBills_FinanceHistory() {
        if (!myBillsMainPassed) {
            throw new SkipException("Skipping because My Bills main test failed");
        }
        
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
    @Test(priority = 19)
    public void mouseHover_Header_Apps_visibilityCheck_of_GandR() {
        try {
            String actual = hm.getValue_of__header_apps_GandR();
            String expected = "Goals and Reviews";
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            gandRMainPassed = true;
        } catch (AssertionError e) {
            gandRMainPassed = false;
            System.out.println("Goals and Reviews main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 20)
    public void verify_redirection_AND_LandingPageValue_GandR_Initiation() {
        if (!gandRMainPassed) {
            throw new SkipException("Skipping because Goals and Reviews main test failed");
        }
        
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

    @Test(priority = 21)
    public void verify_redirection_AND_LandingPageValue_GandR_MyGoals() {
        if (!gandRMainPassed) {
            throw new SkipException("Skipping because Goals and Reviews main test failed");
        }
        
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

    @Test(priority = 22)
    public void verify_redirection_AND_LandingPageValue_GandR_RatingPending() {
        if (!gandRMainPassed) {
            throw new SkipException("Skipping because Goals and Reviews main test failed");
        }
        
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

    @Test(priority = 23)
    public void verify_redirection_AND_LandingPageValue_GandR_AddCustomGoals() {
        if (!gandRMainPassed) {
            throw new SkipException("Skipping because Goals and Reviews main test failed");
        }
        
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

    // MY REFERRAL
    @Test(priority = 24)
    public void mouseHover_Header_Apps_visibilityCheck_of_MyReferral() {
        try {
            String actual = hm.getValue_of__header_apps_MyReferral();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_MyReferral;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            myReferralMainPassed = true;
        } catch (AssertionError e) {
            myReferralMainPassed = false;
            System.out.println("My Referral main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 25)
    public void verify_redirection_AND_LandingPageValue_MyReferral_ReferralProgram() {
        if (!myReferralMainPassed) {
            throw new SkipException("Skipping because My Referral main test failed");
        }
        
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

    @Test(priority = 26)
    public void verify_redirection_AND_LandingPageValue_MyReferral_ReferredList() {
        if (!myReferralMainPassed) {
            throw new SkipException("Skipping because My Referral main test failed");
        }
        
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

    // HELPDESK
    @Test(priority = 27)
    public void mouseHover_Header_Apps_visibilityCheck_of_Helpdesk() {
        try {
            String actual = hm.getValue_of__header_apps_Helpdesk();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Helpdesk;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            helpdeskMainPassed = true;
        } catch (AssertionError e) {
            helpdeskMainPassed = false;
            System.out.println("Helpdesk main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 28)
    public void verify_redirection_AND_LandingPageValue_Helpdesk() {
        if (!helpdeskMainPassed) {
            throw new SkipException("Skipping because Helpdesk main test failed");
        }
        
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

    // EMS
    @Test(priority = 29)
    public void mouseHover_Header_Apps_visibilityCheck_of_EMS() {
        try {
            String actual = hm.getValue_of_header_apps_EMS();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_EMS;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            emsMainPassed = true;
        } catch (AssertionError e) {
            emsMainPassed = false;
            System.out.println("EMS main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 30)
    public void verify_redirection_AND_LandingPageValue_EMS_resignationList() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 31)
    public void verify_redirection_AND_LandingPageValue_EMS_LwdRequestList() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 32)
    public void verify_redirection_AND_LandingPageValue_EMS_RelievingClearance() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 33)
    public void verify_redirection_AND_LandingPageValue_EMS_LetterApproval() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 34)
    public void verify_redirection_AND_LandingPageValue_EMS_ClearanceAssignment() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 35)
    public void verify_redirection_AND_LandingPageValue_EMS_ResignationbehalfEmp() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 36)
    public void verify_redirection_AND_LandingPageValue_EMS_Termination() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 37)
    public void verify_redirection_AND_LandingPageValue_EMS_TerminationList() {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    @Test(priority = 38)
    public void verify_redirection_AND_LandingPageValue_EMS_Resignation() throws Exception {
        if (!emsMainPassed) {
            throw new SkipException("Skipping because EMS main test failed");
        }
        
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

    // USERS
    @Test(priority = 39)
    public void mouseHover_Header_Apps_visibilityCheck_of_Users() {
        try {
            String actual = hm.getValue_of_header_apps_Users();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Users;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            usersMainPassed = true;
        } catch (AssertionError e) {
            usersMainPassed = false;
            System.out.println("Users main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 40)
    public void verify_redirection_AND_LandingPageValue_Users_UsersList() {
        if (!usersMainPassed) {
            throw new SkipException("Skipping because Users main test failed");
        }
        
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
    @Test(priority = 41)
    public void mouseHover_Header_Apps_visibilityCheck_of_HrAdmin() {
        try {
            String actual = hm.getValue_of_header_apps_HrAdmin();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_HrAdmin;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            hrAdminMainPassed = true;
        } catch (AssertionError e) {
            hrAdminMainPassed = false;
            System.out.println("HR Admin main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 42)
    public void verify_redirection_AND_LandingPageValue_HrAdmin_Jobs() {
        if (!hrAdminMainPassed) {
            throw new SkipException("Skipping because HR Admin main test failed");
        }
        
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

    @Test(priority = 43)
    public void verify_redirection_AND_LandingPageValue_HrAdmin_Candidates() {
        if (!hrAdminMainPassed) {
            throw new SkipException("Skipping because HR Admin main test failed");
        }
        
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

    @Test(priority = 44)
    public void verify_redirection_AND_LandingPageValue_HrAdmin_OfferApproval() {
        if (!hrAdminMainPassed) {
            throw new SkipException("Skipping because HR Admin main test failed");
        }
        
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
    @Test(priority = 45)
    public void mouseHover_Header_Apps_visibilityCheck_of_Hiring() {
        try {
            String actual = hm.getValue_of_header_apps_Hiring();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Hiring;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            hiringMainPassed = true;
        } catch (AssertionError e) {
            hiringMainPassed = false;
            System.out.println("Hiring main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 46)
    public void verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_mg1() {
        if (!hiringMainPassed) {
            throw new SkipException("Skipping because Hiring main test failed");
        }
        
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

    @Test(priority = 47)
    public void verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_mg2() {
        if (!hiringMainPassed) {
            throw new SkipException("Skipping because Hiring main test failed");
        }
        
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

    @Test(priority = 48)
    public void verify_redirection_AND_LandingPageValue_Hiring_OfferApproval_CDO() {
        if (!hiringMainPassed) {
            throw new SkipException("Skipping because Hiring main test failed");
        }
        
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

    @Test(priority = 49)
    public void verify_redirection_AND_LandingPageValue_Hiring_JobApproval() {
        if (!hiringMainPassed) {
            throw new SkipException("Skipping because Hiring main test failed");
        }
        
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
    @Test(priority = 50)
    public void mouseHover_Header_Apps_visibilityCheck_of_Recruitment() {
        try {
            String actual = hm.getValue_of_header_apps_Recruitment();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Recruitment;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            recruitmentMainPassed = true;
        } catch (AssertionError e) {
            recruitmentMainPassed = false;
            System.out.println("Recruitment main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 51)
    public void verify_redirection_AND_LandingPageValue_Recruitment_Jobs() {
        if (!recruitmentMainPassed) {
            throw new SkipException("Skipping because Recruitment main test failed");
        }
        
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

    @Test(priority = 52)
    public void verify_redirection_AND_LandingPageValue_Recruitment_MyCandidates() throws Exception {
        if (!recruitmentMainPassed) {
            throw new SkipException("Skipping because Recruitment main test failed");
        }
        
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
    @Test(priority = 53)
    public void mouseHover_Header_Apps_visibilityCheck_of_CvBank() {
        try {
            String actual = hm.getValue_of_header_apps_CvBank();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_CvBank;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            cvBankMainPassed = true;
        } catch (AssertionError e) {
            cvBankMainPassed = false;
            System.out.println("CV Bank main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 54)
    public void verify_redirection_AND_LandingPageValue_CvBank() {
        if (!cvBankMainPassed) {
            throw new SkipException("Skipping because CV Bank main test failed");
        }
        
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

    // ONBOARDING
    @Test(priority = 55)
    public void mouseHover_Header_Apps_visibilityCheck_of_Onboarding() {
        try {
            String actual = hm.getValue_of_header_apps_Onboarding();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Onboarding;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            onboardingMainPassed = true;
        } catch (AssertionError e) {
            onboardingMainPassed = false;
            System.out.println("Onboarding main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 56)
    public void verify_redirection_AND_LandingPageValue_Onboarding() {
        if (!onboardingMainPassed) {
            throw new SkipException("Skipping because Onboarding main test failed");
        }
        
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

    // TRAVEL
    @Test(priority = 57)
    public void mouseHover_Header_Apps_visibilityCheck_of_Travel() {
        try {
            String actual = hm.getValue_of_header_apps_Travel();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Travel;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            travelMainPassed = true;
        } catch (AssertionError e) {
            travelMainPassed = false;
            System.out.println("Travel main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 58)
    public void verify_redirection_AND_LandingPageValue_Travel_Createrequest_Travel() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_Createrequest_Travel();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_Createrequest_Travel;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/createTravelReservation/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 59)
    public void verify_redirection_AND_LandingPageValue_Travel_Createrequest_Accomodation() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_Createrequest_Accomodation();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_Createrequest_Accomodation;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/accommodation/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 60)
    public void verify_redirection_AND_LandingPageValue_Travel_Createrequest_TravelAndAccomodation() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_Createrequest_TravelAndAccomodation();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_Createrequest_TravelAndAccomodation;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/createTravelandAccommodation/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 61)
    public void verify_redirection_AND_LandingPageValue_Travel_Myrequests() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_MyRequests();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_commonTable_value;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/myrequests/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 62)
    public void verify_redirection_AND_LandingPageValue_Travel_ForMyApproval() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_ForMyApproval();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_commonTable_value;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/myapproval/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 63)
    public void verify_redirection_AND_LandingPageValue_Travel_FlightApprovalList() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_FlightApprovalList();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_commonTable_value;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/airticket_approval/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 64)
    public void verify_redirection_AND_LandingPageValue_Travel_TravelBookingList() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_TravelBookingList();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_commonTable_value;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/travelbooking/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 65)
    public void verify_redirection_AND_LandingPageValue_Travel_AccommodationBooking() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_AccomodationBooking();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_AccommodationBookingList;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/accommodationbookinglist/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 66)
    public void verify_redirection_AND_LandingPageValue_Travel_MasterLocation() {
        if (!travelMainPassed) {
            throw new SkipException("Skipping because Travel main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_travel_MasterLocation();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Travel_MasterLocation;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/travel/masterlocation/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    // ASSET
    @Test(priority = 67)
    public void mouseHover_Header_Apps_visibilityCheck_of_Asset() {
        try {
            String actual = hm.getValue_of_header_apps_Asset();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_Asset;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            assetMainPassed = true;
        } catch (AssertionError e) {
            assetMainPassed = false;
            System.out.println("Asset main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 68)
    public void verify_redirection_AND_LandingPageValue_Asset_ItBuApproval() {
        if (!assetMainPassed) {
            throw new SkipException("Skipping because Asset main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Asset_ItBuApproval();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Asset_ItBuApproval;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/asset/assetapproval/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 69)
    public void verify_redirection_AND_LandingPageValue_Asset_Assetprocurement() {
        if (!assetMainPassed) {
            throw new SkipException("Skipping because Asset main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Asset_Assetprocurement();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Asset_Assetprocurement;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/asset/assetproc/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 70)
    public void verify_redirection_AND_LandingPageValue_Asset_AssetNumberAllocation() {
        if (!assetMainPassed) {
            throw new SkipException("Skipping because Asset main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Asset_AssetNumberAllocation();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Asset_AssetNumberAllocation;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/asset/noallocation/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 71)
    public void verify_redirection_AND_LandingPageValue_Asset_AllocationRequest() {
        if (!assetMainPassed) {
            throw new SkipException("Skipping because Asset main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Asset_AllocationRequest();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Asset_AllocationRequest;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/asset/ticket/ticketraise/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 72)
    public void verify_redirection_AND_LandingPageValue_Asset_ReturnAsset() {
        if (!assetMainPassed) {
            throw new SkipException("Skipping because Asset main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Asset_ReturnAsset();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Asset_ReturnAsset;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/asset/ticket/assetreturn/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 73)
    public void verify_redirection_AND_LandingPageValue_Asset_ReplaceAsset() {
        if (!assetMainPassed) {
            throw new SkipException("Skipping because Asset main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_Asset_ReplaceAsset();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_Asset_ReplaceAsset;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/asset/ticket/assetreplace/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    // L & D
    @Test(priority = 74)
    public void mouseHover_Header_Apps_visibilityCheck_of_LandD() {
        try {
            String actual = hm.getValue_of_header_apps_landD();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_LandD;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            landDMainPassed = true;
        } catch (AssertionError e) {
            landDMainPassed = false;
            System.out.println("L&D main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 75)
    public void verify_redirection_AND_LandingPageValue_LandD_QuestionSetup() {
        if (!landDMainPassed) {
            throw new SkipException("Skipping because L&D main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_landD_QuestionSetup();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_LandD_QuestionSetup;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/LandD/question/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 76)
    public void verify_redirection_AND_LandingPageValue_LandD_AllocationAndEvaluation() {
        if (!landDMainPassed) {
            throw new SkipException("Skipping because L&D main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_landD_AllocationAndEvaluation();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_LandD_AllocationAndEvaluation;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/LandD/allocation/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 77)
    public void verify_redirection_AND_LandingPageValue_LandD_Reports() {
        if (!landDMainPassed) {
            throw new SkipException("Skipping because L&D main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_landD_Reports();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_LandD_Reports;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String actualURL = driver.getCurrentUrl();
            String expectedURL = prop.getProperty("HomepageURL") + "apps/LandD/reports/";
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    // MANAGER FB
    @Test(priority = 78)
    public void mouseHover_Header_Apps_visibilityCheck_of_ManagerFB() {
        try {
            String actual = hm.getValue_of_header_apps_ManagerFB();
            String expected = Constants.mouseHover_Header_Apps_visibilityCheck_of_ManagerFB;
            Assert.assertEquals(actual, expected, Constants.assert_ErrorMessage);
            managerFBMainPassed = true;
        } catch (AssertionError e) {
            managerFBMainPassed = false;
            System.out.println("Manager FB main test failed: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 79)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_Admin() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_Admin();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_Admin;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/admin/admincrtpage/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 80)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_AdminView() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_AdminView();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_AdminView;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/admin/adminview/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 81)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_RmPage() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_RmPage();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_RmPage;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/rmpage/rmpageview/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 82)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_ManagementView() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_ManagementView();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_ManagementView;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/mngmntpage/rmmanagement/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 83)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_HrHeadView() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_HrHeadView();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_HrHeadView;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/hrheadpage/hrheadview/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 84)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_EmployeeFeedback() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_EmployeeFeedback();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_EmployeeFeedback;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/userpage/rmuserresponse/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }

    @Test(priority = 85)
    public void verify_redirection_AND_LandingPageValue_ManagerFB_BuPage() {
        if (!managerFBMainPassed) {
            throw new SkipException("Skipping because Manager FB main test failed");
        }
        
        SoftAssert softAssert = new SoftAssert();
        try {
            String actualText = hm.get_LandingPageValue_ManagerFB_BuPage();
            String expectedText = Constants.verify_redirection_AND_LandingPageValue_ManagerFB_BuPage;
            softAssert.assertEquals(actualText, expectedText, Constants.assert_ErrorMessage);

            String expectedURL = prop.getProperty("HomepageURL") + "apps/rmreviewparent/bupage/rmreviewbupage/";
            GeneralUtilities.waitForUrl(driver, expectedURL, 10);
            String actualURL = driver.getCurrentUrl();
            softAssert.assertEquals(actualURL, expectedURL, Constants.assert_URL_Match_ErrorMessage);
            softAssert.assertAll();
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }
}