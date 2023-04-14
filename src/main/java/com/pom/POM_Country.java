package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Country {
	public POM_Country(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
	
	@FindBy(xpath="//select[@style='width: 200px;']")
	private WebElement selectcountry;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agreetermsbutton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbutton;

	

	public WebElement getSelectcountry() {
		return selectcountry;
	}

	public WebElement getAgreetermsbutton() {
		return agreetermsbutton;
	}

	public WebElement getProceedbutton() {
		return proceedbutton;
	}

}
