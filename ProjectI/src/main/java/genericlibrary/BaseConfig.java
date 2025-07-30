package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import pagerepository.LoginPage;
import pagerepository.LogoutPage;

public class BaseConfig {
	public WebDriver driver;
	public static WebDriver staticdriver;
	public String url;
	public String username;
	public String password;
	
	
	@Parameters("BrowserName")
	@BeforeClass
	public void BrowserSetup(String browser)  {
		 browser="edge";
		// Step 1: Open the Browser
		 driver = WebDriverLibrary.openBrowser(browser);
		 staticdriver=driver;
		 
		// Step 2: Maximize the Browser
		 WebDriverLibrary.maximizebrowser();
		 
		 //Wait statement
		 WebDriverLibrary.waitStatement();

		// Step 3: Navigate to the application via URL
		 WebDriverLibrary.navigateToApp(PropertiesLibrary.readData("url"));
		//url=PropertiesLibrary.readData("url");
		//driver.get(url);
		
		// Step 4: Verify the page
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
	}
	
	@BeforeMethod
	public void LoginSwagLabs() {
		
		//Create an object for login page
		LoginPage lobj= new LoginPage(driver);
		
		//Validate the username element
		Assert.assertTrue(lobj.getusername().isDisplayed());
		
		//Enter the user name in the textfield 
		WebDriverLibrary.enterTheData(lobj.getusername(), PropertiesLibrary.readData("username"));
		
		// Step 5: Identify the Element User name and Pass the data
		//username=PropertiesLibrary.readData("username");
		//WebElement username1 = driver.findElement(By.id("user-name"));
		//username1.sendKeys(username);
		
		//Validate the password element
			Assert.assertTrue(lobj.getpassword().isDisplayed());
		//Enter the user name in the textfield 
			WebDriverLibrary.enterTheData(lobj.getpassword(), PropertiesLibrary.readData("password"));

				
		// Step 6: Identify the Element Password and Pass the data
		//password=PropertiesLibrary.readData("password");
		//WebElement password1 = driver.findElement(By.id("password"));
		//password1.sendKeys(password);
		
		// Step 7: Identify the Element Login Button and Click
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		
		//Validate the password element
			Assert.assertTrue(lobj.getloginButton().isDisplayed());		
	//Click on the login button
			WebDriverLibrary.elementClick(lobj.getloginButton());
			
		// Step 8: Verify the page
		//Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
		Reporter.log("Login Successful", true);
	}
	
	@AfterMethod
	public void LogoutSwagLabs() {
		//Step 39: Click on hamburger icon
		//WebElement menu= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		//menu.click();
		
		//Step 40: Click on "Logout" link
		//WebElement logout= driver.findElement(By.id("logout_sidebar_link"));
		//logout.click();
		
		//Create an object for logout page
		LogoutPage logoutobj=new LogoutPage(driver);
		
		//Validate the menu button element
		Assert.assertTrue(logoutobj.getmenu().isDisplayed());	
		//Click on the logout button
		WebDriverLibrary.elementClick(logoutobj.getmenu());
		
		WebDriverLibrary.waitStatement(logoutobj.getlogout());
		//Validate the logout link
		Assert.assertTrue(logoutobj.getlogout().isDisplayed());		
		//Click on the logout link
		WebDriverLibrary.elementClick(logoutobj.getlogout());
	}
		
	@AfterClass
	public void BrowserTermination() {
		//Step 41: Close the browser
		//driver.close(); 
	WebDriverLibrary.closeAllWindows();
	}
	@DataProvider
	public Object[][] readValues(){
		Object[][] data=new Object[1][3];
		data[0][0]= ExcelLibrary.readData("checkoutdetail", 1, 0);
		data[0][1]=ExcelLibrary.readData("checkoutdetail", 1, 1);
		data[0][2]=ExcelLibrary.readData("checkoutdetail", 1, 2);
		
		return data;
	}
	
	
	}
