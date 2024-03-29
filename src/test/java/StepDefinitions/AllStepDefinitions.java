package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;

public class AllStepDefinitions extends GWD {
    
    LocatorPage rp = new LocatorPage();
    
    @Given("Navigate To Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }
    
    @When("Click On The Element")
    public void clickOnTheElement(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = rp.getWebElement(strlinkList.get(i));
            rp.myClick(linkWebElement);
        }
    }
    
    @And("Enter Data in Text Box")
    public void enterDataInTextBox(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.mySendKeys(element, word);
        }
    }
    
    @And("Enter Data in Select Menu")
    public void enterDataInSelectMenu(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.selectContainElement(element, word);
        }
    }

    @And("Verification Is In Progress")
    public void verificationIsInProgress(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.verifyContainsText(element, word);
            
        }
    }
    
    @Given("A blank value")
    public void given_a_blank_value(Map<String, String> map){
        // map contains { "key":"a", "value": ""}
    }
    
    @DataTableType(replaceWithEmptyString = "[blank]")
    public String listOfStringListsType(String cell) {
        return cell;
    }
    
    
    @Given("Hover On The Element")
    public void hoverOnTheElement(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = rp.getWebElement(strlinkList.get(i));
            rp.hoverFunction(linkWebElement);
        }
    }
    
    @And("Verifying that it is equal to 5")
    public void verifyingThatItIsEqualTo(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = rp.getWebElement(strlinkList.get(i));
            if (linkWebElement.getText().contains("5")) {
                System.out.println("Equal to 5");
            } else {
                System.out.println("Not equal to 5");
            }
        }
    }
    
    @And("Is the length of the list equal to 5")
    public void isTheLengthOfTheListEqualTo() {
        if (rp.getDressList().size() == 5) {
            System.out.println("Lengths equal 5");
        } else {
            System.out.println("Lengths not equal to 5");
        }
    }

/*    @And("Is the length of the list equal to 3")
    public void isTheLengthOfTheListEqualTo3() {
        if (rp.getCardItemList().size() == 3) {
            System.out.println("Lengths equal 3");
        } else {
            System.out.println("Lengths not equal to 3");
        }
    }*/
    
    @And("Verification is performed and the previous page is returned.")
    public void verificationIsPerformedAndThePreviousPageIsReturned(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.verifyContainsText(element, word);
        }
        getDriver().navigate().back();
    }
    
    @And("Waiting for fields to be populated")
    public void waitingForFieldsToBePopulated(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            rp.wait.until(ExpectedConditions.textToBePresentInElementValue(element, items.get(i).get(1)));
        }
    }
}