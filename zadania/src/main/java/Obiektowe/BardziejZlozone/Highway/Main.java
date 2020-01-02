package Obiektowe.BardziejZlozone.Highway;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HighWay highWay = new HighWay();
        chooseAction(highWay);
    }

    private static CarType checkCarTypeChoosenByUser(String input) {
        CarType choosenVehicleType;
        if (input.equals("CAR")) {
            choosenVehicleType = CarType.CAR;
        } else if (input.equals("TRUCK")) {
            choosenVehicleType = CarType.TRUCK;
        } else {
            choosenVehicleType = CarType.MOTORCYCLE;
        }
        return choosenVehicleType;
    }

    private static void chooseAction(HighWay highWay) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type the commands:\n" +
                "entry registrationNumber type (car,truck,motorcycle)\n" +
                "exit registrationNumber\n" +
                "check registrationNumber\n" +
                "quit");
        String[] action = scanner.nextLine().trim().toUpperCase().split(" ");

        while (!action[0].equalsIgnoreCase("quit")) { //while first word is DIFFERENT than 'quit' then...
            if (action.length == 3) { //first case, because only "entry" require 3 parameters
                highWay.vehicleEntry(action[1], checkCarTypeChoosenByUser(action[2]));
            } else if (action.length == 2) {//second case exit OR check
                //todo
                if (action[0].equalsIgnoreCase("exit")) {
                    highWay.vehicleLeave(action[1]);
                }
                if (action[0].equalsIgnoreCase("check")) {
                    highWay.searchVehicle(action[1]);
                }
            }
            action = scanner.nextLine().trim().toUpperCase().split(" ");
        }
    }
}
