package com.oop.challange.Hamburger;

public class DeluxHamburger extends Hamburger {
    private String chipsNdrinks;

    public DeluxHamburger(String name, double price, String rollType, String meat) {
        super(name, price, rollType, meat);
    }

    public void chNdr(){
        System.out.println("Extra Chips and Drinks Are for 3.4");
    }

    @Override
    public void addAdditional1(String name, double price) {
        System.out.println("Here You Cant Add any item");
    }

    @Override
    public void addAdditional2(String name, double price) {
        System.out.println("Here You Cant Add any item");
    }

    @Override
    public void addAdditional3(String name, double price) {
        System.out.println("Here You Cant Add any item");
    }

    @Override
    public void addAdditional4(String name, double price) {
        System.out.println("Here You Cant Add any item");
    }

    @Override
    public double hamburgerPrice() {
        double burgerprice=super.hamburgerPrice();
        return burgerprice+3.4;
    }
}
