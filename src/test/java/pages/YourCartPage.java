package pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class YourCartPage {
	
	
	 @FindBy(how = How.CLASS_NAME, using = "inventory_item_name")
	  List<WebElement> cartitems;

	  
	  @FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
	  WebElement cartPage;
	     
	 
	  	  
	  @FindBy(how = How.ID, using = "checkout")
	  WebElement checkout;
	  
	  public WebElement validateCartPage() {
	        return cartPage;
	  }
	 
	
	  public void clickOnCheckout() {
		  checkout.click();
		  }
	       


}
