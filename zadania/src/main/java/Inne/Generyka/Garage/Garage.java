package Inne.Generyka.Garage;

public class Garage<T extends Car> {
    private T parkingSpot1;
    private T parkingSpot2;

    public Garage(T parkingSpot1, T parkingSpot2) {
        this.parkingSpot1 = parkingSpot1;
        this.parkingSpot2 = parkingSpot2;
    }

    public void park(T car) {
        if (getParkingSpot1() == null) {
            setParkingSpot1(car);
            System.out.println(car + " is parked in " + getParkingSpot1());
        } else if (getParkingSpot2() == null) {
            setParkingSpot2(car);
            System.out.println(car + " is parked in " + getParkingSpot2());
        } else unpark(car);
    }

    public boolean unpark(T car) {
        if (getParkingSpot1() != null && parkingSpot1.equals(car)) {
            System.out.println(getParkingSpot1() + " is now available");
            setParkingSpot1(null);
            return true;
        }
        if (getParkingSpot2() != null && parkingSpot2.equals(car)) {
            System.out.println(getParkingSpot2() + " is now available");
            setParkingSpot2(null);
            return true;
        } else {
            System.out.println("Your car is not in the garage");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Garage{" +
                "parkingSpot1=" + getParkingSpot1() +
                ", parkingSpot2=" + getParkingSpot2() +
                '}';
    }

    public T getParkingSpot1() {
        return parkingSpot1;
    }

    public void setParkingSpot1(T parkingSpot1) {
        this.parkingSpot1 = parkingSpot1;
    }

    public T getParkingSpot2() {
        return parkingSpot2;
    }

    public void setParkingSpot2(T parkingSpot2) {
        this.parkingSpot2 = parkingSpot2;
    }
}
