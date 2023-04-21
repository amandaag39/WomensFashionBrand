package com.womensfashionbrand.products;

import java.util.Objects;

public abstract class Product {
    protected String name;
    protected double price;
    protected String size;
    protected String color;

    public Product(String name, double price, String size, String color) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public abstract void printDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        long priceBits = Double.doubleToLongBits(price);
        result = 31 * result + (int) (priceBits ^ (priceBits >>> 32));
        result = 31 * result + size.hashCode();
        result = 31 * result + color.hashCode();
        return result;
}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return Double.compare(other.price, price) == 0 &&
                Objects.equals(name, other.name) &&
                Objects.equals(size, other.size) &&
                Objects.equals(color, other.color);
    }

}