package com.litsynp.flywaydemo.dto;

import com.litsynp.flywaydemo.domain.Review;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewResponse {

    private UUID reviewId;
    private UUID userId;
    private UUID placeId;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public static ReviewResponse from(Review review) {
        return ReviewResponse.builder()
                .reviewId(review.getId())
                .userId(review.getUserId())
                .placeId(review.getPlaceId())
                .content(review.getContent())
                .createdOn(review.getCreatedOn())
                .updatedOn(review.getUpdatedOn())
                .build();
    }
}
