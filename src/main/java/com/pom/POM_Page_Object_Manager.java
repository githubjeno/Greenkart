package com.pom;

import org.openqa.selenium.WebDriver;

public class POM_Page_Object_Manager {

	public static WebDriver driver;
	private POM_Cart pcart;
	private POM_Country pcountry;
	private POM_HOME phome;
	public POM_Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public POM_Cart getPcart() {
		pcart = new POM_Cart(driver);
		return pcart;
	}
	public POM_Country getPcountry() {
		pcountry = new POM_Country(driver);
		return pcountry;
	}
	public POM_HOME getPhome() {
		phome = new POM_HOME(driver);
		return phome;
	}
	
	
}
