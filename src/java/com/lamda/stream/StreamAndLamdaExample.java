/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author consultant.junaid
 */
public class StreamAndLamdaExample {
    //Functional Interface References

    static FunctionalInterfaceTest fit;
    static FunctionalInterfaceTest1 fit1;
    static BlockLmdaFunInt blockLmdaFunInt;
    static GenericFunctionalInterface genericFunctionalInterface;
    static DoubleNumericArrayFunc arrayFunc;

    static String stringOps(GenericFunctionalInterface gfi, String s) {
        return s;

    }

    public static void main(String[] args) throws EmptyArrayException {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
//Stream API
        Stream<String> stream = stringList.stream();
        long count = stream.map((value) -> {
            return value.toLowerCase();
        }).count();
        System.out.println(count);
//with single parameter 
        fit1 = n -> {
            return n * n;
        };
        System.out.println(fit1.getValue(10));
//using Block of Code
        blockLmdaFunInt = (n) -> {
            int result = 1;
            for (int i = 1; i < n; i++) {
                result = i * result;
            }
            return result;

        };
        System.err.println("=======lamda block code=========" + blockLmdaFunInt.getValue(3));
//Using Generic Functional Interface        
        GenericFunctionalInterface<Integer> gfunctionalInterface = (n) -> {
            return n * n;
        };
        System.err.println("-----------generic Int---- " + gfunctionalInterface.getValue(10));
        GenericFunctionalInterface<String> gfunctionalInterface1 = (n) -> {
            String res = null;
            for (int i = n.length() - 1; i >= 0; i--) {
                res = res + n.charAt(i);
            }

            return res.toUpperCase();
        };
        System.err.println("-----------generic String---- " + gfunctionalInterface1.getValue("Sapphire"));

//Generic Functional Interface
        genericFunctionalInterface = (str) -> {
            return str.toString().toUpperCase();
        };

        System.err.println("-----------generic fun String---- " + genericFunctionalInterface.getValue(10));
//Passing Lmda Expression as Arguments
        System.err.println("-----------lamda as argument---- " + (stringOps(genericFunctionalInterface, "This is Lamda")));

//Exception Handling in Lambda Expressions
        double[] values = {1.0, 2.0, 3.0, 4.0};
        arrayFunc = (n) -> {
            double sum = 0;
            if (n.length == 0) {
                throw new EmptyArrayException();
            }
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.err.println("-----------lamda exception Hndling ---- " + arrayFunc.func(values));

        //for exception condition
        System.err.println("-----------lamda exception Hndling ---- " + arrayFunc.func(new double[4]));
    }
}
