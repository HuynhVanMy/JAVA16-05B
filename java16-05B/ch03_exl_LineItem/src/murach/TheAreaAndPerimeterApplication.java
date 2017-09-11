package murach;

import java.util.Scanner;

public class TheAreaAndPerimeterApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "y";
        while (s.equalsIgnoreCase("y")) {
            System.out.println("Welcome to the Area and Perimeter Calculator");
            System.out.print("Enter lenth: ");
            double length = Double.parseDouble(sc.nextLine());
            System.out.print("Enter width: ");
            double width = Double.parseDouble(sc.nextLine());
            double area = length * width;
            double perimeter = (length + width) * 2;
            System.out.println("Area: " + area
                    + "\nPerimeter: " + perimeter);
            System.out.print("Continue? (y/n): ");
            s = sc.nextLine();
        }
        System.out.println("=>GET OUT<=");
    }
}
