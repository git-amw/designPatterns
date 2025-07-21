package org.example.factories;

import org.example.products.Transport;
import org.example.products.Truck;

public class RoadLogistic extends LogisticFactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
