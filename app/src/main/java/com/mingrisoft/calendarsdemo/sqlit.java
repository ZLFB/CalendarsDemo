package com.mingrisoft.calendarsdemo;

public class sqlit {
    String date;
    String isselct;
    String isTry;

    public sqlit() {
    }

    public sqlit(String date, String isselct, String isTry) {
        this.date = date;
        this.isselct = isselct;
        this.isTry = isTry;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsselct() {
        return isselct;
    }

    public void setIsselct(String isselct) {
        this.isselct = isselct;
    }

    public void setIsTry(String isTry) { this.isTry = isTry; }

    public String getIsTry() { return isTry; }

}
