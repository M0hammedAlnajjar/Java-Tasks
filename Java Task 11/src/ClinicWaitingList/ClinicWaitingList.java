package ClinicWaitingList;

import java.util.ArrayList;
import java.util.List;

public class ClinicWaitingList {


    static void main(String[] args) {
        new ClinicWaitingList().run();


    }

    private void run() {
        List<Attendable> queue = new ArrayList<>();
        IO.println("--- Single item created at startup ---");

            BookedPatient patient = new BookedPatient("8:00");
    }
}
