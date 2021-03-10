package com.techreturners.cats;


public abstract class CatImpl implements Cat {
    private boolean sleeping;
    private int height;
    private String type;

    // constructor
    public CatImpl() {
        this.sleeping = true;
    }

    @Override
    public boolean isAsleep() {
        return this.sleeping;
    }

    @Override
    public boolean goToSleep() {
        this.sleeping = true;
        return sleeping;
    }

    @Override
    public void wakeUp() {

    }

    public String getSetting() {
        return "";
    }

    public int getAverageHeight() {
        return height;
    }

    public String eat() {
        return null;
    }
}
