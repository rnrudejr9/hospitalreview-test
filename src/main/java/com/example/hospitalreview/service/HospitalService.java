package com.example.hospitalreview.service;

import com.example.hospitalreview.domain.Hospital;
import com.example.hospitalreview.domain.Review;
import com.example.hospitalreview.domain.dto.HospitalResponse;
import com.example.hospitalreview.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService {
     private final HospitalRepository hospitalRepository;
     private final ReviewService reviewService;

    public HospitalService(HospitalRepository hospitalRepository, ReviewService reviewService) {
        this.hospitalRepository = hospitalRepository;
        this.reviewService = reviewService;
    }


}
