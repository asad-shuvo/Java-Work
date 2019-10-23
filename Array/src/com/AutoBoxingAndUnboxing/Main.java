package com.AutoBoxingAndUnboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String[]strArray=new String[10];
        int[]intArray=new int[10];

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Shuvo");

        ArrayList<Integer> integers=new ArrayList<>();

        for (int i=0;i<5;i++){
            //AutoBoxing
            integers.add(Integer.valueOf(i));

        }
        for (int i=0;i<5;i++){
            //OutBoxing
            System.out.println(integers.get(i).intValue());

        }
        Integer myintvalue=45;
        int t=myintvalue.intValue();
    }
}
