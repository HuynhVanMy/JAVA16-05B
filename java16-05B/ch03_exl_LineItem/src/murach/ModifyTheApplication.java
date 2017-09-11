package murach;

import java.text.NumberFormat;
import java.util.Scanner;

public class ModifyTheApplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "y";
        
        while (s.equalsIgnoreCase("y")) {
            System.out.println("Welcome to the line Item Calculator");
            System.out.print("Enter product code: ");
            String code = sc.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Price: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.println();
            NumberFormat fm = NumberFormat.getCurrencyInstance();
            System.out.println("LINE ITEM");
            System.out.println("Code: " + code);
            System.out.println("Description: Murach's " + code + " Programming");
            System.out.println("Price: " + fm.format(price));
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: " + fm.format((price * quantity)));
            System.out.print("Continue! (y/n): ");
            s = sc.nextLine();
            
        }
        System.out.println("BYE");
    }
}
