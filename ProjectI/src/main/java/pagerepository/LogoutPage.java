package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	//Web Element Identification and Declaration
		@FindBy(id = "react-burger-menu-btn")
		private WebElement menu;
		
		@FindBy(css = "#logout_sidebar_link")
		private WebElement logout;
		
		//Web Element Initialization
		public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
		//Web Element Utilization
		public WebElement getmenu() {
			return menu;
		}
		public WebElement getlogout() {
			return logout;
		}
}
