package com.overpathz.spring.rest.entity;

public class BankCurrency {
    private double currencyCodeA;
    private double currencyCodeB;
    private double date;
    private double rateSell;
    private double rateBuy;
    private double rateCross;

    public BankCurrency() {
    }

    public BankCurrency(double currencyCodeA, double currencyCodeB, double date, double rateSell, double rateBuy, double rateCross) {
        this.currencyCodeA = currencyCodeA;
        this.currencyCodeB = currencyCodeB;
        this.date = date;
        this.rateSell = rateSell;
        this.rateBuy = rateBuy;
        this.rateCross = rateCross;
    }

    public double getCurrencyCodeA() {
        return currencyCodeA;
    }

    public void setCurrencyCodeA(double currencyCodeA) {
        this.currencyCodeA = currencyCodeA;
    }

    public double getCurrencyCodeB() {
        return currencyCodeB;
    }

    public void setCurrencyCodeB(double currencyCodeB) {
        this.currencyCodeB = currencyCodeB;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public double getRateSell() {
        return rateSell;
    }

    public void setRateSell(double rateSell) {
        this.rateSell = rateSell;
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(double rateBuy) {
        this.rateBuy = rateBuy;
    }

    public double getRateCross() {
        return rateCross;
    }

    public void setRateCross(double rateCross) {
        this.rateCross = rateCross;
    }

    @Override
    public String toString() {
        return "BankCurrency{" + "\n" +
                "currencyCodeA=" + currencyCodeA + "\n" +
                "currencyCodeB=" + currencyCodeB + "\n" +
                "date=" + date + "\n" +
                "rateSell=" + rateSell + "\n" +
                "rateBuy=" + rateBuy + "\n" +
                "rateCross=" + rateCross + "\n" +
                '}';
    }
}
