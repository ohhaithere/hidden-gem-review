package com.mrazi.hiddengem.mapper

import com.mrazi.hiddengem.dto.ReviewDto
import com.mrazi.hiddengem.model.Review
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface ReviewMapper {

    fun toDto(review: Review): ReviewDto
    @InheritInverseConfiguration
    fun toModel(review: ReviewDto): Review

    fun toDtos(reviews: List<Review>): List<ReviewDto> {
        return reviews.map { t -> toDto(t) }
    }

}