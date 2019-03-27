/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generics;

/**
 *
 * @author consultant.junaid
 */
public class GenericsTest {

    public static <T> T getString(T t) {
        return t;
    }

    public static void main(String[] args) {
        System.err.println("========" + GenericsTest.getString(5.5));
    }

}
