package Obiektowe.BardziejZlozone.Town;

public class Town {
    protected Citizen[] citizens;


    public static void whoCanVote(Citizen[] citizens) {
        for (int i = 0; i < citizens.length; i++) {
            if (citizens[i].canVote()) {
                System.out.println(citizens[i].name + " moze glosowac");
            }
        }
    }
}
