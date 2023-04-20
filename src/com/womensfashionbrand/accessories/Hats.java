package com.womensfashionbrand.accessories;

import com.womensfashionbrand.products.ApparelItem;

public class Hats extends ApparelItem {
    private String hatsType;

    public Hats (String name, double price, String size, String color, String hatsType) {
        super(name, price, size, color);
        this.hatsType = hatsType;
    }

    public String getHatsType() {
        return hatsType;
    }

    public void setHatsType(String hatsType) {
        this.hatsType = hatsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + hatsType + "hat.");
    }
}
