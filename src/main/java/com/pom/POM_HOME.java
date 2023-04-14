package com.pom;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class POM_HOME {
	public POM_HOME(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchinputbox;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addtocardbutton;
	
	

	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement mycart;
	
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement checkoutbutton;
	
	


	public WebElement getSearchinputbox() {
		return searchinputbox;
	}


	public WebElement getAddtocardbutton() {
		return addtocardbutton;
	}


	public WebElement getMycart() {
		return mycart;
	}


	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}

	
	
}
