package WzorceProjektowe.Builder.Computer;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final String processorModel;
    private final double processorClock;
    private final String gpuModel;
    private final String motherboardModel;
    private final int ramSize; // in MB
    private final List<Disk> disks;
    private final int powerSupplyValue;



//    private computer.Computer(String processorModel, double processorClock, String gpuModel, String motherboardModel, int ramSize, int diskSize, computer.DiskType diskType, int powerSupplyValue) {
//        this.processorModel = processorModel;
//        this.processorClock = processorClock;
//        this.gpuModel = gpuModel;
//        this.motherboardModel = motherboardModel;
//        this.ramSize = ramSize;
//        this.disks = new ArrayList<computer.Disk>();
//        this.disks.add(new computer.Disk(diskSize, diskType));
//        this.powerSupplyValue = powerSupplyValue;
//    }

    private Computer(String processorModel, double processorClock, String gpuModel, String motherboardModel, int ramSize, List<Disk> disks, int powerSupplyValue) {
        this.processorModel = processorModel;
        this.processorClock = processorClock;
        this.gpuModel = gpuModel;
        this.motherboardModel = motherboardModel;
        this.ramSize = ramSize;
        this.disks = disks;
        this.powerSupplyValue = powerSupplyValue;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public double getProcessorClock() {
        return processorClock;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public List<Disk> getDisks() {
        return disks;
    }

    public int getPowerSupplyValue() {
        return powerSupplyValue;
    }



    public static class ComputerBuilder {
        private String processorModel;
        private double processorClock;
        private String gpuModel;
        private String motherboardModel;
        private int ramSize; // in MB
        private List<Disk> disks = new ArrayList<Disk>();
        private int powerSupplyValue;


        public ComputerBuilder withProcessor(String processorModel, double processorClock) {
            this.processorModel = processorModel;
            this.processorClock = processorClock;
            return this;
        }

        public ComputerBuilder withGpuModel(String gpuModel) {
            this.gpuModel = gpuModel;
            return this;
        }

        public ComputerBuilder withMotherboardModel(String motherboardModel) {
            this.motherboardModel = motherboardModel;
            return this;
        }

        public ComputerBuilder withRamSize(int ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder withPowerSupplyValue(int powerSupplyValue) {
            this.powerSupplyValue = powerSupplyValue;
            return this;
        }

        public ComputerBuilder withDisk(int diskSize, DiskType diskType) {
            Disk disk = new Disk(diskSize, diskType);
            this.disks.add(disk);
            return this;
        }

        public Computer build() {
            if (motherboardModel == null) {
                this.motherboardModel = "Najtansza plyta glowna";
                //throw new IllegalArgumentException("Mother board model must be present");
            }
            if (ramSize <= 0) {
                throw new IllegalArgumentException("RAM must be present");
            }
            if (powerSupplyValue <= 0) {
                throw new IllegalArgumentException("Power supply must be present");
            }
            if (processorModel == null) {
                throw new IllegalArgumentException("Processor model must be present");
            }

            return new Computer(this.processorModel, this.processorClock, this.gpuModel, this.motherboardModel, this.ramSize, this.disks, this.powerSupplyValue);
        }
        @Override
        public String toString() {
            return "computer.Computer{" +
                    "processorModel='" + processorModel + '\'' +
                    ", processorClock=" + processorClock +
                    ", gpuModel='" + gpuModel + '\'' +
                    ", motherboardModel='" + motherboardModel + '\'' +
                    ", ramSize=" + ramSize +
                    ", disks=" + disks +
                    ", powerSupplyValue=" + powerSupplyValue +
                    '}';
        }
    }

}
