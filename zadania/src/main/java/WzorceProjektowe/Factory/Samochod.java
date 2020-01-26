package WzorceProjektowe.Factory;

public class Samochod extends PojazdSpalinowy {
    private String typNadwozia;
    private TypSkrzyniBiegow typSkrzyniBiegow;

    public Samochod(String numerRejestracyjny, String kolor, String vin, String typNadwozia, TypSkrzyniBiegow typSkrzyniBiegow) {
        super(numerRejestracyjny, kolor, vin);
        this.typNadwozia = typNadwozia;
        this.typSkrzyniBiegow = typSkrzyniBiegow;
    }

    public String getTypNadwozia() {
        return typNadwozia;
    }

    public TypSkrzyniBiegow getTypSkrzyniBiegow() {
        return typSkrzyniBiegow;
    }

    @Override
    public void jedz() {
        System.out.println("Brum brum!");
    }
}
