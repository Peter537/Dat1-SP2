public abstract class AFuelCar extends ACar {

    protected int kmPrLitre;

    public String getFuelType() {
        return "";
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}