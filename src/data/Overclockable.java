package data;

import util.Messages;

public abstract class Overclockable extends Component implements Overclock {

    private final double baseClock;
    private double currentClock;
    private double baseTempForBaseClock;
    private double clockRelatedTemperature;
    private double maxTemperature;

    public Overclockable(String name, String producer, String serialNumber, double baseClock, double clockRelatedTemperature, double baseTempForBaseClock, double maxTemperature) {
        super(name, producer, serialNumber);
        this.baseClock = baseClock;
        this.currentClock = baseClock;
        this.clockRelatedTemperature = clockRelatedTemperature;
        this.baseTempForBaseClock = baseTempForBaseClock;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void setNewClock(double newClock) {
        double temperatureCheck = calculateNewTemperature(newClock);
        if (newClock >= baseClock) {
            if (checkNewTemperatureIsSecure(temperatureCheck, maxTemperature)) {
                currentClock = newClock;
                clockRelatedTemperature = temperatureCheck;
            } else System.out.println(Messages.printMessageCode(200, getClass().getSimpleName()));
        } else System.out.println(Messages.printMessageCode(100, getClass().getSimpleName()));
    }

    public abstract double calculateNewTemperature(double newClock);

    public double getBaseClock() {
        return baseClock;
    }

    public double getCurrentClock() {
        return currentClock;
    }

    public double getBaseTempForBaseClock() {
        return baseTempForBaseClock;
    }

    public double getClockRelatedTemperature() {
        return clockRelatedTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }
}
