/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgnew;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ham {
    public static void b1(){
        System.out.println("lap trinh java 2021");
    }
    public static void b2(String s){
        System.out.println(s);
    }
    public static void b3(){
        Scanner s=new Scanner(System.in);
        System.out.print("nhap n: ");
        int n=s.nextInt();
        while(n<0){
            System.out.print("nhap lai: ");
            n=s.nextInt();
        }
        System.out.print("nhap thong diep: ");
        String a=s.nextLine();
        for(int i=0; i<n; i++){
            b2(a);
        }
    }
    public static void ptb1(double a, double b){
        double c=0;
        if(a==0){
           if(b==0){
               System.out.println("phuong trinh vo so nghiem");
           }else{
               System.out.println("phuong trinh vo nghiem");
           }
       }else{
           c=(double)(-b/a);
           System.out.println("nghiem: "+ c);
       }
    }
    public static void ptb2(double a, double b, double c){
        double delta, x1, x2;
        if(a==0){
            ptb1(b,c);
        }else{
            delta = b*b - 4*a*c;
            if(delta > 0) {
            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("nghiem 1: "+x1+"\n"+"nghiem 2: "+x2);
            }else if(delta==0){
                System.out.println("pt co nghiem kep: "+(-b/(2*a)));
            }else{
                System.out.println("pt vo nghiem");
            }
         }
    }
    public static void chon(){
        int d;
        double a,b,c;
        System.out.println("nhap so 1 de chon giai ptb1");
        System.out.println("nhap so 2 de chon giai ptb2");
        System.out.print("chon: ");
        Scanner s=new Scanner(System.in);
        d=s.nextInt();
        if(d==1 || d==2){
            System.out.print("nhap a: ");
            a=s.nextDouble();
            System.out.print("nhap b: ");
            b=s.nextDouble();
            if(d==1){
                ptb1(a,b);
            }else if(d==2){
                System.out.print("nhap c: ");
                c=s.nextDouble();
                ptb2(a,b,c);
            }
        }
        
    }
    public static void main(String[] args){
        chon();
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("chon 0 de dung chuong trinh");
        System.out.println("chon 1 de tiep tuc");
        System.out.print("chon: ");
        a=s.nextInt();
    }
}