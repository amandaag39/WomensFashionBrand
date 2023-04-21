package com.womensfashionbrand;

import com.womensfashionbrand.accessories.Bags;
import com.womensfashionbrand.accessories.Hats;
import com.womensfashionbrand.accessories.Jewelry;
import com.womensfashionbrand.clothing.Bottoms;
import com.womensfashionbrand.clothing.Dresses;
import com.womensfashionbrand.clothing.Tops;


public class Main {
    public static void main(String[] args) {

        //Instantiate some Products

        Dresses myDress = new Dresses("Tiffany", 149.99, "Small", "Floral", "Sundresses");
        Tops tops = new Tops("Minimalist Tank", 155.49, "Large", "White", "Tanks");
        Bottoms bottoms = new Bottoms("Intense Bell-bottoms", 189.97, "Extra-Small","Black","Pants");
        Bags bags = new Bags("Fiona", 127.49, "Free","Emerald","Backpack");
        Jewelry jewelry = new Jewelry("Butterfly Kisses", 349.99, "Free","Silver","Necklace");
        Hats hats = new Hats("Chelsea",115,"Small", "Beige","Sun Hat");

        //Instance of Customer
        CustomerInfo customerInfo = new CustomerInfo("Jamie","Potter","jpotter@gmail.com","StrongPassword123","123 Fake Street Chicago, IL 60617", "123 Fake Street Chicago, IL 60617", "773-867-5309");

        //Test the methods


        double priceOfDress = myDress.getPrice();
        System.out.println(priceOfDress); //This will print "149.99"

        String topsSize = tops.getSize();
        System.out.println(topsSize); //This will print "Large"

        String bottomsType1 = bottoms.getBottomsType();
        System.out.println(bottomsType1); //This will print "Pants"

        String bagsType1 = bags.getBagsType();
        System.out.println(bagsType1); //This will print "Backpack"

        String jewelryName = jewelry.getName();
        System.out.println(jewelryName); //This will print "Butterfly Kisses"

        double hatsPrice = hats.getPrice();
        System.out.println(hatsPrice); //This will print "115.00"

        String customerInfoLastName = customerInfo.getLastName();
        System.out.println(customerInfoLastName); //This will print "Potter"
    }
}