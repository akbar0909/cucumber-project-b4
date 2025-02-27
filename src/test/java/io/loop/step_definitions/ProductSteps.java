package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.loop.pages.POM;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class ProductSteps {
    private static final Logger LOG = LogManager.getLogger();
    POM pages = new POM();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("product.url"));
        LOG.info("User is homPage");

    }
    @Then("User should be able to see expected prices in the following products")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products(List<Map<String, String>> productDetails) {
        for (Map<String, String> productDetail : productDetails) {
//            System.out.println(" ==== Product Detail===== " +productDetail);
//            System.out.println("productDetail.get(\"Category\") " + productDetail.get("Category"));
//            System.out.println("productDetail.get(\"Product\") " + productDetail.get("Product"));
//            System.out.println("productDetail.get(\"expectedPrice\") "+ productDetail.get("expectedPrice"));

//click the category
            pages.getProductpage().clickCategory(productDetail.get("Category"));
            // get actual price
            String actualPrice = pages.getProductpage().getProductPrice(productDetail.get("Product"));

            //get product price from my data table

            String expectedPrice = productDetail.get("expectedPrice");


            assertEquals ( "Expected does not much the actual ", expectedPrice, actualPrice);


            LOG.info("Validation of the price for: " + productDetail.get("Category")+ ", for Product: " + productDetail.get("Product") + " expected: " + expectedPrice + " - actual: " +actualPrice);

        }

    }
    @Then("User should be able to see expected prices in the following products with ListOfList")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products_with_list_of_list(List<List<String>> productDetails) {
        for (List<String> productDetail : productDetails) {
            //category
            pages.getProductpage().clickCategory(productDetail.get(0));

            //get actual price for each product
           String actualPrices =  pages.getProductpage().getProductPrice(productDetail.get(1));

           // get expected price from feature file
           String expectedPrice = productDetail.get(2);

           assertEquals ( "Expected does not much the actual ", expectedPrice, actualPrices);
            LOG.info("Validation of the price for: " + productDetail.get(0) + ", for Product: " + productDetail.get(1) + " expected price : " + expectedPrice + " - actual: " +actualPrices );
        }
    }

    @Then("user should be able to see the following in their groups")
    public void user_should_be_able_to_see_the_following_in_their_groups(Map<String, List<String>> student) {
        List<String> group2 = student.get("Group 2");
        System.out.println( "group2 = " +  group2);

        List<String> group1 = student.get("Group 1");
        System.out.println( "group1 = " +  group1);



    }



}
