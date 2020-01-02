package Obiektowe.BardziejZlozone.Highway;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data

 class VehicleInfo {
    String registrationNumber;
    CarType carType;
    LocalDateTime dateOFEntry;

     VehicleInfo(String registrationNumber, CarType carType, LocalDateTime dateOFEntry) {
        this.registrationNumber = registrationNumber;
        this.carType = carType;
        this.dateOFEntry = dateOFEntry;
    }
}
