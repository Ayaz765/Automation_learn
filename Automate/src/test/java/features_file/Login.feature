Feature: Login Functionality

Scenario Outline: Successfull Validation with Valid data

Given Browser is launched

And User is launched on WebPage with <URL>

And User move the key cursor to the Account & List

And click on sign in

When User enter <email>

And click on sumit

When User enter pass <password>

And click on final submit

Then Page is move to HomePage

Examples:

|          email                     |    password       |                               URL                  |
|   ayazahmad984@gmail.com           |   Pass@123453     |                    https://www.amazon.in           |


