package WzorceProjektowe.Singleton.Producer;

public class Main {
    public static void main(String[] args) {
        IdProducer idp = IdProducer.getInstance();
        System.out.println(idp.getNextId());
        System.out.println(idp.getNextId());
        System.out.println(idp.getNextId());

        cos();
    }

    private static void cos() {
        IdProducer idp = IdProducer.getInstance();
        System.out.println("coś: " + idp.getNextId());
    }
}
