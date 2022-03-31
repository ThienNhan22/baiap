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
public class baixoakhoangtrang {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\nNhap chuoi can kiem tra: ");
    String input = sc.nextLine();
    System.out.println("Chuoi sau khi nhap: " + input);
    input = input.replaceAll("\\s", "");
    System.out.println("Chuoi sau khi xoa khoang trang: " + input);
  }
}

