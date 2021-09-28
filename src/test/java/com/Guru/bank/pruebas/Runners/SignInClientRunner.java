package com.Guru.bank.pruebas.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.Guru.bank.pruebas.features\\SignIn.feature",
        glue="com.Guru.bank.pruebas.StepDefinitions",snippets = SnippetType.CAMELCASE)
public class SignInClientRunner {
    //Ejecutar primero para guardar el id del cliente en el excel
}
