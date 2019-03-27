/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.strng;

/**
 *
 * @author consultant.junaid
 */
public class StringManipulations {

    String s = "I LOVE PAKISTAN";

    public String reverseString(String s) {
        String reversedString = null;
        for (int i = s.length(); i <= 0; i--) {
            reversedString = "" + s.charAt(i);

        }
        return reversedString;
    }

    public boolean replaceString(String s, String c) {
        String a = "1234", b = "1243";
        c = b.replace('3', '0');
        c = c.replace('4', '3');
        c = c.replace('0', '4');
        System.out.println("a is : = " + c + "   c is : = " + c);
        System.out.println("count = " + a.equalsIgnoreCase(c));
        return a.equalsIgnoreCase(c);
    }

}
