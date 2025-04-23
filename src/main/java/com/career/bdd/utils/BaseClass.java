package com.career.bdd.utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class BaseClass {
	
	    /**
	     * Description: Waits for the element to be visible and clickable.
	     * @param driver The WebDriver instance.
	     * @param element The WebElement to wait for.
	     * @param timeoutInSeconds Max time to wait.
	     */
	    public void waitForElement(WebDriver driver, WebElement element, int timeoutInSeconds) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	            wait.until(ExpectedConditions.visibilityOf(element));
	            wait.until(ExpectedConditions.elementToBeClickable(element));
	        } catch (Exception e) {
	            System.out.println("Element not visible/clickable within timeout: " + e.getMessage());
	        }
	    }

	    /**
	     * Overloaded version with default 15 seconds timeout.
	     */
	    public void waitForElement(WebDriver driver, WebElement element) {
	        waitForElement(driver, element, 15);
	    }
	    
	    /**
	     * Description: Method for implicit wait
	     * @param driver The WebDriver instance.
	     * @param seconds Max time to wait.
	     */
	        public void setImplicitWait(int seconds,WebDriver driver) {
	            driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	        }
	        
	        /**
		     * Description: Method to scroll down into view
		     * @param driver The WebDriver instance.
		     */
	        public void scrollToElement(WebDriver driver, WebElement element) {
	            JavascriptExecutor js = (JavascriptExecutor) driver;
//	            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
	            js.executeScript("arguments[0].scrollIntoView(true);", element);
	        }
	        
	        public void waitForPageToLoad(WebDriver driver) {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            wait.until((ExpectedCondition<Boolean>) wd ->
	                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	        }

	    }



