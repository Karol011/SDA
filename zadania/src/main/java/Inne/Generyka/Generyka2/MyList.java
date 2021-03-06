package Inne.Generyka.Generyka2;

import java.util.Arrays;

public class MyList<E> {
    protected Integer n;
    private E[] arrayOfElements;

    MyList(int n) {
        this.arrayOfElements = (E[]) (new Object[n]);
    }

    public boolean contain(E element) {
        for (int i = 0; i < arrayOfElements.length; i++) {
            if (arrayOfElements.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean addElement(E element) {
        for (int i = 0; i < arrayOfElements.length; i++) {
            if (arrayOfElements[i] == null) {
                arrayOfElements[i] = element;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return arrayOfElements.length;
    }

    @Override
    public String toString() {
        return "MyList{" +                              //TODO loop
                "n=" + n +
                ", arrayOfElements=" + Arrays.toString(arrayOfElements) +
                '}';
    }

    public int getN() {
        return n;
    }
}
