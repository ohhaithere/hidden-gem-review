package com.mrazi.hiddengem.service

import com.mrazi.hiddengem.dto.ReviewDto
import com.mrazi.hiddengem.mapper.ReviewMapper
import com.mrazi.hiddengem.repository.ReviewRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*

@Component
class ReviewService(private var reviewRepository: ReviewRepository,
                    private var mapper: ReviewMapper) {

    fun save (dto: ReviewDto): ReviewDto {
        val gem = mapper.toModel(dto)
        gem.id = UUID.randomUUID()
        gem.created = LocalDateTime.now()
        reviewRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun update (dto: ReviewDto): ReviewDto {
        val gem = mapper.toModel(dto)
        reviewRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun get(id: UUID): ReviewDto {
        return mapper.toDto(reviewRepository.getById(id));
    }

    fun get(): List<ReviewDto> {
        return mapper.toDtos(reviewRepository.findAll());
    }

}