package com.example.hospitalreview.controller;

import com.example.hospitalreview.domain.dto.HospitalResponse;
import com.example.hospitalreview.domain.dto.ReviewCreateRequest;
import com.example.hospitalreview.domain.dto.ReviewCreateResponse;
import com.example.hospitalreview.service.HospitalService;
import com.example.hospitalreview.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalController {
    private final ReviewService reviewService;
    private final HospitalService hospitalService;

    public HospitalController(ReviewService reviewService, HospitalService hospitalService) {
        this.reviewService = reviewService;
        this.hospitalService = hospitalService;
    }

    @PostMapping("/{id}/reviews")
    public ResponseEntity<ReviewCreateResponse> add(@RequestBody ReviewCreateRequest reviewCreateRequest){
        return ResponseEntity.ok().body(reviewService.createReview(reviewCreateRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<HospitalResponse>> findReview(@PathVariable Long id){
        return ResponseEntity.ok().body(reviewService.findAllByHospitalId(id));
    }
}
