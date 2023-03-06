package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement searchBox;
	
	

	public PomPage01(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getItems() {
		return items;
	}

	public WebElement getpToCheckout() {
		return pToCheckout;
	}

	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement items;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement pToCheckout;
	
}
