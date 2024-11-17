package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationJobPage {
	
	//button[text()='Easy Apply']
	
	@FindBy(xpath="//button[text()='Easy Apply']")
	private WebElement Easyapply;
	
	@FindBy(xpath = "//button[@id='searchFilter_timePostedRange']")
	private WebElement postshort;
	
	//EAsy button 
   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement easy;
   //First Next button 
   @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[1]/span[1]")
	private WebElement Next1;
   // Second next button 
   @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[2]/span[1]")
    private WebElement Next2;	
   // Third next button 
   
	
   @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[2]/span[1]")
   private WebElement Next3;	
   
   
   @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[2]/span[1]")
   private WebElement Review;
   
   ///html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/footer[1]/div[3]/button[2]/span[1]
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/footer[1]/div[3]/button[2]/span[1]")
		   private WebElement Submit;
	
	///html[1]/body[1]/div[4]/div[1]/div[1]/button[1]/*[name()='svg'][1]/*[name()='use'][1]
	 
	 
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/button[1]/*[name()='svg'][1]/*[name()='use'][1]")
		   private WebElement popUpClose;
	

			@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst;
	@FindBy(xpath = "//label[@for='timePostedRange-r86400']")
	private WebElement past24hrs;
	//(//span[@class='artdeco-button__text'][normalize-space()='Show 222 results'])[1]
	@FindBy(xpath="//button[contains(@aria-label, 'Apply current filter to show')][1]")
			private WebElement resultbtn;
	public AutomationJobPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void postshortButton() {
		postshort.click();
	}
// By getters we can open the date ost sort Drop down 
	
	public WebElement postshortButton1() {
		return postshort;
	}
	
	public void easyApplyButton() {
		Easyapply.click();
	} 
	
	
	
	public void resultButton() {
		resultbtn.click();
	} 
	public void past24hrstButton() {
		past24hrs.click();
	} 
	public WebElement getPostshortButton1() {
	    return postshort;
	}

	public WebElement getPast24hrs() {
	    return past24hrs;
	}

	public WebElement getResultButton() {
	    return resultbtn;
	}
	
	public void easyJobButton() {
		easy.click();
	} 
	public void Next1Button() {
		Next1.click();
	} 
	
	public void Next2Button() {
		Next2.click();
	} 
	public void Next3Button() {
		Next3.click();
	} 
	public void ReviewButton() {
		Review.click();
	} 
	
	public void SubmitButton() {
		Submit.click();
	} 
	public void popUpCloseButton() {
		popUpClose.click();
	} 
	
	public void ClickonfirstLink() {
		Clickonfirst.click();
	} 
	
}
