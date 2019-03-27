/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticAndFinal;

/**
 *
 * @author consultant.junaid
 */
public class Animals {

    public static int eyes = 2;
    public static int nose = 2;
    public int mouth = 1;

    static int chest;
    static int length;

    public static int geteyes() {
        eyes = 4;
        return eyes;
    }
    public static int geteyes(int a) {
        eyes = 4;
        return eyes;
    }

 public static int geteyes(int a,float b) {
        eyes = 7;
        return eyes;
    }
}
