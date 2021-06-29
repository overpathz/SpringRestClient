package com.overpathz.spring.rest.entity;


import java.math.BigDecimal;
import java.util.List;

public class PersonalData {
    private String clientId;
    private String name;
    private String webHookUrl;
    private List<Account> accounts;

    public PersonalData() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebHookUrl() {
        return webHookUrl;
    }

    public void setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "clientId='" + clientId + '\n' +
                "name='" + name + '\n' +
                "webHookUrl='" + webHookUrl + '\n' +
                "\t accounts=" + accounts + '}';
    }
}

class Account {
    private String id;
    private double balance;
    private double creditLimit;
    private String type;
    private int currencyCode;
    private String cashbackType;

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCashbackType() {
        return cashbackType;
    }

    public void setCashbackType(String cashbackType) {
        this.cashbackType = cashbackType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\n' +
                "balance=" + balance + '\n' +
                "creditLimit=" + creditLimit + '\n' +
                "type='" + type + '\n' +
                "currencyCode=" + currencyCode + '\n' +
                "cashbackType='" + cashbackType + '\n' + '}';
    }
}