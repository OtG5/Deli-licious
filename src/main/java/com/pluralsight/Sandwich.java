package com.pluralsight;

public class Sandwich {
    protected String breadType;
    protected  int breadSize;
    protected double price;

    protected boolean isToasted;

    public Sandwich(String breadType, int breadSize, double price) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.price = price;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getBreadSize() {
        return breadSize;
    }

    public Sandwich() {

    }

    public double getPrice() {
           if(this.breadSize == 4) {
               return this.price += 5.50;
           } else if(this.breadSize == 8) {
               return this.price += 7.00;
           } else if (this.breadSize == 12) {
               return this.price += 8.50;
           }
           return this.price;
       }

    public String isToasted() {
        return breadType + isToasted;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setBreadSize(int breadSize) {
        this.breadSize = breadSize;
    }


    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public static void getPremiumToppings(String userPremiumToppings) {
    }
}
