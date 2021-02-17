package WzorceProjektowe.Adapter;

public class ComputerGameAdapter implements PCGame {

    private ComputerGame computerGame;

    public ComputerGameAdapter(final ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        return getAgeFromPegiRating(computerGame.getPegiAgeRating());
    }

    private Integer getAgeFromPegiRating(Enum<PegiAgeRating> pegiAgeRatingEnum) {
        return Integer.valueOf(pegiAgeRatingEnum
                .toString()
                .substring(1));
    }

    @Override
    public boolean isTripleAGame() {
        return computerGame.getBudgetInMillionsOfDollars() > 50e6;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(computerGame.getMinimumGpuMemoryInMegabytes(),
                computerGame.getDiskSpaceNeededInGB(),
                computerGame.getRamNeededInGb(),
                computerGame.getCoreSpeedInGhz(),
                computerGame.getCoresNeeded());
    }

}
