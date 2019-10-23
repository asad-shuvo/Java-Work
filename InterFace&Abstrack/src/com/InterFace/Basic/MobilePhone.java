package com.InterFace.Basic;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isringing;
    private boolean isOn=false;


    public MobilePhone(int myNumber){
        this.myNumber=myNumber;
    }
    @Override
    public void powerOn() {
        System.out.println("Mobile phone is on   ");
        isOn=true;

    }

    @Override
    public void dial(int phonenumber) {
        if (isOn == true) {
            System.out.println("Now Ringing  " + phonenumber + "  On MobilePhone");
        }
        else{
            System.out.println("Mobile Phone Is Off");
        }
    }

    @Override
    public void answer() {
        if(isringing && isOn==true){
            System.out.println("Answering On the Desk");
       isringing=false;
        }


    }

    @Override
    public boolean cellPhone(int phoneNumber) {
     if(phoneNumber==myNumber && isOn==true){
         isringing=true;
         System.out.println("Ring Ring");
     }
     else {
         isringing=false;
     }
        return isringing;
    }

    @Override
    public boolean isRinging() {
        return isringing;
    }
}
