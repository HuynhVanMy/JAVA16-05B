/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_6;

/**
 *
 * @author Admin
 */
public class View {

    public static void main(String[] args) {
        MyComplex complex01 = new MyComplex(1.1, 2.2);
        MyComplex complex02 = new MyComplex(3.3, 4.4);
        
        System.out.println("complex01 : " + complex01.toString());
        System.out.println("complex02 : " + complex02.toString());
        
        System.out.println("Is Real: " + complex01.isReal());
        System.out.println("Is Imaginary: " + complex01.isImaginary());
        if(complex01.equals(complex02)){
            System.out.println("equals");
        }else{
            System.out.println("Not Equals");
        }
        System.out.println("Magnitude: " + complex01.magnitude());
        System.out.println(complex01.toString() +" + " + complex02.toString() +" = "+complex01.add(complex02).toString());
        System.out.println(complex01.toString() +" - " + complex02.toString() +" = "+complex01.subtract(complex02).toString());
        
    }
}
