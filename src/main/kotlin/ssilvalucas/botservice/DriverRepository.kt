package ssilvalucas.botservice

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DriverRepository: MongoRepository<DriverModel, String> {

}