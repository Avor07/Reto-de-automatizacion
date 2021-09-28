package com.Guru.Bank.pruebas.PageObjects;

import com.Guru.Bank.pruebas.Models.SigInFormulario;
import com.Guru.Bank.pruebas.Utils.EscribirExcel;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import static org.junit.Assert.assertThat;

@DefaultUrl("http://demo.guru99.com/V4/index.php")
public class SigInClientPageObject extends PageObject {
    By userTxt = By.name("uid");
    By claveTxt = By.name("password");
    By loginBtn = By.name("btnLogin");
    By linkAddCustomer = By.xpath("/html/body/div[3]/div/ul/li[2]/a");
    By nameTxt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
    By checkBox = By.name("rad1");
    By birthdayTxt = By.id("dob");
    By addressTxt = By.name("addr");
    By cityTxt = By.name("city");
    By stateTxt = By.name("state");
    By pinnoTxt = By.name("pinno");
    By telephoneTxt = By.name("telephoneno");
    By emailTxt = By.name("emailid");
    By passTxt = By.name("password");
    By registroBtn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");
    By dataRegistroExitoso = By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]");
    By idClient = By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]");


    public void escribirUsuario(String usuario) {
        getDriver().findElement(userTxt).sendKeys(usuario);
    }

    public void escribirClave(String clave) {
        getDriver().findElement(claveTxt).sendKeys(clave);
    }

    public void clickLogin() {
        getDriver().findElement(loginBtn).click();
    }


    public void clickEnlaceAddCustomer() {
        getDriver().findElement(linkAddCustomer).click();
    }

    public void escribirNombreCliente(String name) {
        getDriver().findElement(nameTxt).sendKeys(name);
    }

    public void seleccionarCheckBox() {
        getDriver().findElement(checkBox).click();
    }

    public void digitarbhirtday(String fecha) {
        getDriver().findElement(birthdayTxt).sendKeys(fecha);
    }

    public void digitarDireccion(String direccion) {
        getDriver().findElement(addressTxt).sendKeys(direccion);
    }

    public void escribirCiudad(String city) {
        getDriver().findElement(cityTxt).sendKeys(city);
    }

    public void escribirEstado(String state) {
        getDriver().findElement(stateTxt).sendKeys(state);
    }

    public void escribirPin(String pin) {
        getDriver().findElement(pinnoTxt).sendKeys(pin);
    }

    public void escribirTelefono(String telefono) {
        getDriver().findElement(telephoneTxt).sendKeys(telefono);
    }

    public void escribirEmail(String email) {
        getDriver().findElement(emailTxt).sendKeys(email);
    }

    public void definirContrasena(String clave) {
        getDriver().findElement(passTxt).sendKeys(clave);
    }

    public void clicKBtnRegistro() {
        getDriver().findElement(registroBtn).click();
    }

    public void verDataCustomer() {
        SigInFormulario formulario = new SigInFormulario();
        String id = getDriver().findElement(idClient).getText();
        formulario.setIdClient(id);
        EscribirExcel excel = new EscribirExcel();
        excel.encabezadoExcel();
        excel.ingresarInformacio(formulario.getIdClient());
        System.out.println(formulario.getIdClient());
        assertThat(getDriver().findElement(dataRegistroExitoso).isDisplayed(), Matchers.is(true));
    }
}
