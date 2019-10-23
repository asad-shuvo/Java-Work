package com.arraylist;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static Scanner sc=new Scanner(System.in);
private static GroceryList groceryList=new GroceryList();
    public static void main(String[] args){

        boolean quit=false;
        int choise=0;
        printinstructions();

        while(!quit){
            System.out.println("Enter Your Choise");
            choise=sc.nextInt();
            sc.nextLine();
            switch (choise){
                case 0:
                    printinstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;

            }

        }

    }

    public static void printinstructions(){
        System.out.println("\npress  \n");
        System.out.println("0. press for instructions");
        System.out.println("1.  press for Grocery List option");
        System.out.println("2.  To add an item");
        System.out.println("3. To modify an item");
        System.out.println("4.  To remove an item");
        System.out.println("5.  To search for an item");
        System.out.println("6.  To quit the application");
    }
    public static void addItem(){
        System.out.println("Add An Item");
        groceryList.addGroceryItem(sc.nextLine());
    }
    public static void modifyItem()
    {
        System.out.println("Modify An item");
        System.out.println("Enter Current Item");
        String item=sc.nextLine();
        System.out.println("Enter New Item");
        String newItem=sc.nextLine();
        groceryList.modifyGroceryList(item,newItem);
    }

    public static void removeItem(){
        String item=sc.nextLine();
        System.out.println("Removing an item");
        groceryList.removeItem(item);
    }

    public static void searchForItem()
    {
        String item=sc.nextLine();
        int t=groceryList.fileSearch(item);
        if(t==0)System.out.println("Search Found");
        if(t==1)System.out.println("Search Not Found");
    }

    public static void processArrayList(){
        ArrayList<String>newArray =new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String>nextArray=new ArrayList<>(groceryList.getGroceryList());

        String[] array=new String[groceryList.getGroceryList().size()];
        array=groceryList.getGroceryList().toArray(array);

    }
}
