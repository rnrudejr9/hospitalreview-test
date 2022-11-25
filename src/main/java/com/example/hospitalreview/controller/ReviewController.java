package com.example.hospitalreview.controller;

import com.example.hospitalreview.domain.Review;
import com.example.hospitalreview.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor //필요한 알규먼트를 넣어줌
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/{id}")
    public ResponseEntity<Review> get(@PathVariable Long id){
        Review review = reviewService.getReview(id);
        return ResponseEntity.ok().body(review);
    }
}
