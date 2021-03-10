package com.techreturners.cats;

public class DomesticCat extends CatImpl {
    private String sound = "Purrrrrrr";
    private int height = 23;
    private String isAwake;
    private String sleeping = "Cat should be snoozing";

    public int getAverageHeight() {
        return height;
    }

    public String getSetting() {
        return "domestic";
    }

    public String eat() {
        return sound;
    }
}

    /* public void wakeUp(){
        this.isAwake = ;
    }

    public String isAsleep(){
        return "";
    }

    public String sleeping (){
        return ""; 
    */