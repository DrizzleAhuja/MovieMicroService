
package com.ncu.review.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @GetMapping(path="/review")
    public String getallreviews() {
        System.out.println("Hello from review controller!");
        // _ReviewService.getAllReviews();
        return "Hello from review controller!"; 
    }


 @GetMapping(path="/review/{reviewId}")
    public String getReviewById(@PathVariable("reviewId") String reviewId) {
        System.out.println("Fetching review with ID: " + reviewId);
        return "Fetching review with ID: " + reviewId;
    }

  
@GetMapping(path="/review/search/{reviewName}")
    public String getReviewByName(@PathVariable("reviewName") String reviewName) {
        System.out.println("Searching for review with name: " + reviewName);
        // _ReviewService.getReviewByName(reviewName);
        return "Searching for review with name: " + reviewName;
    }



}