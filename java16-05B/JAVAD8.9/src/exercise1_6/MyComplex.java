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
public class MyComplex {

    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + ", " + imag + "i)";
    }

    public boolean isReal() {
        return (real != 0);
    }

    public boolean isImaginary() {
        return (imag != 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && imag == this.imag);
    }

    public boolean equals(MyComplex complex) {
        return (this.real == complex.getImag() && this.imag == complex.getImag());
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argumentInRadians() {
        return Math.atan2(this.imag, this.real);
    }

    public int argumentInDegrees() {
        return (int) Math.toDegrees(argumentInRadians());
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex add(MyComplex anothor) {
        return new MyComplex(this.real + anothor.getReal(), this.imag + anothor.getImag());
    }
    
    public MyComplex subtract(MyComplex anothor) {
        return new MyComplex(this.real - anothor.getReal(), this.imag - anothor.getImag());
    }
    
    public MyComplex multiplies(MyComplex anothor){
        double a = this.real*anothor.getReal() - this.imag*anothor.getImag();
        double b = this.real*anothor.getImag() + this.imag*anothor.getReal();
        return new MyComplex(a, b);
    }
    
//    public MyComplex divideBy(MyComplex anothor){
//        double a = this.real*anothor.getReal() - this.imag*anothor.getImag();
//        double b = this.real*anothor.getImag() + this.imag*anothor.getReal();
//        return new MyComplex(a, b);
//    }
}
