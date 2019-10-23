package com.oop.challenge;

public class HealthyBurger extends Hamburger {

    private String HealthyExtra1Name;
    private double healthyExtra1Price;
    private String HealthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    public void addHealthyAddition1(String name,double price){
        this.HealthyExtra1Name=name;
        this.healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name,double price){
        this.HealthyExtra2Name=name;
        this.healthyExtra2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        double hamBurgerPrice=super.itemizeHamburger();

        if(HealthyExtra1Name!=null){
            hamBurgerPrice+=this.healthyExtra1Price;
            System.out.println("Added  "+ this.HealthyExtra1Name+ "  for an extra  "+this.healthyExtra1Price);
        }
        if(HealthyExtra2Name!=null){
            hamBurgerPrice+=this.healthyExtra2Price;
            System.out.println("Added  "+ this.HealthyExtra2Name+ "  for an extra  "+this.healthyExtra2Price);
        }
        return hamBurgerPrice;
    }
}
