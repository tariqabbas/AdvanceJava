/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.inher;

/**
 *
 * @author consultant.junaid
 */
public abstract class Cow extends Animal {

    @Override
    public int getWeight() {
        return 10;

    }

    @Override
    public int cal(int a, int b) {
        return a * b;
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
