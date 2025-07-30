package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Web Element Identification and Declaration
	@FindBy(id = "user-name")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	//Web Element Initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Web Element Utilization
	public WebElement getusername() {
		return username;
		
	}
	public WebElement getpassword() {
		return password;
		
	}
	public WebElement getloginButton() {
		return loginButton;
		
	}
	
}