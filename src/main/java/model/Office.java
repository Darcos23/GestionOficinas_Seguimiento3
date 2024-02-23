package model;

public class Office {
    private int floor;
    private String code;
    private Professor prof;
    private Office nextOffice;

    public Office(int Office, String code) {

    }

    public int getFloor() {
        return floor;
    }

    public String getCode() {
        return code;
    }

    public Office getNextOffice() {
        return nextOffice;
    }

    public void setNextOffice(Office nxof) {
        nextOffice = nxof;
    }
}