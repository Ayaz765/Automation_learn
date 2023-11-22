Feature: Login functionality


Scenario Outline: Successful Login with Valid entries

Given Browser is launched

And User is landed on login Page with <URL>

When user enter in the username <username> and password <password>

 And Click on Login Button


Then Page is navigate to the Home page



Examples:

|username                             |  password      |                               URL                  |
|yashaswini.malviya@xceedance.com     | Pass@12345     | https://uatbrokerportal.hoxtoninsuranceservices.com|


Scenario Outline: Unsuccessful Login with Valid entries

Given Browser is launched

And User is landed on login Page with <URL>

When user enter in the username <username> and password <password>

 And Click on Login Button


Then Message is displaying On UI


Examples:

|username                             |  password      |                               URL                  |
|yashaswini.malviya@xcee.com         | Pass@123   | https://uatbrokerportal.hoxtoninsuranceservices.com|






