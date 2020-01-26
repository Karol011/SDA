package WzorceProjektowe.Singleton;

import java.util.Optional;

public class Singleton {

    public static Singleton INSTANCE = null;
    String s;

    private Singleton() {

        s = "Instance";
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

        System.out.println(x.s);
        System.out.println(y.s);


    }


}
