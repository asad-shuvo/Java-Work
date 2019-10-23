package com.InterFace.Basic;

public class Deskphone implements ITelephone {
    private int myNumber;
    private boolean isringing;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void dial(int phonenumber) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean cellPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
