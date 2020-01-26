package WzorceProjektowe.Builder;

public class Room {
    private RoomType roomType;
    private double surface;

    public Room(RoomType roomType, double surface) {
        this.roomType = roomType;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", surface=" + surface +
                '}';
    }
}
