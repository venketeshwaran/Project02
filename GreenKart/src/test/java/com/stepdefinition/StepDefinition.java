package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("User launch the url")
	public void user_launch_the_url() throws IOException {
	
		String url = File_Reader_Manager.getInstanceCr().getUrl();
		getUrl(url);
	}
	@When("User search the item")
	public void user_search_the_item() {
	
		sendKeys(pom.getInstancePomPage01().getSearchBox(), "tomato");
	}
	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() {
	
		clickOnElement(pom.getInstancePomPage01().getAddToCart());
	} 
	@When("User click the items icon")
	public void user_click_the_items_icon() {
	
		clickOnElement(pom.getInstancePomPage01().getItems());
	}
	@When("User Click the proceed to checkout button")
	public void user_click_the_proceed_to_checkout_button() {
	
		clickOnElement(pom.getInstancePomPage01().getpToCheckout());
		
	}
	@Then("next page")
	public void next_page() {
	
		String actual = driver.getTitle();
		System.out.println(actual);

		Assert.assertEquals(actual, "GreenKart - veg and fruits kart");
		System.out.println(actual);
	}
	
	@When("user click the promo code and send the value")
	public void user_click_the_promo_code_and_send_the_value() throws InterruptedException {
	  Thread.sleep(3000);
		
		sendKeys(pom.getInstancePomPage02().getPromoCode(), "1234");
	}
	@When("user click the apply button")
	public void user_click_the_apply_button() {
	  
		clickOnElement(pom.getInstancePomPage02().getApply());
	}
	@When("user click the place order button")
	public void user_click_the_place_order_button() {
	 
		clickOnElement(pom.getInstancePomPage02().getPlaceOrder());
	}
	
	@When("user select the country")
	public void user_select_the_country() {
	 
		selection(pom.getInstancePomPage03().getCountrySelect(), "byvalue", "India");
	}
	@When("user click the agree button")
	public void user_click_the_agree_button() {
	
		clickOnElement(pom.getInstancePomPage03().getAgree());
	}
	@When("user click the proceed button")
	public void user_click_the_proceed_button() {
	
		clickOnElement(pom.getInstancePomPage03().getProceed());
	}

}
