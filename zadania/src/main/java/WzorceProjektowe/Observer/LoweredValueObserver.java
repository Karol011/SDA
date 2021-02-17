package WzorceProjektowe.Observer;

public class LoweredValueObserver extends Observer {
private int previousValue;

    public LoweredValueObserver(final Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void update(int value) {
        if (previousValue > value) {
            System.out.println("Lowered: New value is: " + value);
        }
        previousValue = subject.getValue();

    }

}