package Inne.Generyka.Garage;

public class Main {
    public static void main(String[] args) {

        Car beta = new BMW("x1", "black");
        BMW betaNowa = new BMW("x3", "black");
        Car porszak = new Porsche("speed", "red");
        Garage<Car> garage = new Garage<>(beta, porszak);

        System.out.println(garage.toString());
        garage.park(beta);
        garage.unpark(beta);
        System.out.println(garage.toString());
        System.out.println();

        Garage<BMW> garazNaBMW = new Garage<>(betaNowa, betaNowa);


    }


}
