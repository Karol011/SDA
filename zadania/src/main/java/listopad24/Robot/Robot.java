package listopad24.Robot;

public class Robot {
    private int batteryLevel;
    private String robotName;
    private boolean isItON;

    public void moveRobot(RobotMoves moveOfTheRobot) {
        if (isItON()) {
            if (getBatteryLevel() - moveOfTheRobot.getEnergyRequired() > 0) {
                setBatteryLevel(getBatteryLevel() - moveOfTheRobot.getEnergyRequired());
            } else {
                System.out.println("battery too low, charge the robot!");
            }

        } else {
            System.out.println("turn it on!");
        }
    }

    public void chargeBattery() {
        if (!isItON()) {
            System.out.println("charging to 100");
            setBatteryLevel(100);
        } else {
            System.out.println("turn it off, at first!");
        }
    }

    public void turnON() {
        System.out.println("turning on");
        setItON(true);
    }

    public void turnOFF() {
        System.out.println("shutting down");
        setItON(false);
    }

    public Robot(int batteryLevel, String robotName, boolean isItON) {
        this.batteryLevel = batteryLevel;
        this.robotName = robotName;
        this.isItON = isItON;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


    public boolean isItON() {
        return isItON;
    }

    public void setItON(boolean itON) {
        isItON = itON;
    }
}
