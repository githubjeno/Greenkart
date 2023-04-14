Feature: Ordering  required vegetables or fruits 

Scenario: user select the required vegetable 

	Given user launch the url
	When  user searches in the searchbox 
	And user clicks add to cart button 
	And user click the cart items icon 
	And user click the proceed to checkout button 
	
Scenario: User place the order 
	When user enter promo code 
	And user click the apply button 
	And user click  the place order button  
	
Scenario: User confirm the order 
	When user select his country to deliver
	And user clicks the agree button
	And user click the proceed button
	