package com.AutoBoxingOutBoxing.challenge.Bank;

import java.util.ArrayList;

public class Customer {
private String name;
private ArrayList<Double>transactions=new ArrayList<>();


    public Customer(String name, double initialAmount) {
        this.transactions=new ArrayList<Double>();
        addTransaction(initialAmount);
        this.name = name;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
