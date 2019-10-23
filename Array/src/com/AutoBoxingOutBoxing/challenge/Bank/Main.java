package com.AutoBoxingOutBoxing.challenge.Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim",50.05);
        bank.addCustomer("Adelaide","Mike",60.05);
        bank.addCustomer("Adelaide","Perey",70.05);
bank.addBranch("Sydney");
bank.addCustomer("Sydney","Bob",90.9);
bank.addCustomerTransaction("Adelaide","Tim",40.90);
bank.addCustomerTransaction("Adelaide","Tim",50.90);
bank.addCustomerTransaction("Adelaide","Tim",60.90);
bank.listCustomers("Adelaide",true);
    }
}
