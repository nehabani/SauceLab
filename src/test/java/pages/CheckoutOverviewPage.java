package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutOverviewPage extends YourCartPage {
	
	
	
	  @FindBy(how = How.CLASS_NAME, using = "cart_desc_label")
	  WebElement description;
    	
	  @FindBy(how = How.ID, using = "finish")
	  WebElement finish;
	  
	  @FindBy(how = How.CLASS_NAME, using = "complete-header")
	  WebElement confirmation;
	  
	  @FindBy(how = How.CLASS_NAME, using = "inventory_item_name")
	  List<WebElement> cartProducts;

	  public void ValidateCartProduct()
	  {
		  List<WebElement> afteritem=cartProducts;
		  List<WebElement> beforeitem=cartitems;
		  Assert.assertEquals(afteritem,beforeitem);
		  		 
	  }
	  


	  
	  public WebElement validateOverviewPage() {
	        return description;
	  }
	  public WebElement validateConfirmationPage() {
	        return confirmation;
	  }

      public void clickOnFinish() {
            finish.click();
  }
  


}
