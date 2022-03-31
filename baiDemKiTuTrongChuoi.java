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
public class baiDemKiTuTrongChuoi {
    static void DemKiTu(String str)
    {
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("\n\nnhap chuoi : ");
        str = sc.nextLine();
        System.out.println("Chuoi sau khi nhap: " +str);
        DemKiTu(str);
    }
}
