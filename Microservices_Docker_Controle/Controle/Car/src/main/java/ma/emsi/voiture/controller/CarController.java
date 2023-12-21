package ma.emsi.voiture.controller;


import lombok.RequiredArgsConstructor;
import ma.emsi.voiture.entity.Car;
import ma.emsi.voiture.models.CarResponse;
import ma.emsi.voiture.repository.CarRepository;
import ma.emsi.voiture.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping
    public void save(@RequestBody Car clt) {
        carService.saveCar(clt);
    }

    @GetMapping
    public List<CarResponse> findAll() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public CarResponse findById(@PathVariable Integer id) throws Exception {
        return carService.findById(id);
    }
}
