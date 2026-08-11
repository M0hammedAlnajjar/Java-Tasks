package VehicleRentalDesk;

public class Car {

    private String plateNumber;
    private double dailyRate;
    private int rentalDays;
    private int seats;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {

        if (plateNumber != null
                && !plateNumber.trim().isEmpty()) {

            this.plateNumber = plateNumber;

        } else {

            System.out.println(
                    "Plate number cannot be empty"
            );
        }
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
