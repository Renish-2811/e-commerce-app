package com.gmail.renish.ecommerce.service;

import com.gmail.renish.ecommerce.domain.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getReviewsByPerfumeId(Long perfumeId);

    Review addReviewToPerfume(Review review, Long perfumeId);
}
