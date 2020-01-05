package Inne.Wyjatki.Club;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    String name,surname;
    int age;

     Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
