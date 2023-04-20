package com.womensfashionbrand.clothing;

import com.womensfashionbrand.products.ApparelItem;

public class Tops extends ApparelItem {
    private String topsType;

    public Tops(String name, double price, String size, String color, String topsType) {
        super(name, price, size, color);
        this.topsType = topsType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTopsType() {
        return topsType;
    }
    public void setTopsType(String topsType){
        this.topsType = topsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + topsType + ".");
    }
}
