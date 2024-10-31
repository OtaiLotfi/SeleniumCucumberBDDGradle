package it.otai.e2e.pages;

import it.otai.e2e.configurations.OtaiE2EProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class EbayPage extends BasePage {
    public By getInputPriceXpath(String label) {
        return By.xpath("//*/div/div[2]/h3[text()='Choose your price']/../div/div/div//label[text()='" + label + "']/../span/input");
    }

    public By getInputBidCountXpath(String label) {
        return By.xpath("//*/div/span/label[text()='" + label + "']/../span/input");
    }

    public By getInputItemsPricedXpath(String label) {
        return By.xpath("//*/span/label[text()='" + label + "']/../span/input");
    }

    private final OtaiE2EProperties otaiE2EProperties;

    protected EbayPage(OtaiE2EProperties otaiE2EProperties) {
        super(otaiE2EProperties);
        this.otaiE2EProperties = otaiE2EProperties;
    }

    public void connectToEBay() {
        getDriver().get(otaiE2EProperties.getEbayUrl());
        getDriver().manage().window().maximize();
        maximizeScreenDimensions();
        this.waitMillis(TIMEOUT);
    }

    public void searchFor(String searchForValue) {
        waitMillis(TIMEOUT);
        By searchInputId = By.xpath("//*[@id='gh-ac']");
        this.waitVisibilityOfElement(searchInputId, 4);
        WebElement searchInputField = getDriver().findElement(searchInputId);
        searchInputField.click();
        searchInputField.clear();
        searchInputField.sendKeys(searchForValue);
        searchInputField.sendKeys(Keys.ENTER);
    }

    public WebElement selectTheFor(String srpControlHeader) {
        waitMillis(TIMEOUT);
        By srpControlHeaderXpath = By.xpath("//*/div/div/span/button/span/span[contains(text(),'" + srpControlHeader + "')]");
        this.waitVisibilityOfElement(srpControlHeaderXpath, 4);
        WebElement srpControlHeaderField = getDriver().findElement(srpControlHeaderXpath);
        return srpControlHeaderField;
    }

    public void findAndClickOnSvgElement(String inputElement, String svgElement) {
        WebElement selectField = this.selectTheFor(inputElement);
        selectField.click();
        waitMillis(TIMEOUT);
        By svgElementFieldXPath = By.xpath("//span[normalize-space()='" + svgElement + "']");
        this.waitVisibilityOfElement(svgElementFieldXPath, ELEMENT_VISIBILITY_DELAY);
        WebElement svgElementField = getDriver().findElement(svgElementFieldXPath);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", svgElementField);
    }

    public void assertTheConditionIsDisplayed(String displayedLabel) {
        By displayedLabelXpath = By.xpath("//*/a/div[contains(text(),'" + displayedLabel + "')]");
        this.waitVisibilityOfElement(displayedLabelXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement displayedLabelField = getDriver().findElement(displayedLabelXpath);
        displayedLabelField.isDisplayed();
    }

    public void enterSelectFor(String label, String value) {
        waitMillis(TIMEOUT);
        By fieldXpath = By.xpath("//*[contains(text(),'" + label + "')]/../span/select");
        this.waitVisibilityOfElement(fieldXpath, 4);
        WebElement field = getDriver().findElement(fieldXpath);
        field.click();
        this.scrollToTheFromListItems(label, value).click();
    }


    public WebElement scrollToTheFromListItems(String label, String itemLabel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By itemLabelXpath = By.xpath("//*[contains(text(),'" + label + "')]/../span/select/option[contains(text(),'" + itemLabel + "')]");
        WebElement itemField = getDriver().findElement(itemLabelXpath);
        js.executeScript("arguments[0].scrollIntoView(true);", itemField);
        return itemField;
    }

    public void enterTheTo(String label, String value) {
        By zipCodeXpath = By.xpath("//*[contains(text(),'" + label + "')]/../span/input");
        this.waitVisibilityOfElement(zipCodeXpath, 4);
        WebElement zipCodeField = getDriver().findElement(zipCodeXpath);
        zipCodeField.click();
        zipCodeField.sendKeys(value);
    }

    public void clickOnOperation(String operationLabel) {
        By operationXpath = By.xpath("//*[text()='" + operationLabel + "']");
        this.waitVisibilityOfElement(operationXpath, 4);
        WebElement operationField = getDriver().findElement(operationXpath);
        operationField.click();
    }

    public void clickOnFromMenu(String operation, String menuLabel) {
        By operationXpath = By.xpath("//*/div/span/button[contains(@aria-label,'" + menuLabel + "')][contains(text(),'" + operation + "')]");
        this.waitVisibilityOfElement(operationXpath, 4);
        WebElement operationField = getDriver().findElement(operationXpath);
        operationField.click();
    }

    public WebElement scrollToTheItemFromMenu(String itemLabel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By editXpath = By.xpath("//*/ul/li/h3/div[contains(text(),'" + itemLabel + "')]");
        WebElement itemField = getDriver().findElement(editXpath);
        js.executeScript("return arguments[0].scrollHeight", itemField);
        return itemField;
    }

    public void assertThatTheConditionRemainsDisplayed(String displayedCondition) {
        By displayedLabelXpath = By.xpath("//*/button/span[text()='" + displayedCondition + "']");
        this.waitVisibilityOfElement(displayedLabelXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement displayedLabelField = getDriver().findElement(displayedLabelXpath);
        displayedLabelField.isDisplayed();
    }

    public WebElement scrollToTheFromThePopup(String itemLabel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By editXpath = By.xpath("//*/div[contains(@id,'subPanel')]/label/div/div//span[text()='" + itemLabel + "']");
        WebElement itemField = getDriver().findElement(editXpath);
        js.executeScript("arguments[0].scrollIntoView(false);", itemField);
        return itemField;
    }

    public void selectThe(String itemLabel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By itemXpath = By.xpath("//*/div[contains(@id,'subPanel')]/label/div/div//span[text()='" + itemLabel + "']/../../../span");
        this.waitVisibilityOfElement(itemXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement itemField = getDriver().findElement(itemXpath);
        js.executeScript("arguments[0].scrollIntoView(false);", itemField);
        itemField.click();
    }

    public void selectFromTheLeftSide(String itemLabel) {
        this.waitMillis(SHORT_WAIT);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By editXpath = By.xpath("//*/div[contains(@class,'left')]/div[contains(@role,'tablist')]/div/span[text()='" + itemLabel + "']");
        WebElement itemField = getDriver().findElement(editXpath);
        js.executeScript("arguments[0].scrollIntoView(false);", itemField);
        itemField.click();
        this.waitMillis(TIMEOUT);
    }

    public void selectThePopularPriceRangesTo(String label) {
        By operationXpath = By.xpath("//*//li/label//span[contains(text(), '" + label + "')]/../../../span");
        this.waitVisibilityOfElement(operationXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement operationField = getDriver().findElement(operationXpath);
        operationField.click();
    }

    public void chooseThePriceToAndTo(String label, String value) {
        this.waitVisibilityOfElement(getInputPriceXpath(label), ELEMENT_VISIBILITY_DELAY);
        WebElement inputField = getDriver().findElement(getInputPriceXpath(label));
        this.waitMillis(SHORT_WAIT);
        inputField.click();
        inputField.clear();
        inputField.sendKeys(value);
        //this.waitMillis(SHORT_WAIT);
    }

    public void clickOnAdvancedSearch() {
        By advancedXpath = By.xpath("//*[@id='gh-as-a']");
        this.waitVisibilityOfElement(advancedXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement buttonField = getDriver().findElement(advancedXpath);
        buttonField.click();
    }

    public void enterKeyWordsWith(String labelInputField, String value) {
        waitMillis(TIMEOUT);
        By fieldXpath = By.xpath("//*/span/label[contains(text(),'" + labelInputField + "')]/../span/input");
        this.waitVisibilityOfElement(fieldXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement field = getDriver().findElement(fieldXpath);
        field.click();
        field.sendKeys(value);
    }

    public void enterExcludeWordsFor(String label, String value) {
        By inputXpath = By.xpath("//*/div/label[contains(text(),'" + label + "')]/../span/input");
        this.waitVisibilityOfElement(inputXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement inputField = getDriver().findElement(inputXpath);
        inputField.click();
        inputField.sendKeys(value);
    }

    public void chooseAllCategoriesFor(String label, String value) {
        //waitMillis(TIMEOUT);
        By fieldXpath = By.xpath("//*/label[contains(text(),'" + label + "')]/../div/span/select");
        this.waitVisibilityOfElement(fieldXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement field = getDriver().findElement(fieldXpath);
        field.click();
        waitMillis(TIMEOUT);
        this.scrollFromListItems(label, value).click();
    }

    public WebElement scrollFromListItems(String label, String itemLabel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By itemLabelXpath = By.xpath("//*/label[contains(text(),'" + label + "')]/../div/span/select/option[contains(text(),'" + itemLabel + "')]");
        this.waitVisibilityOfElement(itemLabelXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement itemField = getDriver().findElement(itemLabelXpath);
        js.executeScript("arguments[0].scrollIntoView(false);", itemField);
        return itemField;
    }

    public void chooseTheBidCountToAndTo(String label, String value) {
        this.waitVisibilityOfElement(getInputBidCountXpath(label), ELEMENT_VISIBILITY_DELAY);
        WebElement inputField = getDriver().findElement(getInputBidCountXpath(label));
        this.waitMillis(SHORT_WAIT);
        inputField.click();
        inputField.clear();
        inputField.sendKeys(value);
        //this.waitMillis(SHORT_WAIT);
    }

    public WebElement scrollForTheFieldSet(String label) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By editXpath = By.xpath("//*/fieldset/legend[contains(text(),'" + label + "')]");
        WebElement itemField = getDriver().findElement(editXpath);
        js.executeScript("arguments[0].scrollIntoView(true);", itemField);
        return itemField;
    }

    public void chooseTheItemsPricedToAndTo(String label, String value) {
        this.waitVisibilityOfElement(getInputItemsPricedXpath(label), ELEMENT_VISIBILITY_DELAY);
        WebElement inputField = getDriver().findElement(getInputItemsPricedXpath(label));
        //this.waitMillis(SHORT_WAIT);
        inputField.click();
        inputField.clear();
        inputField.sendKeys(value);
        this.waitMillis(SHORT_WAIT);
    }

    public void scrollForTheLocationTo(String label, String value) {
        //waitMillis(TIMEOUT);
        By fieldXpath = By.xpath("//*/label[contains(text(),'" + label + "')]/following-sibling::span/span/select");
        this.waitVisibilityOfElement(fieldXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement field = getDriver().findElement(fieldXpath);
        field.click();
        waitMillis(TIMEOUT);
        this.scrollInLocatedIn(label, value).click();
    }

    public WebElement scrollInLocatedIn(String itemLabel, String itemValue) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By itemLabelXpath = By.xpath("//*/label[contains(text(),'" + itemLabel + "')]/following-sibling::span/span/select/option[contains(text(),'" + itemValue + "')]");
        this.waitVisibilityOfElement(itemLabelXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement itemField = getDriver().findElement(itemLabelXpath);
        js.executeScript("arguments[0].scrollIntoView(true);", itemField);
        return itemField;
    }

    public void clickOnTheSecondOperation(String operationLabel) {
        By operationXpath = By.xpath("(//button[text()='" + operationLabel + "'])[2]");
        this.waitVisibilityOfElement(operationXpath, 4);
        WebElement operationField = getDriver().findElement(operationXpath);
        operationField.click();
    }

    public void clickTheRadioButtonFrom(String radioButtonLabel, String fieldSetLabel) {
        By acceptsOffersXpath = By.xpath("//*//fieldset/legend[text()='"+fieldSetLabel+"']/../div/label[text()='"+radioButtonLabel+"']");
        By radioButtonXpath = By.xpath("preceding-sibling::span");
        WebElement acceptsOffersText = getDriver().findElement(acceptsOffersXpath);
        WebElement radioButton = acceptsOffersText.findElement(radioButtonXpath);
        this.waitMillis(500);
        radioButton.click();
    }

    public void fillTheWith(String sellerLabel, String sellerValue) {
        By inputSellerXpath = By.xpath("//*/fieldset/legend[text()='"+sellerLabel+"']/..//span[@class='textbox']/input");
        this.waitVisibilityOfElement(inputSellerXpath, 4);
        WebElement inputSellerField = getDriver().findElement(inputSellerXpath);
        inputSellerField.click();
        inputSellerField.sendKeys(sellerValue);
    }

    public void sortFor(String sortLabel, String sortType) {
        //waitMillis(TIMEOUT);
        By fieldXpath = By.xpath("//*/label[text()='"+sortLabel+"']/..//span/select");
        this.waitVisibilityOfElement(fieldXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement field = getDriver().findElement(fieldXpath);
        field.click();
        waitMillis(TIMEOUT);
        this.sortOperation(sortType).click();
    }

    public WebElement sortOperation(String sortLabel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        By itemLabelXpath = By.xpath("//*/option[contains(text(),'" + sortLabel + "')]");
        this.waitVisibilityOfElement(itemLabelXpath, ELEMENT_VISIBILITY_DELAY);
        WebElement itemField = getDriver().findElement(itemLabelXpath);
        js.executeScript("arguments[0].scrollIntoView(true);", itemField);
        return itemField;
    }
}
