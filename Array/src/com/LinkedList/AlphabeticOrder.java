package com.LinkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class AlphabeticOrder {
    public static void main(String[]args){
        LinkedList<String>visitPlaces=new LinkedList<>();
        addInorder(visitPlaces,"Sydney");
        addInorder(visitPlaces,"Melbourne");
        addInorder(visitPlaces,"Brisbone");
        addInorder(visitPlaces,"Perth");
        addInorder(visitPlaces,"Camberra");
        addInorder(visitPlaces,"Adelaide");
        addInorder(visitPlaces,"Darwin");

        printLinkedList(visitPlaces);
addInorder(visitPlaces,"Alice Springs");
addInorder(visitPlaces,"Darwin");
        printLinkedList(visitPlaces);
        visit(visitPlaces);

    }

    public static boolean addInorder(LinkedList<String>linkedList,String newCity){
        ListIterator<String>listIterator=linkedList.listIterator();

        while (listIterator.hasNext()){
            int comparison=listIterator.next().compareTo(newCity);
            if(comparison==0){
                System.out.println(newCity+"  Is Already Included");
            return false;
            }
            else if(comparison>0){
                //new city should appear this one
                //Brisbone->Adelaide
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }
            else if(comparison<0){
                //move on next city
            }

        }
        listIterator.add(newCity);
        return true;
    }
public static void visit(LinkedList city){
    Scanner sc=new Scanner(System.in);
    boolean goingforward=true;
    boolean quit=false;

    ListIterator<String>listIterator=city.listIterator();

    if(city.isEmpty()){
        System.out.println("No CitY here");
    }
    else{
        System.out.println("Now Visiting  "+ listIterator.next());
        printMenu();
    }

    while(!quit){
        int action=sc.nextInt();
        switch (action){
            case 0:
                System.out.println("Holyday Vacation over");
                quit=true;
                break;
            case 1:
                if(!goingforward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    goingforward=true;
                }
                if(listIterator.hasNext()){
                    System.out.println("Now Visiting  "+listIterator.next());
                }
                else{
                    System.out.println("You Reached At The End Of the trip");
                    goingforward=false;
                }
                break;
            case 2:
                if(goingforward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    goingforward=false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now Visiting  "+listIterator.previous());
                }
                else{
                    System.out.println("We Are at the start of the list");
                    goingforward=true;
                }
                break;
            case 3:
                printMenu();
                break;
        }
    }
}

public static void printMenu(){
    System.out.println("\nAvailable Action:\n press" +
            "\n0->To Quit\n"+
    "1->Go To Next City\n"+
    "2->Go To Previous City\n"+
    "3->Print Menu");
}


    public static void printLinkedList(LinkedList<String> visit){
        Iterator<String> i=visit.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting : "+i.next());
        }
    }
}
