package com.womensfashionbrand.accessories;

import com.womensfashionbrand.products.Product;

public class Jewelry extends Product {
    private String jewelryType;

    public Jewelry (String name, double price, String size, String color, String jewelryType) {
        super(name, price, size, color);
        this.jewelryType = jewelryType;
    }

    public String getJewelryType() {
        return jewelryType;
    }

    public void setJewelryType(String jewelryType){
        this.jewelryType = jewelryType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + jewelryType + ".");
    }
}
