package com.womensfashionbrand.accessories;

import com.womensfashionbrand.products.Product;

public class Bags extends Product {
    private String bagsType;

    public Bags(String name, double price, String size, String color, String bagsType) {
        super(name, price, size, color);
        this.bagsType = bagsType;
    }

    public String getBagsType() {
        return bagsType;
    }

    public void setType(String bagsType) {
        this.bagsType = bagsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + bagsType + ".");
    }
}
