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
  "name": "Verify Professionals career page launch when user click Professionals career type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I click required type company career page",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00274.20.0\u0027, revision: \u0027866c76ca80\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c03f073aab221ff0f18a11dde5a8b8e8, findElement {using\u003dxpath, value\u003d//a[@title\u003d\u0027Professionals\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 135.0.7049.96, chrome: {chromedriverVersion: 135.0.7049.95 (de2eb485a195..., userDataDir: C:\\Users\\nk165\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:60382}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:60382/devtoo..., se:cdpVersion: 135.0.7049.96, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: c03f073aab221ff0f18a11dde5a8b8e8\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)\r\n\tat com.career.bdd.pages.CareerPage.clickCareerType(CareerPage.java:100)\r\n\tat com.career.bdd.helper.CareerHelper.clickRequiredTypeCareerPage(CareerHelper.java:77)\r\n\tat StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(CompanyCareerSteps.java:39)\r\n\tat ✽.I click required type company career page(file:///C:/Users/nk165/OneDrive/Desktop/Rohit/lamdaTest/companyCareerPage/src/test/resources/Features/map.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify user landed on clicked type company career page",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_verify_user_landed_on_clicked_type_company_career_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "Verify Professionals career page launch when user click Students and Graduates career type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I click required type company career page",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00274.20.0\u0027, revision: \u0027866c76ca80\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [e118afa1d7889d702f55549926bdb25a, findElement {using\u003dxpath, value\u003d//a[@title\u003d\u0027Students and Graduates\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 135.0.7049.96, chrome: {chromedriverVersion: 135.0.7049.95 (de2eb485a195..., userDataDir: C:\\Users\\nk165\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:60401}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:60401/devtoo..., se:cdpVersion: 135.0.7049.96, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: e118afa1d7889d702f55549926bdb25a\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)\r\n\tat com.career.bdd.pages.CareerPage.clickCareerType(CareerPage.java:100)\r\n\tat com.career.bdd.helper.CareerHelper.clickRequiredTypeCareerPage(CareerHelper.java:77)\r\n\tat StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(CompanyCareerSteps.java:39)\r\n\tat ✽.I click required type company career page(file:///C:/Users/nk165/OneDrive/Desktop/Rohit/lamdaTest/companyCareerPage/src/test/resources/Features/map.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify user landed on clicked type company career page",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_verify_user_landed_on_clicked_type_company_career_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "Verify dropdown of what is your availability field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I click required type company career page",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d135.0.7049.96)\nBuild info: version: \u00274.20.0\u0027, revision: \u0027866c76ca80\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d95d3421ef9424592fa35c4f8991568c, findElement {using\u003dxpath, value\u003d//a[@title\u003d\u0027Professionals\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 135.0.7049.96, chrome: {chromedriverVersion: 135.0.7049.95 (de2eb485a195..., userDataDir: C:\\Users\\nk165\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:60420}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:60420/devtoo..., se:cdpVersion: 135.0.7049.96, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: d95d3421ef9424592fa35c4f8991568c\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)\r\n\tat com.career.bdd.pages.CareerPage.clickCareerType(CareerPage.java:100)\r\n\tat com.career.bdd.helper.CareerHelper.clickRequiredTypeCareerPage(CareerHelper.java:77)\r\n\tat StepDefinitions.CompanyCareerSteps.i_click_required_type_career_page(CompanyCareerSteps.java:39)\r\n\tat ✽.I click required type company career page(file:///C:/Users/nk165/OneDrive/Desktop/Rohit/lamdaTest/companyCareerPage/src/test/resources/Features/map.feature:29)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify dropdowns of \"what is your availability\"",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CompanyCareerSteps.i_verify_dropdowns(java.lang.String,io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});