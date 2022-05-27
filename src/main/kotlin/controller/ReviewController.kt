package com.mrazi.hiddengem.controller

import com.mrazi.hiddengem.dto.ReviewDto
import com.mrazi.hiddengem.service.ReviewService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/review")
class ReviewController(val reviewService: ReviewService) {

    @PostMapping
    fun save(@RequestBody dto: ReviewDto): ReviewDto {
        return reviewService.save(dto);
    }

}