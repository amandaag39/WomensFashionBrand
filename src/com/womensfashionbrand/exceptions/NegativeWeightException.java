package com.womensfashionbrand.exceptions;

public class NegativeWeightException extends Exception {
    public NegativeWeightException() {}
    public NegativeWeightException(String message){
        super(message);
    }
}
