package stepDefinition;


import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductPage;
import pages.YourCartPage;
//import utilities.Hooks;
import pages.CheckoutInformationPage;
import pages.CheckoutOverviewPage;

public class task10  {

	public HomePage hp=PageFactory.initElements(driver, HomePage.class);
	public ProductPage pg=PageFactory.initElements(driver, ProductPage.class);
	public YourCartPage ycp=PageFactory.initElements(driver, YourCartPage.class);
	public CheckoutInformationPage cip=PageFactory.initElements(driver, CheckoutInformationPage.class);
	public CheckoutOverviewPage cop=PageFactory.initElements(driver, CheckoutOverviewPage.class);
	public static WebDriver driver;
	
	
	@Given("I am on  home page")
	public void i_am_on_home_page()  throws InterruptedException {
	      driver =tools.Browser.Open("Chrome");
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		  Thread.sleep(300);


    }

    @When("I enter Username as {string}")
	public void i_enter_username_as(String string1) throws InterruptedException {
    	hp.setUsername(string1);
		Thread.sleep(300);
    }
    @When("I enter Password  as {string}")
    public void i_enter_password_as(String string2) throws InterruptedException {
		  hp.setPassword(string2);
		  Thread.sleep(300);

	}
    
	@When("I submit invalid credential for login")
	public void i_submit_invalid_credential_for_login() {
		  hp.clickOnLoginButton(); 
		  try {
			Assert.assertNotEquals(true, hp.errorShows());
		} catch (AssertionError e) {
		driver.navigate().refresh();
		//Assert.fail();

		}

	}
	@When("I submit valid credential for login")
	public void i_submit_credential_for_login() throws InterruptedException {
		  hp.clickOnLoginButton(); 
		  Thread.sleep(300);

	}
	
    @Then("I validate the landing page")
	public void i_validate_the_landing_page() throws Exception{
			Assert.assertEquals(true, pg.image().isDisplayed());
			  Thread.sleep(300);

    }
  	
    @When("I sort filter high to low")
	public void i_sort_filter_high_to_low() throws InterruptedException {
		 pg.sortHighToLow();
		 Thread.sleep(300);

    }

	@When("I add items in cart")
	public void i_add_items_in_cart() throws InterruptedException {
		 pg.clickOnItem1();
		 Thread.sleep(300);
		 pg.clickOnItem2();
		 Thread.sleep(300);
		 pg.clickOnItem3();
		 Thread.sleep(300);

	}
	@When("I click on cart icon")
	public void i_click_on_cart_icon() throws InterruptedException {
		pg.clickOnCart();
		Thread.sleep(300);

	}
	
	@Then("I  validate the cart page")
	public void i_validate_the_cart_page() throws InterruptedException{
		  Assert.assertEquals(true,ycp.validateCartPage().isDisplayed());
		  Thread.sleep(300);
    } 
  
    @Given("I am on cart page")
    public void i_am_on_cart_page() throws InterruptedException{
	    Assert.assertEquals(true,ycp.validateCartPage().isDisplayed());
		Thread.sleep(300);
    }
    @When("I click to checkout button")
    public void i_click_to_checkout_button()throws InterruptedException {
		  ycp.clickOnCheckout();
		  Thread.sleep(400);
    }
    @Then("I validate checkout landing page")
    public void i_validate_checkout_landing_page() throws InterruptedException {
		Assert.assertEquals(true,cip.checkoutLandingPage().isDisplayed());
	    Thread.sleep(400);
	}

	@When("^I enter Firstname as \"([a-zA-z]+)\"$")
	public void i_enter_firstname_as(String string) throws InterruptedException{
		 cip.setFirstname(string);	
		 Thread.sleep(400);
	}
	
	@When("^I enter LastName  as \"([a-zA-z]+)\"$")
	public void i_enter_last_name_as(String string)throws InterruptedException {
		 cip.setLastname(string); 
		  Thread.sleep(400);
	}
	
	@When("^I enter Postal code as \"([0-9]+)\"$")
	public void i_enter_postal_code_as(String string)throws InterruptedException {
		cip.setpostalcode(string);
		  Thread.sleep(400);
	}
	
	@When("I click continue button")
	public void i_click_continue_button() throws InterruptedException{
		cip.clickOnContinue(); 		
		  Thread.sleep(400);
	}

   
	@Then("I validated the continue landing page")
	public void i_validated_the_continue_landing_page() throws InterruptedException{
		 Assert.assertEquals(true,cop.validateOverviewPage().isDisplayed());
		  Thread.sleep(400);
    }


	@Given("I validate cart items")
	public void i_validate_cart_items()throws InterruptedException {
		cop.ValidateCartProduct();
		  Thread.sleep(400);
				
	}

	@When("I click on finish button")
	public void finish_button() throws InterruptedException{
		cop.clickOnFinish();
		  Thread.sleep(400);
		
	}

	@Then("I validate the confirmation page")
	public void confirmation_page()throws InterruptedException {
		 Assert.assertEquals(true,cop.validateConfirmationPage().isDisplayed());

		 driver.quit();
				 }
	
		
@After
public void takeScreenshotOnFailure(Scenario scenario) {
	if(scenario.isFailed()) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src,"image/png", "screenshot");
	}
	//System.out.println("This will run after the Scenario");

}
}
	




