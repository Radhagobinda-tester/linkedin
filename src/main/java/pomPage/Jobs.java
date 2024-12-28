package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobs {
	
	@FindBy(xpath="//a[contains(., 'automation test engineer')][1]")
	private WebElement jobautomation;
	
	//id="jobs-search-box-keyword-id-ember1086"
	// automation search field 
	
	@FindBy(xpath = "//input[@aria-label='Search by title, skill, or company']")
	private WebElement searchinput;

	
	// place search field 
	@FindBy(xpath = "//input[@aria-label='City, state, or zip code']")
	private WebElement location;
	
	//search button
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbttn;

	public Jobs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void autoMationJobs() {
		jobautomation.click();
	}
	
	public void autoMationsearchfield(String key) {
		searchinput.sendKeys(key);
	}
	
	public void locationsearchfieldclear() {
		location.clear();
	}
	
	public void locationsearchfield(String key) {
		location.sendKeys(key);
	}
	
	public void locationsearchfieldclick() {
		location.click();
	}
	
	public void searchButton() {
		searchbttn.click();
	}
}
