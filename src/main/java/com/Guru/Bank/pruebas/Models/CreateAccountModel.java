package com.Guru.Bank.pruebas.Models;

public class CreateAccountModel {
    String clientId;

    public String getClientId() {
        return clientId;
    }
    public CreateAccountModel() {
    }
    public CreateAccountModel(String clientId) {
        this.clientId = clientId;
    }
}
