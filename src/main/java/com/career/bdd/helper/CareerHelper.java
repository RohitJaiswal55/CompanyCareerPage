package com.career.bdd.helper;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.career.bdd.constant.CareerConstant;
import com.career.bdd.pages.CareerPage;
import com.career.bdd.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.asserts.SoftAssert;

public class CareerHelper {
	private WebDriver driver;
	private CareerPage careerPage;
	private CareerConstant careerConstant; 
	private SoftAssert softAssert = new SoftAssert();
	private ConfigReader config = new ConfigReader();
	private String browser;

	@Before
	public void setup() {
		browser = config.getProperty(CareerConstant.WEBDRIVER); 

		if (browser.equalsIgnoreCase(CareerConstant.CHROME)) {
			System.out.println("browser--->" + browser);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-features=SameSiteByDefaultCookies,CookiesWithoutSameSiteMustBeSecure");
			options.addArguments("--disable-blink-features=BlockCredentialedSubresources");

			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");

			driver = new ChromeDriver(options);
		} else {
			System.out.println("browser--->" + browser);
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--no-sandbox");

			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/driver/msedgedriver.exe");

			driver = new EdgeDriver(options);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		careerPage = new CareerPage(driver);
	}


	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	/**
	 * Description : Method to launch career page.
	 * @throws InterruptedException
	 */
	public void launchCareerPage() throws InterruptedException {
		
		String baseURL = config.getProperty(CareerConstant.BASE_URL);

		if (driver == null) {
			throw new IllegalStateException("WebDriver is not initialized!");
		}

		driver.get(baseURL);
		
		try {
		    careerPage.clickAcceptButton();
		} finally {
		    System.out.println("pop not appeared");
		}

	}

	/**
	 * Description : Method to click required type career page.
	 * @param careerType
	 * @throws InterruptedException
	 */
	public void clickRequiredTypeCareerPage(String careerType) throws InterruptedException {
		careerPage.clickCareerType(careerType);
	}

	/**
	 * Description : Method to verify correct required career page loaded.
	 * @param careerType
	 * @throws InterruptedException
	 */
	public void verifyRequiredTypeCareerPage(String actCareerType) throws InterruptedException {
		String actualPageTitle = careerPage.getCareerPageTitle();
		softAssert.assertEquals(actualPageTitle, actCareerType);
		softAssert.assertAll();
	}
	
	/**
	 * Description : Method to verify Availability Dropdown Options.
	 * @param expectedOptions
	 * @throws InterruptedException
	 */
	public void verifyAvailabilityDropdownOptions(List<String> expectedOptions) throws InterruptedException {
		careerPage.clickAvailabilityDropdownOptions();
		List<String> actualOptions = careerPage.getDropdownOptions();
		for (String expected : expectedOptions) {
			if (!actualOptions.contains(expected)) {
				throw new AssertionError("Expected option not found: " + expected);
			}
		}

		System.out.println("✅ All expected availability options verified successfully.");
	}
	
	/**
	 * Description : Method to verify Corporate Title Dropdown Options.
	 * @param expectedOptions
	 * @throws InterruptedException
	 */
	public void verifyCorporateTitleDropdownOptions(List<String> expectedOptions) throws InterruptedException {
		careerPage.clickCorporateTitleDropdownOptions();
		List<String> actualOptions = careerPage.getDropdownOptions();
		for (String expected : expectedOptions) {
			if (!actualOptions.contains(expected)) {
				throw new AssertionError("Expected option not found: " + expected);
			}
		}

		System.out.println("All expected availability options verified successfully.");
	}
	
	/**
	 * Description : Method to send job keyword.
	 * @param jobKeyword
	 * @throws InterruptedException
	 */
	public void sendJobKeyword(String jobKeyword) throws InterruptedException {
		careerPage.sendJobKeyword(jobKeyword);
	}
	
	/**
	 * Description : Method to click Search Button .
	 * @throws InterruptedException
	 */
	public void clickSearchButtonOnCareerPage() throws InterruptedException {
		careerPage.clickSearchButton();
	}
	
	/**
	 * Description : Method to verify total No Job Displayed after click search button.
	 * @param expectedNoOfJob
	 * @throws InterruptedException
	 */
	public void verifyTotalNoJobDisplayed(String expectedNoOfJob) throws InterruptedException {
		String actualNoOfJob =careerPage.getTotalNoJobAfterClickSearchButton();
		softAssert.assertEquals(actualNoOfJob, expectedNoOfJob);
		softAssert.assertAll();
	}
	
	/**
	 * Description : Method to verify numbers of results displayed on screen more than zero.
	 * @throws InterruptedException
	 */
	public void verifyNumbersOfResultsMoreThanZero() throws InterruptedException {
		String actualNoOfJob =careerPage.getTotalNoJobBeforeClickSearchButton();
		int actualNoOfJobIntFormat = Integer.parseInt(actualNoOfJob);
		softAssert.assertTrue(actualNoOfJobIntFormat > CareerConstant.ZERO, "Job count should be greater than 0");
		softAssert.assertAll();
	}
	
	/**
	 * Description : Method to verify searched keyword is contained in all job results.
	 * @throws InterruptedException
	 */
	public void verifySearchedKeywordResultsContains(String jobKeyword) throws InterruptedException {
	    List<String> searchedJobResults = careerPage.getAllSearchedJobResults();
	    for (String searchedJobResult : searchedJobResults) {
	        if (!searchedJobResult.toLowerCase().contains(jobKeyword.toLowerCase())) {
	            throw new AssertionError("Job result does not contain the expected keyword: " + jobKeyword + "\nJob result: " + searchedJobResult);
	        }
	    }
	    System.out.println("All job results contain the expected keyword: " + jobKeyword);
	}
	
	/**
	 * Description : Method to click on search job heading displayed.
	 * @throws InterruptedException
	 */
	public void clickJobHeadingDisplayed() throws InterruptedException {
		careerPage.clickJobHeading();
	}
	
	/**
	 * Description : Method to verify job id.
	 * @param expJobId
	 * @throws InterruptedException
	 */
	public void verifyJobId(String expJobId) throws InterruptedException {
		String actJobId = careerPage.getJobId();
		softAssert.assertEquals(actJobId, expJobId);
		softAssert.assertAll();
	}
}