package org.example;

public class Computer {
    private int HDD;
    private int RAM;

    private boolean isgraphicCardEnabled;
    private boolean isBlueetoothEnabled;

    public int getRAM() {
        return RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public boolean isBlueetoothEnabled() {
        return isBlueetoothEnabled;
    }

    public boolean isIsgraphicCardEnabled() {
        return isgraphicCardEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBlueetoothEnabled = builder.isBluetoothEnabled;
        this.isgraphicCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder {
        private int HDD;
        private int RAM;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(int hdd, int ram){
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
