package com.composition.pc;

public class Main {
    public static void main(String []args)
    {
        Dimension dimension=new Dimension(20,20,5);
        Case theCase=new Case("22B","Dell","240",dimension);

        Monitor monitor=new Monitor("27inch Beast","Acer",27,new Resolutaion(2450,1440));

        Motherboard motherboard=new Motherboard("Bj-200","Asus",4,6,"v2.44");
  PC pc=new PC(theCase,monitor,motherboard);
        pc.getMonitor().drawPixelAt(1500,1200,"Red");
        pc.getMotherboard().loadProgram("Windows 1.0");
        pc.getTheCase().pressPowerButton();

    }
}
