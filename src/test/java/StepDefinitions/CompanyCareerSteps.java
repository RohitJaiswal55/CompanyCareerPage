package StepDefinitions;

import java.util.List;

import com.career.bdd.constant.CareerConstant;
import com.career.bdd.helper.CareerHelper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyCareerSteps {
	private CareerHelper careerHelper;
	CareerConstant careerConstant;

	public CompanyCareerSteps() {
		this.careerHelper = Hooks.getCareerHelper(); // Getting initialized helper
	}

	/**
	 * Description : Method to launch career page.
	 * @throws InterruptedException
	 */
	@Given("I launch company career page")
	public void i_launch_company_career_page() throws InterruptedException {
		careerHelper.launchCareerPage();
	}

	/**
	 * Description : Method to click required type career page.
	 * @param careerType the careerType
	 * @throws InterruptedException
	 */
	@When("I click required type company career page")
	public void i_click_required_type_career_page(DataTable careerType) throws InterruptedException {
		List<String> careerTypeList = careerType.asList(String.class);
		careerHelper.clickRequiredTypeCareerPage(careerTypeList.get(CareerConstant.ONE));
	}

	/**
	 * Description : Method to verify correct required career page loaded.
	 * @param careerType the careerType
	 * @throws InterruptedException
	 */
	@When("I verify user landed on clicked type company career page")
	public void i_verify_user_landed_on_clicked_type_company_career_page(DataTable careerType)
			throws InterruptedException {
		List<String> careerTypeList = careerType.asList(String.class);
		careerHelper.verifyRequiredTypeCareerPage(careerTypeList.get(careerConstant.ONE));
	}
	
	/**
	 * Description : Method to verify dropdown.
	 * @param dropdownLabel 
	 * @param availabilityDropdown
	 * @throws InterruptedException
	 */
	@Then("I verify dropdowns of {string}")
	public void i_verify_dropdowns(String dropdownLabel, DataTable availabilityDropdown) throws InterruptedException {
	    List<String> expectedOptions = availabilityDropdown.asList();
	    
	    if(dropdownLabel.equals(CareerConstant.WHAT_IS_YOUR_AVAIABILITY))
	    careerHelper.verifyAvailabilityDropdownOptions(expectedOptions);
	    else
	    	careerHelper.verifyCorporateTitleDropdownOptions(expectedOptions);
	}
	
	/**
	 * Description : Method to enter job keyword.
	 * @param jobKeywords
	 * @throws InterruptedException
	 */
	@And("I enter job keyword in textbox")
	public void i_enter_job_keyword_in_textbox(DataTable jobKeywords) throws InterruptedException {
		List<String> keyword = jobKeywords.asList(String.class);
		careerHelper.sendJobKeyword(keyword.get(careerConstant.ZERO));
		
	}
	
	/**
	 * Description : Method to click search button.
	 * @throws InterruptedException
	 */
	@And("I click search button")
	public void i_click_search_button() throws InterruptedException {
		careerHelper.clickSearchButtonOnCareerPage();
	}
	
	/**
	 * Description : Method to verify mentioned number job appear.
	 * @param totalNoOfJob
	 * @throws InterruptedException
	 */
	@Then("I verify mentioned number job appear")
	public void I_verify_mentioned_number_job_appear(DataTable totalNoOfJob) throws InterruptedException {
		List<String> noOfJob = totalNoOfJob.asList(String.class);
		careerHelper.verifyTotalNoJobDisplayed(noOfJob.get(CareerConstant.ZERO));
	}
	
	/**
	 * Description : Method to verify numbers of results displayed on screen more than zero.
	 * @throws InterruptedException
	 */
	@And("I verify numbers of results displayed on screen more than zero")
	public void i_verify_numbers_of_results_displayed_on_screen_more_than_zero() throws InterruptedException {
		careerHelper.verifyNumbersOfResultsMoreThanZero();
	}
	
	/**
	 * Description : Method to verify all job result should contain searched keyword.
	 * @param seachedJobKeywords
	 * @throws InterruptedException
	 */
	@Then("I verify all job result should contain searched keyword")
	public void i_verify_all_job_result_should_contain_searched_keyword(DataTable seachedJobKeywords) throws InterruptedException {
		List<String> seachedJobKeyword = seachedJobKeywords.asList(String.class);
		careerHelper.verifySearchedKeywordResultsContains(seachedJobKeyword.get(CareerConstant.ZERO));
	}
	
	/**
	 * Description : Method to click on search job heading displayed.
	 * @throws InterruptedException
	 */
	@And("I click on search job heading displayed")
	public void i_click_on_search_job_heading_displayed() throws InterruptedException {
		careerHelper.clickJobHeadingDisplayed();
	}
	
	/**
	 * Description : Method to verify jod id displayed correctly.
	 * @param jobIDs
	 * @throws InterruptedException
	 */
	@Then("I verify mentioned jod id displayed")
	public void i_verify_mentioned_jod_id_displayed(DataTable jobIDs) throws InterruptedException {
		List<String> jobID = jobIDs.asList(String.class);
		careerHelper.verifyJobId(jobID.get(careerConstant.ZERO));
		
	}


}
