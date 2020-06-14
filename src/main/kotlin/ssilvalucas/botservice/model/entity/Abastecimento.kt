package ssilvalucas.botservice.model.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "abastecimentos")
class Abastecimento {
    @Id
    lateinit var id:String

    lateinit var driver: String

    @CreatedDate
    lateinit var created: LocalDateTime
}