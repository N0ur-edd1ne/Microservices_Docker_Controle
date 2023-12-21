package ma.emsi.voiture.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import ma.emsi.voiture.entity.Client;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CarResponse {

        private Integer id;
        private String brand;
        private String model;
        private String RegesterNumber;
        private Client client;
}
