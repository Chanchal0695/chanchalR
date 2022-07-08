package COM.PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement email_tex;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement pass_tex;

	public WebElement getEmail_tex() {
		return email_tex;
	}


	public WebElement getPass_tex() {
		return pass_tex;
	}

	

}

