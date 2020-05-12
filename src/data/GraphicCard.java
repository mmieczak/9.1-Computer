package data;

public class GraphicCard extends Overclockable {
    private int memoryMB;
    private String memoryType;

    public GraphicCard(String name, String producer, String serialNumber, double baseClock, double clockRelatedTemperature, double baseTempForBaseClock, double maxTemperature, int memoryMB, String memoryType) {
        super(name, producer, serialNumber, baseClock, clockRelatedTemperature, baseTempForBaseClock, maxTemperature);
        this.memoryMB = memoryMB;
        this.memoryType = memoryType;
    }

    @Override
    public double calculateNewTemperature(double newClock) {
        return (Overclock.GPU_TEMP_INCREASE_FOR_EVERY_100_MHZ * (newClock - getBaseClock())) / 100;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "Memory[MB]: " + memoryMB +
                ", Memory Type: '" + memoryType + '\'' +
                "Name: " + getProducer() + " " + getName() + ", " +
                "Base clock: " + getBaseClock() + ", " +
                "Base temp: " + getBaseTempForBaseClock() + ", " +
                "Current clock: " + getCurrentClock() + ", " +
                "Current temp: " + getClockRelatedTemperature() + ", " +
                "Max temp: " + getMaxTemperature();
    }
}
