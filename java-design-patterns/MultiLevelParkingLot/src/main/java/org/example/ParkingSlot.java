package org.example;

public class ParkingSlot {
    private final int slotNumber;
    private String licensePlate;

    public ParkingSlot(int slotNumber, String licensePlate) {
        this.slotNumber = slotNumber;
        this.licensePlate = licensePlate;
    }

    public void park(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void unpark() {
        this.licensePlate = null;
    }

    public int getSlotNumber() {
        return this.slotNumber;
    }

}
