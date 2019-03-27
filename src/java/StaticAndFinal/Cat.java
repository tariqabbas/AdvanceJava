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
public class Cat extends Animals {
public static int geteyes() {

        eyes = 5;
        return eyes;
    }

public static int geteyes(int a,float b) {
        eyes = 8;
        return eyes;
    }
    public static void main(String[] args) {
        Animals a=new Animals();
        Animals b=new Animals();
        Cat c=new Cat();
//        a=c;
String s ="tariq";
String st ="tariq";
        System.err.println("has of s "+s.hashCode());
        System.err.println("has of st "+st.hashCode());

        System.out.println("======="+a.hashCode()+"-------"+b.hashCode());
        System.out.println("======="+a.equals(c));
        System.out.println("===as===="+a.hashCode());
        System.out.println("====cs==="+c.hashCode());
        a=c;
        System.out.println("-----var------" + Animals.eyes);
        System.out.println("-----var cat------" + Cat.geteyes(2 , 2));
        System.out.println("-----var------" + new Animals().geteyes());
    }

}
