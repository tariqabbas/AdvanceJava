/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singlton;

/**
 *
 * @author consultant.junaid
 */
public class SingletonExample {

    private SingletonExample() {
    }

    public void testSingle() {
        System.err.println("Test method of Singlton");
    }

    public static SingletonExample singletonExample;

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
            return singletonExample;
        }
        return singletonExample;
    }

}
