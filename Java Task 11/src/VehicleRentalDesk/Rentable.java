package VehicleRentalDesk;

public interface Rentable {

    void printAllInfo();

    double costFor(int days);

    String getPlateNumber();

}
