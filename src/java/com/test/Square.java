/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author consultant.junaid
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square Drawn");
    }

    @Override
    public int getAmount() {
        return 10;
    }

    @Override
    public double getAmount(int a, int b) {
        return a + b;
    }

}
