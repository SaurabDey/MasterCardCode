Feature: All the links in the file are loaded


  Scenario: Check the links are loaded
    Given I have opened the mastercard developer site
    When I click on the link and check it should get loaded
                |Solutions|
                |APIs|
                |New & Experimental|
                |Partner Programs|
                |Case Studies|
                |Blog|
                |Support|
                |Search|
                |Sign Up|
                |Log In|
    Then close the browser

   