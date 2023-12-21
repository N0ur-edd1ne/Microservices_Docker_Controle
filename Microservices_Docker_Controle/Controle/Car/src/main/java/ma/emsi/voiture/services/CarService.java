package ma.emsi.voiture.services;

import lombok.RequiredArgsConstructor;
import ma.emsi.voiture.entity.Car;
import ma.emsi.voiture.entity.Client;
import ma.emsi.voiture.models.CarResponse;
import ma.emsi.voiture.repository.CarRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final RestTemplate restTemplate;
    private final String clientUrl = "http://localhost:8888/SERVICE-CLIENT/api/v1/client";

    public List<CarResponse> getAllCars() {
        List<Car> cars = carRepository.findAll();
        ResponseEntity<Client[]> response =
                restTemplate.getForEntity(this.clientUrl, Client[].class);
        Client[] clients = response.getBody();

        return cars.stream()
                .map(car -> mapToCarResponse(car, clients))
                .collect(Collectors.toList());
    }

    private CarResponse mapToCarResponse(Car car, Client[] clients) {
        Client foundClient = Arrays.stream(clients)
                .filter(client -> Objects.equals(client.getId(), car.getClient_id()))
                .findFirst()
                .orElse(null);

        return CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .RegesterNumber(car.getRegesterNumber())
                .client(foundClient)
                .build();
    }

    public CarResponse findById(Integer id) throws Exception {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new Exception("Car not found"));

        Client client = restTemplate.getForObject(this.clientUrl + "/api/v1/client/" + car.getClient_id(), Client.class);

        return CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .RegesterNumber(car.getRegesterNumber()) // Corrected typo
                .client(client)
                .build();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
}
