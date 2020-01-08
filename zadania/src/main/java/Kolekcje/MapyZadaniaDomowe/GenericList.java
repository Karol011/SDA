package Kolekcje.MapyZadaniaDomowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericList<T> {
    List<T> list = new ArrayList<>();

    GenericList() {
    }

    void add(T t) {
        list.add(t);
    }

    void remove(T t) {
        list.remove(t);
    }

    T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "GenericList{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericList)) return false;
        GenericList<?> that = (GenericList<?>) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

}
