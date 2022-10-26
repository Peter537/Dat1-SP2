public class GasolinCar extends AFuelCar {

    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "GasolinCar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}