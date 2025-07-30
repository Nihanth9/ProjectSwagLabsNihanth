package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	//Web Element Identification and Declaration
		@FindBy(id = "checkout")
		private WebElement checkout;
		@FindBy(id = "first-name")
		private WebElement fname;
		
		@FindBy(id = "last-name")
		private WebElement lname;
		
		@FindBy(id = "postal-code")
		private WebElement zipCode;
		
		@FindBy(id = "continue")
		private WebElement continueButton;
		
		@FindBy(id = "finish")
		private WebElement finish;
		
		@FindBy(id = "back-to-products")
		private WebElement bthButton;
		
		
		//Web Element Initialization
		public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
		//Web Element Utilization
		public WebElement getcheckout() {
			return checkout;
		}
		public WebElement getfname() {
			return fname;
		}
		public WebElement getlname() {
			return lname;
		}
		public WebElement getzipCode() {
			return zipCode;
		}
		public WebElement getcontinueButton() {
			return continueButton;
		}
		public WebElement getfinish() {
			return finish;
		}
		public WebElement getbthButton() {
			return bthButton;
		}
		
		
}
