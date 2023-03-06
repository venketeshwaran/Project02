Feature: Online Shopping site

Scenario: User order the vegetables
   Given User launch the url
   When User search the item 
   And User click the add to cart button
   And User click the items icon
   And User Click the proceed to checkout button
   Then next page 
   
Scenario: User place the order

When user click the promo code and send the value
And user click the apply button
And user click the place order button

Scenario: Proceed the order

When user select the country
And user click the agree button
And user click the proceed button
   