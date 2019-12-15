package Inne.Adnotacje;

public class TeddyBear {
    @MaxLength()
    private String name;

    public TeddyBear(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        try {
            if (!TeddyBearAgeValidation.validate(this)) {
                throw new IllegalArgumentException("Za dlugie imie!");
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TeddyBear misiek = new TeddyBear("piuu7");
        System.out.println(misiek.getName());

    }


}
