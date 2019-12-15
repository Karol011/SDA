package Obiektowe.listopad24.town;

public abstract class Citizen {
    protected String name;
public Citizen(String name){
    this.name = name;
}

    protected abstract boolean canVote();

}
