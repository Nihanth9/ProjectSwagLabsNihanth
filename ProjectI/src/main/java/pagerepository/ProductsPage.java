package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	//Web Element Initialization
	@FindBy(id = "add-to-cart")
	private WebElement addtoCart1;
	@FindBy (css = "#back-to-products")
	private WebElement backtoproducts;
	
	@FindBy(id = "add-to-cart")
	private WebElement addtoCart2;
	@FindBy (css = "#back-to-products")
	private WebElement backtoproducts2;
	
	@FindBy(id = "add-to-cart")
	private WebElement addtoCart3;
	@FindBy (css = "#back-to-products")
	private WebElement backtoproducts3;
	
	//Web Element Initialization
			public ProductsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
	//Web Element Utilization		
	public WebElement getaddtoCart1() {
		return addtoCart1;
	}
	public WebElement getaddtoCart2() {
		return addtoCart2;
	}
	public WebElement getaddtoCart3() {
		return addtoCart3;
	}
	
	public WebElement getbacktoproducts3() {
		return backtoproducts3;
	}
	public WebElement getbacktoproducts2() {
		return backtoproducts2;
	}
	public WebElement getbacktoproducts() {
		return backtoproducts;
	}
}
