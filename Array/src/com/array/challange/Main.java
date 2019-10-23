package com.array.challange;

import java.util.Scanner;

public class Main {
    Scanner sc=new Scanner(System.in);

    public static  void main(String[]args){
        int[] myarry=getintegrs(5);
printIntegers(myarry);

shortIntegers(myarry);
        printIntegers(myarry);
    }

    public static void shortIntegers(int[] myarray){
        for(int i=0;i<myarray.length;i++){
            for(int j=0;j<myarray.length;j++){
                if(myarray[i]<myarray[j]){
                    int temp=myarray[i];
                    myarray[i]=myarray[j];
                    myarray[j]=temp;
                }
            }
        }
    }

    public static void printIntegers(int[]myarry){

        for (int i=0;i<myarry.length;i++)System.out.println(myarry[i]);
    }
    public static int[] getintegrs(int cap){
int[]myarry=new int[cap];
Scanner sc=new Scanner(System.in);
        for(int i=0;i<myarry.length;i++){
            myarry[i]=sc.nextInt();
        }
        return myarry;
    }
}
