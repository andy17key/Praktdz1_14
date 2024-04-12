/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practdz_1_14;

/**
 *
 * @author Andrew B
 */
public class Practdz_1_14 {

    public static void main(String[] args) {
        System.out.println("Богданов Андрей Вариант 4");
        Thread[] threads = new Thread[2];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread("Thread-" + (i + 1)));
            threads[i].start();
        }
    }
}

