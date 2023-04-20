package com.womensfashionbrand.clothing;

import com.womensfashionbrand.products.ApparelItem;

public class ClothingItem extends ApparelItem {

    public ClothingItem(String name, double price, String size, String color) {
        super(name, price, size, color);
    }

    public ClothingItem() {
        super("",0,"","");
    }

    @Override
    public void printDescription() {
        System.out.println("This is a clothing item.");
    }

    //    private String size;
//    private String color;
//
//    public ClothingItem (String name, double price, String size, String color) {
//        super(name, price);
//        this.size = size;
//        this.color = color;
//    }
//
//    public ClothingItem() {
//        super("",0);
//    }
//
//
    public String getSize(){
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
