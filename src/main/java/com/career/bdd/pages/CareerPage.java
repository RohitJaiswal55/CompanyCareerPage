package com.career.bdd.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.career.bdd.constant.CareerConstant;
import com.career.bdd.utils.BaseClass;

public class CareerPage extends BaseClass {
	private WebDriver driver;

	public CareerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='filter-section']")
	private WebElement filterSection;
	
	@FindBy(xpath = "//div[@id= 'vs4__combobox']")
	private WebElement availabilityDropDown;
	
	@FindBy(xpath = "//div[@id= 'vs3__combobox']")
	private WebElement corporateTitleDropDown;
	
	@FindBy(xpath = "//*[contains(text(),' Reset')]")
	private WebElement resetButton;
	
	@FindBy(xpath = "//h2[contains(text(),'Life at Deutsche Bank')]")
	private WebElement lifeAtDeutscheBankLabel;

	@FindBy(id = "jobIdSearch")
	private WebElement jobSearchTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement searchButton;
	
	@FindBy(xpath = "//span[contains(text(),'Search Results:')]")
	private WebElement searchResultsLabel;
	
	@FindBy(xpath = "//div[contains(text(),'Showing result:')]")
	private WebElement showingResultsLabel;
	
	@FindBy(xpath = "//div[contains(text(),'Results:')]")
	private WebElement resultsLabel;
	
	@FindBy(xpath = "//div[@class='detail-entry']")
	private WebElement firstJobHeadingText;
	
	@FindBy(xpath = "//div[@id='headerbox']/table/descendant::td/strong[contains(text(),'Job ID:')]/..")
	private WebElement jobIDText;
	
	CareerConstant careerConstant;

	
	
	/**
	 * Description : Method to accept cookies dialog box.
	 * @throws InterruptedException
	 */
	public void clickAcceptButton() {
		
		try {
			setImplicitWait( 15,driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement shadowHost = driver.findElement(By.cssSelector("div#usercentrics-root"));
			WebElement acceptButton = (WebElement) js.executeScript(
					"return arguments[0].shadowRoot.querySelector('button[data-testid=\"uc-accept-all-button\"]')",
					shadowHost);

			if (acceptButton != null) {
				acceptButton.click();
				System.out.println("Clicked Accept All button.");
				setImplicitWait( 3,driver);
			} else {
				System.out.println("Accept All button not found.");
			}

		} catch (Exception e) {
			System.out.println("Cookie accept button not found or not clickable. Skipping it.");
			e.printStackTrace();
		}
	}

		
	

	/**
	 * Description : Method to click required careeer type.
	 * @param careerType
	 * @throws InterruptedException
	 */
	public void clickCareerType(String careerType) throws InterruptedException {
		WebElement careerTypeButton = driver.findElement(By.xpath("//a[@title='" + careerType + "']"));
		careerTypeButton.click();
	}

	/**
	 * Description : Method to return title of page.
	 * @throws InterruptedException
	 */
	public String getCareerPageTitle() throws InterruptedException {
		waitForElement(driver, filterSection);
		String pageTitle = driver.getTitle();
		return pageTitle;

	}
	
	/**
	 * Description : Method to click availability dropdown.
	 * @throws InterruptedException
	 */
	public void clickAvailabilityDropdownOptions() throws InterruptedException {
		waitForElement(driver, availabilityDropDown);
		scrollToElement(driver, lifeAtDeutscheBankLabel);
		availabilityDropDown.click();
	}
	
	/**
	 * Description : Method to return Dropdown Options.
	 * @throws InterruptedException
	 */
	public List<String> getDropdownOptions() throws InterruptedException {

		waitForElement(driver, availabilityDropDown);
		List<WebElement> options = driver.findElements(By.cssSelector("ul.vs__dropdown-menu li"));

		List<String> optionTexts = new ArrayList<>();
		for (WebElement option : options) {
			optionTexts.add(option.getText().trim());
		}

		return optionTexts;
	}
	
	/**
	 * Description : Method to click Corporate Title dropdown.
	 * @throws InterruptedException
	 */
	public void clickCorporateTitleDropdownOptions() throws InterruptedException {
		waitForElement(driver, corporateTitleDropDown);
		scrollToElement(driver, lifeAtDeutscheBankLabel);
		corporateTitleDropDown.click();
	}
	
	/**
	 * Description : Method to click Corporate Title dropdown.
	 * @param jobKeyword
	 * @throws InterruptedException
	 */
	public void sendJobKeyword(String jobKeyword) throws InterruptedException {
		waitForElement(driver, jobSearchTextBox);
		scrollToElement(driver, lifeAtDeutscheBankLabel);
		jobSearchTextBox.sendKeys(jobKeyword);
	}
	
	/**
	 * Description : Method to click search button.
	 * @throws InterruptedException
	 */
	public void clickSearchButton() throws InterruptedException {
		waitForElement(driver, searchButton);
		scrollToElement(driver, searchButton);
		searchButton.click();
	}
	
	/**
	 * Description : Method to return Total No Job displayed after click search button.
	 * @throws InterruptedException
	 */
	public String getTotalNoJobAfterClickSearchButton() throws InterruptedException {
		waitForElement(driver, showingResultsLabel);
		scrollToElement(driver, showingResultsLabel);
		String results = showingResultsLabel.getText();
		String[] parts = results.split(" ");
		String actualjobNoDisplayed = parts[parts.length - CareerConstant.ONE];
		return actualjobNoDisplayed;
	}
	
	/**
	 * Description : Method to return no of results before click search button.
	 * @throws InterruptedException
	 */
	public String getTotalNoJobBeforeClickSearchButton() throws InterruptedException {
		waitForElement(driver, jobSearchTextBox);
		scrollToElement(driver, jobSearchTextBox);
		String results = resultsLabel.getText();
		String[] parts = results.split(" ");
		String actualjobNoDisplayed = parts[parts.length - CareerConstant.ONE];
		return actualjobNoDisplayed;
	}
	
	/**
	 * Description :  Method to return all job results displayed.
	 * @throws InterruptedException
	 */
	public List<String> getAllSearchedJobResults() throws InterruptedException {
		waitForElement(driver, showingResultsLabel);
		scrollToElement(driver, showingResultsLabel);
		List<WebElement> jobResults = driver.findElements(By.xpath("//div[@class='detail-entry']/h2"));
		List<String> jobResultsList = new ArrayList<>();
		for (WebElement result : jobResults) {
			jobResultsList.add(result.getText().trim());
		}

		return jobResultsList;
	}
	
	/**
	 * Description : Method to click on search job heading displayed.
	 * @throws InterruptedException
	 */
	public void clickJobHeading() throws InterruptedException {
		waitForElement(driver, firstJobHeadingText);
		firstJobHeadingText.click();
	}
	
	/**
	 * Description : Method to return job id.
	 * @throws InterruptedException
	 */
	public String getJobId() throws InterruptedException {
		waitForElement(driver, jobIDText);
		String jobId = jobIDText.getText().trim();
		System.out.println("jobId-->"+jobId);
		return jobId;

	}
	
}
