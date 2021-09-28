package com.Guru.Bank.pruebas.Models;

public class SigInFormulario {


    String user;
    String pass;
    String name;
    String birthday;
    String address;
    String city;
    String state;
    String pin;
    String email;
    String password;
    String idClient;
    String mobile;

    public SigInFormulario() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public SigInFormulario(String user, String pass, String name, String birthday, String address, String city, String state, String pin, String email, String password, String idClient, String mobile) {
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.email = email;
        this.password = password;
        this.idClient = idClient;
        this.mobile = mobile;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }


}
