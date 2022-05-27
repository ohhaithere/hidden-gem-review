package com.mrazi.hiddengem.dto

import java.time.LocalDateTime
import java.util.*

data class ReviewDto(
    var id: UUID? = null,
    val text: String,
    val userId: UUID,
    val dishId: UUID,
    var gemId: UUID? = null
)
