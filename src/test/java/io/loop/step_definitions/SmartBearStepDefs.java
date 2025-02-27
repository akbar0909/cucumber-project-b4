package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.POM;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class SmartBearStepDefs  {
  //  SmartBearOrderPage orderPage = new SmartBearOrderPage();
    POM pages = new POM();



    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("smart.bearURL"));
        pages.getSmartBearOrderPage().usernameBox.sendKeys("Tester" + Keys.TAB + "test" + Keys.ENTER);
        pages.getSmartBearOrderPage().orderButton.click();


    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String String)throws InterruptedException {
      Thread.sleep(1000);
      Select select = new Select(pages.getSmartBearOrderPage().orderProductsDropdown);
      select.selectByIndex(1);


    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
      pages.getSmartBearOrderPage().orderProductsQuantity.sendKeys(Keys.BACK_SPACE + "1");

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
      pages.getSmartBearOrderPage().customerNameBox.sendKeys("Chuck Norris");

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
      pages.getSmartBearOrderPage().streetBox.sendKeys("1100 Long way dr");

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
      pages.getSmartBearOrderPage().cityBox.sendKeys("Chantilly ");


    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
      pages.getSmartBearOrderPage().stateBox.sendKeys("Virginia");

    }
    @When("user enters zip {string}")
    public void user_enters_zip(String string) {
      pages.getSmartBearOrderPage().zipBox.sendKeys("22011");

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string)throws InterruptedException {
      Thread.sleep(1000);
      pages.getSmartBearOrderPage().visaRadioBox.isSelected();
      pages.getSmartBearOrderPage().visaRadioBox.click();


    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_car_number(String string) throws InterruptedException {
      Thread.sleep(1000);
      pages.getSmartBearOrderPage().cardNumberBox.sendKeys("1111222233334444");

    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String string)  throws InterruptedException {
      Thread.sleep(1000);
      pages.getSmartBearOrderPage().expDateBox.sendKeys("02/12");

    }
    @When("user enters process order button")
    public void user_enters_process_order_button()  throws InterruptedException {
      Thread.sleep(1000);
      pages.getSmartBearOrderPage().processButton.click();

    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String string, List<Map<String, String>> list)  throws InterruptedException {
      Thread.sleep(1000);

      pages.getSmartBearOrderPage().viewAllOrders.click();

      String expected;
      String actual;

      for (Map<String, String> map : list) {

        expected = map.get("customerName");
        actual = pages.getSmartBearOrderPage().firstRowOfTable.getText();

        Assert.assertEquals("Actual " + actual + " Does Not match " + expected, actual, expected) ;


      }

    }

}
