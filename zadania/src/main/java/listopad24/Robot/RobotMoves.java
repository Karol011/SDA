package listopad24.Robot;

public enum RobotMoves {
    LEFT_STEP(5),
    RIGHT_STEP(5),
    MOVE_LEFT_ARM(5),
    MOVE_RIGHT_ARM(5),
    JUMP(20);

    private int energyRequired;

    RobotMoves(int energyRequired) {
        this.energyRequired = energyRequired;
    }

    public int getEnergyRequired() {
        return energyRequired;
    }


}
