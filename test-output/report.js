$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/shareit/Eclipse/CucumPOM/src/main/java/com/qa/features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "CRMPRO application test",
  "description": "",
  "id": "crmpro-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validating the pages for the application",
  "description": "",
  "id": "crmpro-application-test;validating-the-pages-for-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user log into app",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_open_the_browser()"
});
formatter.result({
  "duration": 10582782253,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 71822799,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_log_into_app()"
});
formatter.result({
  "duration": 6213291121,
  "status": "passed"
});
});