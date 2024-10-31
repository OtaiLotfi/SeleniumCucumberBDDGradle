package it.otai.e2e.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import it.otai.e2e.pages.EbayPage;
import it.otai.e2e.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static it.otai.e2e.common.CucumberHelper.getDriver;
import static it.otai.e2e.common.CucumberHelper.getScenarioContext;
import static it.otai.e2e.common.ScenarioContextKeys.SRP_CONTROL_OPTION;

public class EbayStepDefinitions {

    private final EbayPage ebayPage;

    public EbayStepDefinitions(EbayPage ebayPage) {
        this.ebayPage = ebayPage;
    }

    @Given("I connect to eBay")
    public void iConnectToEBay() {
        ebayPage.waitMillis(BasePage.TIMEOUT);
        ebayPage.connectToEBay();
    }

    @Then("I search for {string}")
    public void iSearchFor(String searchForValue) {
        ebayPage.searchFor(searchForValue);
    }

    @And("I select the {string} for {string}")
    public void iSelectTheFor(String srpControlHeader, String srpControlOption) {
        ebayPage.findAndClickOnSvgElement(srpControlHeader, srpControlOption);
        getScenarioContext().setScenarioContext(SRP_CONTROL_OPTION, srpControlOption);
    }

    @And("I assert the condition {string} is displayed")
    public void iAssertTheConditionIsDisplayed(String conditionLabel) {
        String selectedItem = "-".equals(conditionLabel) ? getScenarioContext().getScenarioContext(SRP_CONTROL_OPTION).toString() : conditionLabel;
        ebayPage.assertTheConditionIsDisplayed(selectedItem);
    }

    @And("I enter select {string} for {string}")
    public void iEnterSelectFor(String label, String value) {
        ebayPage.enterSelectFor(label, value);
    }

    @And("I enter the {string} to {string}")
    public void iEnterTheTo(String label, String value) {
        ebayPage.enterTheTo(label, value);
    }

    @And("I click on {string} operation")
    public void iClickOnOperation(String operation) {
        ebayPage.clickOnOperation(operation);
    }


    @Then("I click on {string} from {string} menu")
    public void iClickOnFromMenu(String menuLabel, String operation) {
        ebayPage.clickOnFromMenu(menuLabel, operation);
    }

    @Then("I scroll to the {string} from menu")
    public void iScrollToTheFromMenu(String itemLabel) {
        ebayPage.scrollToTheItemFromMenu(itemLabel);
    }

    @And("I assert that the condition {string} remains displayed")
    public void iAssertThatTheConditionRemainsDisplayed(String displayedCondition) {
        ebayPage.assertThatTheConditionRemainsDisplayed(displayedCondition);
    }

    @Then("I scroll to the {string} from the popup")
    public void iScrollToTheFromThePopup(String itemLabel) {
        ebayPage.scrollToTheFromThePopup(itemLabel);
    }

    @Then("I select the {string}")
    public void iSelectThe(String itemLabel) {
        ebayPage.selectThe(itemLabel);
    }

    @And("I select {string} from the left side")
    public void iSelectFromTheLeftSide(String itemLabel) {
        ebayPage.selectFromTheLeftSide(itemLabel);
    }

    @Then("I select the Popular price ranges to {string}")
    public void iSelectThePopularPriceRangesTo(String itemLabel) {
        ebayPage.selectThePopularPriceRangesTo(itemLabel);
    }

    @And("I Choose the price {string} to {string} and {string} to {string}")
    public void iChooseThePriceToAndTo(String minLabel, String minValue, String maxLabel, String maxvalue) {
        ebayPage.chooseThePriceToAndTo(minLabel, minValue);
        ebayPage.chooseThePriceToAndTo(maxLabel, maxvalue);
    }

    @Then("I click on advanced search")
    public void iClickOnAdvancedSearch() {
        ebayPage.clickOnAdvancedSearch();
    }

    @And("I Enter keywords {string} with {string}")
    public void iEnterKeywordsWith(String labelInputField, String value) {
        ebayPage.enterKeyWordsWith(labelInputField, value);
    }

    @And("I enter {string} for {string}")
    public void iEnterFor(String label, String value) {
        ebayPage.enterExcludeWordsFor(label, value);
    }

    @And("I choose {string} for {string}")
    public void iChooseFor(String label, String value) {
        ebayPage.chooseAllCategoriesFor(label, value);
    }

    @And("I Choose the Bid Count {string} to {string} and {string} to {string}")
    public void iChooseTheBidCountToAndTo(String firstMinBidCountLabel, String firstMinBidCountValue, String firstMaxBidCountLabel, String firstMaxBidCountValue) {
        ebayPage.chooseTheBidCountToAndTo(firstMinBidCountLabel, firstMinBidCountValue);
        ebayPage.chooseTheBidCountToAndTo(firstMaxBidCountLabel, firstMaxBidCountValue);
    }

    @And("I click on a white space")
    public void iClickOnAWhiteSpace() {
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ESCAPE).perform();
    }

    @And("I scroll for the field set {string}")
    public void iScrollForTheFieldSet(String label) {
        ebayPage.scrollForTheFieldSet(label);
    }

    @And("I Choose the items priced {string} to {string} and {string} to {string}")
    public void iChooseTheItemsPricedToAndTo(String minItemsPricedLabel, String minItemsPricedValue, String maxItemsPricedLabel, String maxItemsPricedValue) {
        ebayPage.chooseTheItemsPricedToAndTo(minItemsPricedLabel, minItemsPricedValue);
        ebayPage.chooseTheItemsPricedToAndTo(maxItemsPricedLabel, maxItemsPricedValue);
    }

    @And("I scroll for the Location {string} to {string}")
    public void iScrollForTheLocationTo(String label, String itemLabelValue) {
        ebayPage.scrollForTheLocationTo(label, itemLabelValue);
    }

    @And("I click on the second {string} operation")
    public void iClickOnTheSecondOperation(String operationLabel) {
        ebayPage.clickOnTheSecondOperation(operationLabel);
    }

    @Then("I click the radio button {string} from {string}")
    public void iClickTheRadioButtonFrom(String radioButtonLabel, String fieldSetLabel) {
      ebayPage.clickTheRadioButtonFrom(radioButtonLabel,fieldSetLabel);
    }

    @Then("I fill the {string} with {string}")
    public void iFillTheWith(String sellerLabel, String sellerValue) {
        ebayPage.fillTheWith(sellerLabel, sellerValue);
    }

    @And("I sort {string} for {string}")
    public void iSortFor(String sortLabel, String sortType) {
        ebayPage.sortFor(sortLabel, sortType);
    }
}
