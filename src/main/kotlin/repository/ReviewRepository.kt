package com.mrazi.hiddengem.repository

import com.mrazi.hiddengem.model.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ReviewRepository: JpaRepository<Review, UUID> {
}