package WzorceProjektowe.Builder.Computer;

public class Disk {
    private int diskSize; // in GB
    private DiskType diskType;

    public Disk(int diskSize, DiskType diskType) {
        this.diskSize = diskSize;
        this.diskType = diskType;
    }

    public Disk(Disk otherDisk) {
        this.diskSize = otherDisk.diskSize;
        this.diskType = otherDisk.diskType;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    @Override
    public String toString() {
        return "computer.Disk{" +
                "diskSize=" + diskSize +
                ", diskType=" + diskType +
                '}';
    }
}
