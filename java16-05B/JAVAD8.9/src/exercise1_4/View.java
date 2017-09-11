/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_4;

import exercise1_3.MyPoint;

/**
 *
 * @author Admin
 */
public class View {

    public static void main(String[] args) {
        MyCircle circle = new MyCircle(new MyPoint(2, 2), 5);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
    }

}
