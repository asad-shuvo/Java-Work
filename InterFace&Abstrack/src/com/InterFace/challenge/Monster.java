package com.InterFace.challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {

    private String name;
    private int hitPoint;
    private int streangth;

    public Monster(String name, int hitPoint, int streangth) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.streangth = streangth;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStreangth() {
        return streangth;
    }

    @Override
    public List<String> write() {
        ArrayList<String>values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoint);
        values.add(2,""+this.streangth);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hitPoint=Integer.parseInt(savedValues.get(1));
            this.streangth=Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", streangth=" + streangth +
                '}';
    }
}
