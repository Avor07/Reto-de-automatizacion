package com.Guru.bank.pruebas.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.Guru.bank.pruebas.features\\Create.feature",
        glue = "com.Guru.bank.pruebas.StepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class CreateAccountRunner {
    //Ejecutar despues de haber ejecutado el test Sign in
}
