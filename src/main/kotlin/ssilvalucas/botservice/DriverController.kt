package ssilvalucas.botservice

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/driver/")
class DriverController(val repository: DriverRepository) {

    @PostMapping("register")
    fun create(@RequestBody driverModel: DriverModel) =
//            repository.findFirstByPhoneNumber(driverModel.phoneNumber)
//                    .ifPresent {
                        ResponseEntity.ok(repository.save(driverModel))
//                    }

    @GetMapping("list")
    fun fetchAllDrivers() = ResponseEntity.ok(repository.findAll())

    @PutMapping("update/{phoneNumber}")
    fun update(@PathVariable phoneNumber: String, @RequestBody driverModel: DriverModel): ResponseEntity<DriverModel> {
        val driverDB = repository.findFirstByPhoneNumber(phoneNumber).orElseThrow {
            RuntimeException("Driver not found by cellphone: $phoneNumber")
        }
        return ResponseEntity.ok(
                repository.save(driverDB.copy(name = driverModel.name, phoneNumber = driverModel.phoneNumber))
        )
    }

    @DeleteMapping("delete/{phoneNumber}")
    fun delete(@PathVariable phoneNumber: String) = repository.findFirstByPhoneNumber(phoneNumber)
            .ifPresent {
                repository.delete(it)
            }
}