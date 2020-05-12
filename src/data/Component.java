package data;

public abstract class Component {
    private String name;
    private String producer;
    private String serialNumber;

    public Component(String name, String producer, String serialNumber) {
        this.name = name;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    public boolean checkNewTemperatureIsSecure(double tempToCheck, double maxTemperature) {
        return (tempToCheck <= maxTemperature);
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
