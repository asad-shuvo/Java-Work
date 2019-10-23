package com.InterFace.challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    private String name;
    private int hitPoint;
    private int streangth;
    private String weapon;

    public Player(String name, int hitPoint, int streangth) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.streangth = streangth;
        this.weapon="Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getStreangth() {
        return streangth;
    }

    public void setStreangth(int streangth) {
        this.streangth = streangth;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", streangth=" + streangth +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String>values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoint);
        values.add(2,""+this.streangth);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
if(savedValues!=null && savedValues.size()>0){
    this.name=savedValues.get(0);
    this.hitPoint=Integer.parseInt(savedValues.get(1));
    this.streangth=Integer.parseInt(savedValues.get(2));
    this.weapon=savedValues.get(3);

}
    }
}
