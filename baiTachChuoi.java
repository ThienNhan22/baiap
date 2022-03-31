/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgnew;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class baiTachChuoi {
    public static void main(String[] args) {
    String chuoi;
    char kyTu;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    chuoi = scanner.nextLine();
         
    for (int i = 0; i < chuoi.length(); i++) {
        kyTu = chuoi.charAt(i);
             
        // kiểm tra ký tự có phải là khoảng trắng không
        if (Character.isSpace(kyTu)) {
            // Nếu ký tự đó là khoảng trắng thì xuống dòng
            System.out.println();
        } else {
            /*
             * Nếu ký tự đó không là khoảng trắng
             * thì hiển thị ký tự đó trên 1 dòng
             * cho đến khi gặp khoảng trắng thì xuống dòng.
             */
            System.out.print(kyTu);
        }
    }
}
}
