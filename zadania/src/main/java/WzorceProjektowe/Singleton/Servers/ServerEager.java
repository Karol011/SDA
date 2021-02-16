package WzorceProjektowe.Singleton.Servers;

public class ServerEager {
    private static final ServerEager INSTANCE = new ServerEager();

    public static ServerEager getINSTANCE() {
        return INSTANCE;
    }
}
