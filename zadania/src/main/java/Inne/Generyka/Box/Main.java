package Inne.Generyka.Box;

public class Main {
    public static void main(String[] args) {
        Box boxWithString = new Box("jakisString");
        Box boxWithNull = new Box(null);
        Box boxWithoutArguments = new Box();

        boxWithString.isTheBoxEmpty();
        boxWithNull.isTheBoxEmpty();
        boxWithoutArguments.isTheBoxEmpty();
    }
}
/*
2. Stwórz klasę generyczną Pudełko. Pudełko przechowuje dowolny obiekt generyczny.
Dodaj pole typu generycznego 'T'. Stwórz konstruktor który przyjmuje jako parametr obiekt generyczny (przypisz jego wartość do pola).
 Dodaj getter oraz setter do klasy.

* dodaj do klasy metodę "czyPudełkoJestPuste():boolean"
która zwraca informację true - jeśli pudełko jest puste (czyli obiekt generyczny jest ==null)
 oraz false gdy nie jest puste (obiekt [pole] generyczne jest !=null).

Sprawdź czy obiekt zachowuje się zgodnie z założeniami. Stwórz dwa konstruktory:
-	pusty (który nie ustawia zaartości pudełka)
-	z parametrem (który ustawia zawartość)
Stwórz klasę main z metodą main i przetestuj działanie na kilku instancjach.

 */
