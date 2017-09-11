/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_5;

import exercise1_3.MyPoint;

/**
 *
 * @author Admin
 */
public class View {

    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(new MyPoint(1, 2), new MyPoint(3, 4), new MyPoint(5, 6));
        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
