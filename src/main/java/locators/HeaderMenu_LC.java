package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderMenu_LC {

	public HeaderMenu_LC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//APPS
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

//G&R
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

	// REFERRAL PROGRAM
	@FindBy(xpath = "//a[@href='/apps/referralProgram/employeeReferralProgram/']")
	public WebElement click_apps_MyReferral_ReferralProgram;
	@FindBy(xpath = "//h4[normalize-space()='Employee Referral Program']")
	public WebElement assert_MyReferral_ReferralProgram_Page_title;

	// REFERRED LIST
	@FindBy(xpath = "//a[@href='/apps/referralProgram/referredResumes/']")
	public WebElement click_apps_MyReferral_ReferredList;
	@FindBy(xpath = "//h5[normalize-space()='Referred Resumes']")
	public WebElement assert_MyReferral_ReferredList_Page_title;

//HELPDESK
	@FindBy(xpath = "(//p[normalize-space()='Help Desk'])[1]")
	public WebElement hover_apps_Helpdesk;
	@FindBy(xpath = "//button[normalize-space()='Raise New Ticket']")
	public WebElement assert_Helpdesk_Page_title;

//EMS
	@FindBy(xpath = "(//p[normalize-space()='EMS'])[1]")
	public WebElement hover_apps_EMS;
	@FindBy(xpath = "//div[@aria-label='EMP ID']")
	public WebElement assert_EMS_CommonTableValue_Page_title;

	// RESIGNATION LIST
	@FindBy(xpath = "//a[@href='/apps/ems/resignationList/']")
	public WebElement click_apps_EMS_resignationList;

	// LWD REQUEST LIST
	@FindBy(xpath = "//a[@href='/apps/ems/lwdRequestList/']")
	public WebElement click_apps_EMS_LwdRequestList;

	// RELIEVING CLEARANCE
	@FindBy(xpath = "//a[@href='/apps/ems/relievingclearance/']")
	public WebElement click_apps_EMS_Relievingclearance;

	// LETTER APPROVAL
	@FindBy(xpath = "//a[@href='/apps/ems/letterApproval/']")
	public WebElement click_apps_EMS_LetterApproval;

	// CLEARANCE ASSIGNMENT
	@FindBy(xpath = "//a[@href='/apps/ems/clearanceAssignment/']")
	public WebElement click_apps_EMS_ClearanceAssignment;
	@FindBy(xpath = "//p[normalize-space()='Clearance Assignment for EMS']")
	public WebElement assert_EMS_ClearanceAssignment_Page_title;

	// RESIGNATION BEHALF EMPLOYEE
	@FindBy(xpath = "//a[@href='/apps/ems/resignationBehalfEmployee/']")
	public WebElement click_apps_EMS_ResignationbehalfEmp;
	@FindBy(xpath = "//span[normalize-space()='Resignation behalf of employee']")
	public WebElement assert_EMS_ResignationbehalfEmp_Page_title;

	// TERMINATION
	@FindBy(xpath = "//a[@href='/apps/ems/terminationRequest/']")
	public WebElement click_apps_EMS_Termination;
	@FindBy(xpath = "//span[normalize-space()='Request for Termination']")
	public WebElement assert_EMS_Termination_Page_title;

	// TERMINATION LIST
	@FindBy(xpath = "//a[@href='/apps/ems/terminationRequestList/']")
	public WebElement click_apps_EMS_TerminationList;

	// RESIGNATION
	@FindBy(xpath = "//a[@href='/apps/ems/resignation/']")
	public WebElement click_apps_EMS_Resignation;
	@FindBy(xpath = "//span[normalize-space()='Terms and Conditions']")
	public WebElement assert_EMS_Resignation_TandC_Popup__Page_title;
	@FindBy(xpath = "//button[normalize-space()='View terms and conditions']")
	public WebElement assert_EMS_Resignation_TandC_Button_Page_title;
	@FindBy(xpath = "//span[normalize-space()='Resignation']")
	public WebElement assert_EMS_Resignation_homepage_title;

//USERS
		@FindBy(xpath = "(//p[normalize-space()='Users'])[1]")
		public WebElement hover_apps_Users;
		
		@FindBy(xpath = "//a[@href='/apps/user/list/']")
		public WebElement click_apps_Users_usersList;
		@FindBy(xpath = "//span[normalize-space()='Users List']")
		public WebElement assert_Users_UsersList__title;

//HIRING - HRADMIN
				@FindBy(xpath = "(//p[normalize-space()='HR Admin'])[1]")
				public WebElement hover_apps_HRAdmin;
				
				//JOBS
				@FindBy(xpath = "//a[@href='/apps/recruitment/hrAdminJobs/']")
				public WebElement click_apps_HRAdmin_Jobs;
				@FindBy(xpath = "//span[normalize-space()='Jobs']")
				public WebElement  assert_HRAdmin_Jobs_Page_title;
				
				//CANDIDATES
				@FindBy(xpath = "//a[@href='/apps/recruitment/allCandidatesList/']")
				public WebElement click_apps_HRAdmin_Candidates;
				@FindBy(xpath = "//span[normalize-space()='My Candidates List']")
				public WebElement  assert_HRAdmin_Candidates_Page_title;
				
				//OFFER APPROVAL
				@FindBy(xpath = "//a[@href='/apps/recruitment/offerApprovalHr/']")
				public WebElement click_apps_HRAdmin_OfferApproval;
				@FindBy(xpath = "//h4[normalize-space()='Approval Requests']")
				public WebElement  assert_HRAdmin_OfferApproval_Page_title;
				
//HIRING - HIRING
				@FindBy(xpath = "(//p[normalize-space()='Hiring'])[1]")
				public WebElement hover_apps_Hiring;
				
				//OFFER APPROVAL
				@FindBy(xpath = "//a[@href='/apps/recruitment/offerApprovalMgt1/']")
				public WebElement click_apps_Hiring_OfferApproval_mg1;
				@FindBy(xpath = "//a[@href='/apps/recruitment/offerApprovalMgt2/']")
				public WebElement click_apps_Hiring_OfferApproval_mg2;
				@FindBy(xpath = "//a[@href='/apps/recruitment/offerApprovalCdo/']")
				public WebElement click_apps_Hiring_OfferApproval_CDO;
				@FindBy(xpath = "//h4[normalize-space()='Approval Requests']")
				public WebElement  assert_Hiring_OfferApproval_Page_title;
				
				//JOB APPROVAL
				@FindBy(xpath = "//a[@href='/apps/recruitment/jobapproval/']")
				public WebElement click_apps_Hiring_JobApproval;
				@FindBy(xpath = "//span[normalize-space()='Job Approval']")
				public WebElement  assert_Hiring_JobApproval_Page_title;
				
//HIRING - RECRUITMENT
				@FindBy(xpath = "(//p[normalize-space()='Recruitment'])[1]")
				public WebElement hover_apps_Recruitment;
				
				//JOBS
				@FindBy(xpath = "//a[@href='/apps/recruitment/assignedJobs/']")
				public WebElement click_apps_Recruitment_Jobs;
				@FindBy(xpath = "//span[normalize-space()='Assigned Jobs']")
				public WebElement  assert_Recruitment_Jobs_Page_title;
				
				//MY CANDIDATES
				@FindBy(xpath = "//a[@href='/apps/recruitment/myAllCandidates/']")
				public WebElement click_apps_Recruitment_MyCandidates;
				@FindBy(xpath = "//span[normalize-space()='My Candidates List']")
				public WebElement  assert_Recruitment_MyCandidates_Page_title;
				
//CV BANK
				@FindBy(xpath = "(//p[normalize-space()='CV Bank'])[1]")
				public WebElement hover_apps_CvBank;
				@FindBy(xpath = "//button[normalize-space()='Search']")
				public WebElement  assert_CvBank_button_Page_title;

//ONBOARDING
				@FindBy(xpath = "(//p[normalize-space()='Onboarding'])[1]")
				public WebElement hover_apps_Onboarding;
				@FindBy(xpath = "//a[@href='/apps/onboarding/']")
				public WebElement click_apps_Onboarding;
				
				@FindBy(xpath = "//h4[normalize-space()='Onboard Candidates List']")
				public WebElement  assert_Onboard_Page_title;				

// TRAVEL
				@FindBy(xpath = "(//p[normalize-space()='Travel'])[1]")
				public WebElement hover_apps_Travel;
				@FindBy(xpath = "(//p[normalize-space()='Create Request'])[1]")
				public WebElement hover_apps_Travel_CreateRequest;
				@FindBy(xpath = "//div[@aria-label='Request Date']")
				public WebElement assert_Travel_CommonTableValue_Page_title;
				
				//CREATE REQUEST - TRAVEL
				@FindBy(xpath = "//a[@href='/apps/travel/createTravelReservation/']")
				public WebElement click_apps_Travel_Createrequest_travel;
				@FindBy(xpath = "//span[normalize-space()='Create Travel Booking']")
				public WebElement assert_Travel_Createrequest_travel_Page_title;	
				
				//CREATE REQUEST - ACCOMODATION
				@FindBy(xpath = "//a[@href='/apps/travel/accommodation/']")
				public WebElement click_apps_Travel_Createrequest_Accomodation;
				@FindBy(xpath = "//span[normalize-space()='Request for Accommodation']")
				public WebElement assert_Travel_Createrequest_Accomodation_Page_title;	
				
				//CREATE REQUEST - TRAVEL & ACCOMODATION
				@FindBy(xpath = "//a[@href='/apps/travel/createTravelandAccommodation/']")
				public WebElement click_apps_Travel_Createrequest_TravelAndAccomodation;
				@FindBy(xpath = "//span[normalize-space()='Create Travel & Accommodation Booking']")
				public WebElement assert_Travel_Createrequest_TravelAndAccomodation_Page_title;	
				
				//MY REQUESTS
				@FindBy(xpath = "//a[@href='/apps/travel/myrequests/']")
				public WebElement click_apps_Travel_MyRequests;
				
				//FOR MY APPROVAL
				@FindBy(xpath = "//a[@href='/apps/travel/myapproval/']")
				public WebElement click_apps_Travel_ForMyApproval;
				
				//FLIGHT APPROVAL LIST
				@FindBy(xpath = "//a[@href='/apps/travel/airticket_approval/']")
				public WebElement click_apps_Travel_FlightApprovalList;
				
				//TRAVEL BOOKING LIST
				@FindBy(xpath = "//a[@href='/apps/travel/travelbooking/']")
				public WebElement click_apps_Travel_TravelBookingList;
				
				//ACCOMODATION BOOKING
				@FindBy(xpath = "//a[@href='/apps/travel/accommodationbookinglist/']")
				public WebElement click_apps_Travel_AccommodationBookingList;
				@FindBy(xpath = "//div[@aria-label='Created Date']")
				public WebElement assert_Travel_AccommodationBookingList_Page_title;	
				
				//MASTER LOCATION
				@FindBy(xpath = "//a[@href='/apps/travel/masterlocation/']")
				public WebElement click_apps_Travel_MasterLocation;
				@FindBy(xpath = "//div[@aria-label='Airport Name']")
				public WebElement assert_Travel_MasterLocation_Page_title;	
				
// ASSET
				@FindBy(xpath = "(//p[normalize-space()='Asset'])[1]")
				public WebElement hover_apps_Asset;
				
				//IT BU APPROVAL
				@FindBy(xpath = "//a[@href='/apps/asset/assetapproval/']")
				public WebElement click_apps_Asset_ItBuApproval;
				@FindBy(xpath = "//div[@aria-label='PO Number']")
				public WebElement assert_Asset_ItBuApproval_Page_title;	
				
				//ASSET PROCUREMENT
				@FindBy(xpath = "//a[@href='/apps/asset/assetproc/']")
				public WebElement click_apps_Asset_Assetprocurement;
				@FindBy(xpath = "//span[normalize-space()='Asset Procurement Form']")
				public WebElement assert_Asset_Assetprocurement_title;	
				
				//ASSET NUMBER ALLOCATION
				@FindBy(xpath = "//a[@href='/apps/asset/noallocation/']")
				public WebElement click_apps_Asset_AssetNumberAllocation;
				@FindBy(xpath = "//span[normalize-space()='Asset Number Allocation for Purchased Stocks']")
				public WebElement assert_Asset_AssetNumberAllocation_Page_title;	
				
				//ALLOCATION REQUEST
				@FindBy(xpath = "//a[@href='/apps/asset/ticket/ticketraise/']")
				public WebElement click_apps_Asset_AllocationRequest;
				@FindBy(xpath = "//div[normalize-space()='Raise an allocation request']")
				public WebElement assert_Asset_AllocationRequest_Page_title;	
				
				//RETURN ASSET
				@FindBy(xpath = "//a[@href='/apps/asset/ticket/assetreturn/']")
				public WebElement click_apps_Asset_ReturnAsset;
				@FindBy(xpath = "//button[normalize-space()='Submit']")
				public WebElement assert_Asset_ReturnAsset_Page_title;	
				
				//REPLACE ASSET
				@FindBy(xpath = "//a[@href='/apps/asset/ticket/assetreplace/']")
				public WebElement click_apps_Asset_ReplaceAsset;
				@FindBy(xpath = "//div[normalize-space()='Raise a Replacement request']")
				public WebElement assert_Asset_ReplaceAsset_Page_title;	
	
// L&D
				@FindBy(xpath = "(//p[normalize-space()='L&D'])[1]")
				public WebElement hover_apps_LandD;
				
				//QUESTION SETUP
				@FindBy(xpath = "//a[@href='/apps/LandD/question/']")
				public WebElement click_apps_LandD_QuestionSetup;
				@FindBy(xpath = "//p[normalize-space()='Topic List']")
				public WebElement assert_LandD_QuestionSetup_Page_title;	
				
				//ALLOCATION AND EVALUATION
				@FindBy(xpath = "//a[@href='/apps/LandD/allocation/']")
				public WebElement click_apps_LandD_AllocationAndEvaluation;
				@FindBy(xpath = "//p[normalize-space()='Allocation & Evaluation']")
				public WebElement assert_LandD_AllocationAndEvaluation_Page_title;
				
				//REPORTS
				@FindBy(xpath = "//a[@href='/apps/LandD/reports/']")
				public WebElement click_apps_LandD_Reports;
				@FindBy(xpath = "//p[normalize-space()='Reports Page']")
				public WebElement assert_LandD_Reports_Page_title;
				
//MANAGER FEEDBACK
				@FindBy(xpath = "(//p[normalize-space()='Manager Feedback'])[1]")
				public WebElement hover_apps_ManagerFb;
				
				//ADMIN
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/admin/admincrtpage/']")
				public WebElement click_apps_ManagerFb_Admin;	
				@FindBy(xpath = "//button[normalize-space()='Add']")
				public WebElement assert_ManagerFb_Admin_Page_title;
				
				//ADMIN VIEW
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/admin/adminview/']")
				public WebElement click_apps_ManagerFb_AdminView;
				@FindBy(xpath = "//h6[normalize-space()='RM Feedback (Admin Page)']")
				public WebElement assert_ManagerFb_AdminView_Page_title;
				
				//RM PAGE
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/rmpage/rmpageview/']")
				public WebElement click_apps_ManagerFb_RmPage;
				@FindBy(xpath = "//h6[normalize-space()='RM Feedback (RM PAGE)']")
				public WebElement assert_ManagerFb_RmPage_Page_title;
				
				//MANAGEMENT VIEW
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/mngmntpage/rmmanagement/']")
				public WebElement click_apps_ManagerFb_ManagementView;
				@FindBy(xpath = "//h6[normalize-space()='RM Feedback (Management Page)']")
				public WebElement assert_ManagerFb_ManagementView_Page_title;
				
				//HR HEAD VIEW
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/hrheadpage/hrheadview/']")
				public WebElement click_apps_ManagerFb_HrHeadView;
				@FindBy(xpath = "//h6[normalize-space()='RM Feedback (Hr head Page)']")
				public WebElement assert_ManagerFb_HrHeadView_Page_title;
				
				//EMPLOYEE FEEDBACK
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/userpage/rmuserresponse/']")
				public WebElement click_apps_ManagerFb_EmployeeFeedback;
				@FindBy(xpath = "//div[@aria-label='Sno.']")
				public WebElement assert_ManagerFb_EmployeeFeedback_Page_title;
				
				//BU PAGE
				@FindBy(xpath = "//a[@href='/apps/rmreviewparent/bupage/rmreviewbupage/']")
				public WebElement click_apps_ManagerFb_BuPage;
				@FindBy(xpath = "//h6[normalize-space()='RM Feedback (BU PAGE)']")
				public WebElement assert_ManagerFb_BuPage_Page_title;
	
				
				
				
				
				//***********HEADERS***********//
//COMPANY POLICIES
				@FindBy(xpath = "//a[@href='/apps/companyPolicies/']")
				public WebElement click_Header_CompanyPolicies;
				@FindBy(xpath = "//label[normalize-space()='Search Policy']")
				public WebElement assert_CompanyPolicies_Page_title;
				
//TIMESHEET
				@FindBy(xpath = "(//a[@href='/apps/timesheet/'])[2]")
				public WebElement click_Header_timesheet;	
				
//HELPDESK
				@FindBy(xpath = "(//p[normalize-space()='Help Desk'])[2]")
				public WebElement hover_Header_Helpdesk;
		
				//******************************//
				
//REPORTS
				@FindBy(xpath = "(//p[normalize-space()='Reports'])[2]")
				public WebElement hover_Reports;
				
				@FindBy(xpath = "(//p[normalize-space()='Time Sheet'])[3]")
				public WebElement hover_Reports_Timesheet;
				
//REPORTS - TIMESHEET - OVERALL REPORT 
				@FindBy(xpath = "//a[@href='/reports/overAllReport/'][1]")
				public WebElement click_Reports_Timesheet_OverallReport;	
				@FindBy(xpath = "//p[normalize-space()='Topic List']")
				public WebElement assert_Reports_Timesheet_OverallReport_Page_title;
				
//REPORTS - TIMESHEET - BU REPORT
				@FindBy(xpath = "(//p[normalize-space()='L&D'])[1]")
				public WebElement click_Reports_Timesheet_BuReport;	
				@FindBy(xpath = "//p[normalize-space()='Topic List']")
				public WebElement assert_Reports_Timesheet_BuReport_Page_title;
				
////REPORTS - TIMESHEET - REPORTEES REPORT
				@FindBy(xpath = "//a[@href='/apps/LandD/question/']")
				public WebElement click_Reports_Timesheet_ReporteesReport;
				@FindBy(xpath = "//p[normalize-space()='Topic List']")
				public WebElement assert_Reports_Timesheet_ReporteesReport_Page_title;				

				
}
