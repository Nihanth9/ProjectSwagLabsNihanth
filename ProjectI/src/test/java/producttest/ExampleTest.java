package producttest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericlibrary.BaseConfig;
import genericlibrary.WebDriverLibrary;
import pagerepository.CheckoutPage;
import pagerepository.HomePage;
import pagerepository.ProductsPage;

@Listeners(listenerlibrary.ListenerImplementation.class)
public class ExampleTest  extends BaseConfig{
	
	@Test(dataProvider = "readValues", priority = 1, invocationCount = 1)
	public void orderProducts(String fname, String lname, String zip) {
	
	//Create an object for Home page and Product Page
		HomePage hpobj = new HomePage(driver);
		hpobj.getfirstProd().click();
		
		ProductsPage ppobj= new ProductsPage(driver);
		ppobj.getaddtoCart1().click();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='1']")), hpobj.getcartButton());
	ppobj.getbacktoproducts().click();
		
		hpobj.getfifthProd().click();
		
		ppobj.getaddtoCart2().click();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='2']")), hpobj.getcartButton2());
	ppobj.getbacktoproducts2().click();
		
		hpobj.getsixthprod().click();
		ppobj.getaddtoCart3().click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='3']")), hpobj.getcartButton3());
		ppobj.getbacktoproducts3().click();
		hpobj.getcartButton3().click();
		Assert.assertEquals( driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");
		
		//Create an object for Checkout page
		CheckoutPage cpobj= new CheckoutPage(driver);
		cpobj.getcheckout().click();
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", driver.getCurrentUrl());  
		
		WebDriverLibrary.enterTheData(cpobj.getfname(), fname);
		WebDriverLibrary.enterTheData(cpobj.getlname(), lname);
		WebDriverLibrary.enterTheData(cpobj.getzipCode(), zip);
		//cpobj.getfname().sendKeys("Nihanth");
		//cpobj.getlname().sendKeys("Chowdary");
		//cpobj.getzipCode().sendKeys("500090");
		
		cpobj.getcontinueButton().click();
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
		
		cpobj.getfinish().click();
		Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", driver.getCurrentUrl());
		
		cpobj.getbthButton().click();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
		
			
	}	
}