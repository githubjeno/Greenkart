package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Cart {
	
	@FindBy(xpath="//input[@class='promoCode']")
	private WebElement promocodeinputbox;
	
	@FindBy(xpath="//button[@class='promoBtn']")
	private WebElement applybutton;
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement placeorderbutton;

	public POM_Cart(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getPromocodeinputbox() {
		return promocodeinputbox;
	}

	public WebElement getApplybutton() {
		return applybutton;
	}

	public WebElement getPlaceorderbutton() {
		return placeorderbutton;
	}
	
	

}
