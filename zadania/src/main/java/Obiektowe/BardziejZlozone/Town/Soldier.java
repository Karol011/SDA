package Obiektowe.BardziejZlozone.Town;

public class Soldier extends King {

    public Soldier(String name) {
        super(name);
    }
    @Override
    protected boolean canVote() {
        return true;
    }

}
