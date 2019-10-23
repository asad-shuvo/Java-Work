package com.arraylist;

import java.util.ArrayList;

public class GroceryList {
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    private ArrayList<String>groceryList=new ArrayList<>();

     public  void addGroceryItem(String item){
groceryList.add(item);
    }

    public void printGroceryList(){
         System.out.println("You have "+groceryList.size()+ "Items in your grocery list");

         for(int i=0;i<groceryList.size();i++){
             System.out.println((i+1)+". "+groceryList.get(i));
         }
    }
public void modifyGroceryList(String cItem,String newItm){
        int position=groceryList.indexOf(cItem);
        if(position>=0){
            modifyGroceryList(newItm,position);
        }
        else System.out.println("This Item is not in the List, try another :)");
}
    private void modifyGroceryList(String newItm,int position){
        groceryList.set(position,newItm);
        System.out.println((position+1) + " Position item has been modified");
    }

    public void removeItem(String newItm){
        int position=groceryList.indexOf(newItm);
        if(position>=0){
            removeItem(position);
        }
        else System.out.println("This Item is not in the List, try another :)");
    }
    private void removeItem(int position)
    {
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }

    private int  searchItem(String Item){
        //boolean exists=groceryList.contains(Item);
    return groceryList.indexOf(Item);
    }
    public int  fileSearch(String Item){
        int pos=searchItem(Item);
        if(pos>=0)return 1;
        else return 0;
    }
}
