@ebay-search
Feature: ebay search operations

  Background:
    Given I connect to eBay

  @ebay-search-operations
  Scenario: Standard Search
    Then I search for "Health & Beauty"
    And I select the "Condition" for "New"
    And I assert the condition "-" is displayed
    And I select the "Condition" for "Used"
    And I assert the condition "-" is displayed
    And I select the "Delivery Options" for "Update your location"
    And I enter select "Select country" for "Italy - ITA"
    And I enter select "Max Distance" for "500 mi"
    And I enter the "Zip code" to "20100-20199"
    And I click on "Apply" operation
    And I click on "Cancel" operation
    And I select the "Sort:" for "Time: ending soonest"
    Then I scroll to the "Type" from menu
    Then I click on "see all" from "Type" menu
    And I assert that the condition "New" remains displayed
    And I assert that the condition "Used" remains displayed
    Then I scroll to the "Under-Eye Patches" from the popup
    Then I select the "Under-Eye Patches"
    Then I scroll to the "Derma Roller" from the popup
    Then I select the "Derma Roller"
    Then I scroll to the "Brightener" from the popup
    Then I select the "Brightener"
    Then I scroll to the "Ice Roller" from the popup
    Then I select the "Ice Roller"
    Then I scroll to the "Wrinkle Reducer" from the popup
    Then I select the "Wrinkle Reducer"
    Then I scroll to the "Moisturizer" from the popup
    Then I select the "Moisturizer"
    Then I scroll to the "Microneedle" from the popup
    Then I select the "Microneedle"
    Then I scroll to the "Restructuring" from the popup
    Then I select the "Restructuring"
    Then I scroll to the "Renewal" from the popup
    Then I select the "Renewal"
    And I select "Brand" from the left side
    Then I scroll to the "ANEW" from the popup
    Then I select the "ANEW"
    Then I scroll to the "London" from the popup
    Then I select the "London"
    Then I scroll to the "Aurora" from the popup
    Then I select the "Aurora"
    Then I scroll to the "Magic" from the popup
    Then I select the "Magic"
    Then I scroll to the "Marula" from the popup
    Then I select the "Marula"
    Then I scroll to the "Cerave" from the popup
    Then I select the "Cerave"
    Then I scroll to the "PRAI" from the popup
    Then I select the "PRAI"
    Then I scroll to the "Dior" from the popup
    Then I select the "Dior"
    And I select "Price" from the left side
    Then I select the Popular price ranges to "Under $"
    Then I select the Popular price ranges to "to $"
    Then I select the Popular price ranges to "Over $"
    And I Choose the price "Min" to "5" and "Max" to "500"
    And I select "Show only" from the left side
    And I select "Price" from the left side
    And I click on "Apply" operation
    Then I click on advanced search
    And I Enter keywords "Enter keywords or item number" with "Health & Beauty"
    And I choose "Keyword options" for "All words, any order"
    And I enter "Exclude words" for "Demo E2E Test"
    And I choose "In this category" for "eBay Motors"
    And I click on a white space
    And I scroll for the field set "Search Including"
    Then I click the radio button "Completed items" from "Search Including"
    Then I click the radio button "Title and description" from "Search Including"
    Then I click the radio button "Sold items" from "Search Including"
    And I scroll for the field set "Price"
    And I Choose the items priced "Min price" to "11" and "Max price" to "19"
    And I scroll for the field set "Buying Format"
    Then I click the radio button "Accepts offers" from "Buying Format"
    And I scroll for the field set "Condition"
    Then I click the radio button "New" from "Condition"
    And I scroll for the field set "Show Results"
    Then I click the radio button "Free returns" from "Show Results"
    Then I click the radio button "Returns accepted" from "Show Results"
    Then I click the radio button "Authorized seller" from "Show Results"
    Then I click the radio button "Deals and savings" from "Show Results"
    Then I click the radio button "Sale items" from "Show Results"
    Then I click the radio button "Listed as lots" from "Show Results"
    Then I click the radio button "Benefits charity" from "Show Results"
    Then I click the radio button "Authenticity Guarantee" from "Show Results"
    And I Choose the Bid Count "Min bid count" to "2500" and "Max bid count" to "3000"
    And I Choose the Bid Count "Min quantity" to "119" and "Max quantity" to "204"
    And I scroll for the field set "Show Results"
    Then I click the radio button "Free returns" from "Show Results"
    And I scroll for the field set "Shipping Options"
    Then I click the radio button "Free shipping" from "Shipping Options"
    Then I click the radio button "Local pickup" from "Shipping Options"
    And I scroll for the field set "Condition"
    Then I click the radio button "Free shipping" from "Shipping Options"
    And I scroll for the field set "Item Location"
    Then I click the radio button "Worldwide" from "Item Location"
    And I scroll for the Location "Located in" to "Italy"
    And I click on a white space
    And I scroll for the Location "Available to " to "Austria"
    And I click on a white space
    And I scroll for the field set "Sellers"
    Then I fill the "Sellers" with "E2E Test"
    And I sort "Sort By" for "Best match"
    And I sort "View Results" for "List view"
    And I sort "Results Per Page" for "240"
    And I click on the second "Search" operation

  @ebay-standard-search
  Scenario: Standard Search
    Then I search for "Health & Beauty"
    And I select the "Condition" for "New"
    And I assert the condition "-" is displayed
    And I select the "Condition" for "Used"
    And I assert the condition "-" is displayed
    And I select the "Delivery Options" for "Update your location"
    And I enter select "Select country" for "Italy - ITA"
    And I enter select "Max Distance" for "500 mi"
    And I enter the "Zip code" to "20100-20199"
    And I click on "Apply" operation
    And I click on "Cancel" operation
    And I select the "Sort:" for "Time: ending soonest"
    Then I scroll to the "Type" from menu
    Then I click on "see all" from "Type" menu
    And I assert that the condition "New" remains displayed
    And I assert that the condition "Used" remains displayed
    Then I scroll to the "Under-Eye Patches" from the popup
    Then I select the "Under-Eye Patches"
    Then I scroll to the "Derma Roller" from the popup
    Then I select the "Derma Roller"
    Then I scroll to the "Brightener" from the popup
    Then I select the "Brightener"
    And I select "Brand" from the left side
    Then I scroll to the "ANEW" from the popup
    Then I select the "ANEW"
    Then I scroll to the "Argan" from the popup
    Then I select the "Argan"
    Then I scroll to the "London" from the popup
    Then I select the "London"
    Then I scroll to the "Aurora" from the popup
    Then I select the "Aurora"
    Then I scroll to the "Magic" from the popup
    Then I select the "Magic"
    Then I scroll to the "Marula" from the popup
    Then I select the "Marula"
    Then I scroll to the "Cerave" from the popup
    Then I select the "Cerave"
    Then I scroll to the "PRAI" from the popup
    Then I select the "PRAI"
    Then I scroll to the "Derma" from the popup
    Then I select the "Derma"
    Then I scroll to the "Dior" from the popup
    Then I select the "Dior"
    And I select "Price" from the left side
    Then I select the Popular price ranges to "Under $"
    Then I select the Popular price ranges to "to $"
    Then I select the Popular price ranges to "Over $"
    And I Choose the price "Min" to "5" and "Max" to "500"
    And I select "Show only" from the left side
    And I select "Price" from the left side
    And I click on "Apply" operation
    And I assert the condition "Brightener" is displayed

  @ebay-advanced-search
  Scenario: advanced Search
    Then I click on advanced search
    And I Enter keywords "Enter keywords or item number" with "Health & Beauty"
    And I enter "Exclude words" for "Demo E2E Test"
    And I choose "In this category" for "eBay Motors"
    And I click on a white space
    And I scroll for the field set "Price"
    And I Choose the items priced "Min price" to "11" and "Max price" to "19"
    And I scroll for the field set "Condition"
    And I scroll for the field set "Show Results"
    And I Choose the Bid Count "Min bid count" to "2500" and "Max bid count" to "3000"
    And I Choose the Bid Count "Min quantity" to "119" and "Max quantity" to "204"
    And I scroll for the field set "Item Location"
    And I scroll for the Location "Located in" to "Italy"
    And I click on a white space
    And I scroll for the Location "Available to " to "Austria"
    And I click on a white space
    And I scroll for the field set "Sellers"
    And I click on the second "Search" operation