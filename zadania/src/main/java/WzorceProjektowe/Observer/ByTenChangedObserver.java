package WzorceProjektowe.Observer;

public class ByTenChangedObserver extends Observer {
    private int previousValue;

    public ByTenChangedObserver(final Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void update(int value) {
        if (Math.abs(previousValue - value) >= 10) {
            System.out.println("ByTen: New value is: " + value);
        }
        previousValue = subject.getValue();
    }

}