package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<ParkingLevel> parkingLevelList;
    private Map<String, Integer> parkedVehicle;

    public ParkingLot(int numberOfLevels, int numberOfSlot) {
        parkingLevelList = new ArrayList<>();
        parkedVehicle = new HashMap<>();
        for (int i = 0; i < numberOfLevels; i++) {
            parkingLevelList.add(new ParkingLevel(i, numberOfSlot));
        }
    }

    public boolean parkVehicle(String licensePlate) {
        for (ParkingLevel parkingLevel : parkingLevelList) {
            if (parkingLevel.getAvailableSlot()) {
                parkingLevel.parkVehicle(licensePlate);
                parkedVehicle.put(licensePlate, parkingLevel.getLevelNumber());
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(String licensePlate) {
        int parkingLevelNumber = parkedVehicle.get(licensePlate);
        ParkingLevel parkingLevel = parkingLevelList.get(parkingLevelNumber);
        parkingLevel.unparkVehicle(licensePlate);
        parkedVehicle.remove(licensePlate);
        return true;
    }

    public void getDetails() {
    }
}
