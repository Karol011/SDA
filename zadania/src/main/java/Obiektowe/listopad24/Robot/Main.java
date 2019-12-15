package Obiektowe.listopad24.Robot;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Robot robocop = new Robot(100, "Robocop", true);
        start(robocop);
    }

    public static void start(Robot robocop) {
        String command;
        printInfo();
        System.out.println("command: ");
        command = scanner.nextLine();
        do {
            System.out.println("command: ");
            command = scanner.nextLine();
            switch (command) {
                case "ml":
                    System.out.println("left step");
                    robocop.moveRobot(RobotMoves.LEFT_STEP);
                    break;
                case "mr":
                    System.out.println("right step");
                    robocop.moveRobot(RobotMoves.RIGHT_STEP);
                    break;
                case "mla":
                    System.out.println("left arm is waving");
                    robocop.moveRobot(RobotMoves.MOVE_LEFT_ARM);
                    break;
                case "mra":
                    System.out.println("right arm is waving");
                    robocop.moveRobot(RobotMoves.MOVE_RIGHT_ARM);
                    break;
                case "jump":
                    System.out.println("jump!");
                    robocop.moveRobot(RobotMoves.JUMP);
                    break;
                case "charge":
                    robocop.chargeBattery();
                    break;
                case "on":
                    robocop.turnON();
                    break;
                case "off":
                    robocop.turnOFF();
                    break;
                case "show":
                    System.out.println("battery level: " + robocop.getBatteryLevel());
                    break;
            }

        } while (!command.equals("quit"));
    }

    public static void printInfo() {
        System.out.println("INSTRUCTIONS:" +
                "ml = moves left\n" +
                "mr = moves right\n " +
                "mla = moves left arm\n" +
                "mra = moves right arm\n" +
                "jump \n" +
                "charge \n" +
                "on\n" +
                "off\n" +
                "show = show current battery lvl\n" +
                "quit = to quit the program");
    }
}
