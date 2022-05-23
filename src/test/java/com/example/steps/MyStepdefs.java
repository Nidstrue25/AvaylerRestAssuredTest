package com.example.steps;

import com.example.info.ParabankSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

/**
 * By Nidhi Patel
 **/
public class MyStepdefs {
    static ValidatableResponse response;

    @Steps
    ParabankSteps parabankSteps;

    @Given("^User has an account with valid credential$")
    public void userHasAnAccountWithValidCredential() {
        response=parabankSteps.loginAccount().log().all();

    }

    @And("^User should able to get account details$")
    public void userShouldAbleToGetAccountDetails() {
        response=parabankSteps.getAccounts().log().all();
    }

    @And("^the account balance is (\\d+)\\.(\\d+) dollars$")
    public void theAccountBalanceIsDollars(int arg0, int arg1) {
    }

    @When("^the customer withdraws (\\d+)\\.(\\d+) dollars$")
    public void theCustomerWithdrawsDollars(int arg0, int arg1) {
    }

    @Then("^the account balance should be (\\d+)\\.(\\d+) dollars$")
    public void theAccountBalanceShouldBeDollars(int arg0, int arg1) {
    }

    @And("^a new transaction should be recorded$")
    public void aNewTransactionShouldBeRecorded() {

    }


}
