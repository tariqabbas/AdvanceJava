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
public class Recursion {
    // this is a recursive method

    static int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        System.out.println("------n----" + n);
        System.out.println("------in----" + result);
        return result;
    }

    public static void main(String[] args) {
        Recursion.fact(4);
//        System.out.println("----------"+Recursion.fact(4));
    }
}
