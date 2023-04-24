package com.womensfashionbrand.models;

import com.womensfashionbrand.utilities.Reviewable;

import java.util.List;

public class Review implements Reviewable {
    private String reviewerName;
    private int rating;
    private String comment;

    public Review(String reviewerName, int rating, String comment) {
        this.reviewerName = reviewerName;
        this.rating = rating;
        this.comment = comment;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName (String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void addReview(Review review) {
        // add review logic here
    }

    @Override
    public List<Review> getReviews() {
        // get reviews logic here
        return null;
    }

    @Override
    public void removeReview(Review review) {
        // remove review logic here
    }

}
