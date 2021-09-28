package com.Guru.Bank.pruebas.PageObjects;

import com.Guru.Bank.pruebas.Models.CreateAccountModel;
import com.Guru.Bank.pruebas.Utils.LeerFicheros;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static org.junit.Assert.assertThat;

@DefaultUrl("http://demo.guru99.com/V4/index.php")
public class CreateAccountPageObject extends PageObject {
    By userTxt = By.name("uid");
    By claveTxt = By.name("password");
    By loginBtn = By.name("btnLogin");
    By idTxt = By.name("cusid");
    By select = By.name("selaccount");
    By montoTxt = By.name("inideposit");
    By submitBtn = By.name("button2");
    By accountAddLink = By.xpath("/html/body/div[3]/div/ul/li[5]/a");
    By messageDataAccount = By.id("Accmsg");

    public void escribirUsuario(String usuario) {
        getDriver().findElement(userTxt).sendKeys(usuario);
    }

    public void escribirClave(String clave) {
        getDriver().findElement(claveTxt).sendKeys(clave);
    }

    public void clickLogin() {
        getDriver().findElement(loginBtn).click();
    }

    public void clickAddAccount() {
        getDriver().findElement(accountAddLink).click();
    }

    public void escribirId() throws IOException {
        LeerFicheros leerFicheros = new LeerFicheros();
        CreateAccountModel accountModel = new CreateAccountModel(leerFicheros.leerDatoExcelCaracter("DATOS", "DataProvider.xlsx", 0, 1));
        getDriver().findElement(idTxt).sendKeys(accountModel.getClientId());
    }

    public void seleccionarTipoCuenta() {

        WebElement selectElement = getDriver().findElement(select);
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("Savings");
    }

    public void escribirMonto(String monto) {
        getDriver().findElement(montoTxt).sendKeys(monto);
    }

    public void clickSubmit() {
        getDriver().findElement(submitBtn).click();
    }

    public void seeDataAccount() {
        assertThat(getDriver().findElement(messageDataAccount).isDisplayed(), Matchers.is(true));
    }

}
