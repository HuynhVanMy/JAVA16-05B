package murach.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class CalculateTaxAndGrandTotal {
    
    public static void main(String[] args) {
        String code = "Android";
        String description;
        description = "Murach's Android programming";
        double price = 57.5;
        int quantity = 2;
        double total;
        total = price * quantity;
        double taxPercent = 7.5;
        double taxAmount = 8.625;
        double grandTotal = total + taxAmount;
        System.out.println("Code: " + code);
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
        System.out.println("total: " + total);
        System.out.println("taxPercent: "+taxPercent);
        System.out.println("taxAmount: " + taxAmount);
        System.out.println("grandTotal: " + grandTotal);

    }
    
}
