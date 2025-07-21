package org.example;

public class Main {
    public static void main(String[] args) {
        int level = 3;
        int slot = 4;
        ParkingLot parkingLot = new ParkingLot(level, slot);
        if (parkingLot.parkVehicle("Abc123")) {
            System.out.println("Vehicle Abc123 is parked!!");
        }
        if (parkingLot.parkVehicle("1xyz2")) {
            System.out.println("Vehicle 1xyz2 is parked!!");
        }
        if (parkingLot.parkVehicle("piwe34")) {
            System.out.println("Vehicle piwe34 is parked!!");
        }
        parkingLot.unparkVehicle("1xyz2");

    }
}