package exercise1_4;

import exercise1_3.MyPoint;

public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle(int x, int y, int radius) {
        this.center.setXY(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "Circle@ (" + center.getX() + ","+center.getY()+") radius = "+ radius;
    }
    
    public double getArea(){
        return 3.14*radius;
    }
}
