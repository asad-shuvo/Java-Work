package com.oop.challenge;

public class Main {
    public static void main(String[]args){
        Hamburger hamburger=new Hamburger("Basic","Sausase",3.45,"White");
        double a= hamburger.itemizeHamburger();
        hamburger.addHamBurgerAddition1("Tomato",.70);
        hamburger.addHamBurgerAddition2("latus",.80);
        hamburger.addHamBurgerAddition3("carot",.70);
        hamburger.addHamBurgerAddition1("chesse",.90);
        System.out.println(hamburger.itemizeHamburger());
   HealthyBurger healthyBurger=new HealthyBurger("Bacon",5.67);
  // healthyBurger.itemizeHamburger();
   healthyBurger.addHamBurgerAddition1("Egg",.90);

        healthyBurger.addHealthyAddition1("Lentis",4.90);
      //  healthyBurger.itemizeHamburger();
        System.out.println("Healthy Burger price is   "+healthyBurger.itemizeHamburger());
   DeluxBurger deluxBurger=new DeluxBurger();
   deluxBurger.addHamBurgerAddition1("Delux",3.44);
   deluxBurger.itemizeHamburger();
    }
}
