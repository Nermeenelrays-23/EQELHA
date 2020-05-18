Feature: Get Quotes
  User can  Get Quotes And choose One of the ICS and purchase it
 Scenario: User Get Quotes
   Given The User Login From HomePage
   And User Click on Get Quotes From HomePage
   And User enter His Basic info
   And User enter His User info
   And User Enter His Vehicle info
   When User Click on Get Quotes
   And Select Insurance company to Purchase
   Then User can purchase it successfully