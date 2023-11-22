Feature: Search Broker functionlity

Background:

 Given Browser is launched

 And User is landed on login Page with https://uatbrokerportal.hoxtoninsuranceservices.com

 When user enter in the username yashaswini.malviya@xceedance.com  and password Pass@12345

 And Click on Login Button



 

Scenario Outline: Successful Search Broker By User_id

When User click on UserManagment

And User click on Search

When Enter the <user_id> 

Then Click on Search tab

Examples:
|user_id|
|  Wer  |