@Regression
Feature: Feature to test company carrer page functionality

  Background:
  Given I launch company career page 

  @smoke
  Scenario: Verify Professionals career page launch when user click Professionals career type 
  When I click required type company career page
  |careerType|
  |Professionals|
  Then I verify user landed on clicked type company career page
  |careerType|
  |Professionals – Deutsche Bank Careers|
  
  
  @smoke
  Scenario: Verify Professionals career page launch when user click Students and Graduates career type
  When I click required type company career page
  |careerType|
  |Students and Graduates|
  Then I verify user landed on clicked type company career page
  |careerType|
  |Students and Graduates – Deutsche Bank Careers|
  
  
   @smoke
  Scenario: Verify dropdown of what is your availability field
  When I click required type company career page
  |careerType|
  |Professionals|
  Then I verify dropdowns of "what is your availability"
  | Full time          |
  | Part time          |
  
  @Sanity 
  Scenario: Verify dropdown of Corporate title field
  When I click required type company career page
  |careerType|
  |Professionals|
  Then I verify dropdowns of "Corporate title"
 	|Analyst|
	|Assistant Vice President|
	|Associate|
	|Director|
	|Managing Director|
	|No Corporate Title |
	|Not Applicable |
	|Vice President |
	
  @Sanity 
  Scenario: Verify when user enter wrong type job, no job should be appear
  And I click required type company career page
  |careerType|
  |Professionals|
  And I enter job keyword in textbox
  |chairman|
  When I click search button
  Then I verify mentioned number job appear
 	 |0|
  
  @Sanity 
  Scenario: Verify when user enter job keyword, then relevant job should display
  When I click required type company career page
  |careerType|
  |Professionals|
  And I enter job keyword in textbox
  |Manager|
  Then I verify numbers of results displayed on screen more than zero
  When I click search button
  Then I verify all job result should contain searched keyword
  |Manager|
  
  @Sanity 
  Scenario: Verify if user enter job id, same job id job should be display
  When I click required type company career page
  |careerType|
  |Professionals|
  And I enter job keyword in textbox
  |R0377840|
  When I click search button
  Then I verify mentioned number job appear
 	 |1|
  When I click on search job heading displayed
  Then I verify mentioned jod id displayed
  |Job ID:R0377840|
  

  
  
  
  

