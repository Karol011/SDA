package WzorceProjektowe.Singleton.Servers;


/*

        Stwórz singleton Servers typu lazy. Singleton ten przechowuje listę serwerów (jako String). Zaimplementuj następujące funkcjonalności:

        dodanie serwera do listy
        metoda dodająca serwer do listy powinna zwracać boolean (true jeżeli serwer został dodany do listy, false w przeciwnym wypadku)
        dodanie jest możliwe, jeżeli jego nazwa zaczyna się od http lub https
        dodanie zduplikowanej nazwy jest niemożliwe
        pobranie listy serwerów, których nazwa zaczyna się od http
        pobranie listy serwerów, których nazwa zaczyna się od https
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Server {

    private static volatile Server instance;

    public static Server getInstance() {
        if (instance == null) {
            synchronized (Server.class) {
                if (instance == null) {
                    instance = new Server();
                }
            }
        }
        return instance;
    }

    private List<String> servers;

    public boolean addServer(Server server) {
        if ((server.toString().startsWith("http") ||
                server.toString().startsWith("https")) &&
                !servers.contains(server)) {
            return true;
        } else return false;
    }

    public List<String> getHttpServers() {
        final List<String> httpServers = servers.stream()
                .filter(s -> s.startsWith("http"))
                .collect(Collectors.toList());
        return httpServers;
    }
}
