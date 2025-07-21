package org.example;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer.ComputerBuilder(500, 8).build();
        Computer pc2 = new Computer.ComputerBuilder(500, 8)
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false)
                .build();
    }
}