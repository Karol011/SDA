package WzorceProjektowe.Observer;

public abstract class Observer {

    Subject subject;



    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public Observer() {
    }

    public abstract void update(int value);
  }
