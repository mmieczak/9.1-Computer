package data;

public class HardDrive extends Component {
    private int sizeGB;

    public HardDrive(String name, String producer, String serialNumber, int sizeGB) {
        super(name, producer, serialNumber);
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                ", sizeGB: " + sizeGB +
                "Name :'" + getName() + '\'' +
                ", Producer='" + getProducer() + '\'' +
                ", SerialNumber='" + getSerialNumber() + '\'' +
                '}';
    }
}
