package com.customer;

public class Main {
    public static void main(String[]args){
VipCustomer vipCustomer=new VipCustomer("Shuvo",100000,"shuvo@gmail.com");
//VipCustomer vipCustomer=new VipCustomer("Shuvo",100000);
//VipCustomer vipCustomer=new VipCustomer();
System.out.println(vipCustomer.getCredit_limit());
System.out.println(vipCustomer.getName());
System.out.println(vipCustomer.getEmail());
    }
}
