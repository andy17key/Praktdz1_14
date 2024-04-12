/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practdz_1_14;

/**
 *
 * @author Andrew B
 */
public class MyThread implements Runnable {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }
    private static final Object lock = new Object();
    private static int threadIndex = 0;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (lock) {
                while (!name.equals("Thread-" + (threadIndex + 1))) {
                    try {
                        Thread.sleep(1000);
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println(name);
                threadIndex = (threadIndex + 1) % 2;
                lock.notifyAll();
            }
        }
    }
}