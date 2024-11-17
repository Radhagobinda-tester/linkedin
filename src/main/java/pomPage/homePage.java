package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	@FindBy(xpath="//span[contains(@title,'My Network')]")
	private WebElement Mynetwork;
	@FindBy(xpath="//span[contains(@title,'Jobs')]")
	private WebElement jobs;
	// initialization

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//Declaration

		public void Myntwrk() {
			Mynetwork.click();
		}

		//span[normalize-space(text())='MyNetwork']
		public void job() {
			jobs.click();
		}

}
