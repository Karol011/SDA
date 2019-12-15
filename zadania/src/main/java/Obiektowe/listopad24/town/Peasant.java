package Obiektowe.listopad24.town;

public class Peasant extends Townsman {
    public Peasant(String name) {
        super(name);
    }

    @Override
    protected boolean canVote() {
        return false;
    }
}
