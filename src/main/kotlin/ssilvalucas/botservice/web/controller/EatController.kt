package ssilvalucas.botservice.web.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ssilvalucas.botservice.service.EatService

@RestController
@RequestMapping("/api/diario/eat/{phoneNumber}")
class EatController(val service: EatService) {

    @PostMapping
    fun create(@PathVariable phoneNumber: String) =
            ResponseEntity.status(HttpStatus.ACCEPTED).body(service.save(phoneNumber))
}