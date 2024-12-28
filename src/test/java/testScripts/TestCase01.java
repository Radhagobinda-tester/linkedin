package testScripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPage.Login_Page;
import pomPage.My_Network;
import pomPage.homePage;
@Test(invocationCount =3
)

public class TestCase01 extends BaseClass1 {
	 public void TestCase01() throws IOException, InterruptedException {
		 Login_Page p1 = new Login_Page(driver);
		 Thread.sleep(10000);
	        p1.Emailtextf(pdata.getPropertyfiledata("Email1"));
	        Thread.sleep(10000);
	        p1.passwordtextf(pdata.getPropertyfiledata("Password1"));
	        Thread.sleep(10000);
	        p1.loginButtn();
	        Thread.sleep(5000);
	        homePage H = new homePage(driver);
	        H.Myntwrk();
	        Thread.sleep(5000);




	       // driver.navigate().refresh();
	       //Thread.sleep(20000);
	        My_Network n = new My_Network(driver);
	       Thread.sleep(10000);
	      //  n.messageDD();
	       // Thread.sleep(5000);
	       // n.scrollToSeeAllAndClick();
	       //n.SeeAllBtn();

	        Thread.sleep(10000); 
	       
	     //  n.clickAllConnectButtonsAndRefresh();
	        /*
	        // Switching control to the pop-up window
	        String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        for (String handle : allWindowHandles) {
	            if (!handle.equals(mainWindowHandle)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
	        Thread.sleep(20000);
	        // Now you can interact with elements inside the pop-up window

	        // Clicking all the connect buttons
	        n.clickAllConnectButtonsAndRefresh2();
	        */
	        //Thread.sleep(20000);
	        // After interacting with elements in the pop-up window, you may want to switch back to the main window
	       // driver.switchTo().window(mainWindowHandle);
            n.clickAllConnectButtonsAndRefresh2();
            
           // n.scrollToSeeAllAndClick();
            n.clickAllConnectButtonsAndRefresh2();
            //n.scrollToSeeAllAndClick();
            n.clickAllConnectButtonsAndRefresh2();
           // n.scrollToSeeAllAndClick();
            n.clickAllConnectButtonsAndRefresh2();
	    }

	 }




