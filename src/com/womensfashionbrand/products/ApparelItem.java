package com.womensfashionbrand.products;

import com.womensfashionbrand.Product;

public abstract class ApparelItem extends Product {
    protected String size;
    protected String color;

    public ApparelItem(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public abstract void printDescription();

    @Override
    public String toString() {
        return super.toString() + ", size: " + size + ", color: " + color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + size.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(!super.equals(obj)) {
            return  false;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        ApparelItem other = (ApparelItem) obj;
        if (!size.equals(other.size)) {
            return false;
        }
        if (!color.equals(other.color)) {
            return false;
        }
        return true;
    }

}
