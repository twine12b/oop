package com.techreturners.cats;

public class CatImpl implements Cat {
    private String type;

    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public boolean goToSleep() {
        return false;
    }

    @Override
    public void wakeUp() {

    }

    public String getSetting() {
        return "";
    }
}
