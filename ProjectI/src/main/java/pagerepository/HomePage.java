package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Web Element Identification and Declaration
	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
	private WebElement firstProd;
	@FindBy(xpath = "//span[text()='1']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private WebElement fifthProd;
	
	@FindBy(xpath = "//span[text()='2']")
	private WebElement cartButton2;
	
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement sixthprod ;
	
	@FindBy(xpath = "//span[text()='3']")
	private WebElement cartButton3;
	
	@FindBy(xpath = "//a[@data-test=\\\"shopping-cart-link\\\"]")
	private WebElement addtoCart4;
	
	
	
	//Web Element Initialization
		public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		//Web Element Utilization
		
		
		public WebElement getfirstProd() {
			return firstProd;
		}
		
		public WebElement getcartButton() {
			return cartButton;
		}
		public WebElement getfifthProd() {
			return fifthProd;
		}
		
		public WebElement getcartButton2() {
			return cartButton2;
		}
		public WebElement getsixthprod() {
			return sixthprod;
		}
	
		
		public WebElement getcartButton3() {
			return cartButton3;
		}
		
		public WebElement getaddtoCart4() {
			return addtoCart4;
		}
	
}
