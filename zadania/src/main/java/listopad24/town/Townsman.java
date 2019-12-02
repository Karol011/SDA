package listopad24.town;

public class Townsman extends Soldier {

    public Townsman(String name) {
        super(name);

    }

    @Override
    protected boolean canVote() {
        return true;
    }
}
