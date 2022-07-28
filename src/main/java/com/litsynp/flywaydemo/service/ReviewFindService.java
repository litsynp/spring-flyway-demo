package com.litsynp.flywaydemo.service;

import com.litsynp.flywaydemo.dao.ReviewRepository;
import com.litsynp.flywaydemo.domain.Review;
import com.litsynp.flywaydemo.dto.ReviewResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewFindService {

    private final ReviewRepository reviewRepository;

    public Page<ReviewResponse> findAll(Pageable pageable) {
        Page<Review> reviews = reviewRepository.findAll(pageable);
        return reviews.map(ReviewResponse::from);
    }
}
