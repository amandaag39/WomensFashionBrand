package com.womensfashionbrand.utilities;

import com.womensfashionbrand.models.Review;

import java.util.List;

public interface Reviewable {
    void addReview(Review review);
    List<Review> getReviews();
    void removeReview(Review review);
}
