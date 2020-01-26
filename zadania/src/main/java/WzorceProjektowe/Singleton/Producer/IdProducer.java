package WzorceProjektowe.Singleton.Producer;

public class IdProducer {
    private static IdProducer instance = null;

    public static IdProducer getInstance() {
        if (instance == null) {
            instance = new IdProducer();
        }
        return instance;
    }

    private int lastId = 0;

    private IdProducer() {
    }

    public int getNextId() {
        return ++lastId;
    }
}
