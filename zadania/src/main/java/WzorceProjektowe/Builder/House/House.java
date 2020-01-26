package WzorceProjektowe.Builder.House;

import java.util.ArrayList;
import java.util.List;

public class House {

    private final int numberOfloors;
    private final List<Room> rooms;
    private final RoofType roofType;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final HeatingType heatingSource;
    private final String address;


    private House(int numberOfloors, List<Room> rooms, RoofType roofType, boolean hasGarage, boolean hasGarden, HeatingType heatingSource, String address) {
        this.numberOfloors = numberOfloors;
        this.rooms = rooms;
        this.roofType = roofType;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
        this.heatingSource = heatingSource;
        this.address = address;
    }


//kilka pokoi osobny metraz

    public static class HouseBuilder {
        private int numberOfloors;
        private List<Room> rooms = new ArrayList<>();
        private RoofType roofType;
        private boolean hasGarage;
        private boolean hasGarden;
        private HeatingType heatingType;
        private String address;


        public HouseBuilder withNumberOfFloors(int numberOfFloors) {
            this.numberOfloors = numberOfFloors;
            return this;
        }


        public HouseBuilder withRoom(RoomType roomType, double surface) {
            Room room = new Room(roomType, surface);
            this.rooms.add(room);
            return this;
        }

        public HouseBuilder withRoofType(RoofType roofType) {
            this.roofType = roofType;
            return this;
        }

        public HouseBuilder withGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder withGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder withHeatingType(HeatingType heatingType) {
            this.heatingType = heatingType;
            return this;
        }

        public HouseBuilder withAddress(String address) {
            this.address = address;
            return this;
        }


        public House build() {
            if (address == null) {
                throw new IllegalArgumentException("House cannot exist without a proper address");
            }
            if (rooms.isEmpty()) {
                throw new IllegalArgumentException("House without any rooms?");
            }
            if (numberOfloors < 0) {
                throw new IllegalArgumentException("Number of floors must be equal or greater than 1");
            } else if (numberOfloors == 0) {//jezeli user nie poda ilosci pieter to domyslnie dom ma 1 pietro
                this.numberOfloors = 1;
            }

            if (roofType == null) {
                this.roofType = RoofType.FLAT;
            }

            return new House(this.numberOfloors, this.rooms, this.roofType, this.hasGarage, this.hasGarden, this.heatingType, this.address);
        }

        @Override
        public String toString() {
            return "HouseBuilder{" +
                    ", numberOfloors=" + numberOfloors +
                    ", numberOfRooms=" + rooms +
                    ", roofType=" + roofType +
                    ", hasGarage=" + hasGarage +
                    ", hasGarden=" + hasGarden +
                    ", heatingType=" + heatingType +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}

