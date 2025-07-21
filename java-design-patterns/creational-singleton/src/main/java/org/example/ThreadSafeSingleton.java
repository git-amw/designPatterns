package org.example;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    public String data;
    private ThreadSafeSingleton(String data) {
        this.data = data;
    }
    public static ThreadSafeSingleton getInstance(String data) {
        ThreadSafeSingleton result = instance;
        if (result == null) {
            synchronized (ThreadSafeSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new ThreadSafeSingleton(data);
                }
            }
        }
        return instance;
    }
}
