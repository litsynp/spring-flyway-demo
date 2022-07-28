package com.litsynp.flywaydemo.dao;

import com.litsynp.flywaydemo.domain.Review;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, UUID> {

}
