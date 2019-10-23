package com.InterFace.Basic;

public class Main {
    public static void main(String[] args) {
        ITelephone iTelephone;
        iTelephone=new Deskphone(1234);
        iTelephone.powerOn();
        iTelephone.answer();
        iTelephone.cellPhone(1234);
        iTelephone.dial(1234);
        iTelephone.isRinging();
        iTelephone=new MobilePhone(1234);
        iTelephone.powerOn();
        iTelephone.answer();
        iTelephone.cellPhone(1234);
        iTelephone.dial(1234);
        iTelephone.isRinging();
    }
}
