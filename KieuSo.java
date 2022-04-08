package firstproject;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class KieuSo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    byte a = sc.nextByte(), b = sc.nextByte();
    System.out.println("Tong: "+ (a + b));
    System.out.println("Hieu: "+ (a - b));
    System.out.println("Tich: "+ (a * b));
    System.out.println("Thuong: "+ (a / b));
    System.out.println("Chia Phan Du: "+ (a % b)); 
    System.out.println("A mu B: "+ Math.pow(a,b));
    }
}