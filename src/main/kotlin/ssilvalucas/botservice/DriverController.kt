package ssilvalucas.botservice

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.RuntimeException

@RestController
@RequestMapping("api/driver/")
class DriverController(val repository: DriverRepository) {

    @PostMapping("register")
    fun create(@RequestBody driverModel: DriverModel) =
            ResponseEntity.ok(repository.save(driverModel))

    @GetMapping("list")
    fun fetchAllDrivers() = ResponseEntity.ok(repository.findAll())

}