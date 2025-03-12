package pageObjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locators.HeaderMenu_LC;
import locators.LoginPage_LC;
import utils.GeneralUtilities;

public class Headermenus_PG {
	private WebDriver driver;
	private GeneralUtilities gu;
	private HeaderMenu_LC locators;

	public Headermenus_PG(WebDriver driver) {
		this.driver = driver;
		this.gu = new GeneralUtilities();
		this.locators = new HeaderMenu_LC(driver);
		PageFactory.initElements(driver, this);
	}

	public boolean isHeaderAppVisible() {
		return gu.isElementVisible(driver, locators.hover_apps);
	}

	public void mouseHover_header_apps() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	// TIMESHEET
	public String getValue_of_header_apps_timesheet() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			return gu.getElementText(locators.click_apps_timesheet);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_Timesheet() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.click_apps_timesheet);
			return gu.getElementText(locators.assert_TimesheetPage_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	// LEAVES
	public String getValue_of__header_apps_Leaves() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			return gu.getElementText(locators.hover_apps_Leaves);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_Leaves_ApplyLeave() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_Leaves);
			gu.element_Click(locators.click_apps_Leaves_ApplyLeave);
			return gu.getElementText(locators.assert_ApplyLeave_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_Leaves_MyLeaveHistory() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_Leaves);
			gu.element_Click(locators.click_apps_Leaves_MyLeaveHistory);
			return gu.getElementText(locators.assert_MyleaveHistory_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_Leaves_ForMyApproval() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_Leaves);
			gu.element_Click(locators.click_apps_Leaves_ForMyApproval);
			return gu.getElementText(locators.assert_ForMyApproval_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

// GROUP CHANGE
	public String getValue_of__header_apps_GroupChange() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			return gu.getElementText(locators.click_apps_groupchange);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_GroupChange() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.click_apps_groupchange);
			return gu.getElementText(locators.assert_groupchange_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

// MY BILLS
	public String getValue_of__header_apps_MyBills() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			return gu.getElementText(locators.hover_apps_mybills);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_CreateNewRequest() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_CreateNewRequest);
			return gu.getElementText(locators.assert_createNewRequest_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_myBillsHistory() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_MyBillsHistory);
			return gu.getElementText(locators.assert_MyBillsHistory_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_BuApproval() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_BuApproval);
			return gu.getElementText(locators.assert_BuApproval_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_BuHistory() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_BuHistory);
			return gu.getElementText(locators.assert_BuHistory_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_category() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_Category);
			return gu.getElementText(locators.assert_Category_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_DepartmentApproval() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_DeptApproval);
			return gu.getElementText(locators.assert_DeptApproval_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_DepartmentHistory() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_DeptHistory);
			return gu.getElementText(locators.assert_DeptHistory_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_FinanceApproval() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_Finapproval);
			return gu.getElementText(locators.assert_Finapproval_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_MyBills_FinanceHistory() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_mybills);
			gu.element_Click(locators.click_apps_mybills_FinHistory);
			return gu.getElementText(locators.assert_FinHistory_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

//GOALS & REVIEWS
	public String getValue_of__header_apps_GandR() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			return gu.getElementText(locators.hover_apps_GandR);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_GandR_Initiation() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_GandR);
			gu.element_Click(locators.click_apps_GandR_initiation);
			return gu.getElementText(locators.assert_GandR_initiation_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_GandR_MyGoals() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_GandR);
			gu.element_Click(locators.click_apps_GandR_MyGoals);
			return gu.getElementText(locators.assert_GandR_MyGoals_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}

	public String get_LandingPageValue_GandR_RatingPending_BeforeAfterInitiation() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_GandR);
			gu.element_Click(locators.click_apps_GandR_RatingPending);
			if (gu.isElementVisible(driver, locators.assert_GandR_RatingPending_Page_title_BeforeInitiation)) {
				return gu.getElementText(locators.assert_GandR_RatingPending_Page_title_BeforeInitiation);
			} else if (gu.isElementVisible(driver, locators.assert_GandR_RatingPending_Page_title__AfterInitiation)) {
				return gu.getElementText(locators.assert_GandR_RatingPending_Page_title__AfterInitiation);
			} else {
				return "UNKNOWN";
			}
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}
	
	public String get_LandingPageValue_GandR_AddCustomGoals() {
		try {
			isHeaderAppVisible();
			gu.mousehower(driver, locators.hover_apps);
			gu.element_Click(locators.hover_apps_GandR);
			gu.element_Click(locators.click_apps_GandR_AddCustomGoals);
			return gu.getElementText(locators.assert_GandR_AddCustomGoals_Page_title);
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			throw e;
		}
	}
	
//MY REFERRAL
		public String getValue_of__header_apps_MyReferral() {
			try {
				isHeaderAppVisible();
				gu.mousehower(driver, locators.hover_apps);
				return gu.getElementText(locators.hover_apps_myreferral);
			} catch (Exception e) {
				System.err.println("Failed: " + e.getMessage());
				throw e;
			}
		}
		public String get_LandingPageValue_GandR_ReferralProgram() {
			try {
				isHeaderAppVisible();
				gu.mousehower(driver, locators.hover_apps);
				gu.element_Click(locators.hover_apps_myreferral);
				gu.element_Click(locators.click_apps_MyReferral_ReferralProgram);
				gu.visibility_wait_utility(driver, locators.assert_MyReferral_ReferralProgram_Page_title);				
				return gu.getElementText(locators.assert_MyReferral_ReferralProgram_Page_title);
			} catch (Exception e) {
				System.err.println("Failed: " + e.getMessage());
				throw e;
			}
		}

}
