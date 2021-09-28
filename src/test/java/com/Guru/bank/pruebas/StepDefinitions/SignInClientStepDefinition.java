package com.Guru.bank.pruebas.StepDefinitions;

import com.Guru.Bank.pruebas.Models.SigInFormulario;
import com.Guru.Bank.pruebas.Steps.SigInSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;


public class SignInClientStepDefinition {
    @Steps
    SigInSteps signInSteps;

    @Given("^user is on Guru Bank$")
    public void userIsOnGuruBank() {
        signInSteps.OpenPage();
    }


    @Given("^user is Log in$")
    public void userIsLogIn(List<SigInFormulario> data) {
        signInSteps.LogIn(data.get(0).getUser(), data.get(0).getPass());
    }

    @When("^user Sign in a client$")
    public void userSignInAClient(List<SigInFormulario> data) {
        signInSteps.addCustomer(data.get(0).getName(), data.get(0).getBirthday(), data.get(0).getAddress(), data.get(0).getCity(), data.get(0).getState(), data.get(0).getPin(), data.get(0).getEmail(), data.get(0).getPassword(),data.get(0).getMobile());
    }

    @Then("^user Should see data client$")
    public void userShouldSeeDataClient() {
        signInSteps.getIdClient();
    }
}
