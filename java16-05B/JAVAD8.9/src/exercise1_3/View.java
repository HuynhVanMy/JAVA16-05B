package exercise1_3;

public class View {

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(8, 9);
        System.out.println("điểm ban đầu: " +myPoint.toString());
        double dis = myPoint.distance(4, 9);
        System.out.println("distance = " + dis);
        System.out.println("---------------");
        double dis02 = myPoint.distance(new MyPoint(1, 9));
        System.out.println("distance02 = " + dis02);
    }

}
