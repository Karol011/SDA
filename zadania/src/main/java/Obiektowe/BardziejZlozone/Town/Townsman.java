package Obiektowe.BardziejZlozone.Town;

public class Townsman extends Soldier {

    public Townsman(String name) {
        super(name);

    }

    @Override
    protected boolean canVote() {
        return true;
    }
}
