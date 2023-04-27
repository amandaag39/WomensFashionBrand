package com.womensfashionbrand.exceptions;

import com.womensfashionbrand.models.Product;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException() {}
    public ProductNotFoundException(String message) {
        super(message);
    }
}
