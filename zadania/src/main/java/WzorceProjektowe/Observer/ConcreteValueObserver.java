package WzorceProjektowe.Observer;

public class ConcreteValueObserver extends Observer {

    public ConcreteValueObserver(final Subject subject) {
        super(subject);
    }

    @Override
    public void update(int value) {
        System.out.println("Concrete: New value is: " + value);
    }

}
