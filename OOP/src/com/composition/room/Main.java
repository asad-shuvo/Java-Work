package com.composition.room;

public class Main {
    public static void main(String[]args){
Wall wall1=new Wall("East");
Wall wall2=new Wall("West");
Wall wall3=new Wall("North");
Wall wall4=new Wall("South");

Bed bed=new Bed("Modern",4,2,8,3);
Lamp lamp=new Lamp("Elecric",true,20);
Celing celing=new Celing(20,1);
Bedroom bedroom=new Bedroom("Tim",wall1,wall2,wall3,wall4,lamp,celing,bed);

bedroom.makeBed();
bedroom.getLamp().turnOn();
bedroom.getCelling().getHeight();
System.out.println(bedroom.getWall().getDirection());
    }
}
