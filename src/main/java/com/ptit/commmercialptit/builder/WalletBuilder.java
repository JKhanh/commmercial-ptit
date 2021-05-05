package com.ptit.commmercialptit.builder;

public class WalletBuilder {
    private String name; // required
    private String accountNumber; // required
    private String bankNumber;
    private String bank;

    public WalletBuilder(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public WalletBuilder withBankNumber(String bankNumber){
        this.bankNumber = bankNumber;
        return this;
    }

    public WalletBuilder withBank(String bank){
        this.bank = bank;
        return this;
    }

    public Wallet build(){
        Wallet wallet = new Wallet(
                name, accountNumber, bankNumber, bank
        );
        return wallet;
    }
}
