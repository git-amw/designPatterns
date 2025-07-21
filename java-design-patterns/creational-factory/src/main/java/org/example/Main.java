package org.example;

import org.example.factories.LogisticFactory;
import org.example.factories.RoadLogistic;
import org.example.factories.WaterLogistic;

public class Main {
    public static void main(String[] args) {
        LogisticFactory roadLogistic = new RoadLogistic();
        roadLogistic.plainDeliver();

        LogisticFactory waterLogistic = new WaterLogistic();
        waterLogistic.plainDeliver();
    }
}