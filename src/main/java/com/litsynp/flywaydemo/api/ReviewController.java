package com.litsynp.flywaydemo.api;

import com.litsynp.flywaydemo.dto.ReviewResponse;
import com.litsynp.flywaydemo.service.ReviewFindService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewFindService reviewFindService;

    @GetMapping
    public Page<ReviewResponse> list(
            @PageableDefault(sort = "createdOn", direction = Direction.DESC) Pageable pageable) {
        return reviewFindService.findAll(pageable);
    }
}
