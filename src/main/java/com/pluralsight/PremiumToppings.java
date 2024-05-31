package com.pluralsight;

public class PremiumToppings  extends Sandwich{
    protected   String steak;
    protected String  ham;
    protected String  salami;
    protected String  roastBeef;
    protected String  chicken;
    protected String bacon;

    public PremiumToppings(String breadType, int breadSize, double price, String steak, String ham, String salami, String roastBeef, String chicken, String bacon) {
        super(breadType, breadSize, price);
        this.steak = steak;
        this.ham = ham;
        this.salami = salami;
        this.roastBeef = roastBeef;
        this.chicken = chicken;
        this.bacon = bacon;
    }


    public String getSteak() {
        return steak;
    }

    public void setSteak(String steak) {
        this.steak = steak;
    }

    public String getHam() {
        return ham;
    }

    public void setHam(String ham) {
        this.ham = ham;
    }

    public String getSalami() {
        return salami;
    }

    public void setSalami(String salami) {
        this.salami = salami;
    }

    public String getRoastBeef() {
        return roastBeef;
    }

    public void setRoastBeef(String roastBeef) {
        this.roastBeef = roastBeef;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
    }

    @Override
    public String getBreadType() {
        return super.getBreadType();
    }
}
