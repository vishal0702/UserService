package com.mservice.user.service.external.services;

import com.mservice.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "RATING-SERVICE")
@Service
public interface RatingService {

    //Get


    //POST
    @PostMapping("/ratings")
    public ResponseEntity<Rating> createRating(Rating values);

    //PUT
    @PutMapping("/ratings/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);

    //DELETE
    @DeleteMapping("/ratings/{ratingId}")
    public void deteleRating(@PathVariable("ratingId") String ratingId);
}
