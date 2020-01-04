package Inne.Generyka.Box;

import java.util.Optional;

public class Box<T> {
    T object;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
    public Box(){
            }

    public void setObject(T object) {
        this.object = object;
    }

    void isTheBoxEmpty() {

        Optional.ofNullable(object)
                .ifPresentOrElse(o->{System.out.println(false);} ,
        ()->{System.out.println(true);});
    }
}
