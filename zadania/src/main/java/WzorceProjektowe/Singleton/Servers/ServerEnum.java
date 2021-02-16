package WzorceProjektowe.Singleton.Servers;

import java.util.ArrayList;
import java.util.List;

public enum ServerEnum {
    INSTANCE;
    private final List<String> serverList;

    ServerEnum() {
        serverList = new ArrayList<>();
    }

}
