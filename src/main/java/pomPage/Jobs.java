package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobs {
	
	@FindBy(xpath="//a[contains(., 'automation test engineer')][1]")
	private WebElement jobautomation;
	
	public Jobs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void autoMationJobs() {
		jobautomation.click();
	}
}
