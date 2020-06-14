package ssilvalucas.botservice.mapper

import org.springframework.stereotype.Component
import ssilvalucas.botservice.model.entity.Abastecimento
import ssilvalucas.botservice.web.dto.request.AbastecimentoRequest
import ssilvalucas.botservice.web.dto.response.CreatedResource

@Component
class AbastecimentoMapper {

    fun requestToEntity(request: AbastecimentoRequest): Abastecimento {
        val ab = Abastecimento();
        ab.driver = ""
        return ab
    }
}