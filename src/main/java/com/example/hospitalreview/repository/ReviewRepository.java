package com.example.hospitalreview.repository;

import com.example.hospitalreview.domain.Hospital;
import com.example.hospitalreview.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.image.renderable.RenderableImage;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findReviewsByHospital_Id(Long id);
    List<Review> findByHospital(Hospital hospital);
}
