package WzorceProjektowe.Singleton;

public class Singleton {

    public static Singleton INSTANCE = null;
    String string;

    private Singleton() {

        string = "Instance";
    }
public static Singleton getInstance(){
    if (INSTANCE == null) {
        INSTANCE = new Singleton();
    }
    return INSTANCE;

}

    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        System.out.println(x.string);
        System.out.println(y.string);


    }


}
