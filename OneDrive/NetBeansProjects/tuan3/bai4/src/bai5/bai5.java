/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("Nhap vao ba canh tam giac");
        Scanner t = new Scanner(System.in);
        float a, b, c;
        a = t.nextInt();
        b = t.nextInt();
        c = t.nextInt();
        if(a+b<c||a+c<b||b+c<a) System.out.println("Khong phai la tam giac");
        else if(a==b && a==c) System.out.println("La tam giac deu");
        else if((a==b)||(a==c)||(b==c)) System.out.println("La tam giac can");
        else if((a*a==b*b+c+c)||(b*b==a*a+c*c)||(c*c==a*a+b*b)) System.out.println("La tam giac vuong");
        else System.out.println("La tam giac thuong");
    }
}
