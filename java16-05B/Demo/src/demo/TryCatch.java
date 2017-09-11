/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("QQQQQQQQQQ");
        boolean check = true;
        do {
            try {
                System.out.println("nhập");
                a = Integer.parseInt(sc.nextLine());
                //nếu không gặp lỗi thì chạy xuống đây, nếu lỗi thì k thực hiện mà nhảy vô catch
                check = false;
                System.out.println("----");

            } catch (NumberFormatException e) {//gặp lỗi thì nhảy vô đây
                System.out.println(e);
                System.out.println("aaaaaaaaaaaaaaa");
            }
        } while (check);//kiểm tra điều kiện lặp, nếu k gặp lỗi thì kết thúc vòng lặp 

        System.out.println(a);

    }

}
