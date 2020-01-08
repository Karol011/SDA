package Obiektowe.BardziejZlozone.Town;

/*
Zadanie 2
Stwórz klasę abstrakcyjną Citizen(Obywatel) oraz klasy dziedziczące:
Peasant(Chłop),
Townsman(Mieszczanin),
King(Król),
Soldier(Żołnierz)
Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole - podpowiedz: w klasie Citizen).
Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'boolean canVote()' (może głosować) która zwraca true
dla townsman'a i soldier'a, ale false dla chłopa i króla.
Stwórz klasę Town która posiada tablicę Citizenów. Town nie dziedziczy po Citizen.
Dodaj do niej kilku citizenów (różnych w mainie) i stwórz metody howManyCanVote które zwracają ilość osób które mogą głosować.
Stwórz w klasie Town metodę "whoCanVote" która wypisuje imiona osób które mogą głosować.
*Dla chetnych metoda whoCanVote():Citizen[] - zwraca podtablicę osób które mogą głosować.
WSKAZÓWKA: żeby dodać do Town citizenów, stwórzcie citizenów jako pole w mieście, a następnie przekaż ich w konstruktorze.
Tworząc miasto w main’ie przekaż przygotowaną wcześniej tablicę obywateli (citizenów).
    howmanycanvote - pętlą liczymy ilość obywateli którzy mogą głosować.
 */
public class Main {
    public static void main(String[] args) {
        Citizen Artur = new King("Artur");
        Citizen Ork = new Soldier("Ork");
        Citizen Pioter = new Peasant("Pioter");
        Citizen Karol = new Townsman("Karol");
        Citizen Sebek = new Peasant("Sebek");

        Citizen[] citizens = {Artur, Ork, Pioter, Karol, Sebek};
        Town town = new Town(citizens);


        int peopleThatCanVote = howManyCanVote(citizens);
        Town.whoCanVote(citizens);
        System.out.println("People that can vote: " + howManyCanVote(citizens));
    }

    public static int howManyCanVote(Citizen[] citizens) {
        int peopleThatCanVote = 0;
        for (int i = 0; i < citizens.length; i++) {
            if (citizens[i].canVote()) {
                peopleThatCanVote++;
            }
        }
        return peopleThatCanVote;
    }

    /*   public static void whoCanVote(Citizen[] citizens, int peopleThatCanVote) {
           Citizen[] citizensAbleToVote = new Citizen[peopleThatCanVote];
           for (int i = 0; i < citizens.length; i++) {
               for (int j = 0; j < citizens.length; j++) {
                   if (citizens[i].canVote()) {
                       citizensAbleToVote[j] = citizens[i];
                       System.out.println(citizensAbleToVote[i].name);
                   }
               }

           }
       }


     */
    public static void showWhoCanVote(Citizen[] citizensAbleToVote) {
        for (int i = 0; i < citizensAbleToVote.length; i++) {
            System.out.println(citizensAbleToVote[i].name + ",");
        }
    }
}
