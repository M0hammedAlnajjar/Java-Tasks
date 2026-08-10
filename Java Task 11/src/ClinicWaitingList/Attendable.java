package ClinicWaitingList;

public interface Attendable {
    void printAllInfo();
    String getPriority();
    int getWaitMinutes();

}
