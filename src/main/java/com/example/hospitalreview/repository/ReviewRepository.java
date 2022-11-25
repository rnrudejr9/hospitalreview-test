package com.example.hospitalreview.repository;

import com.example.hospitalreview.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
