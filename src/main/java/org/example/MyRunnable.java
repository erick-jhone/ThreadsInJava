package org.example;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Rodando a thread: " + Thread.currentThread().getName());
    }
}
