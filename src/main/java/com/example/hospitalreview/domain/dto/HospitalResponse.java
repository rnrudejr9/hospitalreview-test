package com.example.hospitalreview.domain.dto;

import com.example.hospitalreview.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class HospitalResponse {
    private Long id;
    private String hospital_name;
    private String road_name_address;
    private String content;
    private String title;
    private String username;
}
