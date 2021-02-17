package WzorceProjektowe.Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer concreteObserver = new ConcreteValueObserver(subject);
        Observer loweredObserver = new LoweredValueObserver(subject);
        Observer ByTenObserver = new ByTenChangedObserver(subject);

        subject.subscribe(concreteObserver);
        subject.subscribe(loweredObserver);
        subject.subscribe(ByTenObserver);

        subject.update(10);
        subject.update(12);
        subject.update(9);
        subject.update(99);
    }
}
