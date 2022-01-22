package com.techreturners.cats;

public abstract class CatImpl implements Cat {

    private boolean isAsleep;
    private int averageHeight;
    private String setting;

    public CatImpl(boolean isAsleep, int averageHeight, String setting) {
        this.isAsleep = isAsleep;
        this.averageHeight = averageHeight;
        this.setting = setting;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(int averageHeight) {
        this.averageHeight = averageHeight;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    @Override
    public boolean goToSleep() {
        isAsleep = true;
        return isAsleep;
    }

    @Override
    public boolean wakeUp() {
        isAsleep = false;
        return isAsleep;
    }

    public String run() {
        return "All cats can run";
    }

    public abstract String eat();
}
