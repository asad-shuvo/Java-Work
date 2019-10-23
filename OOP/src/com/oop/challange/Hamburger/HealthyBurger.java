package com.oop.challange.Hamburger;

public class HealthyBurger extends Hamburger{
    private String addition1name;
    private String addition2name;
    private double addition1price;
    private double addition2price;

    public HealthyBurger(String name, double price, String rollType, String meat) {
        super(name, price, rollType, meat);
    }
    public void addition1(String name,double price){

        this.addition1name=name;
        this.addition1price=price;
        System.out.println("Added Extra " + this.addition1name+ "in healthy Hamburger "+" for "+ this.addition1price);
    }
    public void addition2(String name,double price){
        this.addition2name=name;
        this.addition2price=price;
        System.out.println("Added Extra " + this.addition2name+ "in healthy Hamburger "+" for "+ this.addition2price);
    }

    @Override
    public double hamburgerPrice() {
        double burgerprice=super.hamburgerPrice();
        if(addition1name!=null){
            burgerprice+=addition1price;
        }
        if(addition2name!=null){
            burgerprice+=addition2price;
        }
        return burgerprice;
    }
}
