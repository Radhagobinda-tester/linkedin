package pomPage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Network {
	private WebDriver driver;

	@FindBy(xpath = "//button[contains(@id, 'ember') and contains(@aria-label, 'Invite')]")
    private List<WebElement> connectButtons;
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement seeall;
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[4]/aside[1]/div[1]/header[1]/div[3]/button[2]/*[name()='svg'][1]")
	private WebElement dd;





    public My_Network(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAllConnectButtons() throws InterruptedException {
        for (WebElement button : connectButtons) {
            button.click();
           // driver.navigate().refresh();
            Thread.sleep(10000);
        }
    }


    public void messageDD() {
      dd.click();
	}
    public void SeeAllBtn() {
    	seeall.click();
  	}
/*
    public void clickAllConnectButtonsAndRefresh() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        for (WebElement button : connectButtons) {
        	 Thread.sleep(5000);
            // Scroll to the element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

            // Wait for element to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(button));
            Thread.sleep(10000);
            // Click the button
            button.click();
            Thread.sleep(5000);

            // Refresh the page
            */
    public void scrollToSeeAllAndClick() throws InterruptedException {
    	 Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", seeall);
        Thread.sleep(5000); // Adjust sleep time as needed
        seeall.click();
    }
    public void clickAllConnectButtonsAndRefresh1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        int count = 0; // Counter to keep track of the number of buttons clicked

        for (WebElement button : connectButtons) {
            Thread.sleep(5000);
            // Scroll to the element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

            try {
                // Wait for element to be clickable
                wait.until(ExpectedConditions.elementToBeClickable(button));

                // Click the button
                button.click();
                count++; // Increment the counter
                Thread.sleep(5000);
            } catch (StaleElementReferenceException e) {
                // If element is stale, refresh the page and reinitialize the elements
                driver.navigate().refresh();
                PageFactory.initElements(driver, this);

                // Scroll to the element again
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

                // Wait for element to be clickable
                wait.until(ExpectedConditions.elementToBeClickable(button));

                // Click the button
                button.click();
                count++; // Increment the counter
                Thread.sleep(5000);
            }

            // Check if 30 buttons have been clicked
            if (count >= 30) {
                break; // Exit the loop if 30 buttons have been clicked
            }
        }
    }

    public void clickAllConnectButtonsAndRefresh2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        int count = 0; // Counter to keep track of the number of buttons clicked

        for (WebElement button : connectButtons) {
            Thread.sleep(5000);
            // Scroll to the element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

            try {
                // Wait for element to be clickable
                wait.until(ExpectedConditions.elementToBeClickable(button));

                // Click the button using JavaScript
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

                count++; // Increment the counter
                Thread.sleep(5000);
            } catch (StaleElementReferenceException e) {
                // If element is stale, refresh the page and reinitialize the elements
                driver.navigate().refresh();
                PageFactory.initElements(driver, this);

                // Scroll to the element again
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

                // Wait for element to be clickable
                wait.until(ExpectedConditions.elementToBeClickable(button));

                // Click the button using JavaScript
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

                count++; // Increment the counter
                Thread.sleep(5000);
            }

            // Check if 30 buttons have been clicked
            if (count >= 100) {
                break; // Exit the loop if 30 buttons have been clicked
            }
        }
        System.out.println("Number of connection requests sent: " + count);
    }


            


        
    }


