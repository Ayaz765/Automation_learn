Feature: Add Client functionlity

Background:

 Given Browser is launched

 And User is landed on login Page with https://uatbrokerportal.hoxtoninsuranceservices.com

 When user enter in the username yashaswini.malviya@xceedance.com  and password Pass@12345

 And Click on Login Button



 

Scenario Outline: Successful Client Creation

 When  Click on Client Management
 
 And Click Add New Client
 
 When  User enter all the details of client <firstname> and <lastname>

 And click on submit button

 Then Client has been created with message on UI
 

Examples:

    |  firstname|  lastname|
    |    azam   |   singh  |
