package WzorceProjektowe.Builder.Dog;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog.Builder()
                .withAge(18)
                .withName("Burek")
                .withToys(List.of("Kulka","Kosc"))
                .build();
        System.out.println(dog);
    }
}
