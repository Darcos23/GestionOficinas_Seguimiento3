package model;

public class Department {

    private Office firstOffice;

    public Department() {

    }

    public void addOffice(int f, String c) {
        Office newOffice = new Office(f,c);
    }

    public Office searchOffice(String c) {
        return null;
    }

    public void removeEvenFloors() {

    }
}
