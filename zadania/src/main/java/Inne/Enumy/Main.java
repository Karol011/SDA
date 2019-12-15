package Inne.Enumy;

public class Main {
    public static void main(String[] args) {

        SuperBohater superman = new SuperBohater("superman", "latanie");
        SuperBohater batman = new SuperBohater("batman", "skakanie");
        SuperBohater jakisZiomek = new SuperBohater("jakisZiomek", "narzekanie");

        superman = batman;
        superman = null;
        System.out.println(batman == null);

        superman = null;
        batman = superman;
        superman = jakisZiomek;
        System.out.println(superman == null);
        System.out.println(batman == null);
        System.out.println(jakisZiomek == null);

        String blabla = "blabla";
        String blabla1 = new String("blabla");

       // System.out.println(blabla.equals(blabla1));
    //    System.out.println(blabla == blabla1);

    }
}
