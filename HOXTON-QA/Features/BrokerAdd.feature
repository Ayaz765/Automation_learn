Feature: BrokerAdd
Scenario: Sucessfully New Broker Creation
Given User Launch Chrome Browser
When User Open Url "https://uatbrokerportal.hoxtoninsuranceservices.com"
And User enter Email as "yashaswini.malviya@xceedance.com" and Password as "Pass@12345"
And Click on Login
When user click on UserManagment
Then Search User and Add New User pop will appear
When User click on Add new User
Then Add User page will open
When User fill the detail of User and Click on submit
Then New broker is created
And Browser is closed
