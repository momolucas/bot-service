package ssilvalucas.botservice

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DriverRepository : MongoRepository<DriverModel, String> {

    fun findFirstByPhoneNumber(phoneNumber: String): Optional<DriverModel>

}