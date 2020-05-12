package data;

public class Memory extends Overclockable {
    private int amountMB;

    public Memory(String name, String producer, String serialNumber, double baseClock, double clockRelatedTemperature, double baseTempForBaseClock, double maxTemperature, int amountMB) {
        super(name, producer, serialNumber, baseClock, clockRelatedTemperature, baseTempForBaseClock, maxTemperature);
        this.amountMB = amountMB;
    }

    @Override
    public double calculateNewTemperature(double newClock) {
        return (Overclock.MEMORY_TEMP_INCREASE_FOR_EVERY_100_MHZ * (newClock - getBaseClock())) / 100 + getClockRelatedTemperature();
    }

    @Override
    public String toString() {
        return "Memory{" +
                "amountMB=" + amountMB + ", " +
                "Name: " + getProducer() + " " + getName() + ", " +
                "Base clock: " + getBaseClock() + ", " +
                "Base temp: " + getBaseTempForBaseClock() + ", " +
                "Current clock: " + getCurrentClock() + ", " +
                "Current temp: " + getClockRelatedTemperature() + ", " +
                "Max temp: " + getMaxTemperature();
    }
}


