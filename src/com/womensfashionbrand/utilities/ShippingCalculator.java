package com.womensfashionbrand.utilities;

import com.womensfashionbrand.models.CartItem;

import java.util.List;

public interface ShippingCalculator {
    String getDestinationAddress();

    void setDestinationAddress(String destinationAddress);

    double getWeight(CartItem item);

    void setWeight(double weight);

    double calculateShippingCost(List<CartItem> items);
}
