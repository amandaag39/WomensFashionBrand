package com.womensfashionbrand.clothing;

import com.womensfashionbrand.products.ApparelItem;

public class Dresses extends ApparelItem {
    private String dressesType;

    public Dresses(String name, double price, String size, String color, String dressesType) {
        super(name, price, size, color);
        this.dressesType = dressesType;
    }

    public String getDressesType() {
        return dressesType;
    }

    public void setType(String dressesType) {
        this.dressesType = dressesType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + dressesType + ".");
    }
}
