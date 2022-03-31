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
public class baiInChuoiDaoNguoc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s;
    System.out.println("\n\nNhập vào chuỗi: ");
    s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    String text = sb.toString();
    System.out.println("Original string: " + s);
    System.out.println("Reversed string: " + text);
  }
  }

