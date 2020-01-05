package Inne.Wyjatki.Club;

import java.util.HashSet;
import java.util.Set;

class Club {
private Set<Person> peopleInCLub = new HashSet<>();

    void enter(Person person) {
        if (person.getAge() < 18) {
            throw new NotAnAdultException("You have to be above 18 years old to enter");
        }
        peopleInCLub.add(person);
    }

    void showPeopleINClub() {
        for (Person personInClub :peopleInCLub ) {
            System.out.println(personInClub.toString());
        }
    }
}
