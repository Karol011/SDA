package Inne.Watki;

public class WspolbiezneOdliczanie {


    public static void main(String[] args) {
        Runnable uruchamialna = new Runnable() {
            @Override
            public void run() {
                System.out.println("Uruchomienie powiodło się");
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(1000);
                        System.out.println(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable uruchamialna2 = () -> run2();


        Thread watek = new Thread(uruchamialna);
        Thread watek2 = new Thread(uruchamialna2);
        watek.start();
        watek2.start();
    }
    public static void run2() {
        System.out.println("Uruchomienie powiodło się");
        try {
            for (int i = 100; i > 0; i--) {
                Thread.sleep(500);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
