package com.pluralsight;

public class RegularToppings {
    protected String lettuce;
    protected String peppers;
    protected String onions;
    protected String tomatoes;
    protected String jalepenos;
    protected String guacamole;
    protected String mushroom;
    public RegularToppings(String lettuce, String peppers, String onions, String tomatoes, String jalepenos, String guacamole, String mushroom) {
        this.lettuce = lettuce;
        this.peppers = peppers;
        this.onions = onions;
        this.tomatoes = tomatoes;
        this.jalepenos = jalepenos;
        this.guacamole = guacamole;
        this.mushroom = mushroom;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getPeppers() {
        return peppers;
    }

    public void setPeppers(String peppers) {
        this.peppers = peppers;
    }

    public String getOnions() {
        return onions;
    }

    public void setOnions(String onions) {
        this.onions = onions;
    }

    public String getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(String tomatoes) {
        this.tomatoes = tomatoes;
    }

    public String getJalepenos() {
        return jalepenos;
    }

    public void setJalepenos(String jalepenos) {
        this.jalepenos = jalepenos;
    }

    public String getGuacamole() {
        return guacamole;
    }

    public void setGuacamole(String guacamole) {
        this.guacamole = guacamole;
    }

    public String getMushroom() {
        return mushroom;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }
}
