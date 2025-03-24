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
		public String get_LandingPageValue_MyReferral_ReferralProgram() {
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
		public String get_LandingPageValue_MyReferral_ReferredList() {
			try {
				isHeaderAppVisible();
				gu.mousehower(driver, locators.hover_apps);
				gu.element_Click(locators.hover_apps_myreferral);
				gu.element_Click(locators.click_apps_MyReferral_ReferredList);
				gu.visibility_wait_utility(driver, locators.assert_MyReferral_ReferredList_Page_title);				
				return gu.getElementText(locators.assert_MyReferral_ReferredList_Page_title);
			} catch (Exception e) {
				System.err.println("Failed: " + e.getMessage());
				throw e;
			}
		}
		
//HELPDESK
				public String getValue_of__header_apps_Helpdesk() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_Helpdesk);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_Helpdesk() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Helpdesk);
						gu.visibility_wait_utility(driver, locators.assert_Helpdesk_Page_title);				
						return gu.getElementText(locators.assert_Helpdesk_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}

//EMS
				public String getValue_of_header_apps_EMS() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_EMS);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_EMS_resignationList() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_resignationList);
						gu.visibility_wait_utility(driver, locators.assert_EMS_CommonTableValue_Page_title);				
						return gu.getElementText(locators.assert_EMS_CommonTableValue_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}	
				public String get_LandingPageValue_EMS_LwdRequestList() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_LwdRequestList);
						gu.visibility_wait_utility(driver, locators.assert_EMS_CommonTableValue_Page_title);				
						return gu.getElementText(locators.assert_EMS_CommonTableValue_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_EMS_RelievingClearance() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_Relievingclearance);
						gu.visibility_wait_utility(driver, locators.assert_EMS_CommonTableValue_Page_title);				
						return gu.getElementText(locators.assert_EMS_CommonTableValue_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_EMS_LetterApproval() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_LetterApproval);
						gu.visibility_wait_utility(driver, locators.assert_EMS_CommonTableValue_Page_title);				
						return gu.getElementText(locators.assert_EMS_CommonTableValue_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_EMS_ClearanceAssignment() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_ClearanceAssignment);
						gu.visibility_wait_utility(driver, locators.assert_EMS_ClearanceAssignment_Page_title);				
						return gu.getElementText(locators.assert_EMS_ClearanceAssignment_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_EMS_ResignationbehalfEmp() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_ResignationbehalfEmp);
						gu.visibility_wait_utility(driver, locators.assert_EMS_ResignationbehalfEmp_Page_title);				
						return gu.getElementText(locators.assert_EMS_ResignationbehalfEmp_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
				public String get_LandingPageValue_EMS_Termination() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_Termination);
						gu.visibility_wait_utility(driver, locators.assert_EMS_Termination_Page_title);				
						return gu.getElementText(locators.assert_EMS_Termination_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
				public String get_LandingPageValue_EMS_TerminationList() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_TerminationList);
						gu.visibility_wait_utility(driver, locators.assert_EMS_CommonTableValue_Page_title);				
						return gu.getElementText(locators.assert_EMS_CommonTableValue_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
				public String get_LandingPageValue_EMS_Resignation() throws Exception {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_EMS);
						gu.element_Click(locators.click_apps_EMS_Resignation);
						if (gu.isElementVisible(driver, locators.assert_EMS_Resignation_TandC_Popup__Page_title)) {
							Thread.sleep(2000);
							return gu.getElementText(locators.assert_EMS_Resignation_TandC_Popup__Page_title);
						} else if (gu.isElementVisible(driver, locators.assert_EMS_Resignation_TandC_Button_Page_title)) {
							Thread.sleep(2000);
							return gu.getElementText(locators.assert_EMS_Resignation_TandC_Button_Page_title);
						} else if (gu.isElementVisible(driver, locators.assert_EMS_Resignation_homepage_title)) {
							Thread.sleep(2000);
							return gu.getElementText(locators.assert_EMS_Resignation_homepage_title);
						} 
						else {
							return "UNKNOWN";
						}
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
//USERS
				public String getValue_of_header_apps_Users() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_Users);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_Users_UsersList() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Users);
						gu.element_Click(locators.click_apps_Users_usersList);
						gu.visibility_wait_utility(driver, locators.assert_Users_UsersList__title);				
						return gu.getElementText(locators.assert_Users_UsersList__title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
				
//HIRING- HR ADMIN
				public String getValue_of_header_apps_HrAdmin() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_HRAdmin);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_HrAdmin_Jobs() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_HRAdmin);
						gu.element_Click(locators.click_apps_HRAdmin_Jobs);
						gu.visibility_wait_utility(driver, locators.assert_HRAdmin_Jobs_Page_title);				
						return gu.getElementText(locators.assert_HRAdmin_Jobs_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_HrAdmin_Candidates() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_HRAdmin);
						gu.element_Click(locators.click_apps_HRAdmin_Candidates);
						gu.visibility_wait_utility(driver, locators.assert_HRAdmin_Candidates_Page_title);				
						return gu.getElementText(locators.assert_HRAdmin_Candidates_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_HrAdmin_OfferApproval() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_HRAdmin);
						gu.element_Click(locators.click_apps_HRAdmin_OfferApproval);
						gu.visibility_wait_utility(driver, locators.assert_HRAdmin_OfferApproval_Page_title);				
						return gu.getElementText(locators.assert_HRAdmin_OfferApproval_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
//HIRING- HIRING
				public String getValue_of_header_apps_Hiring() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_Hiring);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
				public String get_LandingPageValue_Hiring_OfferApproval_mg1() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Hiring);
						gu.element_Click(locators.click_apps_Hiring_OfferApproval_mg1);
						gu.visibility_wait_utility(driver, locators.assert_Hiring_OfferApproval_Page_title);				
						return gu.getElementText(locators.assert_Hiring_OfferApproval_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_Hiring_OfferApproval_mg2() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Hiring);
						gu.element_Click(locators.click_apps_Hiring_OfferApproval_mg2);
						gu.visibility_wait_utility(driver, locators.assert_Hiring_OfferApproval_Page_title);				
						return gu.getElementText(locators.assert_Hiring_OfferApproval_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_Hiring_OfferApproval_cdo() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Hiring);
						gu.element_Click(locators.click_apps_Hiring_OfferApproval_CDO);
						gu.visibility_wait_utility(driver, locators.assert_Hiring_OfferApproval_Page_title);				
						return gu.getElementText(locators.assert_Hiring_OfferApproval_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_Hiring_JobApproval() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Hiring);
						gu.element_Click(locators.click_apps_Hiring_JobApproval);
						gu.visibility_wait_utility(driver, locators.assert_Hiring_JobApproval_Page_title);				
						return gu.getElementText(locators.assert_Hiring_JobApproval_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
//HIRING- RECRUITMENT
				public String getValue_of_header_apps_Recruitment() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_Recruitment);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}		
				
				public String get_LandingPageValue_Recruitment_Jobs() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Recruitment);
						gu.element_Click(locators.click_apps_Recruitment_Jobs);
						gu.visibility_wait_utility(driver, locators.assert_Recruitment_Jobs_Page_title);				
						return gu.getElementText(locators.assert_Recruitment_Jobs_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				public String get_LandingPageValue_Recruitment_MyCandidates() throws Exception {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Recruitment);
						Thread.sleep(2000);
						gu.element_Click(locators.click_apps_Recruitment_MyCandidates);
						gu.visibility_wait_utility(driver, locators.assert_Recruitment_MyCandidates_Page_title);				
						return gu.getElementText(locators.assert_Recruitment_MyCandidates_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
//CV BANK
				public String getValue_of_header_apps_CvBank() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_CvBank);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}		
				
				public String get_LandingPageValue_CvBank() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_CvBank);
						gu.element_Click(locators.hover_apps_CvBank);
						gu.visibility_wait_utility(driver, locators.assert_CvBank_button_Page_title);				
						return gu.getElementText(locators.assert_CvBank_button_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}
				
//ONBOARDING
				public String getValue_of_header_apps_Onboarding() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						return gu.getElementText(locators.hover_apps_Onboarding);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}		
				
				public String get_LandingPageValue_Onboarding() {
					try {
						isHeaderAppVisible();
						gu.mousehower(driver, locators.hover_apps);
						gu.element_Click(locators.hover_apps_Onboarding);
						gu.element_Click(locators.click_apps_Onboarding);
						gu.visibility_wait_utility(driver, locators.assert_Onboard_Page_title);				
						return gu.getElementText(locators.assert_Onboard_Page_title);
					} catch (Exception e) {
						System.err.println("Failed: " + e.getMessage());
						throw e;
					}
				}					
				
				
}
