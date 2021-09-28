package com.Guru.Bank.pruebas.Steps;

import com.Guru.Bank.pruebas.PageObjects.SigInClientPageObject;
import net.thucydides.core.annotations.Step;

public class SigInSteps {
    SigInClientPageObject signInPOM = new SigInClientPageObject();

    @Step
    public void OpenPage() {
        signInPOM.open();
    }

    @Step
    public void LogIn(String user, String pass) {
        signInPOM.escribirUsuario(user);
        signInPOM.escribirClave(pass);
        signInPOM.clickLogin();
    }

    @Step
    public void addCustomer(String client, String date, String address, String city, String state, String pin, String email, String pass,String telefono) {
        signInPOM.clickEnlaceAddCustomer();
        signInPOM.escribirNombreCliente(client);
        signInPOM.seleccionarCheckBox();
        signInPOM.digitarbhirtday(date);
        signInPOM.digitarDireccion(address);
        signInPOM.escribirCiudad(city);
        signInPOM.escribirEstado(state);
        signInPOM.escribirPin(pin);
        signInPOM.escribirTelefono(telefono);
        signInPOM.escribirEmail(email);
        signInPOM.definirContrasena(pass);
        signInPOM.clicKBtnRegistro();
    }

    @Step
    public void getIdClient() {
        signInPOM.verDataCustomer();
    }

}
