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
public class ShapeFactory {
    public static Shape getShape(String shape){
        if(shape.equalsIgnoreCase("")||shape==null){
            return null;
        }
        else if(shape.equalsIgnoreCase("square")){
        return new Square();
        }else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;  
        
    }
    
}
