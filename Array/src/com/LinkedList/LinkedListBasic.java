package com.LinkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[]args){
        LinkedList<String>visitPlaces=new LinkedList<>();

        visitPlaces.add("Dhaka");
        visitPlaces.add("Comilla");
        visitPlaces.add("Chittagang");
        visitPlaces.add("Barishal");
        visitPlaces.add("Sylhet");
        visitPlaces.add("Rajshahi");

        printLinkedList(visitPlaces);

        visitPlaces.add(3,"B Bariya");
        printLinkedList(visitPlaces);
        visitPlaces.remove(3);
        printLinkedList(visitPlaces);

    }

    public static void printLinkedList(LinkedList<String> visit){
        Iterator<String> i=visit.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting : "+i.next());
        }
    }
}
