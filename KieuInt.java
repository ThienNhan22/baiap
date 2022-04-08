/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class KieuInt {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    System.out.println("Tong: "+ (a + b));
    System.out.println("Hieu: "+ (a - b));
    System.out.println("Tich: "+ (a * b));
    System.out.println("Thuong: "+ (a / b));
    System.out.println("Chia Phan Du: "+ (a % b)); 
    System.out.println("A mu B: "+ Math.pow(a,b));
    }
}