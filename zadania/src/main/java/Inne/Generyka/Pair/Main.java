package Inne.Generyka.Pair;

public class Main {

    static Pair[] findNotEmptyPairs(Pair[] pairs) {
        int counterOfNonNullPairs = 0;
        for (Pair pair : pairs) {
            if (pair.getLeft() != null && pair.getRight() != null) {
                counterOfNonNullPairs++;
            }
        }
        Pair[] pairsThatAreNotEmpty = new Pair[counterOfNonNullPairs];

        for (int i = 0; i < counterOfNonNullPairs; i++) {
            if (pairs[i].getLeft() != null && pairs[i].getRight() != null) {
                pairsThatAreNotEmpty[i] = pairs[i];
            }
        }
        return pairsThatAreNotEmpty;

    }

    static void printArrayOfPairs(Pair[] pairs) {
        for (Pair pair : pairs) {
            System.out.println(pair);
        }
    }


    public static void main(String[] args) {
        Pair<Student, Car> firstPair = new Pair<>(
                new Student("Andrzej", "Majewski", 5),
                new Car("BMW", "Black", 2016));

        Pair<Student, Car> secondPair = new Pair<>(
                new Student("Marta", "Kaczynska", 3),
                new Car("Opel", "White", 2005));

        Pair<Student, Car> thirdPair = new Pair<>(
                new Student("Kamila", "Szarzynska", 4),
                new Car("Audi", "Red", 2012));
        Pair<Student, Car> fourthPair = new Pair<>(
                null,
                new Car("Audi", "Red", 2012));

        Pair[] arrayOfPairs = new Pair[]{firstPair, secondPair, thirdPair, fourthPair};


        printArrayOfPairs(findNotEmptyPairs(arrayOfPairs));
    }


}


/*
3. Stwórz klasę generyczną Para, która przyjmuje dwa obiekty - obiekt prawy i lewy. Niech klasa będzie generyczna.
 Typy obiektów (lewego i prawego) klasy mają być podane przy
deklaracji obiektu (generyczne).

Stwórz klasę modelu Student oraz Samochód. Stwórz kilka obiektów typu Para (samochód i Student) a następnie dodaj je do tablicy.

3B*. Stwórz metodę generyczną 'znajdźNiepuste(Para[]):Para[]' która iteruje tablicę obiektów typu 'Para'
 i znajduje tylko niepuste pary (obiekt prawy i lewy mają być niepuste (!=null).

 */
