package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	//Declaration

	@FindBy(id="username")
	private WebElement EmailtextField;
	@FindBy(id="password")
	private WebElement PasswordtextField;
	@FindBy(xpath ="(//button[normalize-space()='Sign in'])[1]")
	private WebElement Login;

	// initialization

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//Declaration

		public void loginButtn() {
			Login.click();
		}

		public void Emailtextf(String key) {
			EmailtextField.sendKeys(key);
		}
		public void passwordtextf(String key) {

			PasswordtextField.sendKeys(key);
		}



}
