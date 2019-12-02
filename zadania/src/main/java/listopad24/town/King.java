package listopad24.town;

public class King extends Citizen {
    protected String name;

    public King(String name) {
        super(name);
    }

    @Override
    protected boolean canVote() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
