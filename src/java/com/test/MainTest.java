/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.singlton.SingletonExample;
import java.util.Comparator;

/**
 *
 * @author consultant.junaid
 */
public class MainTest {

    public static Comparator<Object> com = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return o2.hashCode() - o1.hashCode();
        }
    };

    public static void main(String[] args) {    
        SingletonExample sing = SingletonExample.getInstance();
        sing.testSingle();
        MainTest.com.compare(com, com);
        Shape s = ShapeFactory.getShape("square");
        s.draw();
    }
}
