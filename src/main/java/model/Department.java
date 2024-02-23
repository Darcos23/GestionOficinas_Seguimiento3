package model;

public class Department {

    private Office firstOffice;

    public Department() {
        firstOffice = null;
    }

    public void addOffice(int f, String c) {
        Office newOffice = new Office(f,c);

        if (firstOffice == null) {
            firstOffice = newOffice;
        } else {
            Office current = firstOffice;
            while (current.getNextOffice() != null) {
                current = current.getNextOffice();
            }

            current.setNextOffice(newOffice);
        }
    }

    public Office searchOffice(String c) {
        if (firstOffice == null) {
            return null;
        }

        if(firstOffice.getCode().equals(c)) {
            return firstOffice;
        }

        Office current = firstOffice;

        while (current.getNextOffice() != null) {
            if (current.getNextOffice().getCode().equals(c)) {
                return current.getNextOffice();
            }

            current = current.getNextOffice();
        }

        return null;
    }

    public void removeEvenFloors() {
        Office current = firstOffice;
        Office previous = null;

        while (current != null) {
            int currentFloor = current.getFloor();

            if (currentFloor % 2 == 0) {
                if (previous == null) {
                    firstOffice = current.getNextOffice();
                } else {
                    previous.setNextOffice(current.getNextOffice());
                }
            } else {
                previous = current;
            }
            current = current.getNextOffice();
        }
    }
}
