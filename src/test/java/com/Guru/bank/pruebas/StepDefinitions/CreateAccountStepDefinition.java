package com.Guru.bank.pruebas.StepDefinitions;

import com.Guru.Bank.pruebas.Models.CreateAccountModel;
import com.Guru.Bank.pruebas.Steps.CreateAccountSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;
import java.util.List;

public class CreateAccountStepDefinition {
    @Steps
    CreateAccountSteps accountSteps;

    @Given("^user is Log in Guru Bank$")
    public void userIsLogInGuruBank(DataTable data) {
        List<String> credential= data.asList(String.class);
        accountSteps.OpenPage();
       
        accountSteps.IniciarSession(credential.get(0),credential.get(1));
    }


    @When("^the user create the clients account$")
    public void theUserCreateTheClientsAccount(DataTable data) throws IOException {
        List<String> monto= data.asList(String.class);
        accountSteps.createAccount(monto.get(0));
    }

    @Then("^user Should see  accounts data$")
    public void userShouldSeeAccountsData() {
        accountSteps.seeDataAccount();
    }

}
