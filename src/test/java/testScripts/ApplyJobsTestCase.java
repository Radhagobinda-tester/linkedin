package testScripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPage.AutomationJobPage;
import pomPage.Jobs;
import pomPage.Login_Page;
import pomPage.homePage;
import java.time.Duration;


@Test(invocationCount =1)
public class ApplyJobsTestCase extends BaseClass1 {
	

	 public void  ApplyJobsTestCase() throws IOException, InterruptedException{
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	 Login_Page p2 = new Login_Page(driver);
	 Thread.sleep(5000);
        p2.Emailtextf(pdata.getPropertyfiledata("Email1"));
        Thread.sleep(5000);
        p2.passwordtextf(pdata.getPropertyfiledata("Password1"));
        Thread.sleep(5000);
        p2.loginButtn();
        Thread.sleep(5000);
        homePage H5 = new homePage(driver);
        // click the jobs option on the header 
        H5.job();
        Thread.sleep(5000);
        Jobs j2 = new Jobs(driver);
        Thread.sleep(5000);
        // Tapping on automation link
        
        j2.autoMationJobs();
        
        Thread.sleep(5000);
        // Entering the place name 
        j2.autoMationsearchfield(pdata.getPropertyfiledata("searchjobtitle"));
        Thread.sleep(5000);
        // Entering the location name 
        j2.locationsearchfieldclear();
        Thread.sleep(5000);
        j2.locationsearchfield(pdata.getPropertyfiledata("Jobsearcharea"));
        Thread.sleep(5000);
        j2.locationsearchfieldclick();
        Thread.sleep(5000);
        j2.searchButton();
        Thread.sleep(20000);
        driver.close();
        /*
        
AutomationJobPage a = new AutomationJobPage(driver);

         //Thread.sleep(20000);
         
         // a.easyApplyButton();
          
          Thread.sleep(20000);
        // Open the "Date posted" filter
        wait.until(ExpectedConditions.elementToBeClickable(a.getPostshortButton1()));
        a.postshortButton();
        Thread.sleep(20000);
        
        // Re-locate the "Past 24 hours" radio button to avoid stale reference
        WebElement past24hrsButton = a.getPast24hrs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", past24hrsButton); // Scroll the "Past 24 hours" radio button into view
        past24hrsButton.click(); // Click the radio button
        Thread.sleep(20000);
     
        // Click the "Show results" button
        wait.until(ExpectedConditions.elementToBeClickable(a.getResultButton()));
        a.resultButton();
      Thread.sleep(20000);
        a.easyJobButton();
        driver.navigate().refresh();
        /*
        Thread.sleep(20000);
        a.Next1Button();
        Thread.sleep(20000);
        Thread.sleep(20000);
        
        a.Next2Button();
        Thread.sleep(20000);
        
        a.Next3Button();
        Thread.sleep(20000);
        
        a.ReviewButton();
        Thread.sleep(20000);
        
        a.SubmitButton();
        Thread.sleep(20000);
        */
        /*
        try {
            a.Next1Button();
        } catch (Exception e) {
            System.out.println("An error occurred in Next1Button: " + e.getMessage());
        }
        Thread.sleep(20000);

        try {
            a.Next2Button();
        } catch (Exception e) {
            System.out.println("An error occurred in Next2Button: " + e.getMessage());
        }
        Thread.sleep(20000);

        try {
            a.Next3Button();
        } catch (Exception e) {
            System.out.println("An error occurred in Next3Button: " + e.getMessage());
        }
        Thread.sleep(20000);

        try {
            a.ReviewButton();
        } catch (Exception e) {
            System.out.println("An error occurred in ReviewButton: " + e.getMessage());
        }
        Thread.sleep(20000);

        try {
            a.SubmitButton();
        } catch (Exception e) {
            System.out.println("An error occurred in SubmitButton: " + e.getMessage());
        }
        Thread.sleep(20000);

        a.popUpCloseButton();
        Thread.sleep(20000);
        */
        // now given
        /*
        for (int i = 0; i < 5; i++) {
            try {
            	a.ClickonfirstLink();
                Thread.sleep(20000);

                // Click "Easy Job" button
                a.easyJobButton();
                Thread.sleep(20000);

                // Click "Next" buttons with error handling
                try {
                    a.Next1Button();
                } catch (Exception e) {
                    System.out.println("An error occurred in Next1Button: " + e.getMessage());
                }
                Thread.sleep(20000);

                try {
                    a.Next2Button();
                } catch (Exception e) {
                    System.out.println("An error occurred in Next2Button: " + e.getMessage());
                }
                Thread.sleep(20000);
                
          
                
                String TextName1 = text.getText();
                String expectedTextName1 ="How many years of work experience do you have with Vector?";
                String inputValue;
                if(TextName1.equals(expectedTextName1)) {
                  
                 
                 
                }
                 else {
                System.out.println("Actual result is not matching with expected result"); 
                 }

                try {
                    a.Next3Button();
                } catch (Exception e) {
                    System.out.println("An error occurred in Next3Button: " + e.getMessage());
                }
                Thread.sleep(20000);

                // Review and Submit with error handling
                try {
                    a.ReviewButton();
                } catch (Exception e) {
                    System.out.println("An error occurred in ReviewButton: " + e.getMessage());
                }
                Thread.sleep(20000);

                try {
                    a.SubmitButton();
                } catch (Exception e) {
                    System.out.println("An error occurred in SubmitButton: " + e.getMessage());
                }
                Thread.sleep(20000);

                // Close any pop-up if present
                a.popUpCloseButton();
                Thread.sleep(20000);
                
                // Refresh the page before the next iteration
                driver.navigate().refresh();
                Thread.sleep(20000);

            } catch (Exception e) {
                System.out.println("An error occurred in loop iteration " + (i+1) + ": " + e.getMessage());
            }
        }
*/
	 }
}
