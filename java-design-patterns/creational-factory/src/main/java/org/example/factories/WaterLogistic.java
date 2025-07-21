package org.example.factories;

import org.example.products.Ship;
import org.example.products.Transport;

public class WaterLogistic extends LogisticFactory{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
