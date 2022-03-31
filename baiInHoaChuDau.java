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
public class baiInHoaChuDau {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
    message = sc.nextLine();
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;
    for(int i = 0; i < charArray.length; i++) {
      if(Character.isLetter(charArray[i])) {
        if(foundSpace) {
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }
      else {
        foundSpace = true;
      }
    }
    message = String.valueOf(charArray);
    System.out.println("Chuỗi sau khi đổi: \n" + message);
  }
}
