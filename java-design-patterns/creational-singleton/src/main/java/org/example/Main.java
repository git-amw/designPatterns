package org.example;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                ThreadSafeSingleton firstInstance = ThreadSafeSingleton.getInstance("Foo " + Thread.currentThread().getName());
                System.out.println(firstInstance.data);
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                ThreadSafeSingleton secondInstance = ThreadSafeSingleton.getInstance("Bar " + Thread.currentThread().getName());
                System.out.println(secondInstance.data);
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}