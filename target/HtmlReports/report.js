$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/map.feature");
formatter.feature({
  "name": "Feature to test company carrer page functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch company career page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_launch_company_career_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "XRAY-009 Verify that a maximum of 10 jobs are displayed initially, and clicking the Load More",
  "description": "  button loads 10 additional jobs.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@XRAY-009"
    }
  ]
});
formatter.step({
  "name": "I click required type company career page",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"India\" as a country in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_select_country_in_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify mentioned no of  jobs displayed",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_verify_mentioned_no_of_jobs_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click load more buttton",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_click_load_more_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify mentioned no of  jobs displayed",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_verify_mentioned_no_of_jobs_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});