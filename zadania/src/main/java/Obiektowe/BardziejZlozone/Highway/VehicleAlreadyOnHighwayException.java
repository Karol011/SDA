package Obiektowe.BardziejZlozone.Highway;

 class VehicleAlreadyOnHighwayException extends RuntimeException {
     VehicleAlreadyOnHighwayException(String errorMessage) {
        super(errorMessage);
    }
}
