package data;

public class CPU extends Overclockable {

    public CPU(String name, String producer, String serialNumber, double baseClock, double clockRelatedTemperature, double baseTempForBaseClock, double maxTemperature) {
        super(name, producer, serialNumber, baseClock, clockRelatedTemperature, baseTempForBaseClock, maxTemperature);
    }

    @Override
    public double calculateNewTemperature(double newClock) {
        return (Overclock.CPU_TEMP_INCREASE_FOR_EVERY_100_MHZ * (newClock - getBaseClock())) / 100 + getClockRelatedTemperature();
    }

    @Override
    public String toString() {
        return "CPU{" +
                "Name: " + getProducer() + " " + getName() + ", " +
                "Base clock: " + getBaseClock() + ", " +
                "Base temp: " + getBaseTempForBaseClock() + ", " +
                "Current clock: " + getCurrentClock() + ", " +
                "Current temp: " + getClockRelatedTemperature() + ", " +
                "Max temp: " + getMaxTemperature();
    }
}

