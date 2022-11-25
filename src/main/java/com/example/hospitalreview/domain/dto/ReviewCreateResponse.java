package com.example.hospitalreview.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewCreateResponse {
    private String userName;
    private String title;
    private String content;
    private String message;
}
