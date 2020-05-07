package data;

public interface Overclock {
    double CPU_TEMP_INCREASE_FOR_EVERY_100_MHZ = 10;
    double MEMORY_TEMP_INCREASE_FOR_EVERY_100_MHZ = 15;
    double GPU_TEMP_INCREASE_FOR_EVERY_100_MHZ = 20;

    void setNewClock(double newClock);

    double calculateNewTemperature(double newClock);

}
