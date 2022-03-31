/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgnew;

/**
 *
 * @author Administrator
 */
class CharToString
{
    public static void main(String args[]){
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("Chuỗi là: "+str);
        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("Chuỗi là: "+str2);
    }
}