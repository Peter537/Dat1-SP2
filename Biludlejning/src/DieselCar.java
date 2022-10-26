public class DieselCar extends AFuelCar {

    private boolean particleFilter;

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
                ", kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}