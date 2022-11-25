package com.example.hospitalreview.service;

import com.example.hospitalreview.domain.Hospital;
import com.example.hospitalreview.domain.Review;
import com.example.hospitalreview.domain.dto.ReviewCreateRequest;
import com.example.hospitalreview.domain.dto.ReviewCreateResponse;
import com.example.hospitalreview.repository.HospitalRepository;
import com.example.hospitalreview.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    private final HospitalRepository hospitalRepository;
    private final ReviewRepository reviewRepository;

    public ReviewService(HospitalRepository hospitalRepository, ReviewRepository reviewRepository) {
        this.hospitalRepository = hospitalRepository;
        this.reviewRepository = reviewRepository;
    }

    public ReviewCreateResponse createReview(ReviewCreateRequest dto){
        Optional<Hospital> hospitalOptional = hospitalRepository.findById(dto.getHospitalId());

        Review review = Review.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .username(dto.getUserName())
                .hospital(hospitalOptional.get())
                .build();

        Review savedReview = reviewRepository.save(review);

                ;
        return ReviewCreateResponse.builder()
                .title(savedReview.getTitle())
                .userName(savedReview.getUsername())
                .content(savedReview.getContent())
                .message("성공적으로 완료되었습니다.")
                .build();
    }

    public Review getReview(Long id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("해당 아이디가 없습니다."));

        return review;
    }
}
