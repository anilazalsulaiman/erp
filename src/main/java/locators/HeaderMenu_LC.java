package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderMenu_LC {

	public HeaderMenu_LC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(css = ":nth-child(2) > :nth-child(1) > .css-mukiy0 > .css-1y19ivf")public WebElement hover_apps;
	@FindBy(xpath = "//p[normalize-space()='Apps']")
	public WebElement hover_apps;
	
//TIMESHEET
	@FindBy(xpath = "//a[@href='/apps/timesheet/'][1]")
	public WebElement click_apps_timesheet;

	@FindBy(xpath = "//h5[normalize-space()='My TimeSheet']")
	public WebElement assert_TimesheetPage_title;
//LEAVE
	@FindBy(xpath = "(//p[normalize-space()='Leaves'])[1]")
	public WebElement hover_apps_Leaves;

	// APPLY LEAVE
	@FindBy(xpath = "//a[@href='/apps/leaves/apply/']")
	public WebElement click_apps_Leaves_ApplyLeave;
	@FindBy(xpath = "//h6[normalize-space()='Leave Application']")
	public WebElement assert_ApplyLeave_Page_title;

	// MY LEAVE HISTORY
	@FindBy(xpath = "//a[@href='/apps/leaves/']")
	public WebElement click_apps_Leaves_MyLeaveHistory;
	@FindBy(xpath = "//h5[normalize-space()='My Leaves']")
	public WebElement assert_MyleaveHistory_Page_title;

	// FOR MY APPROVAL
	@FindBy(xpath = "(//a[@href='/apps/leaves/requests/'])[1]")
	public WebElement click_apps_Leaves_ForMyApproval;
	@FindBy(xpath = "//h5[normalize-space()='Leave Applications']")
	public WebElement assert_ForMyApproval_Page_title;

//GROUP CHANGE
	@FindBy(xpath = "//a[@href='/apps/groupchange/']")
	public WebElement click_apps_groupchange;
	@FindBy(xpath = "//button[normalize-space()='Group Change Request']")
	public WebElement assert_groupchange_Page_title;

//MY BILLS
	@FindBy(xpath = "(//p[normalize-space()='My Bills'])[1]")
	public WebElement hover_apps_mybills;

	// CREATE NEW REQUEST
	@FindBy(xpath = "//a[@href='/apps/Reim/createnew/']")
	public WebElement click_apps_mybills_CreateNewRequest;
	@FindBy(xpath = "//span[normalize-space()='Create Bill']")
	public WebElement assert_createNewRequest_Page_title;

	// MY BILLS HISTORY
	@FindBy(xpath = "//a[@href='/apps/Reim/createnew/billshistory/']")
	public WebElement click_apps_mybills_MyBillsHistory;
	@FindBy(xpath = "//span[normalize-space()='My Bills History']")
	public WebElement assert_MyBillsHistory_Page_title;

	// BU APPROVAL
	@FindBy(xpath = "//a[@href='/apps/Reim/Buapprove/Buapprove/']")
	public WebElement click_apps_mybills_BuApproval;
	@FindBy(xpath = "//span[normalize-space()='BU APPROVALS']")
	public WebElement assert_BuApproval_Page_title;

	// BU HISTORY
	@FindBy(xpath = "//a[@href='/apps/Reim/Buapprove/Buhistory/']")
	public WebElement click_apps_mybills_BuHistory;
	@FindBy(xpath = "//span[normalize-space()='BU HISTORY']")
	public WebElement assert_BuHistory_Page_title;

	// CATEGORY
	@FindBy(xpath = "//a[@href='/apps/Reim/admin/']")
	public WebElement click_apps_mybills_Category;
	@FindBy(xpath = "//span[normalize-space()='Reimbursement Master']")
	public WebElement assert_Category_Page_title;

	// DEPT APPROVAL
	@FindBy(xpath = "//a[@href='/apps/Reim/deptapprove/Deptapprove/']")
	public WebElement click_apps_mybills_DeptApproval;
	@FindBy(xpath = "//span[normalize-space()='DEPARTMENT APPROVALS']")
	public WebElement assert_DeptApproval_Page_title;

	// DEPT HISTORY
	@FindBy(xpath = "//a[@href='/apps/Reim/deptapprove/Depthistory/']")
	public WebElement click_apps_mybills_DeptHistory;
	@FindBy(xpath = "//span[normalize-space()='DEPARTMENT HISTORY']")
	public WebElement assert_DeptHistory_Page_title;

	// FIN APPROVAL
	@FindBy(xpath = "//a[@href='/apps/Reim/finapproval/Finapproval/']")
	public WebElement click_apps_mybills_Finapproval;
	@FindBy(xpath = "//span[normalize-space()='FINANCE APPROVALS']")
	public WebElement assert_Finapproval_Page_title;

	// FIN HISTORY
	@FindBy(xpath = "//a[@href='/apps/Reim/finapproval/Financehistory/']")
	public WebElement click_apps_mybills_FinHistory;
	@FindBy(xpath = "//span[normalize-space()='FINANCE HISTORY']")
	public WebElement assert_FinHistory_Page_title;

//MY BILLS
	@FindBy(xpath = "(//p[normalize-space()='Goals and Reviews'])[1]")
	public WebElement hover_apps_GandR;

	// INITIATION
	@FindBy(xpath = "//a[@href='/apps/GandR/admin/initiate/']")
	public WebElement click_apps_GandR_initiation;
	@FindBy(xpath = "//h6[normalize-space()='Initiate G&R']")
	public WebElement assert_GandR_initiation_Page_title;

	// MY GOALS
	@FindBy(xpath = "//a[@href='/apps/GandR/employee/mygoals/']")
	public WebElement click_apps_GandR_MyGoals;
	@FindBy(xpath = "//strong[normalize-space()='Current Year Goals']")
	public WebElement assert_GandR_MyGoals_Page_title;
	
	// RATING PENDING
	@FindBy(xpath = "//a[@href='/apps/GandR/rm/peruserreport/']")
	public WebElement click_apps_GandR_RatingPending;
	@FindBy(xpath = "//h6[normalize-space()='No Pending Lists Available']")
	public WebElement assert_GandR_RatingPending_Page_title_BeforeInitiation;
	@FindBy(xpath = "//div[normalize-space()='SUBMIT YOUR RATINGS FOR THIS YEAR']")
	public WebElement assert_GandR_RatingPending_Page_title__AfterInitiation;
	

	// ADD CUSTOM GOALS
	@FindBy(xpath = "//a[@href='/apps/GandR/customgoals/']")
	public WebElement click_apps_GandR_AddCustomGoals;
	@FindBy(xpath = "//div[@aria-label='Employee ID']")
	public WebElement assert_GandR_AddCustomGoals_Page_title;
	
//MY REFERRAL
		@FindBy(xpath = "(//p[normalize-space()='My Referral'])[1]")
		public WebElement hover_apps_myreferral;
		
		// ADD CUSTOM GOALS
		@FindBy(xpath = "//a[@href='/apps/referralProgram/employeeReferralProgram/']")
		public WebElement click_apps_MyReferral_ReferralProgram;
		@FindBy(xpath = "//h4[normalize-space()='Employee Referral Program']")
		public WebElement assert_MyReferral_ReferralProgram_Page_title;
}
