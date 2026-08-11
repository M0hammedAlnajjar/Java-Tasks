package VehicleRentalDesk;

public class Car implements Rentable {

    private String plateNumber;
    private double dailyRate;
    private int rentalDays;
    private int seats;

    @Override
    public void printAllInfo() {
    IO.println(plateNumber);
    IO.println(dailyRate);
    IO.println(seats);
    IO.println(rentalDays);
    IO.println(costFor(rentalDays));

    }

    @Override
    public double costFor(int days) {

        return  days * rentalDays + 5000 ;
    }

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
        if (dailyRate > 0 && dailyRate <= 200) {
            this.dailyRate = dailyRate;
        } else {
            System.out.println(
                    "Daily rate must be above 0 and not more than 200"
            );

        }
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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
