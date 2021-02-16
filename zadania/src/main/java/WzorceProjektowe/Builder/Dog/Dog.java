package WzorceProjektowe.Builder.Dog;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

/*
Builder powinien zostać zdefiniowany wewnątrz klasy Dog i powinien być jedynym sposobem stworzenia jej instancji.
 */
@Getter
@ToString
public class Dog {

    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(final String name, final String type, final Integer age, final List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    static class Builder {

        private String name;
        private String type;
        private Integer age;
        private List<String> toys;


        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        public Builder withType(String type) {
            this.type = type;
            return this;
        }
        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withToys(List toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(name,type, age, toys);
        }
    }
}



