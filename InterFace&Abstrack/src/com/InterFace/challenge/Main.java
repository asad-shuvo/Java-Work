package com.InterFace.challenge;

import com.InterFace.Basic.MobilePhone;
import javafx.application.Platform;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Player tim=new Player("Tim",10,15);
        System.out.println(tim.toString());
tim.setHitPoint(8);
System.out.println(tim);

tim.setWeapon("StormBringer");
saveObject(tim);
//loadObject(tim);

System.out.println(tim);

ISavable wareWorlf=new Monster("WareWolf",18,20);
System.out.println(wareWorlf);
        System.out.println(((Monster) wareWorlf).getStreangth());
saveObject(wareWorlf);
    }


    public static ArrayList<String>readValues(){
        ArrayList<String>values = new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        boolean quit=false;

        int index=0;

        System.out.println("Choose\n"+
        "1->Enter A String \n"+
                "0->Quit");
        while (!quit){
            System.out.println("Choose An Option");
            int option=scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter A String");
                    String StringInput=scanner.nextLine();
                    values.add(index,StringInput);
                    index++;
                    break;
            }
        }
return values;
    }

    public static void saveObject(ISavable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+ "  to Storage Device");
        }
    }
public static void loadObject(ISavable objectToLoad){
    ArrayList<String>values=readValues();
    objectToLoad.read(values);

}

}
