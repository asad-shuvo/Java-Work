package com.oop.challange.Hamburger;

public class Main {

    public static void main(String[]args){
 Hamburger hamburger=new Hamburger("Regular",4.60,"Double","Sausage");
hamburger.addAdditional1("Letus",1.09);
System.out.println("Total Cost   "+hamburger.hamburgerPrice());

 HealthyBurger healthyBurger=new HealthyBurger("Extra Healthy",6.89,"Brown rye bread","Suasage");
healthyBurger.addition1("Double Lettus",1.2);
System.out.println("Total Price For Healthy Hamburger "+healthyBurger.hamburgerPrice());

DeluxHamburger deluxHamburger=new DeluxHamburger("Delux Burger",7.9,"Special","Double Sausage");
deluxHamburger.addAdditional1("Meat",4.5);
        System.out.println("Total Price for DelixHamburger "+deluxHamburger.hamburgerPrice());
    }
}
