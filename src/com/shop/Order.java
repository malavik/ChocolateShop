package com.shop;

public class Order {
    private int cash;
    private int price;
    private int wrappersNeeded;

    private String type;

    private int milkChocoNo;
    private int sugarFreeNo;
    private int whiteChocoNo;
    private int darkChocoNo;

    public int chocoNo;
    int freeChocolate;
    int wrappersRemaining;


    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWrappersNeeded() {
        return wrappersNeeded;
    }

    public void setWrappersNeeded(int wrappersNeeded) {
        this.wrappersNeeded = wrappersNeeded;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMilkChocoNo() {
        return milkChocoNo;
    }

    public void setMilkChocoNo(int milkChocoNo) {
        this.milkChocoNo = milkChocoNo;
    }

    public int getSugarFreeNo() {
        return sugarFreeNo;
    }

    public void setSugarFreeNo(int sugarFreeNo) {
        this.sugarFreeNo = sugarFreeNo;
    }

    public int getWhiteChocoNo() {
        return whiteChocoNo;
    }

    public void setWhiteChocoNo(int whiteChocoNo) {
        this.whiteChocoNo = whiteChocoNo;
    }

    public int getDarkChocoNo() {
        return darkChocoNo;
    }

    public void setDarkChocoNo(int darkChocoNo) {
        this.darkChocoNo = darkChocoNo;
    }


    public void calculateChocoNo() {

    }
}
