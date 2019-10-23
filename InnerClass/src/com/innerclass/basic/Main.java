package com.innerclass.basic;

public class Main {

    public static void main(String[] args) {

        GearBox macleran = new GearBox(6);
       macleran.operateClutch(true);
       macleran.changeGear(1);
       macleran.operateClutch(false);

       System.out.println(macleran.wheelSpeed(1000));
       macleran.changeGear(2);
       System.out.println(macleran.wheelSpeed(3000));

       macleran.operateClutch(true);
       macleran.changeGear(3);
       macleran.operateClutch(false);
       System.out.println(macleran.wheelSpeed(6000));
    }
}
