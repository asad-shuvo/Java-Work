package com.AutoBoxingOutBoxing.challenge.Bank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer>customers;

    public Branch(String name){
        this.name=name;
        this.customers=new ArrayList<Customer>();

    }

    public ArrayList<Customer> getCustomers() {

        return customers;
    }

    public String getName() {
        return name;
    }
    public boolean newCustomer(String customer,double initialAmount ){
        if(findCustomer(customer)==null){
            this.customers.add(new Customer(customer,initialAmount));
        return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customername,double amount){
        Customer existingCustomer=findCustomer(customername);

        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
        return true;
        }
        return  false;
    }
    private Customer findCustomer(String customerName){
            for(int i=0;i<this.customers.size();i++){
                Customer checkCustomer=this.customers.get(i);
                if(checkCustomer.getName().equals(customerName)){
                    return checkCustomer;
                }

            }
        return null;
    }
}
