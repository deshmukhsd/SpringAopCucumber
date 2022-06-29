package org.example;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.businessLayer.HomeBL;
import org.example.businessLayer.SearchBL;
import org.springframework.beans.factory.annotation.Autowired;


public class SearchbarSteps {
    public static HomeBL homeBL;
    public static SearchBL searchBL;
    @Autowired
    public SearchbarSteps(HomeBL homeBL,SearchBL searchBL) {
        this.homeBL=homeBL;
        this.searchBL=searchBL;
    }
    @Given("User is on Home page")
    public void userIsOnHomePage() {
        System.out.println("##### USER NAVIGATED TO HOME PAGE #####");
        homeBL.navigateTo();
    }

    @When("User searches for {string}")
    public void userSearchesFor(String product) {
        System.out.println("##### USER SEARCHING FOR "+product+" #####");
        searchBL.searchFor(product);
    }

    @Then("Options matching to the searched product should be displayed to User")
    public void verifyMatchingOptions() {
        System.out.println("##### VERIFYING PRODUCT AVAILABILITY IN SUGGESTION LIST #####");
        searchBL.fetchProductSearchSuggestions();
    }

}
