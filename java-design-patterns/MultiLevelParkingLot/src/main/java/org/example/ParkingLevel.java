package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ParkingLevel {
    private int levelNumber;
    private PriorityQueue<ParkingSlot> availableSlots;
    private Map<String, ParkingSlot> occupiedSlots;

    public ParkingLevel(int levelNumber, int numberOfSlots) {
        this.levelNumber = levelNumber;
        availableSlots = new PriorityQueue<>(Comparator.comparingInt(ParkingSlot::getSlotNumber));
        occupiedSlots = new HashMap<>();
        for (int i = 0; i < numberOfSlots; i++) {
            availableSlots.add(new ParkingSlot(i, null));
        }
    }

    public boolean getAvailableSlot() {
        if (availableSlots.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean parkVehicle(String licensePlate) {
        ParkingSlot parkingSlot = availableSlots.poll();
        assert parkingSlot != null;
        parkingSlot.park(licensePlate);
        occupiedSlots.put(licensePlate, parkingSlot);
        return true;
    }

    public boolean unparkVehicle(String licensePlate) {
        ParkingSlot parkingSlot = occupiedSlots.get(licensePlate);
        assert parkingSlot != null;
        parkingSlot.unpark();
        availableSlots.add(parkingSlot);
        occupiedSlots.remove(licensePlate);
        return true;
    }

    public int getLevelNumber() {
        return this.levelNumber;
    }
}
