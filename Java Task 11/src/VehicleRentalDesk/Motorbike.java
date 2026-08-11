package VehicleRentalDesk;

public class Motorbike {

    private String plateNumber;
    private double dailyRate;
    private int rentalDays;
    private int engineSize;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        if (plateNumber != null && !plateNumber.trim().isEmpty()) {

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

        if (rentalDays >= 1 && rentalDays <= 30) {
            this.rentalDays = rentalDays;
        } else {
            System.out.println(
                    "Rental days must be from 1 to 30"
            );
        }
}

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
