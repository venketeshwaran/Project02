package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@style='width: 200px;']")
	private WebElement countrySelect;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agree;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;

	public PomPage03(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCountrySelect() {
		return countrySelect;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getProceed() {
		return proceed;
	}
	

}
