@Regression
Feature: Feature to test company carrer page functionality

  Background:
  Given I launch company career page 

  @smoke
  @XRAY-001
  Scenario: XRAY-001 Verify Professionals career page launch when user click Professionals career type 
  When I click required type company career page
  |careerType|
  |Professionals|
  Then I verify user landed on clicked type company career page
  |careerType|
  |Professionals – Deutsche Bank Careers|
  
  
  @Sanity
  @XRAY-002
  Scenario: XRAY-002 Verify Professionals career page launch when user click Students and Graduates career type
  When I click required type company career page
  |careerType|
  |Students and Graduates|
  Then I verify user landed on clicked type company career page
  |careerType|
  |Students and Graduates – Deutsche Bank Careers|
  
  
  @Sanity
   @XRAY-003
  Scenario: XRAY-003 Verify dropdown of what is your availability field
  When I click required type company career page
  |careerType|
  |Professionals|
  Then I verify dropdowns of "what is your availability"
  | Full time          |
  | Part time          |
  
  @Sanity 
  @XRAY-004
  Scenario: XRAY-004 Verify dropdown of Corporate title field
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
  @XRAY-005
  Scenario: XRAY-005 Verify when user enter wrong type job, no job should be appear
  And I click required type company career page
  |careerType|
  |Professionals|
  And I enter job keyword in textbox
  |chairman|
  When I click search button
  Then I verify mentioned number job appear
 	 |0|
  
  @Sanity 
  @XRAY-006
  Scenario: XRAY-006 Verify when user enter job keyword, then relevant job should display
  When I click required type company career page
  |careerType|
  |Professionals|
  And I enter job keyword in textbox
  |Manager|
  Then I verify numbers of results displayed on screen more than zero
  When I click search button
  Then I verify all job result should contain searched keyword
  |Manager|
  
  @smoke 
  @XRAY-007
  Scenario: XRAY-007 Verify if user enter job id, same job id job should be display
  And I click required type company career page
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
  
  
  @smoke 
  @XRAY-008
  Scenario: XRAY-008 Verify when user enter job location India, then only India cities job should be displayed
  And I click required type company career page
  |careerType|
  |Professionals|
  When I select "India" as a country in dropdown
  And I click search button
  Then I verify only "Indians" cities jobs are listed
  |Pune|
  |Bangalore|
  |Jaipur|
  |Mumbai|
  
  @Sanity 
  @XRAY-009
  Scenario: XRAY-009 Verify that a maximum of 10 jobs are displayed initially, and clicking the Load More 
  button loads 10 additional jobs.
  And I click required type company career page
  |careerType|
  |Professionals|
  And I select "India" as a country in dropdown
  When I click search button
  Then I verify mentioned no of  jobs displayed 
  |no of jobs|
  |10|
  When I click load more buttton
    Then I verify mentioned no of  jobs displayed 
  |no of jobs|
  |20|