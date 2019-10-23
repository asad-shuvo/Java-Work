package com.arraylistChallenge.mobile;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts>myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts=new ArrayList<Contacts>();
    }

    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int foundPosition=findContact(oldContact);
        if(foundPosition<0){
            System.out.println("The Contact Does'nt Found");
            return false;
        }
        else{
            this.myContacts.set(foundPosition,newContact);
            System.out.println(oldContact.getName() +"  is Replaced With  "+newContact.getName());
        return true;
        }

    }

public boolean removeContact(Contacts contacts){
        int foundContact=findContact(contacts);
        if(foundContact>=0){
            this.myContacts.remove(contacts);
            return true;
        }
        else{
            System.out.println("Contact Not Found");
            return false;
        }
}
    public boolean addnewContact(Contacts contacts){
        if(findContact(contacts.getName())>=0){
            System.out.println("The Name Is Already In The ArrayList");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    private int findContact(Contacts contacts)
    {
        return this.myContacts.indexOf(contacts);
    }
    private int findContact(String contactName){
        for(int i=0;i<myContacts.size();i++){
            Contacts contacts=this.myContacts.get(i);
            if(contacts.getName().equals(contactName))
                return i;
        }
        return -1;
    }

    public String queryContact(Contacts contacts){
        if(findContact(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContacts(String name){
        int position=findContact(name);
        if(position>=0){
            this.myContacts.get(position);
        }
        return null;
    }
    public void printArrayList(){
        System.out.println("\tContact List");
        for(int i=0;i<myContacts.size();i++){
            System.out.println((i+1)+" -> "+ this.myContacts.get(i).getName()+ "  "+this.myContacts.get(i).getNumber());
        }
    }
}
