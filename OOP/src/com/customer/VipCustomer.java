package com.customer;

public class VipCustomer {
    private String name;
    private int credit_limit;
    private String email;

    public VipCustomer(String name, int credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public VipCustomer(String name, int credit_limit) {
        this(name,credit_limit,"shuvo@gmail.com");
    }

    public VipCustomer() {
        this("Shuvo",100000,"Shuvo@gmail.com");
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

}
