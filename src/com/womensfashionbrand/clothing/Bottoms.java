package com.womensfashionbrand.clothing;

import com.womensfashionbrand.products.ApparelItem;

public class Bottoms extends ApparelItem {
    private String bottomsType;

    public Bottoms(String name, double price, String size, String color, String bottomsType) {
        super(name, price, size, color);
        this.bottomsType = bottomsType;
    }

    public String getBottomsType() {
        return bottomsType;
    }
    public void setType(String bottomsType) {
        this.bottomsType = bottomsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + bottomsType + ".");

    }
}
