package WzorceProjektowe.Builder;

public class Main {
    public static void main(String[] args) {
        House.HouseBuilder houseBuilder = new House.HouseBuilder();
        houseBuilder.withGarage(true)
                .withHeatingType(HeatingType.ELECTRIC)
                .withRoom(RoomType.KITCHEN,32d)
                .withRoom(RoomType.BATHROOM,12d)
                .withAddress("blablabla street")
                .build();

        System.out.println(houseBuilder);
    }

    //wzorzec projektowy builder ma za zadanie stworzyc instancje danego obiektu z wybranymi parametrami wpisywanie argumentow jest zastapiane przez
    // method chaining
    //(zamiast wpisywac kolejne parametry w konstruktorze, tworzymy metody buildera "with..." i chainujemy je kolejno na sobie aby stworzyc obiekt)
}
