package org.example.factories;

import org.example.products.Transport;

public abstract class LogisticFactory {
    public Transport plainDeliver() {
        Transport transport = createTransport();
        transport.deliver();
        return transport;
    }
    public abstract Transport createTransport();
}
