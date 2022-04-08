package firstproject;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class ChuVi {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double r = 0;
    double chuvi;
    try 
    {
        System.out.print("r = ");
        r = sc.nextDouble();
    } 
    catch(Exception e)
    {
        System.out.println("Du lieu khong dung!");
    }
        chuvi = r * 2 * 3.14159;
        System.out.println("chu vi hinh tron la " + chuvi);
    }
}
