package com.techreturners.cats;

public class CheetahCat extends CatImpl {

    private boolean isAsleep;
    private int averageHeight;
    private String setting;

    @Override
    public boolean isAsleep() {
        return isAsleep;
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

    @Override
    public String getSetting() {
        this.setSetting("wild");
        return setting;
    }

    @Override
    public int getAverageHeight() {
        this.setAverageHeight(1500);
        return averageHeight;
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    public void setAverageHeight(int averageHeight) {
        this.averageHeight = averageHeight;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

}
