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
 ///html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]
	@FindBy(xpath ="//span[text()='Connect']")
    private List<WebElement> connectButtons;
	

 /*
	// for selecting people from same category

	@FindBy(xpath = "//span[@class='artdeco-button__text'][normalize-space()='Connect'])[49]")
    private List<WebElement> connectButtons;
    */
 //see all button naviagtion 
	////button[@aria-label='Show all suggestions for People you may know from Tech Mahindra']//span[@class='yyosflm cnuthteo cnutht0 h8e4ml0 _1xoe5hd0 cnuthtbs cnuthti8 cnutht17k _1s9oaxg7 _1s9oaxgi _1pylls4i _1pylls4m _139m7k7f _139m7k7m _139m7k7k _139m7k19r _139m7k1a1 _139m7k19w yyosfl11 h8e4mlbg _1k2lxme120 _1k2lxme15s _1k2lxmets _1k2lxmexk _1ptbkx6w8 yyosfl1c']
	///html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/section[1]/div[1]/div[1]/button[1]/span[1]
	///html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]
	@FindBy(xpath="//button[@aria-label='Show all suggestions for People you may know from Tech Mahindra']//span[@class='yyosflm cnuthteo cnutht0 h8e4ml0 _1xoe5hd0 cnuthtbs cnuthti8 cnutht17k _1s9oaxg7 _1s9oaxgi _1pylls4i _1pylls4m _139m7k7f _139m7k7m _139m7k7k _139m7k19r _139m7k1a1 _139m7k19w yyosfl11 h8e4mlbg _1k2lxme120 _1k2lxme15s _1k2lxmets _1k2lxmexk _1ptbkx6w8 yyosfl1c']")
	private WebElement showall;
	
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
    	showall.click();
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
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", showall);
        Thread.sleep(5000); // Adjust sleep time as needed
        //seeall.click();
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


