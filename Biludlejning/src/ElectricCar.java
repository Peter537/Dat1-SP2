public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return batteryCapacity / maxRange;
    }

    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}