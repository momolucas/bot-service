package ssilvalucas.botservice.service

import org.springframework.stereotype.Service
import ssilvalucas.botservice.data.repository.EatRepository
import ssilvalucas.botservice.mapper.EatMapper
import ssilvalucas.botservice.model.entity.Eat
import ssilvalucas.botservice.web.dto.request.FinishTravelRequest

@Service
class EatService(val repository: EatRepository, val mapper: EatMapper) {

    fun save(driver: String): Eat {
        return repository.save(mapper.requestToEntity(driver))
    }
}