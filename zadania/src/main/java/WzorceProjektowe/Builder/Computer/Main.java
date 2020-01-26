package WzorceProjektowe.Builder.Computer;

public class Main {

    public static void main(String[] args) {
        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder();
        computerBuilder
                .withDisk(1000,DiskType.SSD)
                .withMotherboardModel("Radeon xxx")
                .withPowerSupplyValue(320)
                .withProcessor("AMD123",2.4)
                .withRamSize(2048)
                .build();

        System.out.println(computerBuilder);
    }
}
