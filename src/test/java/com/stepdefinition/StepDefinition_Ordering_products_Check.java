package com.stepdefinition;

import java.io.IOException;

import org.apache.commons.io.file.Counters.PathCounters;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.helper.File_Reader;
import com.pom.POM_Cart;
import com.pom.POM_Country;
import com.pom.POM_HOME;
import com.pom.POM_Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition_Ordering_products_Check extends BaseClass{
	
	
  POM_Page_Object_Manager pom = new POM_Page_Object_Manager(driver);
	@Given("user launch the url")
	public void user_launch_the_url() throws IOException {
	   
	    URL(File_Reader.getInstance().geturl());
	}

	@When("user searches in the searchbox")
	public void user_searches_in_the_searchbox() throws InterruptedException, IOException {
	
		pom.getPhome().getSearchinputbox().sendKeys(File_Reader.getInstance().getSearchTerm());
		Thread.sleep(3333);
		
	}
	    
	

	@When("user clicks add to cart button")
	public void user_clicks_add_to_cart_button() {
	   pom.getPhome().getAddtocardbutton().click();
	}

	@When("user click the cart items icon")
	public void user_click_the_cart_items_icon() {
		pom.getPhome().getMycart().click();
	   
	}

	@When("user click the proceed to checkout button")
	public void user_click_the_proceed_to_checkout_button() {
		pom.getPhome().getCheckoutbutton().click();
	  
	}

	@When("user enter promo code")
	public void user_enter_promo_code() throws InterruptedException {
	    
	   Thread.sleep(2222);
	   pom.getPcart().getPromocodeinputbox().sendKeys("mypromo");
	   Thread.sleep(4444);
	}

	@When("user click the apply button")
	public void user_click_the_apply_button() {
	   pom.getPcart().getApplybutton().click();
	}

	@When("user click  the place order button")
	public void user_click_the_place_order_button() {
	  pom.getPcart().getPlaceorderbutton().click();
	}

	@When("user select his country to deliver")
	public void user_select_his_country_to_deliver() throws InterruptedException {
		
		Thread.sleep(999);
	    Select select_Class = SELECT_Class(pom.getPcountry().getSelectcountry());
	    select_Class.selectByValue("India");
	}

	@When("user clicks the agree button")
	public void user_clicks_the_agree_button() {
	    pom.getPcountry().getAgreetermsbutton().click();
	}
	@When("user click the proceed button")
	public void user_click_the_proceed_button() {
	   pom.getPcountry().getProceedbutton().click();
	}

}
