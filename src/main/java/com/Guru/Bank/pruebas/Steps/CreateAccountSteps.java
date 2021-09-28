package com.Guru.Bank.pruebas.Steps;

import com.Guru.Bank.pruebas.PageObjects.CreateAccountPageObject;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class CreateAccountSteps {
    CreateAccountPageObject createAccountPOM = new CreateAccountPageObject();

    @Step
    public void OpenPage() {
        createAccountPOM.open();
    }

    @Step
    public void IniciarSession(String user, String pass) {
        createAccountPOM.escribirUsuario(user);
        createAccountPOM.escribirClave(pass);
        createAccountPOM.clickLogin();
    }

    @Step
    public void createAccount(String monto) throws IOException {
        createAccountPOM.clickAddAccount();
        createAccountPOM.escribirId();
        createAccountPOM.seleccionarTipoCuenta();
        createAccountPOM.escribirMonto(monto);
        createAccountPOM.clickSubmit();
    }

    @Step
    public void seeDataAccount() {
        createAccountPOM.seeDataAccount();
    }

}
