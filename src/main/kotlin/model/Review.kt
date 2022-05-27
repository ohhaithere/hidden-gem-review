package com.mrazi.hiddengem.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gem", schema = "public")
class Review(
    @Id
    var id: UUID? = null,
    val text: String,
    val userId: UUID,
    val dishId: UUID,
    var gemId: UUID? = null,
    var created: LocalDateTime
)