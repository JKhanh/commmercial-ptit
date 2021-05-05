package com.ptit.commmercialptit.builder;

public class Wallet {
    private String name; // required
    private String accountNumber; // required
    private String bankNumber;
    private String bank;

    public Wallet(String name, String accountNumber, String bankNumber, String bank) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankNumber = bankNumber;
        this.bank = bank;
    }

    public Wallet(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public String getBank() {
        return bank;
    }
}
