/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threads;

/**
 *
 * @author consultant.junaid
 */
public class CustomThread {

    Runnable r = () -> {
        try {
            int millisecs=1000;
            for (int i = 0; i < 10; i++) {
                Thread.sleep(millisecs);
                System.err.println("Thread waiting for "+millisecs);
                System.err.println("Running in Threads");
            }

        } catch (Exception e) {
        }
        finally{
            System.err.println("fINALLY IS ECECUTING");
        }

    };

    public static void main(String[] args) {
        new CustomThread().r.run();
    }
}
