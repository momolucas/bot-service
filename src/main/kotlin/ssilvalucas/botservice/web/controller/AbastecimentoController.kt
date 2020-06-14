package ssilvalucas.botservice.web.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ssilvalucas.botservice.service.AbastecimentoService
import ssilvalucas.botservice.web.dto.request.AbastecimentoRequest

@RestController
@RequestMapping("api/abastecimento")
class AbastecimentoController(val service: AbastecimentoService) {

    @PostMapping
    fun create(@RequestBody request: AbastecimentoRequest) =
            ResponseEntity.status(HttpStatus.CREATED).body(service.save(request))
}