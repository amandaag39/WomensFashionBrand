package com.womensfashionbrand.utilities;

import com.womensfashionbrand.models.CartItem;

public interface DiscountCalculator {
    double calculateDiscount(CartItem item);
}
