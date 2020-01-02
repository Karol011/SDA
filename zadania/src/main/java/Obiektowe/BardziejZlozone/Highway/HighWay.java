package Obiektowe.BardziejZlozone.Highway;

import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

 class HighWay {
    private List<VehicleInfo> vehicles = new ArrayList<>();

    void vehicleEntry(String registrationNumber, CarType type) throws VehicleAlreadyOnHighwayException {
        for (int i = 0; i < vehicles.size(); i++) {                     //checking if vehicle with those registrationNumbers is already present on the highway
            if (vehicles.get(i).getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                throw new VehicleAlreadyOnHighwayException("vehicle is already present on the highway");
            }
        }
        VehicleInfo newVehicle = new VehicleInfo(registrationNumber, type, LocalDateTime.now());
        vehicles.add(newVehicle);
        System.out.println("New vehicle entered the highway: " + newVehicle.getRegistrationNumber() + " " + newVehicle.getCarType());
    }

    void searchVehicle(String registrationNumber) {
        boolean isPresent = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                System.out.println("vehicle " + registrationNumber + " is present on the highway");
                isPresent = true;
            }
        }
        if (isPresent == false) {
            System.out.println("there is no such vehicle as " + registrationNumber);
        }
    }

    void vehicleLeave(String registrationNumber) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                vehicles.remove(vehicles.get(i));
                LocalDateTime dateOFLeaveing = LocalDateTime.now();
                Duration timeOfRidingOnTheHighawy = Duration.between(vehicles.get(i).dateOFEntry, LocalDateTime.now());
                //todo count how many seconds vehicle was on the highway
                System.out.println("vehicle " + registrationNumber + " has left the highway and was " + timeOfRidingOnTheHighawy.getSeconds() + " seconds on it");
                System.out.println("his date of entry:" + vehicles.get(i).dateOFEntry);
                System.out.println("date of leaving: " + LocalDateTime.now());
            }
        }
    }


}

