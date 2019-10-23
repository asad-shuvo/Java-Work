package com.arraylistChallenge.mobile;


import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("01867512994");

    public static void main(String[] args){

        boolean quit=false;
        startPhone();
        printActions();

        while (!quit){

            int action=sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting Down...");
                    break;
                case 1:
                    mobilePhone.printArrayList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    querycontact();
                    break;
                case 6:
                    printActions();
                    break;




            } }}

            private static void printContacts(){

            }
    private static void startPhone(){
        System.out.println("Starting Phone");
    }
    private static void addNewContact(){
        System.out.println("Enter New Name");
        String name=sc.nextLine();

        System.out.println("Enter New number");
        String num=sc.nextLine();
        Contacts newCOntact=Contacts.createContact(name,num);
        if(mobilePhone.addnewContact(newCOntact))
            System.out.println("New Contact Added ,Name= "+newCOntact.getName()+" number"+ newCOntact.getNumber());
  else
      System.out.println("This Contact is already in the contact list");
    }

    private static void updateContact(){
        System.out.println("Enter Existing Contact name");
        String name=sc.nextLine();
        Contacts existingCOntact=mobilePhone.queryContacts(name);
        if(existingCOntact==null){
            System.out.println("Contact Not Found");
            return;

        }
        System.out.println("Enter New Contact Name");
        String newName=sc.nextLine();
        System.out.println("Enter New Phone Number");
        String newNumber=sc.nextLine();
        Contacts newContacts=Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingCOntact,newContacts)){
            System.out.println("Successfully Updatet");
        }
        else{
            System.out.println("Error Updating records");
        }
    }
    public static void removeContact(){
        System.out.println("Enter Existing Contact name");
        String name=sc.nextLine();
        Contacts existingCOntact=mobilePhone.queryContacts(name);
        if(existingCOntact==null){
            System.out.println("Contact Not Found");
            return;

        }
        if(mobilePhone.removeContact(existingCOntact))
            System.out.println("SuccessFully Deleted");
        else
            System.out.println("Error Deleting Contact");

    }
    public static void querycontact(){
        System.out.println("Enter Existing Contact name");
        String name=sc.nextLine();
        Contacts existingCOntact=mobilePhone.queryContacts(name);
        if(existingCOntact==null){
            System.out.println("Contact Not Found");
            return;

        }
      System.out.println("Name-> "+existingCOntact.getName()+"  Number->"+existingCOntact.getNumber());

    }
    private static void printActions(){
        System.out.println("Available Actions");

        System.out.println("0-> To Shutdown");
        System.out.println("1-> To prin contacts");
        System.out.println("2-> TO add a new contact");
        System.out.println("3-> TO update a contact");
        System.out.println("4-> To remove an existing contact");
        System.out.println("5 -> Query if an existing contact Exists" );
        System.out.println("6-> Available Actions");
    }
}
