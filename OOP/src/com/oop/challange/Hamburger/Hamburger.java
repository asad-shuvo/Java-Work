package com.oop.challange.Hamburger;

public class Hamburger {
    private String name;
    private double price;
    private String rollType;
    private String meat;
    private String additional2name;
    private String additional3name;
    private String additional4name;
    private String additional1name;
    private double additional1price;
    private double additional2price;
    private double additional3price;
    private double additional4price;

    public Hamburger(String name,double price, String rollType, String meat) {
      this.name=name;
        this.price = price;
        this.rollType = rollType;
        this.meat = meat;

        System.out.println(this.name+"   is roll on  "+this.rollType+"  on a price "+"of  "+this.price);
    }

    public void addAdditional1(String name,double price)
    {
        this.additional1name=name;
        this.additional1price=price;
        System.out.println("Added Additional "+ name + "For Extra "+ price);
    }
    public void addAdditional2(String name,double price)
    {
        this.additional2name=name;
        this.additional2price=price;
        System.out.println("Added Additional "+ name + "For Extra "+ price);
    }
    public void addAdditional3(String name,double price)
    {
        this.additional3name=name;
        this.additional3price=price;
        System.out.println("Added Additional "+ name + "For Extra "+ price);
    }
    public void addAdditional4(String name,double price)
    {
        this.additional4name=name;
        this.additional4price=price;
        System.out.println("Added Additional "+ name + "For Extra "+ price);
    }

    public double hamburgerPrice(){
        double burgerprice=this.price;

        if(additional1name!=null){
            burgerprice+=this.additional1price;
        } if(additional2name!=null){
            burgerprice+=this.additional2price;
        } if(additional3name!=null){
            burgerprice+=this.additional3price;
        } if(additional4name!=null){
            burgerprice+=this.additional4price;
        }
        return burgerprice;
    }

}
