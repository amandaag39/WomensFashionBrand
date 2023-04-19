package com.womensfashionbrand.accessories;

import com.womensfashionbrand.products.ApparelItem;

public class AccessoriesItem extends ApparelItem {
    public AccessoriesItem(String name, double price, String size, String color) {
       super(name, price, size, color);
    }

    public AccessoriesItem(String name, double price){
        super("",0,"","");
    }

    @Override
    public void printDescription() {
        System.out.println(this);
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", description='" + description + '\'' +
//                ", stock=" + stock +
//                ", price=" + price +
//                '}';
//    }
}
